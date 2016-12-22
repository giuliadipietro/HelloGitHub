
public class ParmTest {

	public static void main(String[] args) {

		String result = printRectangleArea("Das Rechteck hat Fäche von", 4, 5);
		System.out.println(result);
	}

	public static String printRectangleArea(String text, int a, int b) {
		int area = a * b;
		return text+" "+area;
	}
	
}
