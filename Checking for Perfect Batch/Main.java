import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Try your code here
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    int l[]=new int[n];
    for(int i=0;i<n;i++)
    {
      l[i]=in.nextInt();
    }
    pb(l,n);
  }
  public static void pb(int l[],int n)
  {
    boolean is_pb=true;
    int bs=l[0]+l[1]+l[2];
    for(int i=3;i<=n-1;i=i+3)
    {
      int cur_bs=l[i]+l[i+1]+l[i+2];
      if(cur_bs!=bs)
      {
        is_pb=false;
      }
    }
    if(is_pb==true)
    {
      System.out.println("Perfect Batch");
    }
    else
    {
      System.out.println("Not a Perfect Batch");
    }
  }
}