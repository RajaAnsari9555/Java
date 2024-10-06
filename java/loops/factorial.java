import java.util.*;

public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the no.");

        int fact = 1;
        int num = sc.nextInt();

        for (int i = 1; i <= num; i++) {
            fact = fact * i;

        }
        System.out.println("enter the number" + fact);

    }
}
