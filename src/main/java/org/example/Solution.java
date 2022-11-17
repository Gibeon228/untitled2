package org.example;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if ((map.containsKey(nums[i])) && ((i - map.get(nums[i])) <= k)) {
                return true;
            }
            map.put(nums[i], i);
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = new int[4];
        //int[] nums = new int[5];
        nums[0] = 1;
        nums[1] = 2;
        nums[2] = 3;
        nums[3] = 1;
        int k = 3;
        System.out.println(containsNearbyDuplicate(nums, k));
    }
}
