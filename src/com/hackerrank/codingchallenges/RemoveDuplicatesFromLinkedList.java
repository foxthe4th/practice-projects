package com.hackerrank.codingchallenges;

import java.util.HashSet;
import java.util.LinkedList;

public class RemoveDuplicatesFromLinkedList {

   public static HashSet linkedListWithRemovedDuplicates(LinkedList removeMyDuplicates) {

       HashSet answer = new HashSet<>();

       for (int i = 0; i < removeMyDuplicates.size(); i++) {
           answer.add(removeMyDuplicates.get(i));
       }
       return answer;
   }

    public static void main(String[] args) {

        LinkedList removeMyDuplicates = new LinkedList<>();
        removeMyDuplicates.add(1);
        removeMyDuplicates.add(1);
        removeMyDuplicates.add(2);
        removeMyDuplicates.add(3);
        removeMyDuplicates.add(4);
        removeMyDuplicates.add(4);
        removeMyDuplicates.add(5);
        removeMyDuplicates.add(5);
        removeMyDuplicates.add(6);
        removeMyDuplicates.add(7);
        removeMyDuplicates.add(8);
        removeMyDuplicates.add(8);
        removeMyDuplicates.add(8);
        removeMyDuplicates.add(9);

        //Implement solution method here
        HashSet results = linkedListWithRemovedDuplicates(removeMyDuplicates);
        System.out.println(results);


    }




}
