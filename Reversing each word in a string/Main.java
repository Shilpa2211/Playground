import java.util.Scanner;
class Main
{
  public static void rev(String str)
  {
    String[] words=str.split(" ");
    String revs="";
    for(int i=0;i<words.length;i++)
    {
      String word=words[i];
      String rev="";
      for(int j=word.length()-1;j>=0;j--)
      {
        rev=rev+word.charAt(j);
      }
      revs=revs+rev+" ";
    }
    System.out.println(revs);
  }
  public static void main(String args[])
  {
    //your code here;
    Scanner sc=new Scanner(System.in);
    String str=sc.nextLine();
    rev(str);
  }
}