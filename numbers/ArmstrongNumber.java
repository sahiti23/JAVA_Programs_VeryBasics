package numbers;
/*
153 = 1*1*1 + 5*5*5 +3*3*3 = 153
 */
import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String args[]){

        int sum =0, r=0;
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a number");
        int n = sc.nextInt();
        int temp =n;
        while(n>0)
        {
            r = n%10;
            n=n/10;
            sum = sum+ (r*r*r);

        }
        if(temp == sum)
            System.out.println(sum + " is armstrong");
        else
            System.out.println(sum + " is not armstrong");


    }
}
