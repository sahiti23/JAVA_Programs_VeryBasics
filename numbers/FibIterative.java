package numbers;

import java.util.Scanner;

public class FibIterative {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int n = sc. nextInt();
        int a=0,b=1;
        int c=0;
        System.out.println(a);
        System.out.println(b);

        for(int i=2;i<n;i++)
        {
            c = a+b;
            if(c>=n)
                break;
            System.out.println(c);
            a=b;
            b=c;

        }
    }
}
