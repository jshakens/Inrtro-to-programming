package com.company;
/*Jordan Shakespeare 2-11-2020 code converts celsius to fahrenheit*/
import java.util.Scanner;

public class Ex_2_1 {

    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("Degrees in Celsius: ");
	double celsius = scanner.nextDouble();
	double fahrenheit = (9.0/5)*celsius+32;
	System.out.println("Degrees in fahrenheit: "+ fahrenheit);

    }
}
