import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Type your code here
    Scanner in=new Scanner (System.in);
    int num=in.nextInt();
    int n1=num/100;
    int n2=(num/10)%10;
    int n3=num%10;
    int rev=(n3*100)+(n2*10)+n1;
    System.out.println(rev);
  }
}