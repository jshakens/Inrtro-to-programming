import java.util.Scanner;

public class Ex_4_23 {
/*Jordan Shakespeare 2-26-2020 code computes the gross and net pay of an employee*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Employee name: ");
        String employee_name = scanner.nextLine();
        System.out.print("Hours worked: ");
        float Hours_worked = scanner.nextFloat();
        System.out.print("Pay per hour: ");
        float Pay_per_hour = (float) scanner.nextDouble();
        float Gross_pay = Hours_worked * Pay_per_hour;
        System.out.print("Federal deduction rate: ");
        float Federal_deduction = (float) (Gross_pay * (scanner.nextDouble()));
        System.out.print("State deduction rate: ");
        float State_deduction = (float) (Gross_pay * (scanner.nextDouble()));
        System.out.println("Employee name: " + employee_name);
        System.out.print("Hours worked: "+ Hours_worked +"\n");
        System.out.printf("Pay per hour: $%4.2f\n", Pay_per_hour);
        System.out.printf("Gross pay: $%4.2f\n", Gross_pay);
        System.out.println("Deductions:");
        System.out.printf("federal: $%4.2f\n", Federal_deduction);
        System.out.printf("state: $%4.2f\n", State_deduction);
        float Total_deductions = Federal_deduction + State_deduction;
        System.out.printf("Total deductions: $%4.2f\n", Total_deductions);
        float Net_pay = Gross_pay - Total_deductions;
        System.out.printf("Net pay: $%4.2f\n", Net_pay);
    }
}
