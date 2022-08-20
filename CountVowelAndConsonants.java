import java.util.Scanner;

public class CountVowelAndConsonants {

    public static void countVowelAndConsonants(String s)
    {
        int vowel = 0;
        int consonants = 0;
        for(int i = 0;i<s.length();i++)
        {
            char ch = s.charAt(i);
    
            if(ch=='a'||ch=='A'||ch=='e'||ch=='E'||ch=='i'||ch=='I'||ch=='o'||ch=='O'||ch=='u'||ch=='U')
            {
                vowel++;
            }
            else{
                consonants++;
            }
        }
        System.out.println(" The string have "+vowel+" vowels");
        System.out.println("The String Having "+consonants+" consonants");
    }
    public static void main(String[] args) {
       
       String str = new String();
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter a string : ");
       str = sc.nextLine();
       
       countVowelAndConsonants(str);

    }
}
