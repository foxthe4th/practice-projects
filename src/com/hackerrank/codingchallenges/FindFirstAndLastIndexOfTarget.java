package com.hackerrank.codingchallenges;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindFirstAndLastIndexOfTarget {

    public static void main(String[] args) {

        int[] nums = new int[6];
        nums[0] = 4;
        nums[1] = 3;
        nums[2] = 2;
        nums[3] = 2;
        nums[4] = 2;
        nums[5] = 1;

        int target = 6;

        List<Integer> ans = new ArrayList<Integer>();
        int falseCounter = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != target) {
                falseCounter++;
            }
            if (nums[i] == target) {
                ans.add(i);
            }
        }

        if (falseCounter == nums.length) {
            int[] notInArray = new int[2];
            notInArray[0] = -1;
            notInArray[1] = -1;
            System.out.println(Arrays.toString(notInArray));
        }

        if(falseCounter != nums.length){

            int[] primitive =   ans.stream()
                                .mapToInt(Integer::intValue)
                                .toArray();
            System.out.println(primitive);
        }

        //For leetcode
        //return null;

    }
}
