import java.util.Scanner;

public class Ex_3_3 {
/*Jordan Shakespeare 2-19-2020*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("A: ");
        double A = scanner.nextDouble();
        System.out.print("B: ");
        double B = scanner.nextDouble();
        System.out.print("C: ");
        double C = scanner.nextDouble();
        System.out.print("D: ");
        double D = scanner.nextDouble();
        System.out.print("E: ");
        double E = scanner.nextDouble();
        System.out.print("F: ");
        double F = scanner.nextDouble();
        double X = ((E*D)-(B*F))/((A*D)-(B*C));
        double Y = ((A*F)-(E*C))/((A*D)-(B*C));
        if ((A * D) - (B * C) == 0){
            System.out.println("Cannot Divide by 0");
        } else {
            System.out.println("Y= " + Y);
            System.out.println("X= " + X);
        }


    }
}
