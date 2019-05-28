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
          if(((cr%2==0)&&(cc==1))||((cr%2==1)&&(cc==n)))
          {
            System.out.print(cr+1);
          }
          else
          {
            System.out.print(cr);
          }
        }
        System.out.println();
      }
   }
}