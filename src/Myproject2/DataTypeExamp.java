package Myproject2;

public class DataTypeExamp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 50;
		int num2 = 5;
		int sum = num1 + num2 ;
		
		float div = ( float ) num1/num2 ;
		System.out.println("the sum of two number is " +  sum);
		System.out.println(div);
		
		String str1 ="Clean World Green World";
		System.out.println(str1.length());
		
		System.out.println(str1);
		
		
		char ch1 = str1.charAt(0);
		System.out.println("The first char is " +  ch1);
		char ch2 = str1.charAt(str1.length()- 1); 
		System.out.println(ch2);
		System.out.println(str1.toUpperCase());
		System.out.println(str1.toLowerCase());

	}

}
