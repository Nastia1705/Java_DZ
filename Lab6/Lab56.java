package Lab6;

import java.util.Scanner;

public class Lab56 {
    static Scanner input = new Scanner(System.in);

    static void reverse(String sentence) {
        StringBuilder reversedsentence = new StringBuilder();
        int j = sentence.length() - 1;
        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(j) != ' ') {
                reversedsentence.append(sentence.charAt(j));

            }
            if (sentence.charAt(i) == ' ') {

                reversedsentence.append(sentence.charAt(i));

            }
            j--;
        }
        System.out.println(reversedsentence);
    }

    public static void main(String[] args) {
        System.out.println("input your sentence: ");
        String sentence = input.nextLine();
        reverse(sentence);
    }

}
