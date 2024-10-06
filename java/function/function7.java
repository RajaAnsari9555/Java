//prime no.
public class function7 {
    public static boolean isprime(int n) {
        boolean isprime = true;
        for (int i = 2; i <= n - 2; i++) {
            if (n % i == 0) {
                isprime = false;

            }
        }
        return true;
    }

    // prime in range
    public static void primeinrange(int n) {
        for (int i = 2; i <= n; i++) {
            if (isprime(i)) {
                System.err.print(i + "");
            }

        }
        System.out.println();

    }

    public static void main(String[] args) {
        primeinrange(20);

    }

}
