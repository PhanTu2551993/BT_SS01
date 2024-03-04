import java.util.Scanner;

public class bt2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double usd;
        while (true) {
            System.out.println("Mời bạn nhập số tiền USD chuyển đổi :");
            usd = Double.parseDouble(scanner.nextLine());
            if (usd > 0) {
                break;
            } else {
                System.out.println("Nhap so tien > 0");
            }
        }
        double vnd = 24000*usd;
        System.out.println("Chuyển đổi tien");
        System.out.printf("%.2f USD = %.2f VND",usd,vnd);
    }

}
