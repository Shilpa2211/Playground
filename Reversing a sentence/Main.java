import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        // Type your code here
      Scanner scan=new Scanner(System.in);
      String str=scan.nextLine();
      StringBuilder sb=new StringBuilder(str);
      int str_len=sb.length();
      reverse_string(sb,0,str_len-1);
      int strt_idx=0;
      for(int idx=0;idx<str_len;idx++)
      {
        if(sb.charAt(idx)== ' ' )
        {
          reverse_string(sb,strt_idx,idx-1);
          strt_idx=idx+1;
        }
        else if(idx==(str_len-1))
        {
          reverse_string(sb,strt_idx,idx);
          strt_idx=idx+1;
        }
      }
      System.out.print(sb);
    }
    // Function to reverse a string
    public static void reverse_string(StringBuilder sb, int strt_idx, int end_idx)
    {
        // Type your code here
      int e=end_idx;
      int f=strt_idx;
      while(f<e)
      {
        char tmp_ch=sb.charAt(f);
        sb.setCharAt(f,sb.charAt(e));
        sb.setCharAt(e,tmp_ch);
        f++;
        e--;
      }
    }
}