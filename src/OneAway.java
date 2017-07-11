import java.util.ArrayList;

/**
 * Created by anddica on 7/11/17.
 */
public class OneAway {
    public static final int SINGLE_CHAR = 1;
    public static final int LETTERS_IN_ENGLISH_ALPHABET = 26;
    public static final int BEGINNING_OF_ALPHABET = 0;
    public static final int BEGINNING_OF_WORD = 0;
    final static String alphabet = "abcdefghijklmnopqrstuvwxyz";

    //1.5 There are three types of edits that can be performed on strings: insert a character, remove a character, or replace a
    //character.  Given two strings, write a function to check if they are one edit (or zero edits) away.

    //EXAMPLE
    //pale, ple -> true
    //pales, pale -> true
    //pale, bale -> true
    //pale, bake -> false

    public static boolean isOneAway(String inputOne, String inputTwo) {
        if (wordsAreMoreThanTwoCharsApart(inputOne, inputTwo)) {
            return false;
        }

        if (wordOneLongerThanWordTwo(inputOne, inputTwo)) {
            return isOneDeletionAway(inputOne, inputTwo);
        } else if (wordOneShorterThanWordTwo(inputOne, inputTwo)) {
            return isOneInsertionAway(inputOne, inputTwo);
        } else {
            return isOneEditAway(inputOne, inputTwo);
        }
    }

    private static boolean wordOneShorterThanWordTwo(String inputOne, String inputTwo) {
        return inputOne.length() < inputTwo.length();
    }

    private static boolean wordOneLongerThanWordTwo(String inputOne, String inputTwo) {
        return inputOne.length() > inputTwo.length();
    }

    private static boolean wordsAreMoreThanTwoCharsApart(String inputOne, String inputTwo) {
        return inputOne.length() > inputTwo.length() + SINGLE_CHAR || inputOne.length() < inputTwo.length() - SINGLE_CHAR;
    }

    private static boolean isOneDeletionAway(String baseString, String compareString) {
        ArrayList<String> listOfWords = new ArrayList<String>();

        for(int x=0; x<baseString.length(); x++){
            listOfWords.add(baseString.substring(0,x)+baseString.substring(x+1, baseString.length()));
        }

        return checkIfMatchExists(compareString, listOfWords);

    }

    private static boolean isOneInsertionAway(String baseString, String compareString) {
        return false;
    }

    private static boolean isOneEditAway(String baseString, String compareString) {
        char[] wordAsArray = baseString.toCharArray();
        ArrayList<String> listOfWords = new ArrayList<String>();

        for (int x = BEGINNING_OF_WORD; x < baseString.length(); x++) {
            for (int y = BEGINNING_OF_ALPHABET; y < LETTERS_IN_ENGLISH_ALPHABET; y++) {
                char[] replacementWord = wordAsArray.clone();
                replacementWord[x] = alphabet.charAt(y);
                listOfWords.add(new String(replacementWord));
            }
        }

        return checkIfMatchExists(compareString, listOfWords);
    }

    private static boolean checkIfMatchExists(String compareString, ArrayList<String> listOfWords) {
        return ifWordsMatch(compareString, listOfWords);
    }

    private static boolean ifWordsMatch(String compareString, ArrayList<String> listOfWords) {
        if (compareWordListWithSecondString(compareString, listOfWords)){
            return true;
        }else return false;
    }

    private static boolean compareWordListWithSecondString(String compareString, ArrayList<String> listOfWords) {
        for (String word : listOfWords) {
            if (word.equals(compareString)) {
                return true;
            }
        }
        return false;
    }
}
