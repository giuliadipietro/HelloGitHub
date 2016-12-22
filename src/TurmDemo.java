
public class TurmDemo {

	public static void main(String[] args) {
		
		int a = 2;
		int b = 2;
		int result=a;
		
		while (b <= 9) {
			System.out.println(result + "*" + b + "=" + (result*b));
			result = result * b;	//result* = b; - another way to write it
			b++;
		}
		
		b = 2;
	 
		while (b <= 9) {
			System.out.println(result + "/" + b + "=" + (result/b));
			result = result / b;
			b++;
		}
		
	}
	
}
