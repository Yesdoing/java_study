package lotto;

import java.util.Collections;
import java.util.List;

public class Lotto {
	List<Integer> lottoNos;
	
	Ticket ticket;
	int buyTicketMoney = 0;
	
	
	Lotto(Ticket ticket) {
		this.ticket = ticket;
	}

	Lotto(List<Integer> lottoNos) { 
		this.lottoNos = lottoNos;
	}

	public int buyingLotto(Integer money) {
		System.out.println("구매금액을 입력해 주세요. ");
		buyTicketMoney = money;
		System.out.println(buyTicketMoney + "만큼 구매합니다. ");
		return buyTicketMoney;
	}

	public List<Ticket> sellTicket(int numberOfTicket) {
		System.out.println(numberOfTicket + "개를 구매하셨습니다.");
		return ticket.countOfTicket(numberOfTicket);
	}


	
	
	public Lotto winningNumber() {
		lottoNos = ticket.generateNumber();
		return  new Lotto(Collections.unmodifiableList(lottoNos));
	}


	List<Integer> getNumbers() {
		return lottoNos;
	}

	int contains(Integer number) {
		if(lottoNos.contains(number)) return 1;
		return 0;
	}

	void printTicket() {
		System.out.print("[ ");
		for(Integer a=0; a< 6; a++) {
			System.out.print(lottoNos.get(a) + " ");
		}
		System.out.print(" ]");
		System.out.println();

	}

	void showLottoReport(int money, Result result) {
		System.out.println("총 수익률은 " + (result.resultMoney() / money) * 100 + "%입니다.");
	}

}
