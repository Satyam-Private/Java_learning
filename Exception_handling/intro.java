public class intro{ 
    public int first(){ 
        return 1;
    }
    public static void main(String[] args) {
        try{ 
            System.out.println(8/0);
        }catch(Exception e){ 
            System.out.println(e);
        }
        finally{ 
            System.out.println("This code block will always execute ");
        }
        System.out.println("Hello, this is after try and catch block");
    }
}
 