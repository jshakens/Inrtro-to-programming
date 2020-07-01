/* Jordan Shakespeare 6-23-2020 Intro to programing
Code reverses user input and figures out if user input is palindrome returning true for is palindrome and false for is not palindrome.
 */
import java.util.Scanner;

public class Ex_6_3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a value: ");
        int n = scanner.nextInt();
        boolean p = isPalindrome(n);
        if (p){
            System.out.println(true);
        }else System.out.println(false);

    }
        public static int reverse(int n){
            int r = 0;
            int s = 0;
            int t = n;
            while (n != 0){
                r = n % 10;
                s = s * 10 + r;
                n /= 10;
            }
            return s;
        }
        public static boolean isPalindrome(int n){
        int s = reverse(n);
        if(n==s){
            return true;
        }
        else
            return false;
    }

}

