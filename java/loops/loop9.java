
//diplay all no.entered by user except multiples of 10;
import java.util.*;

public class loop9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("Enter th no.");
            int n = sc.nextInt();
            if (n % 10 == 0) {
                continue;
            }
            System.out.println("number was:" + n);

        } while (true);
    }

}
