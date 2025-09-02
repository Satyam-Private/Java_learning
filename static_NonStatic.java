// Static function (method):

// Belongs to the class itself, not to any particular object.

// Can be called directly using the class name (or inside main without creating an object).

// Shared by all objects of that class.

// Example: Math.sqrt(25) (you don’t need to create a Math object).

// Non-static function (method):

// Belongs to the object (instance) of the class.

// You need to create an object to use it, because it works on the data stored inside that object.

// Each object has its own copy of instance variables that the method can work with.

public class static_NonStatic { 

    static void firstFunc(){ 
        System.out.println("Hey i am inside the static function");
    }

    void secFunc(){ 
        System.out.println("Hey ii am inside the non static function");
    }


    public static void main(String args[]){ 
        System.out.println("hellow!!");
        // Now lets understand about static keyword

        firstFunc();

        // secFunc(); this will give error for that we need to make a object 


        static_NonStatic obj = new static_NonStatic(); 
        obj.secFunc(); 
    }
}