import java.util.Scanner;

public class Array {
    public static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        System.out.print("So phan tu cua mang la: ");
        int n = scanner.nextInt();
        
        int [] arr = new int [n];
        System.out.print("Cac phan tu cua mang : \n");
        for (int i = 0; i < n; i++) {
            System.out.printf("a[%d] = ", i);
            arr[i] = scanner.nextInt();
        }
        
        sortASC(arr);
        System.out.println("Day so duoc sap xep tang dan: ");
        show(arr);

        double sum = 0, average;
        for (int i = 0; i< arr.length; i++){
            sum += arr[i];
        };
        average = sum /arr.length;
        System.out.println("\nTong cua mang: " + sum+"\nGia tri trung binh cua mang: " + average);
    }

    public static void sortASC(int [] arr) {
        int temp = arr[0];
        for (int i = 0 ; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
    }
    
    public static void show(int [] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
