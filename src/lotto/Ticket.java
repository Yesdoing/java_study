package lotto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ticket {
	private List<Integer> numbers;

	Ticket() {
	}
	
	Ticket(List<Integer> numbers) {
		this.numbers = numbers;
	}
	
	Ticket publish() {
		return new Ticket(generateNumber());
	}
	
	int getTicketSize() {
		return numbers.size();
	}
	
	int getTicketNum(int index) {
		return numbers.get(index);
	}

	List<Integer> generateNumber() {
		List<Integer> numbers = new ArrayList<>();

		for (int i = 0; i < 45; i++) {
			numbers.add(i + 1);
		}
		
		Collections.shuffle(numbers);
		
		return Collections.unmodifiableList(numbers.subList(0, 6));
	}

	List<Ticket> countOfTicket(int ticket) {
		List<Ticket> tickets = new ArrayList<>();

		for (int i = 0; i < ticket; i++) {
			tickets.add(publish());
		}

		return Collections.unmodifiableList(tickets);
	}
	
	void showTicketNumber() {
		System.out.println(numbers);
	}
	
}
