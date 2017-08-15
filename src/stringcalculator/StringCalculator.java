package stringcalculator;

import java.util.ArrayList;

public class StringCalculator {
	Splitter d_splitter = new DefaultSplitter();
	Splitter c_splitter = new CustomSplitter();
	
	private ArrayList<Positive> split(String str) {
		ArrayList<Positive> params = new ArrayList<>();
		
		if(c_splitter.supports(str)) {
			return addList(c_splitter.splits(str));
		}
		
		
		return addList(d_splitter.splits(str));
	}
	
	private ArrayList<Positive> addList(String[] strs) {
		ArrayList<Positive> params = new ArrayList<>();
		for(int i=0; i<strs.length; i++) {
			params.add(new Positive(strs[i]));
		}
		
		return params;
	}
	
	
	
	public int add(String str) {

		if(str.equals("")) {
			return 0;
		}
		
		return sum(split(str));
	}

	private int sum(ArrayList<Positive> params) {
		Positive result = new Positive(0);
		
		for(Positive param : params ) {
			result.sum(param.intVaule());
		}
		
		return result.intVaule();
	}
	
	
}
