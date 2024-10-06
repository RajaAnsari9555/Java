//function overloading using parametrs
public class function5 {
    public static int sum(int a, int b) {
        return a + b;

    }

    public static int sum(int a, int b, int c) {
        return a + b + c;

    }

    public static void main(String[] args) {
        System.out.println(sum(7, 8));
        System.out.println(sum(7, 7, 7));
    }
}
