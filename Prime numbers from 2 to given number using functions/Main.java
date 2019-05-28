import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      for(int i=2;i<=n;i++)
      {
        if(isp(i))
        {
          System.out.println(i);
        }
      }
	}
  public static boolean isp(int m)
  {
    boolean isp=true;
    for(int j=2;j<=m/2;j++)
    {
      if(m%j==0)
      {
        isp=false;
        break;
      }
    }
    return isp;
  }
}