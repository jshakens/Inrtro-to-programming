
/*Jordan Shakespeare
6-10-2020
Program displays all numbers between 100 and 200 divisible by 5 or 6.
 */
public class EX_5_11 {

    public static void main(String[] args) {
        int counter = 1;
        for (int x = 100; x <=200; x++){
            if ((x % 5 ==0) ^ (x % 6 ==0)) {
                System.out.print(" " + x);
                        counter++;

            }
            if(counter==10) {
                System.out.println(" " + x);
                counter = 1;
            }
        }



    }
}
