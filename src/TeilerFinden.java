


public class TeilerFinden {

	public static void main(String[] args) {
		
		int nummer = 10;
		int teiler = 2;
		
		while (teiler < nummer) {
			if (nummer%teiler == 0) {
				System.out.println(teiler);
			}
			
			teiler++;
		}
		
	}
	
}
