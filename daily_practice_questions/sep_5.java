public class sep_5{ 


    public static int prodi(int a , int b){ 
        return a + b;
    }


    public static int fact(int num){ 
        if(num == 0 || num == 1){ 
            return 1;
        }
        return num*fact(num-1);
    }
    public static void main(String[] args) {
        System.out.println("hellow");
        int ans = prodi(10, 15);
        System.out.println(ans);


        int facto = fact(11);
        System.out.println(facto);
    }
}