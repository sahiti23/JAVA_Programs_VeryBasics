package com.sahiti.types;

public class SlidingWindow {

    public static void main(String args[])
    {
        int[] arr = {1,2,3,4,5,6};

        // Find sum of each sub array of fixed length k

        int k = 3;

        System.out.println(SlidingFixedSizeWindow(arr,k));
    }

    public static int SlidingFixedSizeWindow(int[] arr, int k)
    {
        int sum = 0;
        int maxsum = 0;

        // SUm of first sub array
        for(int i=0;i<arr.length-k+1;i++)
        {
            sum += arr[i];
        }

        for(int i=1;i<arr.length-k+1;i++)
        {
            sum = sum - arr[i-1];
            sum = sum + arr[i+k-1];
        }
        maxsum = Math.max(maxsum, sum);
        return maxsum;
    }

}
