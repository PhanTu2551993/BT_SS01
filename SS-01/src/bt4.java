import java.awt.*;
import java.util.Scanner;

public class bt4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chiều dài:");
        int a = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập chiều rộng:");
        int b = Integer.parseInt(scanner.nextLine());
        int C = (a+b)*2;
        int S = a*b;
        System.out.println("Chu vi HCN là :"+C);
        System.out.println("Diện tích HCN là :"+S);
    }
}
