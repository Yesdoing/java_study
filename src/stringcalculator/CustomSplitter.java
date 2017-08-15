package stringcalculator;

public class CustomSplitter implements Splitter{

	@Override
	public boolean supports(String str) {
		
		if(str.contains("//") && str.contains("\n")) return true;
		return false;
	}

	@Override
	public String[] splits(String str) {
		String[] strs = str.split("\n");
		String symbol = strs[0].replace("//", "");
		return strs[1].split(symbol);
	}
	
}
