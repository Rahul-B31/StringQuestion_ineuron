import java.util.Scanner;

public class countSpecialCharacter {
    public static void main(String[] args) {
        String s = new String();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A String : ");
        s = sc.nextLine();
        String temp = "";
        int SpecialChar = 0;
        for(int i= 0;i<s.length();i++)
        {
            char ch = s.charAt(i);
          
            if(!(ch>='a'&&ch<='z'||ch>='A'&&ch<='Z'||ch>='0'&&ch<='9'))
            {
                temp = temp + ch +' ';
                 SpecialChar++;
            }
        }

        System.out.println("The String have "+SpecialChar+ "  Special character That Are"+temp);
    }
}
