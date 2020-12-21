package Lab6;

import java.util.Scanner;

public class Lab53 {
    static Scanner input = new Scanner(System.in);

    static void newnumber(int number1, int number2) {
        int number = number2;
        for (int i = 1; i <= number1; i++) {
            number2 *= i;
            if (i == number1) {
                System.out.print(number2);
            } else {
                System.out.print(number2 + "->");
            }
            number2 = number;
        }
    }

    public static void main(String[] args) {
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        newnumber(number1, number2);
    }
}
