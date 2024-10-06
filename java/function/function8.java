//convert binary to decimal

public class function8 {
    public static void bintodec(int binNum) {
        int myNUm = binNum;
        int pow = 0;
        int decNUm = 0;
        while (binNum > 0) {
            int lastdigit = binNum % 10;
            decNUm = decNUm + (lastdigit * (int) Math.pow(2, pow));
            pow++;
            binNum = binNum / 10;

        }
        System.out.println("decimalof" + myNUm + "=" + decNUm);
    }

    public static void main(String[] args) {
        bintodec(111);
    }

}
