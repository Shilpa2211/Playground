import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		// Type your code her
      Scanner in=new Scanner(System.in);
      int num= in.nextInt();
      int a=(num%100)/10;
      System.out.println(a);
	}
}