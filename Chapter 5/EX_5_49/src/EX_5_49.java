/*Jordan Shakespeare 6-16-2020
5-49 Program counts and displays number of vowels and consonants in a string. Note that program counts spaces and special characters as consonants.
 */
import java.util.Scanner;

public class EX_5_49 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Type your message here: ");
        String x = scanner.nextLine();
        char y[] = x.toUpperCase().toCharArray();
        int size = y.length;
        int vowel_count = 0;
        int consonant_count = 0;

        int i = 0;
        while(i != size) {
            if (y[i] == 'A' || y[i] == 'E' || y[i] == 'I' || y[i] == 'O' || y[i] == 'U') {
                ++vowel_count;
            } else {
                ++consonant_count;

            }
            ++i;
        }
        System.out.println(y);
        System.out.println("Vowel count is "+vowel_count);
        System.out.println("Consonant count is "+consonant_count);


    }
}
