//floyd's triangle
public class pattern6 {
    static int count = 1;

    public static void floyds_triangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(count + "");
                count++;

            }
            System.out.println();

        }

    }

    public static void main(String[] args) {
        floyds_triangle(5);
    }
}
