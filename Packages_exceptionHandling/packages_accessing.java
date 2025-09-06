import my_math.basic_ops;

public class packages_accessing {
    public static void main(String[] args) {
        basic_ops obj = new basic_ops();
       int ans =  obj.addition_two(10 ,15);
       System.out.println(ans);
    }
}