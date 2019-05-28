import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        // Type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int a[]=new int[n];
      for(int i=0;i<=n-1;i++){
        a[i]=sc.nextInt();
      }
      int is=0;
      for(int v=1;v<=n;v++)
      {
        boolean is_found=false;
        for(int i=0;i<=n-1;i++){
          if(a[i]==v)
          {
            is_found=true;
            break;
          }
        }
        if(is_found==false){
          is=v;
          break;
        }
      }
      System.out.print(is);
      
    }
}