import java.util.Scanner;
class Main{
    public static void main(String args[]){
        // Type your code here
      Scanner in=new Scanner(System.in);
      int as=in.nextInt();
      int a[]=new int[as];
      for(int i=0;i<=as-1;i++)
      {
        a[i]=in.nextInt();
      }
      int sea1=in.nextInt();
      int sea2=in.nextInt();
      int ele1=-1;
      int ele2=-1;
      for(int i=0;i<=as-1;i++)
      {
        if(sea1==a[i])
        {
          ele1=i;
        }
        if(sea2==a[i])
        {
          ele2=i;
        }
      }
      System.out.println(ele1);
      System.out.println(ele2);
    }
}