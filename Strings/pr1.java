import java.util.*;
public class pr1{ 
    public static boolean isVowel(Character ch){ 
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){ 
            return true;
        }
        return false;
    }
    public static int countVowel(String str){ 
        int count = 0; 
        for(int i = 0; i < str.length(); i++){ 
            if(isVowel(str.charAt(i))){ 
                count++;
            }
        }
        return count;
    }
    public static void main(String args[]){ 
        Scanner sc = new Scanner(System.in); 
        System.out.println("Now enter the string: "); 
        String str1 = sc.nextLine(); 
        int ans = countVowel(str1); 
        System.out.println("THe number of vowels are : "+  ans);
    }
}