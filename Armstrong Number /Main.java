import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int c=n;
      int cnt=0;
      if(n==0)
      {
        System.out.println(n);
      }
      else
      {
        while(n>0)
        {
          cnt++;
          n=n/10;
        }
      }
      n=c;
      int s=0;
      int p=1;
      while(n>0)
      {
        int r= n%10;
        for(int ct=1;ct<=cnt;ct++)
        {
          p=p*r;
        }
        s=s+p;
        p=1;
        n=n/10;
      }
      if(s == c)
      {
        System.out.print("Armstrong Number");
      }
      else
      {
        System.out.print("Not a Armstrong Number");
      }
	}
}