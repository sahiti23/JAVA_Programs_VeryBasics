package printMenu;

import java.util.Scanner;

public class print {
    public static void main(String args[]) {
        String menu[] = {"Indian", "Chinese", "Italian", "American"};
        String indian[] = {"Rice", "Dal", "curries", "fry"};
        String chinese[] = {"chow mein", "egg rolls"};
        String italian[] = {"pasta", "pizza"};
        String american[] = {"pancakes", "fries"};
        System.out.println("Available cuisines");
        for (String m : menu)
            System.out.println(m);
        System.out.println("Select your choice of cuisine:");
        Scanner s = new Scanner(System.in);
        String choice = s.next();
        if (choice.equalsIgnoreCase("indian")) {
            System.out.print("you can have ");
            for (String i : indian)
                System.out.print(i + "  ");

        } else if (choice.equalsIgnoreCase("chinese")) {
            System.out.print("you can have ");
            for (String c : chinese)
                System.out.print(c + "  ");

        } else if (choice.equalsIgnoreCase("italian")) {
            System.out.print("you can have ");
            for (String it : italian)
                System.out.print(it + "  ");

        } else {
            System.out.print("you can have ");
            for (String a : american) {
                System.out.print(a + "  ");
            }
        }
    }
}

