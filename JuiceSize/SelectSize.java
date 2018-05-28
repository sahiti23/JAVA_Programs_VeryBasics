package JuiceSize;

import java.util.Scanner;

public class SelectSize {
    public static void main(String args[])
    {
        JuiceSize j = new JuiceSize();
        System.out.println(java.util.Arrays.asList(JuiceSize.juiceSizes.values()));
        Scanner s = new Scanner(System.in);
        System.out.println("Select the size of the drink");
        String val = s.nextLine();
        if(val.equalsIgnoreCase("small"))
            System.out.println("pay $1.60");
        else if(val.equalsIgnoreCase("medium"))
            System.out.println("pay $3.00");
        else
            System.out.println("pay $5");

        System.out.println("Here is your " +val+ " size drink");
    }
}
