package stringcalculator;

public interface Splitter {
	
	boolean supports(String str);
	
	String[] splits(String str);
	
}
