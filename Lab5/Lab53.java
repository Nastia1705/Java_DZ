package Lab5;

import java.util.Scanner;

public class Lab53 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String operation;
        int i = 0;
        String str = null;
        sentence = "";
        while (str != "3") {
            System.out.print("Please press '1' to add or delete sentence or '2' to show your sentence or '3' to exit the program: ");
            operation = input.next();

            switch (operation) {
                case "1":
                    System.out.println("Use +- to add or delete sentence");
                    str = input.next();
                    changeSentence(str);
                    break;
                case "2":
                    System.out.println("Your sentence: " + sentence);
                    break;
                case "3":
                    System.out.println("Goodbye!");
                    str = "3";
                    break;
                default:
                    System.out.println("You pressed the wrong button. Please try again");
            }
        }
    }

    static String sentence;

    static void changeSentence(String str) {
        if (str.charAt(0) == '+')
            add(str);
        else if (str.charAt(0) == '-')
            delete(str);
        else
            System.out.println("You enter the wrong sentence. Please try again");
    }

    static void delete(String str) {
        str = str.substring(1);
        int index = str.indexOf(str);
        if (index == -1) {
            System.out.println("The '" + str + "' was not found");
        } else if (index == 0) {
            sentence = sentence.replace(str + ", ", "");
            sentence = sentence.replace(", " + str, "");
            sentence = sentence.replace(str, "");
            System.out.println("The '" + str + "' has been deleted");
        } else {
            sentence = sentence.replace(", " + str, "");
            sentence = sentence.replace(str, "");
            System.out.println("The '" + str + "' has been deleted");
        }
    }

    static void add(String str) {
        if (sentence == "")
            sentence = str.substring(1);
        else
            sentence += ", " + str.substring(1);
    }

}