package com.hackerrank.codingchallenges;

import java.util.Arrays;

public class Subsequence {

    public static int findSubsequence(int[] numbers){
        int [] temp = new int[numbers.length];
        int sequenceLength = 0;

        for(int i = 0; i < numbers.length; i++) {
            int index = Arrays.binarySearch(temp, 0, sequenceLength, numbers[i]);

            if (index < 0) {
                index = -(index + 1);
            }
            temp[index] = numbers[i];

            if (index == sequenceLength) {
                sequenceLength++;
            }
        }
        return sequenceLength;

    }

    public static void main(String[] args) {
        int[] numbers = new int[5];
        numbers[0] = 8;
        numbers[1] = 2;
        numbers[2] = 5;
        numbers[3] = 7;
        numbers[4] = 1;

        int result = findSubsequence(numbers);
        System.out.println(result);

    }



}
