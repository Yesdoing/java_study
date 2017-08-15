package lotto;

public class Result {
	private int countOfMatch3;			// 5000
	private int countOfMatch4;			// 50000
	private int countOfMatch5;			// 1500000
	private int countOfMatch6;			// 2000000000
	
	Result() {
		countOfMatch3 = 0;  
		countOfMatch4 = 0;
		countOfMatch5 = 0;
		countOfMatch6 = 0;
	}
	
	void setMatch(int result) {
		if(result == 3) {
			countOfMatch3++;
		}
		if(result == 4) {
			countOfMatch4++;
		}
		if(result == 5) {
			countOfMatch5++;
		}
		if(result == 6) {
			countOfMatch6++;
		}
	}
	
	
	
	int resultMoney() {
		
		System.out.println("당첨 통계");
		System.out.println("---------");
		System.out.println("3개 일치 (5000원)- " + countOfMatch3 + "개 ");
		System.out.println("4개 일치 (50000원)- " + countOfMatch4 + "개 ");
		System.out.println("5개 일치 (1500000원)- " + countOfMatch5 + "개 ");
		System.out.println("6개 일치 (2000000000원)- " + countOfMatch6 + "개 ");
		return countOfMatch3 * 5000 + countOfMatch4 * 50000 + countOfMatch5 * 1500000 + countOfMatch6 * 2000000000; 
	}
}
