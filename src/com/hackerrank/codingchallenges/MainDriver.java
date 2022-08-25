package com.hackerrank.codingchallenges;

public class MainDriver {
    public static void main(String[] args) {

        //Takes a value n, converts it into a binary number, then counts the number of consecutive 1s
        //Coding challenge from HackerRank!
         int n = 439;


         //take n and find its binary representation
        char[] binaryN = Integer.toBinaryString(n).toCharArray();

        //Declare an int called result
        int result = 0;
        int finalResult = 0;

        //iterate through binaryN
        for (int i = 0; i < binaryN.length; i++){

            //if charAt(i) is 1
            result = (binaryN[i] == '0') ? 0 : result + 1;

            //set the max number of 1s from the binary string.
            if(result>finalResult){
                finalResult = result;
            }
        }
        //print out the result
        System.out.println(finalResult);
    }
}



