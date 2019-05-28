import java.util.Scanner;
class Main 
{
  public static void left(int as,int a[],int num)
  {
    int first=1;
    int last;
    if(as%2==0)
    {
      last=as-1;
    }
    else
    {
      last=as-2;
    }
    for(int rot=1;rot<=num;rot++)
    {
      int t=a[first];
      for(int i=3;i<as;i=i+2)
      {
        a[i-2]=a[i];
      }
      a[last]=t;
    }
  }
  public static void right(int as,int a[],int num)
  {
    int first=0;
    int last;
    if(as%2==1)
    {
      last=as-1;
    }
    else
    {
      last=as-2;
    }
    for(int rot=1;rot<=num;rot++)
    {
      int t=a[last];
      for(int i=(last-2);i>=0;i=i-2)
      {
        a[i+2]=a[i];
      }
      a[first]=t;
    }
  }
  public static void main(String args[])
    {
    	//Try your code here
    Scanner in=new Scanner(System.in);
    int as=in.nextInt();
    int a[]=new int[as];
    for(int i=0;i<=(as-1);i++)
    {
      a[i]=in.nextInt();
    }
    int num=in.nextInt();
    left(as,a,num);
    right(as,a,num);
    
    for(int i=0;i<=(as-1);i++)
    {
      System.out.print(a[i]+" ");
    }
  }
 }
