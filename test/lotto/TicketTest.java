package lotto;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TicketTest {
	
	Ticket ticket;
	
	@Before
	public void setup() throws Exception {
		ticket = new Ticket();
	}
	
	@Test
	public void 숫자생성기() {
		System.out.println(ticket.generateNumber());
	}
	
	@Test
	public void 티켓여러장사기() throws Exception {
		assertEquals(3, ticket.countOfTicket(3).size());
	}
	
	 @Test
	public void 티켓번호보기() throws Exception {
		 Ticket ticket2 = ticket.publish();
		 ticket2.showTicketNumber();
	}

}
