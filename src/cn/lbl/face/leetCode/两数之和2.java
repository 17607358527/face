package cn.lbl.face.leetCode;

import java.util.Arrays;
import java.util.HashMap;

/*
给定 nums = [2, 7, 11, 15], target = 9

因为 nums[0] + nums[1] = 2 + 7 = 9
所以返回 [0, 1]
 */
public class 两数之和2 {

    /*
    一遍哈希表
     */
    public static int[] twoSum(int[] nums,int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i <nums.length ; i++) {
            int complement=target-nums[i];
            if (map.containsKey(complement)) {
                return new int[]{i,map.get(complement)};
            }
            map.put(nums[i],i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }


    public static void main(String[] args) {
        int[] ints = twoSum(new int[]{2, 7, 11, 15}, 9);
        System.out.println(Arrays.toString(ints));

    }
}
