/*Jordan Shakespeare 2-12-2020 code calculates the cost of road trip*/
import java.util.Scanner;

public class Ex_2_23 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Distance: ");
        double Distance = scanner.nextDouble();
        System.out.print("MPG: ");
        double MPG = scanner.nextDouble();
        System.out.print("Price per Gallon: $");
        double Price_per_Gallon = scanner.nextDouble();
        double Total_cost = (Distance/MPG)*Price_per_Gallon;
        System.out.println("Cost of trip: $" + Total_cost);





    }
}
