package com.hackerrank.codingchallenges;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Permutations {

    public static void main(String[] args) {

        HashSet test = new HashSet<>();

        ArrayList e = new ArrayList<>();

        int listSize = 4;

        for (int i = 1; i < listSize; i++) {
            e.add(i);
        }
        test.add(e);

        System.out.println(test);


    }

}
