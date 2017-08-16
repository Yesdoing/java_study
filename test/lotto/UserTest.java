package lotto;

import static org.junit.Assert.*;

import java.util.Scanner;

import org.junit.Before;
import org.junit.Test;

public class UserTest {

	User user;
	Scanner scan;
	@Before
	public void setup() {
		user = new User();
		scan = new Scanner(System.in);
	}
	
//	@Test
//	public void 금액_충전() {
//		
//		System.out.println("얼마를 충전하시겠습니까? ");
//		user.insertMoney(scan);
//		assertEquals(10000, user.getMoney());
//	}
	
//	@Test
//	public void 티켓_구매() throws Exception {
//		System.out.println("구매금액을 입력해 주세요. ");
//		int ticket = user.buyingManyTicket(scan);
//		
//		assertEquals(10, ticket);
//	}
	
	@Test
	public void 얼마나_티켓을_살수있는가() throws Exception {
		User user2 = new User(10000);
		user2.checkUserMoney();
		assertEquals(10, user2.getHowManyTicket());
	}

}
