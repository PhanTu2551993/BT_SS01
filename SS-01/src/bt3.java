import java.util.Scanner;

public class bt3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap So bat ky nho hon 1000");
        while (true){
            System.out.println("Mời nhập số :");
            int n = Integer.parseInt(scanner.nextLine());
            int hangTram = n/100;
            int hangChuc = n % 100/10;
            int hangDv = n%10;
            String chuoi = "";

            if (n>=0 && n<=999){
                System.out.print("Hàng trăm:" +hangTram);
                System.out.print(" - Hàng Chục:" +hangChuc);
                System.out.println(" - Hàng đơn vị:" +hangDv);
                switch (hangTram) {
                    case 1:
                        chuoi = "One Hundred";
                        break;
                    case 2:
                        chuoi = "Two Hundred";
                        break;
                    case 3:
                        chuoi = "Three Hundred";
                        break;
                    case 4:
                        chuoi = "Four Hundred";
                        break;
                    case 5:
                        chuoi = "Five Hundred";
                        break;
                    case 6:
                        chuoi = "Six Hundred";
                        break;
                    case 7:
                        chuoi = "Seven Hundred";
                        break;
                    case 8:
                        chuoi = "Eight Hundred";
                        break;
                    case 9:
                        chuoi = "Nine Hundred";
                        break;
                }
                if (hangChuc>=2){
                    switch (hangChuc){
                            case 2 :
                                chuoi = chuoi + " Twenty";
                                break;
                            case 3 :
                                chuoi += " Thirty";
                                break;
                            case 4 :
                                chuoi += " Fourty";
                                break;
                            case 5 :
                                chuoi += " Fifty";
                                break;
                            case 6 :
                                chuoi += " Sixty";
                                break;
                            case 7 :
                                chuoi += " Seventy";
                                break;
                            case 8 :
                                chuoi += " Eighty";
                                break;
                            case 9 :
                                chuoi += " Ninety";
                                break;
                        }
                    }
                    if (hangChuc==1){
                        switch (hangDv){
                            case 0 :
                                chuoi = chuoi + " Ten";
                                break;
                            case 1 :
                                chuoi = chuoi + " Eleven";
                                break;
                            case 2 :
                                chuoi = chuoi + " Twelve";
                                break;
                            case 3 :
                                chuoi = chuoi + " Thirteen";
                                break;
                            case 4 :
                                chuoi = chuoi + " Fourteen";
                                break;
                            case 5 :
                                chuoi = chuoi + " Fifteen";
                                break;
                            case 6 :
                                chuoi = chuoi + " Sixteen";
                                break;
                            case 7 :
                                chuoi = chuoi + " Seventeen";
                                break;
                            case 8 :
                                chuoi = chuoi + " Eighteen";
                                break;
                            case 9 :
                                chuoi = chuoi + " Nineteen";
                                break;
                        }
                    }
                    if (hangChuc!=1){
                        switch (hangDv){
                            case 1:
                                chuoi = chuoi + " One";
                                break;
                            case 2:
                                chuoi = chuoi + " Two";
                                break;
                            case 3:
                                chuoi = chuoi + " Three";
                                break;
                            case 4:
                                chuoi = chuoi + " four";
                                break;
                            case 5:
                                chuoi = chuoi + " Five";
                                break;
                            case 6:
                                chuoi = chuoi + " Six";
                                break;
                            case 7:
                                chuoi = chuoi + " Seven";
                                break;
                            case 8:
                                chuoi = chuoi + " Eight";
                                break;
                            case 9:
                                chuoi = chuoi + " Nine";
                                break;
                        }
                    }
                    System.out.println(chuoi);

            }else {
                System.out.println(" So nam ngoai khoang 0-999");


            }
        }
    }}