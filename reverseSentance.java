import java.util.Scanner;

public class reverseSentance {

    public static String reverse(String s)
    {
       String temp ="";
       for(int i = s.length()-1;i>=0;i--)
       {
            temp = temp+s.charAt(i);
       }
       return temp;
    }
    public static void main(String[] args) {

      Scanner sc = new Scanner(System.in);
      String s1 = new String();
      System.out.println("Enter a string ");
      s1 = sc.nextLine();
      String []arr = s1.split(" ");

      String ans="";
      for(int i=0;i<arr.length;i++)
      {
           ans = ans+reverse(arr[i])+' ';
      }
     
      System.out.println(ans);
    
    


    
    }
    
}
