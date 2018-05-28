package strings;

import java.util.Scanner;

public class Strings {

    public static void main(String args[]) {
        Strings s = new Strings();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a string");
        String mainString =sc.nextLine();
        String revString = s.reverse(mainString);
        if(mainString.equals(revString))
            System.out.println(mainString+" is a palindrome");
        else
            System.out.println(mainString+" is not a palindrome");
    }

    public String reverse(String str) {
        String rev = "";

        for (int i = str.length() - 1; i >= 0; i--) {

            rev = rev + str.charAt(i);
        }
    return rev;

    }

}
