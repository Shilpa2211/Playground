import java.util.*;
import java.io.*;
import java.lang.*;
public class Main 
{
    public static void main(String a[])throws IOException
    {
       // type your code here
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      LinkedHashSet<String> lhs=new LinkedHashSet<String>();
      String m=br.readLine();
      String[] arr=m.split(",");
      for(int i=0;i<arr.length;i++)
      {
        lhs.add(arr[i]);
      }
      System.out.println(lhs);
      System.out.print("Enter the value to be deleted: ");
      String n=br.readLine();
      System.out.println(n);
      lhs.remove(n);
      System.out.println(lhs);
      System.out.print("Enter the value to be added: ");
      String p=br.readLine();
      System.out.println(p);
      lhs.add(p);
      System.out.println(lhs);
    }
}