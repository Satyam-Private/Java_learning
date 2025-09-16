class validAnagram {
    public static boolean isAnagram(String s, String t) {
        int count[] = new int[26]; 
        if(s.length() != t.length()) return false;
        for(int i = 0; i < s.length(); i++){ 
            count[s.charAt(i)-'a']++; 
            count[t.charAt(i)-'a']--; 

        }
        for(int i = 0; i < count.length; i++){ 
            if(count[i] != 0) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        String s = "hello"; 
        String t = "elhlo"; 
    
        boolean ans = isAnagram(s, t); 
        if(ans){ 
            System.out.println("Strings are anagram ");
        }
        else{ 
            System.out.println("Strings are not anagram");
        }
    }
}