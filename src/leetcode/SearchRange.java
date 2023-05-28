package leetcode;

import java.util.Arrays;

/**
 * leetcode 34题
 * url :  <a href="https://leetcode.cn/problems/find-first-and-last-position-of-element-in-sorted-array/">...</a>
 */

/**
 * 34. 在排序数组中查找元素的第一个和最后一个位置
 * 给你一个按照非递减顺序排列的整数数组 nums，和一个目标值 target。请你找出给定目标值在数组中的开始位置和结束位置。
 *
 * 如果数组中不存在目标值 target，返回 [-1, -1]。
 *
 * 你必须设计并实现时间复杂度为 O(log n) 的算法解决此问题。
 *
 *
 *
 * 示例 1：
 *
 * 输入：nums = [5,7,7,8,8,10], target = 8
 * 输出：[3,4]
 * 示例 2：
 *
 * 输入：nums = [5,7,7,8,8,10], target = 6
 * 输出：[-1,-1]
 * 示例 3：
 *
 * 输入：nums = [], target = 0
 * 输出：[-1,-1]
 *
 *
 * 提示：
 *
 * 0 <= nums.length <= 105
 * -109 <= nums[i] <= 109
 * nums 是一个非递减数组
 * -109 <= target <= 109
 */
public class SearchRange {
    public static void main(String[] args) {
        int[] nums = {5,7,8,8,8,10};
        int target = 8;
        int[] result = searchRange(nums , target);
        System.out.println(Arrays.toString(result));
    }

    private static int[] searchRange(int[] nums, int target) {
        if (nums.length == 0){
            return new int[]{-1,-1};
        }
        int left = 0;
        int right = nums.length - 1;
        int[] result = new int[2];
        while (left <= right){
            int mid = (left + right) / 2;
            if (nums[mid] > target){
                right = mid - 1;
            }else if (nums[mid] < target){
                left = mid + 1;
            }else {
                int i = mid;
                int j = mid;
                while (i >= 0 && nums[i] == target){
                    i--;
                }
                while (j < nums.length && nums[j] == target){
                    j++;
                }
                result[0] = i + 1;
                result[1] = j - 1;
                return result;
            }
        }
        return new int[]{-1,-1};

    }
}
