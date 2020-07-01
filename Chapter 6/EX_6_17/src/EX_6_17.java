/* Jordan Shakespeare 6-19-2020 Intro to Programming
Program displays an n-by-n matrix with random 1's and 0's
 */
import java.util.Scanner;
public class EX_6_17 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a number: ");
        int n = in.nextInt();
        printMatrix(n);
    }
    public static void printMatrix(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print((int) (Math.random() * 2) + " ");
            }
            System.out.println();
        }
    }
}