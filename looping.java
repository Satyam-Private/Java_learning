public class looping{ 
    public static void main(String args[]){ 
        System.out.println("hey this is the new java file");

        int i = 0; 

        while(i < 15){ 
            System.out.println("hey this is the example of while loop " + i); 
            i++;
        }

        int addition = 0;
        for(int  it= 1; it <= 10; it++){ 
            addition +=it ;
        }

        System.out.print("the addition is " + addition);
    }
}