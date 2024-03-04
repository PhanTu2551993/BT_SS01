import java.util.Scanner;

public class bt5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập điểm Toán :");
        double toan = Double.parseDouble((scanner.nextLine()));
        System.out.println("Nhập điểm Lý :");
        double ly = Double.parseDouble((scanner.nextLine()));
        System.out.println("Nhập điểm Hóa :");
        double hoa = Double.parseDouble((scanner.nextLine()));
        System.out.println("Nhập điểm Văn :");
        double van = Double.parseDouble((scanner.nextLine()));
        System.out.println("Nhập điểm Anh :");
        double anh = Double.parseDouble((scanner.nextLine()));

        double tbc = (toan+ly+hoa+van+anh)/5;

        if (0<=tbc&&tbc<5){
            System.out.println("Điểm TBC= "+tbc+" : Xếp loại yếu");
        } else if (5<=tbc&&tbc<6.5) {
            System.out.println("Điểm TBC= "+tbc+" : Xếp loại trung bình");
        } else if (6.5<=tbc&&tbc<8) {
            System.out.println("Điểm TBC= "+tbc+" : Xếp loại khá");
        } else if (8<=tbc&&tbc<9) {
            System.out.println("Điểm TBC= "+tbc+" : Xếp loại giỏi");
        }else {
            System.out.println("Điểm TBC= "+tbc+" : Xếp loại xuất sắc");
        }

    }

}
