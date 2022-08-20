import java.util.*;;
public class AnagramString {



  

    public static void main(String[] args) {
       
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter two String :-");
      String s1 = new String();
      String s2 = new String();
      s1 = sc.nextLine();  
      s2 = sc.nextLine(); 
      
      int len1 = s1.length();
      int len2 = s2.length();

      if(len1!=len2)
      {
          System.out.println("The String are not  Anagram ");
          System.exit(0);
      }

      // convert the String in char array
      char arr[] = s1.toCharArray();
      char arr1[] = s2.toCharArray();

      // Sort the char Array
      Arrays.sort(arr);
      Arrays.sort(arr1);
    
// Convert the char Array into String 
      s1 = new String(arr);
      s2 = new String(arr1);
  
     boolean ans = s1.equalsIgnoreCase(s2);

     if(ans)
     {
        System.out.println("THE STRING ARE ANAGRAM TO EACH OTHER");
     }
     else
     {
        System.out.println("THE STRING ARE NOT ANAGRAM TO EACH OTHER");
     }



        
    }
    
}
