import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    // your code here
    Scanner sc=new Scanner(System.in);
    int N=sc.nextInt();
    int a[]=new int[20];
    int i,j;
    for(i=0;i<N;i++)
    {
      a[i]=sc.nextInt();
    }
    System.out.print(sum_sub(a,N));
  }
  public static int sum_sub(int a[],int n)
  {
    int run_sum,max_sum,i;
    run_sum=a[0];
    max_sum=a[0];
    for(i=1;i<n;i++)
    {
         if(a[i]>a[i-1])
         {
           run_sum += a[i];
         }
         else
         {
           run_sum=a[i];
         }
         if(run_sum>max_sum)
         {
           max_sum=run_sum;
         }
      }
     return max_sum;
  }
}