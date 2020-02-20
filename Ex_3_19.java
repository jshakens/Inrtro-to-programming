import java.util.Scanner;

public class Ex_3_19 {
/*Jordan Shakespeare 2-20-2020 Code finds the perimeter of a triangle*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Side 1: ");
        int Side_1 = scanner.nextInt();
        System.out.print("Side 2: ");
        int Side_2 = scanner.nextInt();
        System.out.print("Side 3: ");
        int Side_3 = scanner.nextInt();
        int Perimeter = Side_1 + Side_2 + Side_3;
        if (Side_1 + Side_2 <= Side_3){
            System.out.println("invalid input");
        }
        if (Side_1 + Side_3 <= Side_2){
            System.out.println("invalid input");
        }
        if (Side_2 + Side_3 <= Side_1){
            System.out.println("invalid input");
        } else {
            System.out.println("Perimeter of Triangle is " + Perimeter);
        }
        }

    }

