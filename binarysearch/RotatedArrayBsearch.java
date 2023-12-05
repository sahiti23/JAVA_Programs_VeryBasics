package binarysearch;


public class RotatedArrayBsearch
{
    public static void main(String[] args)
    {
        int[] nums = {8,9,0,1,2,3,4,5,6,7};

        System.out.println(findElement(nums,2, 4));
        System.out.println(findElement(nums,2, 9));
        System.out.println(findElement(nums,2, 7));
        System.out.println(findElement(nums,2, 8));
        System.out.println(findElement(nums,2, 0));




    }

    public static int findElement(int[] nums, int k, int target)
    {
        int n = nums.length;

        int index = -1;

        if(nums[n-1] >= target) // 7 > 4
        {
            index = bsearch(nums, k, n-1, target);
        }
        else
        {
            index = bsearch(nums, 0, k-1, target);
        }
        return index;
    }

    public static int bsearch(int[] nums, int start, int end, int target)
    {
        while(start<=end)
        {
            int mid = start + (end - start)/2;  // 2 + 9 = 5
            //System.out.println("mid="+mid);

            if(nums[mid] == target)
            {
                return mid;
            }
            else if(nums[mid] > target)
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

}