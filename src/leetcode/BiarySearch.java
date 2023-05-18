package leetcode;


import java.util.Arrays;

/**
 * 二分查找
 */
public class BiarySearch {
    public static void main(String[] args) {
        int[] nums = {-1, 0, 3, 5, 9, 12};
        int target = 9;
        Arrays.sort(nums);
        int index = myBinarySearch(nums, target);
        System.out.println(index);
    }

    private static int myBinarySearch(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] > target) {
                right = mid - 1;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
