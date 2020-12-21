package Lab6;

import java.util.Scanner;

public class Lab5 {
    static Scanner input = new Scanner(System.in);

    static int newnumber(int number) {
        int figure = 0, timefigure;
        for (int i = 1; i != 0; ) {
            timefigure = number % 10;
            figure += timefigure;
            number = (number - timefigure) / 10;
            if (number == 0) {
                System.out.print(timefigure + " = ");
                i = 0;
            } else {
                System.out.print(timefigure + " + ");
            }
        }
        return figure;
    }

    public static void main(String[] args) {
        int number = input.nextInt();
        System.out.print(number + " ---> ");
        number = newnumber(number);
        while (number > 10) {
            System.out.print(" " + number + " ---> ");
            number = newnumber(number);
        }
        System.out.print(number);
    }

}
