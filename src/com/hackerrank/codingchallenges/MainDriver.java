package com.hackerrank.codingchallenges;

import java.io.*;
import java.util.*;

public class MainDriver {
    public static void main(String[] args) throws IOException {

        //In this challenge, we are tasked with creating a 6x6 2d array. We then look for the 'hourglasses'
        //within the array, then find and print the largest sum of all possible hourglasses
        /*EX: 1 1 1 |
                1   | ->   = 7
              1 1 1 |      */


        //We would use this for testing given input. I'm not making 36 ints for 1 test
        //Scanner scanner = new Scanner(System.in);

        //Initialize the 2d array to have 6 rows and 6 columns
        int [][] testArr = new int [6] [6];

        //Iterate through each "cell" for each row and column
        for(int i = 0; i < 6; i++){
            for(int j = 0; j < 6; j++){

                //Fill the "cells" with values from the scanner for the test.
                //Again, I'm not making a bunch of ints to test this here.
                //testArr [i][j] = scanner.nextInt();
            }
        }

        //Set an int sum to a random, LOW number. This will act as our placeholder to compare the final answer against.
        int sum = -1000;

        //Iterate through the array for hourglasses. Remember: arrays start at indices 0, and iterative for loops
        //count [0] [0] as the first iteration. Therefor, we need to search through the array [3] [3] at a time to make
        //an hourglass, and we do this by stopping the iterative search at [i][j] < [4][4]
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){

                //Create a new int to hold the max sum of the hourglass being tested.
                int maxSum = testArr[i][j] + testArr[i] [j+1] + testArr[i] [j+2] + testArr[i + 1 ] [j + 1] + testArr[i+2][j] + testArr[i + 2] [j + 1] + testArr[i + 2] [j + 2];

                //If the max sum is larger than our initial placeholder sum, change the value of the placeholder sum
                //to be the current max sum.
                if(maxSum > sum){
                    sum = maxSum;
                }
            }
        }

        //Finally, print out the max sum
        System.out.println(sum);
        //scanner.close();
    }
}
