package com.hackerrank.codingchallenges;

public class AtBashCipher {

    //using lowercase letter f as an example...
    //if ascii value at str(i) is within a - m
    //		take (ascii of lowMid - 1) - (ascii f) -- which would be a difference of 7
    //		then, starting at lowMid, add 7, and add that character to the answer string. (in this case, letter u)

    //using lowercase letter s as an example...
    //	if ascii value at str(i) is within n - z
    //		take (ascii of s) - (ascii of lowMid) -- which would be a difference of 5
    //		then, starting at (lowMid - 1), subtract 5, and add that character to the answer string. (in this case, letter h)


    //If str(i) is within uppercase ascii, we'll do the same thing as above, but use ascii value of
    // N as our midpoint.

    //Finally, return our answer string to complete our encryption method

    public static String atBash(String str) {

        //Declare int capMid to hold ascii value of lowercase alphabet midpoint (N)
        int capMid = 'N';
        System.out.println(capMid);

        //Declare int lowMid to hold ascii value of lowercase alphabet midpoint (n)
        int lowMid = 'n';
        System.out.println(lowMid);

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
                    int encryptionValue = (capMid - 1) - asciiOfChar;
                    char encryptedLetter = (char) (capMid + encryptionValue);
                    answer += encryptedLetter;

                } else if(asciiOfChar >= 78 && asciiOfChar <= 90){
                    int encryptionValue = asciiOfChar - capMid;
                    char encryptedLetter = (char) ((capMid-1) - encryptionValue);
                    answer += encryptedLetter;
                }


            //For lowercase letters  a = 97,  n = 110, z = 122
            } else if(asciiOfChar >= 97 && asciiOfChar <= 122 ) {
                if(asciiOfChar >= 97 && asciiOfChar < 110){
                    int encryptionValue = (lowMid - 1) - asciiOfChar;
                    char encryptedLetter = (char) (lowMid + encryptionValue);
                    answer += encryptedLetter;

                } else if (asciiOfChar >= 110 && asciiOfChar <= 122){
                    int encryptionValue = asciiOfChar - lowMid;
                    char encryptedLetter = (char) ((lowMid-1) - encryptionValue);
                    answer += encryptedLetter;
                }

            } else {
                //should the asciiOfChar not be a-z or A-Z, add it to the answer string unaltered
                answer += str.charAt(i);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        String toBeEncrypted = atBash("Hello, test");
        System.out.println(toBeEncrypted);
        //Answer to solution should be Svool, gvhg

    }
}
