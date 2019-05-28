import java.util.Scanner;
class Main{
    public static void main(String args[]) {
       // Type your code here
      Scanner in=new Scanner(System.in);
      int as=in.nextInt();
      int a[]=new int[as];
      for(int i=0;i<=as-1;i++)
      {
        a[i]=in.nextInt();
      }
      zeroes(as,a);
      for(int i=0;i<=as-1;i++)
      {
        System.out.print(a[i] + " ");
      }
    }
  public static void zeroes(int as,int a[])
  {
    int c=0;
    for(int i=0;i<=as-1;i++){
      if(a[i]!=0)
      {
        int t=a[i];
        a[i]=a[c];
        a[c]=t;
        c++;
      }
    }
  }
}