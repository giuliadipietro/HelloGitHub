public class ArithmetischeOperationen {

	public static double fahrenheit2Celsius(double fahrenheit) {
		
		double celsius = (fahrenheit - 32) * (5.0/9.0);		
		return celsius;
		
	}
	
	public static void main(String[] args) {

		double tempF = fahrenheit2Celsius(26.0);
		System.out.println(tempF);
				
		}

	}

