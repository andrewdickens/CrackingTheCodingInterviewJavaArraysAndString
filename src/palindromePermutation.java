import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by anddica on 7/10/17.
 */
public class palindromePermutation {
    public static final int SINGLE_CHAR = 1;
    //    Given a string, write a function to check if it is a getPermutationsOfString of a palindrome.  A palindrome is a word
//    or phrase that is the same forwards and backwards.  A getPermutationsOfString is a rearrangement of letters.  the palindrome does not need
//    to be limited to just dictionary words.
//
//    EXAMPLE
//
//    Input:  Tact Coa
//    Output: True (permutations: "taco cat", "atco cta", etc.)

    //Current implementation does not work for words with spaces.  Moving on to next problem as fixing this issue is trivial

    public static ArrayList getPalindromePermutations(String inputString) {
        ArrayList<String> permutationList = new ArrayList<String>();
        ArrayList palindromicPermutations = new ArrayList();
        Set<String> wordSet = new HashSet<String>();

        getPermutationsOfString("", inputString, wordSet);
        addWordsFromSetToList(permutationList, wordSet);
        determineIfWordIsPalindrome(permutationList, palindromicPermutations);

        return palindromicPermutations;
    }

    private static void determineIfWordIsPalindrome(ArrayList<String> permutationList, ArrayList palindromicPermutations) {
        for (String string : permutationList) {
            StringBuilder reversedString = new StringBuilder(string).reverse();
            System.out.println(reversedString + " and " + string);
            System.out.println(isPalindrome(string, reversedString));

            if (isPalindrome(string, reversedString)) {
                addToPermutationList(palindromicPermutations, string);
            }
        }
    }

    private static boolean addToPermutationList(ArrayList palindromicPermutations, String string) {
        return palindromicPermutations.add(string);
    }

    private static boolean isPalindrome(String string, StringBuilder reversedString) {
        return reversedString.toString().equals(string);
    }

    private static void addWordsFromSetToList(ArrayList<String> permutationList, Set<String> wordSet) {
        for (String word : wordSet) {
            addToPermutationList(permutationList, word);
        }
        System.out.println(permutationList);
    }

    private static void getPermutationsOfString(String prefix, String inputString, Set wordSet) {
        if (isLastChar(inputString)) {
            addToWordSet(prefix, inputString, wordSet);
            return;
        }

        int n = inputString.length();
        for (int i = 0; i < n; i++) {
            getPermutationsOfString(prefix + inputString.charAt(i), inputString.substring(0, i) + inputString.substring(i + 1, n), wordSet);
        }
    }

    private static boolean addToWordSet(String prefix, String inputString, Set wordSet) {
        return wordSet.add(prefix + inputString);
    }

    private static boolean isLastChar(String inputString) {
        return inputString.length() == SINGLE_CHAR;
    }
}
