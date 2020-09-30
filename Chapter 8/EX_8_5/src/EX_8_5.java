import java.util.Arrays;
import java.util.Scanner;

public class EX_8_5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a[][] = new double[3][3];
        double b[][] = new double[3][3];

        System.out.print("Enter Matrix 1: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                a[i][j] = scanner.nextDouble();
            }
        }
        System.out.print("Enter Matrix 2: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                b[i][j] = scanner.nextDouble();
            }
        }
        System.out.println("The result of the matrices is: "+ addMatrix(a,b));
    }
    public static String addMatrix(double[][] a, double[][] b){
        double c[][] = new double[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                c[i][j] = a[i][j] + b[i][j];
            }
        }
            return Arrays.deepToString(c);
        }
}
