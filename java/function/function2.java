//swap of two numbers
public class function2 {
    public static void swap(int a, int b) {
        int temp = a;

        a = b;
        b = temp;
        System.out.println("a=" + a);
        System.out.println("b=" + b);
    }

    public static void main(String[] args) {
        int a = 24;
        int b = 35;
        swap(a, b);

    }
}
