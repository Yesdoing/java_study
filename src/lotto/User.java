package lotto;

import java.util.List;
import java.util.Scanner;

public class User {
	List<Ticket> tickets;
	Integer money = 0;
	Integer howManyTicket = 0;
	
	User() {
	}
	
	User(int money) {
		this.money = money;
	}
	

	int getTicketSize() {
		return tickets.size();
	}
	
	void showTicket() {
		for(Ticket ticket : tickets) {
			ticket.showTicketNumber();
		}
	}
	
	int getMoney() {
		return money;
	}
		
	int getHowManyTicket() {
		return howManyTicket;
	}
	
	void insertMoney(Scanner scan) {
		money = scan.nextInt();
	}
		
	public boolean buyingManyTickets(Lotto lotto, Integer buyTicketNumber) {
		tickets = lotto.sellTicket(buyTicketNumber);
		money = money - buyTicketNumber * 1000;
		return true;
	}
	
	void checkUserMoney() {		
		howManyTicket = money / 1000;
		System.out.println("현재 가지고 있는 금액은 " + money + "원 입니다. ");
		System.out.println("로또 복권을 " + howManyTicket + "장을 구매하실 수 있습니다.");
	}
	
	
	public Result compareTickets(Lotto winningNumber) {
		Result result = new Result();
		System.out.println("지난 주 당첨 번호입니다.");
		winningNumber = winningNumber.winningNumber();
		winningNumber.printTicket();
		for (Ticket ticket : tickets) {
			result.setMatch(compareTicket(winningNumber, ticket));
		}
		
		return result;
	}

	public int compareTicket(Lotto winningNumbers, Ticket ticket) {

		int goal = 0;
		
		for (int i=0; i<ticket.getTicketSize(); i++) {
				goal += winningNumbers.contains(ticket.getTicketNum(i));
		}

		return goal;
	}

	
}
