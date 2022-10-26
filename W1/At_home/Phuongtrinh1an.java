import java.text.DecimalFormat;
import java.util.Scanner;

public class Phuongtrinh1an {
    public static void main(String[] args) {
        int aNumber, bNumber;
        double nghiem;
        DecimalFormat decimalFormat = new DecimalFormat("#.##");    // làm tròn đến 2 chữ số thập phân

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Nhap vao so a: ");
            aNumber = scanner.nextInt();
            System.out.println("Nhap vao so b: ");
            bNumber = scanner.nextInt();
        }
        System.out.println("Phuong trinh ban vua nhap vao la : " + aNumber + "x + " + bNumber + " = 0.");

        if (aNumber == 0) {
            if (bNumber == 0) {
                System.out.println("Phuong trinh co vo so nghiem.");
            } else {
                System.out.println("Phuong trinh vo nghiem.");
            }
        } else {
            nghiem = (double) -bNumber / aNumber;   // ép kiểu để cho ra kết quả chính xác
            System.out.println("Phuong trinh co nghiem x = " + decimalFormat.format(nghiem) + ".");
        }
    }
}


