class practice { 
    public String to_lower(String text){ 
        text = text.toLowerCase(); 
        return text;
    }
}



public class string { 



    public static void main(String args[]){ 
        System.out.println("Hellow !!");
        practice obj = new practice();
        String result = obj.to_lower("Hey This Is The String"); 
        System.out.println(result);
    }
}