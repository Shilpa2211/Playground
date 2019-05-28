import java.util.Scanner;
class Main
{
	public static void main (String[] args)
    {
	 // Type your code here   
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      System.out.print(sq(n));
	} 
  public static int sq(int a)
  {
    int r=a*a;
    return r;
  }
}