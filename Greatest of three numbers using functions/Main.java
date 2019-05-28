import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in=new Scanner(System.in);
        int n1=in.nextInt();
      int n2=in.nextInt();
      int n3=in.nextInt();
      int r=g(n1,n2);
      System.out.print(g(r,n3));
	}
  public static int g(int p1,int p2)
  {
    int max=0;
    if(p1>p2)
    {
      max=p1;
    }
    else
    {
      max=p2;
    }
    return max;
  }
}