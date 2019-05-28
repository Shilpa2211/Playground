import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //type your code;
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int l[]=new int[n];
    for(int i=0;i<n;i++)
    {
      l[i]=sc.nextInt();
    }
    insert(n,l);
  }
  public static void insert(int n,int l[])
  {
    for(int i1=1;i1<n/2;i1++)
    {
      int k=l[i1];
      int i2=i1-1;
      while((i2>=0)&&(l[i2]>k))
      {
        l[i2+1]=l[i2];
        i2--;
      }
      l[i2+1]=k;
    }
    for(int i=0;i<n;i++)
    {
      System.out.print(l[i]+" ");
    }
  }
}