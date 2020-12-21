package Lab5;

import java.util.Scanner;

public class Lab51 {
    public static void main(String[] args) {
        System.out.print("Enter a string:-> ");
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        System.out.println("=" + calculate(str));
    }

    public static double calculate(String str) {
        char[] charArr = str.toCharArray();
        int begin, n, i = 0;
        double rezult;
        while (Character.isDigit(charArr[i])) {
            i++;
        }
        rezult = getNumber(charArr, 0, i);
        char znak;
        for (; i < charArr.length; i++) {
            znak = charArr[i];
            i++;
            begin = i;
            while ((charArr.length > i) && Character.isDigit(charArr[i]))
                i++;
            n = getNumber(charArr, begin, i);
            if (znak == '+')
                rezult = rezult + n;
            else if (znak == '-')
                rezult = rezult - n;
            else if (znak == '/')
                rezult = rezult / n;
            else if (znak == '*')
                rezult = rezult * n;
            i--;
        }
        return rezult;
    }

    public static int getNumber(char[] arr, int begin, int end) {
        end--;
        char[] number = new char[end - begin + 1];
        int j = 0;
        for (int i = begin; i <= end; i++) {
            number[j] = arr[i];
            j++;
        }
        String str = new String(number);
        return Integer.parseInt(str);
    }
}
