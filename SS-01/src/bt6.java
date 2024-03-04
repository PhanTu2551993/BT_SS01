import java.awt.*;
import java.util.Scanner;

public class bt6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số nguyên bất kỳ : ");
        int a = Integer.parseInt(scanner.nextLine());
        if (a%3==0&&a%5==0){
            System.out.println("Số "+a+" Chia hết cho cả 3 và 5" );
        }else if (a%3==0&& a%5 != 0) {
            System.out.println("Số "+a+" Chỉ chia hết cho 3" );
        }else if (a%3 != 0 && a%5==0) {
            System.out.println("Số " + a + " Chỉ chia hết cho 5");
        }else {
            System.out.println("Số " + a + " Không chia hết cho 3 và 5");
        }
    }
}
