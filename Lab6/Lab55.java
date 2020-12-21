package Lab6;

import java.util.Scanner;

public class Lab55 {
    static Scanner input = new Scanner(System.in);

    static boolean hasNoneLetters(char[] blacklist, String sentence) {
        for (int i = 0; i < blacklist.length; i++) {
            if (sentence.indexOf(blacklist[i]) != 1) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("input your blacklist: ");
        String blackliststring = input.nextLine();
        System.out.println("input your sentence: ");
        String sentence = input.nextLine();
        char[] blacklist = blackliststring.toCharArray();
        System.out.println(hasNoneLetters(blacklist, sentence));
    }
}
