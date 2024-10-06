import java.util.*;

public class Mdraja11 {
    // bill of items
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float pencil = sc.nextFloat();
        float pen = sc.nextFloat();
        float eraser = sc.nextFloat();
        float total = (pen + pencil + eraser);
        System.out.println(total);
        // with 18% gst
        float newtotal = total + (0.18f * total);
        System.out.println(newtotal);
    }

}
