class newCreated { 
     int x = 10; 
    public newCreated(){ 
        System.out.println("Hey i am inside the constructor of a created class");
    }

}


public class first { 

    public static void main(String args[]){ 
        System.out.println("Hellow");

        newCreated obj = new newCreated(); 
        System.out.println(obj.x);
    }
}