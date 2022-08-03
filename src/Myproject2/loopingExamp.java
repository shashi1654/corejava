package Myproject2;

public class loopingExamp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 2;
		while (num<=10) {
			if (num ==6) {
				
				num= num+2;
				continue;
			}
			System.out.println(num);
			num= num +2 ;
		System.out.println("After while loop");
		
		for (int index=1;index<=10;index++) {
			if (index==6 ) {
				
			}
			continue;
			System.out.println(index);
		}
	}

}
}
