import java.util.*;

public class conditional6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no.");
        int A = sc.nextInt();
        System.out.println("enter the no.");
        int B = sc.nextInt();
        System.out.println("enter the no.");
        int C = sc.nextInt();
        if (A > B && A > C) {
            System.out.println("A is largest");

        } else if (B > A && B > C) {
            System.out.println("B is largest");
        } else {
            System.out.println("C is largest");
        }

    }

}
