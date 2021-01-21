package org.msdemt.exercise;

import java.util.Arrays;

/**
 * 80. 删除排序数组中的重复项 II
 * https://leetcode-cn.com/problems/remove-duplicates-from-sorted-array-ii/
 */
public class leetcode_0001_80 {

    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 2, 2, 2, 3, 4, 4, 4, 5, 5, 6, 6, 6};

        int length = removeDuplicates(nums);

        System.out.println("计算后数组：" + Arrays.toString(Arrays.copyOfRange(nums, 0, length)));
        System.out.println("计算后数组长度：" + length);
    }

    public static int removeDuplicates(int[] nums){
        int i=1, count=1, length=nums.length;

        while(i<length){
            if(nums[i] == nums[i-1]){
                count++;
                if(count > 2){
                    remElement(nums, i);
                    i--;
                    length--;
                }
            }else{
                count = 1;
            }
            i++;
        }
        return length;
    }

    private static int[] remElement(int[] arr, int index) {
        for(int i=index+1; i<arr.length;i++){
            arr[i-1] = arr[i];
        }
        return arr;
    }
}
