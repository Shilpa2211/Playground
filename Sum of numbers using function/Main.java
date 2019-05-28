import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in=new Scanner (System.in);
      int n=in.nextInt();
      System.out.print(s(n));
    }
    public static int s(int y)
    {
      int sum=0;
      for(int i=1;i<=y;i++)
      {
        sum=sum+i;
      }
      return sum;
	}
}