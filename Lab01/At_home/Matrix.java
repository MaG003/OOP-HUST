import java.util.Scanner;

public class Matrix {
    public static double[][] SelfInput(Scanner keyboard){
        int m,n;
        System.out.println("Please enter number of row of matrix");
        m = keyboard.nextInt();
        System.out.println("Please enter number of collumn of matrix");
        n = keyboard.nextInt();
        
    }
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);

        int m,n,option;
        double[][] matrix = new double[m][n]; 

        System.out.println("Do you want to enter the matrices?\n 1.Yes\n 2.No");
        option = keyboard.nextInt();
        if (option == 1 || option == 2){  
            double[] NewArray ;
            if(option == 1 ){
                do{
                    NewArray = SelfInput(keyboard) ;    
                } while (NewArray==null);
            }
            else {
                NewArray = new double[] {1225.1, 344, 6, 235.9, 900, 112, 45.1, 67, 79.19};
            }
            System.out.println("Array unsort: " + Arrays.toString(NewArray));
            Arrays.sort(NewArray); 
            System.out.println("Array sorted: " + Arrays.toString(NewArray));
            double sum = 0, average;
            for (int i = 0; i< NewArray.length; i++){
                sum += NewArray[i];
            };
            average = sum /NewArray.length;
            System.out.println("The sum is " + sum+"\nThe average is " + average);
        }
        else {
            System.out.println("Invalid choice");
        }
    } while ( !(option == 1 || option == 2));
}
