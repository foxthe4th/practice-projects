package com.hackerrank.codingchallenges;

public class AtBashCipher {

    public static String atBash(String str) {

        //Declare ints capStart and capMid to hold ascii values of A and N
        int capStart = 'A';
        int capMid = 'N';

        //Declare ints lowStart and lowMid to hold ascii values of a and n
        int lowStart = 'a';
        int lowMid = 'n';

        //Create an empty answer string to hold our encrypted message
        String answer = "";

        //create for loop for iteration of str
        for (int i = 0; i < str.length(); i++) {

            char letterAtIndex = str.charAt(i);
            int asciiOfChar = letterAtIndex;

            //Evaluate for upper or lowercase, both functions will work the same, just using different ascii values

            //For uppercase letters A = 65, N = 78, Z = 90
            if(asciiOfChar >= 65 && asciiOfChar <= 90 ){
                if(asciiOfChar >= 65 && asciiOfChar < 78){

                } else if(asciiOfChar >= 78 && asciiOfChar <= 90){

                }


            //For lowercase letters  a = 97,  n = 110, z = 122
            } else if(asciiOfChar >= 97 && asciiOfChar <= 122 ) {
                if(asciiOfChar >= 97 && asciiOfChar < 110){

                } else if (asciiOfChar >= 110 && asciiOfChar <= 122){

                }

            }


            //using lowercase letter f as an example...
            //if ascii value at str(i) is within a - m
            //		take (ascii of lowMid - 1) - (ascii f) -- which would be a difference of 7
            //		then, starting at lowMid, add 7, and add that character to the answer string. (in this case, letter u)

            //using lowercase letter s as an example...
            //	if ascii value at str(i) is within n - z
            //		take (ascii of s) - (ascii of lowMid) -- which would be a difference of 5
            //		then, starting at (lowMid - 1), subtract 5, and add that character to the answer string. (in this case, letter h)


            //If str(i) is within uppercase ascii, we'll do the same thing as above, but use ascii values of
            // A and N as our startpoint and midpoint.

            //Finally, return our answer string to complete our encryption method

        }
        return null;
    }

    public static void main(String[] args) {
        String toBeEncrypted = "abcd";
                //"Hello, test string.";
        //Answer to solution should be zyxw
        // abcdefghijklm nopqrstuvwxyz
    }
}
