import java.util.Scanner;
/*Jordan Shakespeare 2-12-2020 code displays account value after a period of months*/
public class Ex_2_13 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double interest = (0.05/12);
        System.out.print("Savings: $");
        double savings = scanner.nextFloat();

        double account_value = savings * (1 + interest);
        account_value = (100 * (1 + 0.00417));
        System.out.println("Account value after one month: "+ account_value);
        account_value = ((savings + account_value) * (1 + interest));
        System.out.println("Account value after two months: "+ account_value);
        account_value = ((savings + account_value) * (1 + interest));
        System.out.println("Account value after three months: "+ account_value);
        account_value = ((savings + account_value) * (1 + interest));
        System.out.println("Account value after four months: "+ account_value);
        account_value = ((savings + account_value) * (1 + interest));
        System.out.println("Account value after five months: "+ account_value);
        account_value = ((savings + account_value) * (1 + interest));
        System.out.println("Account value after six months: "+ account_value);




    }
}
