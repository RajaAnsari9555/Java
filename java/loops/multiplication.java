import java.util.*;

public class multiplication {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("enter the no.");
       
      int  num = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            num = num * i;

        }
        System.out.println(num +"*"+ i +"="+ num * i)
    }
}
