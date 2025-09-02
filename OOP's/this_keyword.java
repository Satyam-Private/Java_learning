public class this_keyword { 
    String name; 
    int id;
    public this_keyword(String name , int id) {
        this.name = name;
        this.id = id;
    }

    public void display(){ 
        System.out.println("The name is : " + name);
        System.out.println("The id is : " + id);

    }


    
    public static void main(String args[]){ 
        System.out.println("hellow !! ");
        this_keyword obj = new this_keyword("Satyam" , 1);
        obj.display();
    }
}