package com.hackerrank.codingchallenges;

public class TestMethod {

    public static void main(String[] args) {

        String test = "abcd";
        for (int i = 0; i < test.length(); i++) {
            char x = test.charAt(i);
            int asciiA = x;
            System.out.println(asciiA);
        }

    }
}
