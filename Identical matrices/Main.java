import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //your code here
     Scanner in=new Scanner(System.in);
    int f=0;
    int r=in.nextInt();
    int c=in.nextInt();
    int a[][]=new int[r][c];
    for(int i=0;i<r;i++){
      for(int j=0;j<c;j++){
        a[i][j]=in.nextInt();
      }
    }
    int b[][]=new int[r][c];
    for(int i=0;i<r;i++){
      for(int j=0;j<c;j++){
        b[i][j]=in.nextInt();
      }
    }
    for(int i=0;i<r;i++)
    {
      for(int j=0;j<c;j++)
      {
        if(a[i][j]!=b[i][j])
        {
          f=1;
          break;
        }
      }
    }
    if(f==0)
      System.out.print("Yes");
    else
      System.out.print("No");
  }
}