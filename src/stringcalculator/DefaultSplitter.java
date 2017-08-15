package stringcalculator;

public class DefaultSplitter implements Splitter {

	@Override
	public boolean supports(String str) {
		if(str.contains(":") || str.contains(",")) return true;
		return false;
	}

	@Override
	public String[] splits(String str) {
		return str.split(":|,");
	}


	
}
