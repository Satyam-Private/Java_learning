class c1{ 
    public int var1 = 10;
    public void meth1(){ 
        System.out.println("I am meth1 inside c1");
    }
    public void meth2(){ 
        System.out.println("I am meth2 inside c1");
    }
}

class c2 extends c1{ 
    public int var1 = 15; 
    public void meth1(){ 
        System.out.println("I am meth1 inside c2");
    }
    
}


public class overriding_first { 
    public static void main(String args[]){ 
        System.out.println("Hello");
        // c1 obj = new c1(); 
        // System.out.println(obj.var1);
        // obj.meth1();

        c2 obj2 = new c2(); 
        System.out.println(obj2.var1);
        obj2.meth1();
        obj2.meth2();
    }
}