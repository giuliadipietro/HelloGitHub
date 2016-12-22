
public class WinterreifenpflichtDemo {

	public static void main(String[] args) {
		boolean result = isWinterreifenPflicht(13, true);
		
		if (result == true) {
			System.out.println("Bitte Winterreifen verwenden");
		}
		else {
			System.out.println("Winterreifen sind nicht erforderlich");
		}
	}

	public static boolean isWinterreifenPflicht(int temperatur, boolean rutschigeFahrbahn) {
		boolean result;
		if ((temperatur < 10 && true)|| temperatur < 4) {
			result = true;
		}
		else {
			result = false;
		}
		return result;
	}
}
