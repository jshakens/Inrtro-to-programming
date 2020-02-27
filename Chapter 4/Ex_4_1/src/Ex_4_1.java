import java.util.Scanner;
/* Jordan Shakespeare 2-24-2020 Code computes area of pentagon*/
public class Ex_4_1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("R = ");
        double r = scanner.nextDouble();
        double s = (2 * r * Math.sin(Math.PI / 5));
        double Area = (5* Math.pow(s, 2))/(4*(Math.tan(Math.PI/5)));
        System.out.println("Area = "+ Area);
    }
}
