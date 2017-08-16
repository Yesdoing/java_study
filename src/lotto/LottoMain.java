package lotto;

import java.util.Scanner;

public class LottoMain {

	
	public static void main(String[] args) {
		int input = 0;
		Lotto lotto = new Lotto(new Ticket());

		User user = new User();
		Scanner scan = new Scanner(System.in);
		
		while(input != 6) {
			System.out.println("1. 현금 충전, 2. 지갑보기, 3. 로또사기, 4. 내가 산 로또 번호 보기, 5. 당첨 확인, 6. 종료 ");
			input = scan.nextInt();
			
			if(input == 1) {
				System.out.println("현금을 충전합니다. ");
				System.out.println("얼마를 충전하시겠습니까? ");
				System.out.print("금액 : ");
				user.insertMoney(scan);
				
				System.out.println(user.getMoney() + "원을 충전하였습니다. ");
			}
			if(input == 2) {
				System.out.println("현재 소지하고 있는 금액은 " + user.getMoney() + "원 입니다. ");
			}
			if(input == 3) {
				System.out.println("로또 복권을 구매합니다. ");
				System.out.println("몇 장을 구매하시겠습니까? ");
				System.out.print("구매량 : ");
				int buyTicket = scan.nextInt();
				user.buyingManyTickets(lotto, buyTicket);
				
				System.out.println("로또 복권을 " + user.getTicketSize() + "개 구매하셨습니다. ");
				
			}
			
			if(input == 4) {
				System.out.println("구매하신 티켓의 번호는 다음과 같습니다. ");
				user.showTicket();
			}
			
			if(input == 5) {
				System.out.println("로또 복권을 확인합니다. ");
				System.out.println("수익율은 " + user.compareTickets(lotto).resultMoney() + "% 입니다. ");
			}
		}
		
	}
}
