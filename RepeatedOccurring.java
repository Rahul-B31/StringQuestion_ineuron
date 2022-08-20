import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

public class RepeatedOccurring {
    public static void main(String[] args) {
        int arr[] = new int[26];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String s = sc.nextLine();
        int index;
        for(int  i = 0;i<s.length();i++)
        {
            char ch = s.charAt(i);
            if(ch>='A'&&ch<='Z')
            {
               index = ch-'A'; 
            }
            else if(ch>='a'&&ch<='z')
            {
                index = ch-'a' ;
            }
         else{
                continue;
            }
            arr[index]++;
        }

        int index1 = -1;
        int cnt = 1;
   for(int i = 0;i<arr.length;i++)
   {
       if(arr[i]>cnt)
       {
          index1 = i;
          cnt = arr[i];
       }  
   }

    if(cnt == 1)
    {
        System.out.println("All the Character Occur 1 Times Only");
        System.exit(0);
    }
   // get the character

  char ch = (char)(index1+'A');
  System.out.println("The Most repeatedly occurring  Character is : \'"+ch+"\' It occur : "+cnt+" Times");

    }
}
