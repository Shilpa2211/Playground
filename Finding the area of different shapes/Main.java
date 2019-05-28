import java.util.Scanner;
public class Main
{
    public static void main(String args[])
    {
        //Try your code here
      Scanner sc=new Scanner(System.in);
      int o=sc.nextInt();
      switch(o)
      {
        case 1:
          int s=sc.nextInt();
          int as=s*s;
          System.out.println(as);
          break;
        case 2:
          int l=sc.nextInt();
          int b=sc.nextInt();
          int ar=l*b;
          System.out.println(ar);
          break;
        case 3:
          int h=sc.nextInt();
          int ba=sc.nextInt();
          int at=(h*ba)/2;
          System.out.println(at);
          break;
        case 4:
          int r=sc.nextInt();
          double ac=3.14*r*r;
          System.out.println(ac);
          break;
      }
   }
}