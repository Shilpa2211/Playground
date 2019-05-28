import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		// Type your code here
      Scanner in=new Scanner (System.in);
      int n=in.nextInt();
      if(n>=85)
        System.out.print("A");
      else if(n>=75&&n<85)
        System.out.print("B");
      else if(n>=65&&n<75)
        System.out.print("C");
      else if(n>=55&&n<65)
        System.out.print("D");
      else if(n>=45&&n<55)
        System.out.print("E");
      else
        System.out.print("Fail");
    }
}