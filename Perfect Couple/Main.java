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
      int val=in.nextInt();
      pc(as,ar,val);
    }
  public static void pc(int as,int ar[],int val)
  {
    for(int i1=0;i1<=as-1;i1++)
    {
      for(int i2=i1+1;i2<=as-1;i2++)
      {
        int sum=ar[i1]+ar[i2];
        if(sum==val)
        {
          System.out.println(ar[i1]+","+" "+ar[i2]);
        }
      }
    }
  }
}

                          
