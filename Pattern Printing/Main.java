import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
       //Try your code here
      Scanner sc=new Scanner(System.in);
      int r=sc.nextInt();
      int c=sc.nextInt();
      for(int i=1;i<=r;i++)
      {
        for(int j=c;j>c-i;j--)
        {
          System.out.print(j);
        }
        for(int j=1;j<=c-i;j++)
        {
          System.out.print(r-i+1);
        }
        System.out.println();
      }
    }
}