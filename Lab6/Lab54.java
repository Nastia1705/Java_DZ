package Lab6;

import java.util.Scanner;

public class Lab54 {
    public static void main(String[] args) {
        System.out.print("This program find the longest word and returns it's length.");
        System.out.print("\nEnter a string:-> ");
        Scanner input = new Scanner(System.in);
        String temp = input.nextLine();
        String words[] = temp.split(" ");
        int longestWord = findLongestWord(words);
        System.out.print("The longest word is " + words[longestWord] + ": " +
                lengthWord(words[longestWord]) + " letters.");
    }

    public static int findLongestWord(String arr[]) {
        int longestWord = 0;
        for (int i = 1; i < arr.length; i++)
            if (lengthWord(arr[i]) > lengthWord(arr[longestWord]))
                longestWord = i;
        return longestWord;
    }

    public static int lengthWord(String str) {
        int l = str.toString().length();
        return l;
    }
}