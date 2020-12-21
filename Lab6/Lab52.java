package Lab6;

import java.util.Scanner;

public class Lab52 {
    static Scanner input = new Scanner(System.in);

    static void newnumber(int number) {
        int hh, mm, ss;
        hh = number / 3600;
        mm = (number % 3600) / 60;
        ss = (number % 60);
        System.out.print(hh + ":" + mm + ":" + ss);
    }

    public static void main(String[] args) {
        int number;
        do {
            number = input.nextInt();
        } while (number < 0);
        newnumber(number);
    }

}
