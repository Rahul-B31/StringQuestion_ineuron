import java.util.Scanner;

/**
 * PangramString
 */
public class PangramString {

    public static boolean checkPangram(String str)
    {
        int arr[] = new int[26];
        int index;
        for(int i=0;i<str.length();i++)
        {
            char ch = str.charAt(i);

            if(ch>='A'&&ch<='Z')
            {
                index = ch-'A';

            }
            else if(ch>='a'&&ch<='z')
            {
                index = ch-'a';
            }
           else{
               continue;

            }
            arr[index] = 1;
        }

        // check for pangram 

        for(int i= 0;i<arr.length;i++)
        {
            if(arr[i]==0)
            {
                return false;
            }
        }
        return true;
    }
 public static void main(String[] args) {
   
    String str = new String();
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a String : ");
    str = sc.nextLine();
     if(checkPangram(str))
     {
        System.out.println("The Given String Are Pangram");
     }
     else{
        System.out.println("The Given String Are Not Pangram");
     }


 }
   

}