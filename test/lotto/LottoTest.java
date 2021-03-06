package lotto;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class LottoTest {

	Lotto lotto;
	Ticket ticket;
	@Before
	public void setup() {
		ticket = new Ticket();
		lotto = new Lotto(ticket);
	}
	
	@Test
	public void 티켓_발매() throws Exception {
		List<Ticket> tickets = lotto.sellTicket(10);
		assertEquals(10, tickets.size());
	}
	
//	@Test
//	public void testName() throws Exception {
//		Lotto myNum = new Lotto(new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6)));
//		ArrayList<Lotto> testNums = new ArrayList<>();
//		testNums.add(new Lotto(new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6))));
//		testNums.add(new Lotto(new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 7))));
//		testNums.add(new Lotto(new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 8, 7))));
//		testNums.add(new Lotto(new ArrayList<Integer>(Arrays.asList(1, 2, 3, 9, 8, 7))));
//		lotto.showLottoReport(4000, lotto.compareTickets(testNums, myNum));		
//
//	}
//	@Test
//	public void macthingTicket() throws Exception {
//		Lotto myNum = new Lotto(new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6)));
//		lotto.showLottoReport(14000, lotto.compareTickets(lotto.sellTicket(14), myNum));
//	}
}
