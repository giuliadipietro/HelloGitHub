package demo;

public class ArrayDemo2 {

	public static void main(String[] args) {

		String[] month = {"january", "february", "march", "april", "may", "june", "july", "august", "september", 
				"october", "november", "december"};
		
		
		for(int i = 0; i < month.length; i++) {
			System.out.println(month[i]+ " [" +(i+1) + "]");
		}
		
	}

}
