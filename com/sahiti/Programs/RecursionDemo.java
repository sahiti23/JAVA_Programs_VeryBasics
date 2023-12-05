package com.sahiti.Programs;

import java.util.ArrayList;

public class RecursionDemo {

    public static void main(String[] args)
    {
        //System.out.println(Fibonacci(6));

        int maxnumber = 10 ;

        for(int i=0;i<maxnumber;i++)
        {
            System.out.println(Fibonacci(i));
        }

        int[] arr = {1,37,98,234,12345,65678};
        int target = 234;

        int pos = BinarySearch(arr, target);

        System.out.println("Element found at "+pos+" position");

        int[] arr2 = { 1,45,65,78,99,134,135,768,2345,12345};
        int start = 0;
        int end = arr2.length-1;
        int target2 = 12345;
        int index = BinarySearch(arr2, start, end, target2);
        System.out.println("target "+target2+" at position "+index);

        DescAsc(5);
        System.out.println("Factorial = "+Factorial(5));
        System.out.println("Sum = "+Sum(5));

        int sumofdigits = SumOfDigits(12345);
        System.out.println("Sum of Digits= "+sumofdigits);

        int productofdigits = ProductOfDigits(55 );
        System.out.println("Product of Digits= "+productofdigits);
        System.out.println("No.of Zeroes = "+countZeroes(10230500));

        int[] ar = {1,2,3,4,5,6,7};
        System.out.println(isSorted(ar, 0));
        System.out.println(findElement(ar, 7, 0));
        System.out.println(findElementIn(ar, 7, 0));

        int[] ar2 = {1,2,3,4,5,5,6};
        System.out.println(findElementLast(ar2, 5, ar2.length-1));

        findElementsIndices(ar2, 5, 0);
        System.out.println(indices);

        System.out.println(findIndices(ar2, 5, 0));
    }

    public static int Fibonacci(int n)
    {
        if(n==0)
        {
            return 0;
        }
        if(n==1)
        {
            return 1;
        }
        return Fibonacci(n-1) + Fibonacci(n-2);
    }

    public static int BinarySearch(int[] arr, int target)
    {
        int start = 0;
        int end = arr.length-1;

        while(start<=end)
        {
            int mid = start+(end-start)/2;

            if(arr[mid] ==  target)
            {
                return mid;
            }
            else if(arr[mid] > target)
            {
                end = mid - 1;
            }
            else
            {
                start = mid + 1;
            }
        }
        return -1;
    }

    public static int BinarySearch(int[] arr, int start, int end, int target)
    {
        if(start <= end)
        {
            int mid = start + (end - start)/2;

            if(arr[mid] == target)
            {
                return mid;
            }
            else if(arr[mid] > target)
            {
                return BinarySearch(arr, start, mid - 1, target);
            }
            else
            {
                return BinarySearch(arr, mid + 1, end, target);
            }
        }
        return -1;
    }

    public static void DescAsc(int n)
    {
        if(n==0)
        {
            return;
        }
        System.out.println(n);
        DescAsc(n-1);
        System.out.println(n);
    }

    public static int Factorial(int n)
    {
        if(n<=1)
            return 1;

        return n * Factorial(n-1);
    }

    public static int Sum(int n)
    {
        if(n==1)
            return 1;

        return n + Sum(n-1);
    }

    public static int SumOfDigits(int n)
    {
        if(n==0)
        {
            return 0;
        }
        return (n%10) + SumOfDigits(n/10);
    }
    public static int ProductOfDigits(int n)
    {
        if(n%10 == n)
        {
            return n;
        }
        return (n%10) * ProductOfDigits(n/10);
    }

    static int countZeroes(int n)
    {
        return findz(n,0);
    }
    public static int findz(int n, int count)
    {
        if(n==0)
        {
            return count;
        }

        int rem = n % 10;
        if(rem == 0)
        {
            return findz(n/10, count+1);
        }
        else
        {
            return findz(n/10, count);
        }
    }

    /**
     * @param arr
     * @param index
     * @return
     */
    public static boolean isSorted(int[] arr, int index)
    {
        if(index == arr.length - 1)
        {
            return true;
        }
        return arr[index] < arr[index+1] && isSorted(arr,index+1);
    }

    public static boolean findElement(int[] arr, int target, int index)
    {
        if(arr.length == index)
        {
            return false;
        }
        return arr[index] == target || findElement(arr, target, index+1);
    }

    public static int findElementIn(int[] arr, int target, int index)
    {
        if(arr.length == index)
        {
            return -1;
        }
        else if(arr[index] == target)
        {
            return index;
        }
        return findElementIn(arr, target, index+1);
    }

    public static int findElementLast(int[] arr, int target, int index)
    {
        if(index ==  -1)
        {
            return -1;
        }
        if(arr[index] == target)
        {
            return index;
        }
        else
        {
            return findElementLast(arr, target, index-1);
        }
    }

    static ArrayList<Integer> indices = new ArrayList<>();
    public static void findElementsIndices(int[] arr, int target, int index)
    {
        if(index == arr.length)
        {
            return;
        }
        if(arr[index] == target)
        {
            indices.add(index);
        }

        findElementsIndices(arr, target, index+1);
    }

    // return type - arraylist.

    public static ArrayList<Integer> findIndices(int[] nums, int target, int index)
    {
        //Not very optimized because it is creating objects.

        ArrayList<Integer> list = new ArrayList<>();
        if(index == nums.length)
        {
            return list;
        }
        if(nums[index] == target)
        {
            list.add(index);
        }

        ArrayList<Integer> temp = findIndices(nums, target, index+1);

        list.addAll(temp);
        return list;
    }
}
