import java.util.Scanner;
class Main{
    public static void main(String args[]) {
       // Type your code here
      Scanner in=new Scanner(System.in);
      int as=in.nextInt();
      int ar[]=new int[as];
      for(int i=0;i<=as-1;i++)
      {
        ar[i]=in.nextInt();
      }
      sub(as,ar);
    }
  public static void sub(int as,int ar[])
  {
    for(int i1=0;i1<=as-2;i1++)
    {
      for(int i2=i1+1;i2<=as-1;i2++)
      {
        for(int i3=i2+1;i3<=as-1;i3++)
        {
          System.out.print("("+ar[i1]+","+" "+ar[i2]+","+" "+ar[i3]+")"+" ");
        }
      }
      System.out.println();
    }
  }
}