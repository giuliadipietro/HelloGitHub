package demo;

public class ArrayDemo1 {

	public static void main(String[] args) {

		int[] array1 = {3, 4, 5};
		
		int[] array2 = new int[3];
		
		array2[0] = 7;
		array2[1] = 1;
		array2[2] = 4;
		
		System.out.println("+ "+(array1[0]+array2[0]) + " " +(array1[1]+array2[1]) + " " +(array1[2]+array2[2]));
		System.out.println("* "+(array1[0]*array2[0]) + " " +(array1[1]*array2[1]) + " " + (array1[2]*array2[2]));
	}

}
