package lotto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Lotto {
	ArrayList<Integer> lottoNos;
	
	Lotto() {
	}

	Lotto(ArrayList<Integer> lottoNos) { 
		this.lottoNos = lottoNos;
	}

	public int buyingLotto(Scanner scan) {
		System.out.println("구매금액을 입력해 주세요. ");
		int money = scan.nextInt();
		return money / 1000;
	}

	private Lotto publish() {
		ArrayList<Integer> numbers = new ArrayList<>();

		for (int i = 0; i < 45; i++) {
			numbers.add(i + 1);
		}
		Collections.shuffle(numbers);
		return new Lotto(new ArrayList<Integer>(numbers.subList(0, 6)));
	}

	public ArrayList<Lotto> sellTicket(int ticket) {
		System.out.println(ticket + "개를 구매하셨습니다.");
		ArrayList<Lotto> tickets = new ArrayList<>();

		for (int i = 0; i < ticket; i++) {
			tickets.add(publish());
			tickets.get(i).printTicket();
		}

		return tickets;
	}

	public Lotto winningNumber(Scanner scan) {
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		System.out.println("지난 주 당첨 번호를 입력해 주세요.");
		for (int i = 0; i < 6; i++) {
			numbers.add(scan.nextInt());
		}

		return  new Lotto(numbers);
	}

	public Result compareTickets(ArrayList<Lotto> tickets, Lotto winningNumber) {
		Result result = new Result();

		for (Lotto ticket : tickets) {
			result.setMatch(ticket.compareTicket(winningNumber));
		}

		return result;
	}

	public int compareTicket(Lotto winningNumbers) {

		int goal = 0;

		for (Integer number : winningNumbers.getNumbers()) {
				goal += contains(number);
		}

		return goal;
	}

	private ArrayList<Integer> getNumbers() {
		return lottoNos;
	}

	private int contains(Integer number) {
		if(lottoNos.contains(number)) return 1;
		return 0;
	}

	private void printTicket() {
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
