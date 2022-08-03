package Myproject2;

public class ArrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[]array1 = {10,20,30,40,50};
		
		System.out.println(array1.length);
		System.out.println(array1[1]);
		System.out.println(array1[array1.length-1]);
		
		String[] array2 = {"xyz", "pqr", "abc"};
		System.out.println(array2[0]);
		
		String str1 = "Clean World Green World";
		String[] array3 = str1.split(" ");
		System.out.println(array3[1]);
		
	
	}

}
