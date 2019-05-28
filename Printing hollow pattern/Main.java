import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      for(int cr=1;cr<=n;cr++)
      {
        for(int cc=1;cc<=n;cc++)
        {
          if((cr==1)||(cc==1)||(cr==n)||(cc==n))
          {
            System.out.print("*");
          }
          else
          {
            System.out.print(" ");
          }
        }
        System.out.println();
      }
	}
}