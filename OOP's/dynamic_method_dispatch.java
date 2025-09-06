class one { 
     public void meth1(){ 
        System.out.println("hello i am inside the class one");
    }
}

class two extends one{ 
    public void meth1(){ 
        System.out.println("hellow i am inside the class two");
    }
}


public class dynamic_method_dispatch{ 
    public static void main(String args[]){ 
        System.out.println("hellow");
        one ob = new two(); 
        ob.meth1();
    }
}