import java.util.Scanner;
class Main
{
  static int most(int a[],int n,int f[])
  {
    int max=0;
    int cur=1;
    for(int i=0;i<n;i++)
    {
      for(int j=i+1;j<n;j++)
      {
        if(a[i]==a[j])
          cur++;
      }
      f[i]=cur;
      cur=1;
    }
    for(int i=0;i<n;i++)
    {
      if(f[i]>f[max])
        max=i;
    }
    return a[max];
  }
  
  public static void main(String args[])
  {
    
    // your code here
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int a[]=new int[n];
    for(int i=0;i<n;i++)
    {
      a[i]=sc.nextInt();
    }
    int f[]=new int[n];
    System.out.println(most(a,n,f));
    
  }
}