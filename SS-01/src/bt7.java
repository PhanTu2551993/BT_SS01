import java.util.Scanner;

public class bt7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap số bất kỳ : ");
        int a = Integer.parseInt(scanner.nextLine());
        switch (a){
            case 1 :
                System.out.println("Một");
                break;
            case 2 :
                System.out.println("Hai");
                break;
            case 3 :
                System.out.println("Ba");
                break;
            case 4 :
                System.out.println("Bốn");
                break;
            case 5 :
                System.out.println("Năm");
                break;
            case 6 :
                System.out.println("Sáu");
                break;
            case 7 :
                System.out.println("Bảy");
                break;
            case 8 :
                System.out.println("Tám");
                break;
            case 9 :
                System.out.println("Chín");
                break;
            default:
                System.out.println("Nhâp sai định dạng");
        }
    }
}
