import java.util.Scanner;
class Main {
	public static void main (String[] args){
        // Type your code here
      Scanner in=new Scanner (System.in);
      int n=in.nextInt();
      for(int cr=1;cr<=n;++cr)
      {
        for(int cc=1;cc<=n;++cc)
        {
          if((cr==cc)||(cr+cc==n+1))
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