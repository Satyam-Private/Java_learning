class base{ 
    public int x = 10; 

    public void setX(int x){ 
        this.x = x; 
    }

    public int getX(){ 
        return x;
    }
}

class derived extends base { 
    public int y = 10; 

    public void setY(int y){ 
        this.y = y; 
    }
    public int add(){ 
        return (x + y);
    }

}



public  class inheritance_first{ 
    public static void main(String args[]){ 
        System.out.println("hello");
        derived ob1 = new derived(); 
        ob1.setX(50);
        ob1.setY(100);
        System.out.println(ob1.add());

    }
}