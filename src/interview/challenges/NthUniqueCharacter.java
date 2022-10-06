package interview.challenges;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class NthUniqueCharacter {

    public static char uniqueCharacter(String str, int k){

        char[] testChars = str.toCharArray();
        char prevChar;
        char currentChar;
        char[] answerChars = new char[testChars.length];
        char answer;
        ArrayList<Character> arrayList = new ArrayList();

        Arrays.sort(testChars);

        for(int i = 1; i < testChars.length; i++){
            prevChar = testChars[i-1];
            currentChar = testChars[i];
            if(currentChar == prevChar){
                //int a = i-1;
                //answerChars[i] = currentChar;
                arrayList.add(currentChar);
            }
        }
        System.out.println(Arrays.toString(answerChars));
        Arrays.sort(answerChars);
        System.out.println((arrayList));
        answer=arrayList.get(k-1);
        return answer;
    }

    public static void main(String[] args) {
        String str = "abbcddeff"; //f
        int k = 3;

        char solution = uniqueCharacter(str,k);
        System.out.println(solution);
    }
}
