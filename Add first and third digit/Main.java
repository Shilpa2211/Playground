import java.util.Scanner;
class Main{
	public static void main (String[] args) {
		// Type your code here
      Scanner in=new Scanner (System.in);
      int num=in.nextInt();
      int f= num/100;
      int l=num%10;
      int a=f+l;
      System.out.println(a);
	}
}