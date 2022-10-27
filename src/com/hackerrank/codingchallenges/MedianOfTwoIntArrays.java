package com.hackerrank.codingchallenges;
import java.util.Arrays;

public class MedianOfTwoIntArrays {
    public static double medianOfArrays(int[] a, int[] b){
        int aList = a.length;
        int bList = b.length;

        int[] ans = new int[aList+bList];

        System.arraycopy(a, 0, ans, 0, aList);
        System.arraycopy(b, 0, ans, aList, bList);

        Arrays.sort(ans);

        double evenAnsIndex1;
        double evenAnsIndex2;
        int oddAnsIndex;
        double sumMedian;

        if(ans.length % 2 == 0){
            evenAnsIndex1 = ans[(ans.length/2) - 1];
            evenAnsIndex2 = ans[(ans.length/2)];
            sumMedian = (evenAnsIndex1 + evenAnsIndex2) / 2.0;
        } else {
            oddAnsIndex = (ans.length - 1) / 2;
            sumMedian = ans[oddAnsIndex];
        }
        return sumMedian;
    }

    public static void main(String[] args) {
        int[] a = new int[4];
        int[] b = new int[4];

        a[0] = 1;
        a[1] = 2;
        a[2] = 3;
        a[3] = 4;

        b[0] = 1;
        b[1] = 2;
        b[2] = 3;
        b[3] = 4;

        double sumOfTwoArrays = medianOfArrays(a,b);
        System.out.println(sumOfTwoArrays);
    }
}