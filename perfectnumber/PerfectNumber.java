package perfectnumber;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String args[]){

        int k=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int n = sc.nextInt();
        while(k<n){
            for(int i=1;i<=n;i++){
                if(n%i==0) {
                    k = k + i;
                    if(k>=n)
                        break;
                }
            }
        }

        if(k==n)
            System.out.println("the number is a perfect number");
        else
            System.out.println("the number is not a perfect number");
    }

}
