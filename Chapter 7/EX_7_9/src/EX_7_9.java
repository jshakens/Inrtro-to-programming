import java.util.Scanner;

public class EX_7_9 {

    public static void main(String[] args) {
        double[] numbers = new double[10];
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter ten numbers: ");
        for (int i = 0; i < numbers.length; i++){
            numbers[i] = scanner.nextDouble();
        }
        System.out.println("The smallest value in the array is: "+ min(numbers));

    }

    public static double min(double[] array) {
    double min = array[0];
    for ( int i = 1; i < array.length; i++)
        if( min > array[i])
            min = array[i];

        return min;
    }

    }



