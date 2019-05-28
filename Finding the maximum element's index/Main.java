import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Try your code here
    Scanner in=new Scanner (System.in);
    int n=in.nextInt();
    int l[]=new int[n];
    int mi;
    for(int i=0;i<n;i++)
    {
      l[i]=in.nextInt();
    }
    if(l[0]>l[1])
    {
      mi=0;
    }
    else
    {
      mi=1;
    }
    for(int i=2;i<=n-1;i++)
    {
      if(l[mi]<l[i])
      {
        mi=i;
      }
    }
    System.out.println(mi);
    
  }
}