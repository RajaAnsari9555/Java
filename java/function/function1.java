import java.util.*;

public class function1 {
    public static int calculatesum(int a, int b) {// parametrs or formal parameters
        int sum = a + b;
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int sum = calculatesum(a, b);// arguments or actual parametrs
        System.out.println(sum);
    }
}