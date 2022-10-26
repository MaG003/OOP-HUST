import java.util.Scanner;

public class Calculate {
	 public static void main(String[] args)
	    {
	        try (Scanner in = new Scanner(System.in)) {
				System.out.print("Nhap so thu nhat: ");
				int firstInt = in.nextInt();
				System.out.print("Nhap so thu hai: ");
				int secondInt = in.nextInt();

				System.out.printf("Tong cua 2 so : %d%n", firstInt + secondInt);
				System.out.printf("Hieu cua 2 so : %d%n", firstInt - secondInt);
				System.out.printf("Tich cua 2 so : %d%n", firstInt * secondInt);
				System.out.printf("Thuong cua 2 so doi mot(so thu nhat/so thu hai): %.2f%n", ( (double) firstInt / secondInt ));
				System.out.printf("Thuong cua 2 so doi mot(so thu hai/so thu nhat): %.2f%n", ( (double) secondInt / firstInt  ));
			}
		}

}
