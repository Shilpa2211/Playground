import java.util.Scanner;
class Main{ 
  public static void main(String args[]) 
  { 
    // Type your code here
     Scanner in=new Scanner(System.in);
    int rs=in.nextInt();
    int cs=in.nextInt();
    int m1[][]=new int[rs][cs];
    for(int i=0;i<rs;i++){
      for(int j=0;j<cs;j++)
      {
        m1[i][j]=in.nextInt();
      }
    }
    int m2[][]=new int[rs][cs];
    for(int i=0;i<rs;i++){
      for(int j=0;j<cs;j++){
        m2[i][j]=in.nextInt();
      }
    }
    int sum[][]=new int[rs][cs];
    subtraction_of_two_matrices(m1, m2, sum);
    display(sum);
  }
  public static void subtraction_of_two_matrices(int m1[][],int m2[][],int sum[][])
  {
    for(int i=0;i<=sum.length-1;i++){
      for(int j=0;j<=sum[i].length-1;j++)
      {
        sum[i][j]=m1[i][j]-m2[i][j];
      }
    }
  }
  public static void display(int m[][]){
    for(int i=0;i<=m.length-1;i++){
      for(int j=0;j<=m[i].length-1;j++)
      {
        System.out.print(m[i][j] + " ");
      }
      System.out.println();
    }
  }
} 