package Myproject2;

public class ReverseExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str ="clean world green world ";
String result = " ";
for (int index= str.length( )-1; index>=0;index--) {
	
char ch = str.charAt(index);
result = result + ch ;
}
System.out.println("the reverse string is " + result );
int num = 456789;
int res = 0;
while(num>0) {
	int rem = num%10;
	res = res*10 +rem;
	num= num/10;
}
System.out.println("The result num is" + res);
}
}