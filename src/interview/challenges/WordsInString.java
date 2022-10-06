package interview.challenges;

public class WordsInString {

    public static int wordCounter(String str){
        //Why do we instantiate new int[], but not for string
        String[] testString = str.split(" ");
        int counter = 0;

        for(int i = 0; i < testString.length; i++){
            counter++;
        }
        return counter;
    }

    public static void main(String[] args) {
        String s = "This is a test string for practice";
        int answer = wordCounter(s);
        System.out.println(answer);
    }

}
