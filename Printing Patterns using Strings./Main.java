import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //type your code here
    Scanner sc=new Scanner(System.in);
    String str=sc.nextLine();
    int n=str.length();
    int m=n/2;
    for(int i=n-1;i>=0;i--)
    {
      int c=0;
      for(int s=0;s<i;s++)
      {
        System.out.print(" ");
        c++;
      }
      if(i>=n/2)
      {
        int j=n/2;
        while(c<n)
        {
          System.out.print(str.charAt(j++));
          c++;
        }
      }
      else
      {
        int j=n/2;
        while(c<=(n/2+i))
        {
          System.out.print(str.charAt(j++));
          c++;
        }
        j=0;
        while(c<n)
        {
          System.out.print(str.charAt(j++));
          c++;
        }
      }
      System.out.println();
    }
  }
}