class variables { 
    public int x = 10; 
    public void greeting(){ 
        System.out.println("Hello greetings from my side ");
    }
}

public class public_modifier { 
    public static void main(String[] args) {
        System.out.println("hellow");
        variables obj = new variables(); 
        System.out.println(obj.x);
        obj.greeting();
    }
}