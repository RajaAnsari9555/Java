//function overloading using data types
public class function6 {
    public static int sum(int a, int b) {
        return a + b;

    }

    public static float sum(float a, float b, float c) {
        return a + b + c;

    }

    public static void main(String[] args) {
        System.out.println(sum(7, 8));
        System.out.println(sum(7.6f, 7.7f, 7.5f));

    }
}
