package Myproject2;

public class PrimeNumberCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num= 13;
		boolean b1= true;
		for(int index =2;index<num;index++) {
			int rem = num%index;
			if (rem ==0) {
				System.out.println("no is not prime no");
				b1= false;
				break;
				
			}
		}
if (b1) {
	System.out.println("no is prime no");
}
	}

}
