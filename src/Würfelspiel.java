
public class Würfelspiel {
	
	public static void main(String[] args) {
		triesUntilThreeOnes();
		}
	
	public static int triesUntilThreeOnes() {
		
		int tries = 0;
		int ones = 0;
		
		while(ones < 3){
			int diceValue = 1 + (int)(Math.random()* 6);
			
			if(diceValue == 1) {
				ones++; }
			
			System.out.println(diceValue);
			tries++; }
		
		System.out.println("number of tries: "+tries);
		return tries;
	
	}
	}
	

