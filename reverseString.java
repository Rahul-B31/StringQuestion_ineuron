import java.util.*;

class reverseString
{

    // reverse a string without using another string
    public static void reverse(StringBuffer s)
    {
         
     int len = s.length();
     for(int i= 0;i<len/2;i++)
     {
           char temp = s.charAt(i);
           s.setCharAt(i, s.charAt(len-1-i));
           s.setCharAt(len-1-i,temp);
       
         
     }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String ");
        StringBuffer s1 = new StringBuffer();
        s1.append(sc.nextLine());
         reverse(s1);
       
         System.out.println(s1);

    }
}