package com.sahiti.Programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class ArrayDemo {
    public static void main(String[] args) throws Exception {

        int[][] matrix = { {10,20},
                {30},
                {10,2},
                {10,3,56,7}
        };

        int target = 30;

        printResult(linearSearch(matrix,target), target);

        int[][] sortedMatrix = {{1,3,5},{4,6,8},{11,20,34},{60,77}};
        int findnum = 34;

        printResult(binarySearch(sortedMatrix, findnum), findnum);

        String[] strs = {"hi","dups","hi","programs","dups"};

        findDuplicates(strs);
        int[] arr = {1,4,6,7,23,1,1,4};
        System.out.println(containsDuplicates(arr));

        int[] n = {1,2,1,2,1,1,4};
        System.out.println("Unique Element is = "+findUnique(n));

        System.out.println(findIndices(n, 1));

        int[] a = {-4,5,-1,2,0};
        System.out.println("Maximum Sum = "+maxSumSubArray(a));

        int[] nums1 = { 5,6,7,8,1,2,3,4};
        int[] nums2 = {1,25,7,9,0,2};
        System.out.println("Even Array= "+Arrays.toString(EvenNumbersArr(nums1,nums2)));

        reverseArray(nums1);

        int[] rarr = {1,2,3,4,5};
        rotateArray(rarr);

        int[][] pairs = {{1,2},{2,3},{1,2},{2,3},{1,2,3},{2,3}};
        System.out.println(repeatedArrays(pairs));

        int[] numbers = {2,7,23,5,6,8};
        int t = 14;
        System.out.println(findTargetIndices(numbers, t));
    }

    public static int[] linearSearch(int[][] m, int t)
    {
        for(int i=0;i<m.length;i++)
        {
            for(int j=0;j<m[i].length;j++)
            {
                //System.out.print(m[i][j]+" ");
                if(m[i][j] ==  t)
                {
                    return new int[]{i,j};
                }
            }
            //System.out.println();
        }
        return new int[]{0};
    }

    public static int[] binarySearch(int[][] smatrix, int target)
    {
        int row = 0;
        int rows = smatrix.length;
        int col = smatrix[0].length-1;

        while((row < rows) && (col >=0))
        {
            if(smatrix[row][col] > target)
            {
                col--;
            }
            else if (smatrix[row][col] < target)
            {
                row++;
            }
            else if(smatrix[row][col] == target)
            {
                return new int[]{row,col};
            }
        }
        return new int[]{0};

    }
    public static void printResult(int[] indices, int target)
    {
        //Print the data in the form of Array without using built-in functions
        /*
        System.out.print("[");
        for(int i = 0;i<indices.length;i++)
        {
            if(i<indices.length-1)
            {
                System.out.print(indices[i]+",");
            }
            else
            {
                System.out.print(indices[i]);
            }
        }
        System.out.print("]");

        */
        System.out.println(Arrays.toString(indices));

        if(indices.length > 1)
        {
            StringBuilder sb = new StringBuilder("Target element "+target+" is found at ");
            for(int i:indices)
            {
                sb.append(i);
                sb.append(" ");
            }
            sb.append("indices");
            System.out.println(sb);
        }
        else
        {
            System.out.println("Target element "+target+" is not found in the matrix");
        }
    }

    public static void findDuplicates(String[] strs)
    {
        for(int i = 0;i<strs.length;i++)
        {
            for(int j=i+1;j<strs.length;j++)
            {
                if(strs[i].equals(strs[j]))
                {
                    System.out.println(strs[i]);
                }
            }
        }

    }

    public static boolean containsDuplicates(int[] arr)
    {
        HashSet<Integer> set = new HashSet<>();

        for(int n : arr)
        {
            if(set.contains(n))
            {
                return true;
            }
            else
            {
                set.add(n);
            }
        }
        return false;
    }

    public static int findUnique(int[] nums)
    {
        HashMap<Integer,Integer>  hm = new HashMap<>();

        for (int num : nums) {
            if (hm.containsKey(num)) {
                hm.put(num, hm.get(num) + 1);
            } else {
                hm.put(num, 1);
            }
        }
        for(Integer n : hm.keySet())
        {
            if(hm.get(n) == 1)
            {
                return n;
            }
        }
        return 0;
    }

    public static int maxSumSubArray(int[] arr)
    {
        int maxsum = arr[0];
        int sum = arr[0];

        for(int i=1;i<arr.length;i++)
        {
            if(sum<0)
            {
                sum = arr[i];
            }
            else
            {
                sum = sum + arr[i];
            }

            maxsum = Math.max(sum, maxsum);
        }
        return maxsum;
    }

    public static ArrayList<Integer> findIndices(int[] nums, int target)
    {
        ArrayList<Integer> list = new ArrayList<>();

        for(int i=0;i<nums.length;i++)
        {
            if(nums[i] == target)
            {
                list.add(i);
            }
        }
        return list;
    }

    public static int[] EvenNumbersArr(int[] ar1, int[] ar2)
    {
        ArrayList<Integer> evenlist = new ArrayList<>();

        for (int j : ar1) {
            if (j % 2 == 0)
                evenlist.add(j);
        }

        for(int num:ar2)
        {
            if(num % 2 == 0)
                evenlist.add(num);
        }
        int[] evarr = new int[evenlist.size()];

        for(int i=0;i<evenlist.size();i++)
        {
            evarr[i] = evenlist.get(i);
        }
        return evarr;
    }

    public static void reverseArray(int[] arr)
    {
        //int[] rev = new int[arr.length];

        /*int index = 0;
        for(int i=arr.length-1;i>=0;i--)
        {
            rev[index++] = arr[i];
        } */

        /*for(int i=0;i<arr.length;i++)
        {
            rev[i] = arr[arr.length-1-i];
        } */

        for(int i=0;i<arr.length/2;i++)
        {
            swap(arr, i,arr.length-1-i);
        }

        System.out.println(Arrays.toString(arr));
    }

    public static void swap(int[] arr, int a1, int a2)
    {
        int temp = arr[a1];
        arr[a1]= arr[a2];
        arr[a2] = temp;
    }

    public static void rotateArray(int[] nums)
    {
        int temp = nums[0];
        for(int i=0;i<nums.length-1;i++)
        {
            nums[i] = nums[i+1];
        }
        nums[nums.length-1] = temp;
        System.out.println(Arrays.toString(nums));
    }

    public static int repeatedArrays(int[][] arr)
    {
        System.out.println("======= Duplicates Pairs in Array");
        int count = 0;
        HashSet<String> hs = new HashSet<>();

        for(int[] a: arr)
        {
            String pair = Arrays.toString(a);
            if(hs.contains(pair))
            {
                count ++;
            }
            else
            {
                hs.add(pair);
            }
        }
        return count;
    }
    public static ArrayList<Integer> findTargetIndices(int[] nums, int target)
    {
        HashMap<Integer, Integer> hm = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();

        for(int i=0;i<nums.length;i++)
        {
            int compl = target - nums[i];
            if(hm.containsKey(compl))
            {
                list.add(hm.get(compl));
                list.add(i);
            }
            else
            {
                hm.put(nums[i],i);
            }
        }
        return list;
    }
}

