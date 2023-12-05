package com.sahiti.Programs;

public class ClimbStairs {

    public static void main(String[] args)
    {
        // N = no.of stairs = 2, You can climb in 1 step or 2 steps
        //Find the number of ways to climb N stairs

        // n = 2  --> You can climb it in the following ways
        // Path = {[0,1,1] ,[0,2] } ==> Num ways = 2
        // This is a Dynamic Programming question because we are solving the problem as sub problems

        int n = 4;
        System.out.println(FindNumberOfWays(n));
    }
    public static int FindNumberOfWays(int n)
    {
        //Base case
        // TO climb 0 steps, there is 1 way i.e you are on the step itself.
        //To climb 1 step, there is also 1 way i.e you can take one step only
/*
        if(n==0 || n==1)
        {
            return 1;
        }
        else
        {
            return FindNumberOfWays(n-1)+FindNumberOfWays(n-2);  // This is worst case in fibonacci series because we are computing values again and again.
                                                                // This can be resolved using Memoization technique of saving values in an array as shown below.
        } */


        if(n==0 || n==1)
        {
            return 1;
        }
        int[] result = new int[n+1];

        result[0] = 1;
        result[1] = 1;

        for(int i=2;i<=n;i++)
        {
            result[i] = result[i-1]+result[i-2];
        }
        return result[n];
    }
}
