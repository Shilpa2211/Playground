import java.util.Scanner;
class Main{
    public static void main(String args[]) {
        // Type your code here
      Scanner scan=new Scanner(System.in);
      String str=scan.nextLine();
      int str_len=str.length();
      int end=str_len-1;
      int f=0;
      boolean is_pal=true;
      while(f<end)
      {
        if(str.charAt(f)!=str.charAt(end))
        {
          is_pal=false;
          break;
        }
        f++;
        end--;
      }
      if(is_pal==true)
      {
        System.out.println("Yes");
      }
      else
      {
        System.out.println("No");
      }
    } 
}