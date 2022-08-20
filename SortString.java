import java.util.Scanner;

public class SortString {
    
  public static void sort(StringBuffer s)
  {

    // we use simple bubble sort logic
    // Compare the corresponding character 
     for(int i = 1;i<s.length();i++)
     {
        for(int j = 0;j<s.length()-i;j++)
        {
            if(s.charAt(j)>s.charAt(j+1))
            {
                char temp = s.charAt(j);
                s.setCharAt(j, s.charAt(j+1));
                s.setCharAt(j+1, temp);
            }
        }
     }
  }

 public static void main(String[] args) {

    StringBuffer str = new StringBuffer();
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a String : ");
    str.append(sc.nextLine());
    sort(str);
    System.out.println("Sorted String is : "+str);
 
 }
}
