package lotto;

import java.util.Scanner;

public class LottoMain {
	
	
	public static void main(String[] args) {
		Lotto lotto = new Lotto();
		Scanner scan = new Scanner(System.in);
		int money = lotto.buyingLotto(scan);
		lotto.showLottoReport(money, lotto.compareTickets(lotto.sellTicket(money), lotto.winningNumber(scan)));
	}
}
