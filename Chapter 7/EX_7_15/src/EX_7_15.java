import java.util.Scanner;

public class EX_7_15 {

    public static void main(String[] args) {
        int[] arr = new int[10];
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter ten numbers: ");

        int length = arr.length;
        for (int i = 0; i < length; i++) {
            arr[i] = scanner.nextInt();}

         removeDuplicateElements( arr, length);
    }
    public static void removeDuplicateElements(int[] arr, int n){
        if (n==0 || n==1){

        }
        int[] temp = new int[n];
        int j = 0;
        for (int i=0; i < n-1; i++){
            if (arr[i] != arr[i+1]){
                temp[j++] = arr[i];
            }
        }
        temp[j++] = arr[n-1];
        // Changing original array
        for (int i=0; i < j; i++){
            arr[i] = temp[i];
        }
        for(int i = 0; i < j; i ++){
            System.out.print(temp[i]+" ");
        }
    }
    
}
