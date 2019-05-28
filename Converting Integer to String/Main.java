import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    // type your code here
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    int t=n;
    int c=0;
    if(n<0)
    {
      n=n * -1;
    }
    do
    {
      c++;
      n=n/10;
    }while(n>0);
    if(t<0)
      c=c+1;
    char a[]=new char[c];
    if(t<0)
    {
      t=t * -1;
      a[0]='-';
    }
    c=c-1;
    while(t>0)
    {
      char ch=(char)((t%10) + '0');
      a[c]=ch;
      t /=10;
      --c;
    }
    System.out.print(a);
  }
}