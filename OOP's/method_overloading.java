
public class method_overloading {

    public static int addNum(int x, int y, int z) {
        return x + y + z;
    }

    public static int addNum(int x, int y) {
        return x + y;
    }

    public static void main(String[] args) {
        System.out.println("hii");

        System.out.println(addNum(5 , 10));
        System.out.print(addNum(15 , 10  , 50));

    }
}
