package com.michaelklanica;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class APAS {

    public static void main(String[] args) {

//        SOLUTION #1
        System.out.println(Arrays.toString(twoSum(new int[]{1, 2, 3, 4}, 9)));
//        SOLUTION #2


    };

//    PROBLEM #1:
//    Given an array of integers, return indices of the two numbers such that they add up to a specific target.
//    You may assume that each input would have exactly one solution, and you may not use the same element twice.

    private static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] {map.get(complement), i};
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }





}
