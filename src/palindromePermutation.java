import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by anddica on 7/10/17.
 */
public class palindromePermutation {
//    Given a string, write a function to check if it is a getPermutationsOfString of a palindrome.  A palindrome is a word
//    or phrase that is the same forwards and backwards.  A getPermutationsOfString is a rearrangement of letters.  the palindrome does not need
//    to be limited to just dictionary words.
//
//    EXAMPLE
//
//    Input:  Tact Coa
//    Output: True (permutations: "taco cat", "atco cta", etc.)

    public static ArrayList getPalindromePermutations(String inputString){
        ArrayList<String> permutationList = new ArrayList();
        ArrayList palindromicPermutations = new ArrayList();
        Set<String> wordSet = new HashSet();


        getPermutationsOfString("", inputString, permutationList, wordSet);

        for (String word: wordSet
             ) {permutationList.add(word);
        }
        System.out.println(permutationList);

        for (String string : permutationList) {
            StringBuilder reversedString = new StringBuilder(string).reverse();
            System.out.println(reversedString+ " and " + string);
            System.out.println(reversedString.toString().equals(string));

            if(reversedString.toString().equals(string)){
                palindromicPermutations.add(string);
            }
        }

        return palindromicPermutations;
    }

    private static void getPermutationsOfString(String prefix, String inputString, ArrayList<String> permutationList, Set wordSet) {
        if(inputString.length()==1){
//            System.out.println(prefix+inputString);
            wordSet.add(prefix+inputString);
            return;
        }

        int n = inputString.length();
            for (int i = 0; i < n; i++) {
//                if(!wordSet.contains(prefix + inputString.charAt(i) + inputString.substring(0, i) + inputString.substring(i + 1, n))){
//                    wordSet.add(prefix + inputString.charAt(i) + inputString.substring(0, i) + inputString.substring(i + 1, n));
//                    permutationList.add(prefix + inputString.charAt(i) + inputString.substring(0, i) + inputString.substring(i + 1, n));
//                }
                getPermutationsOfString(prefix + inputString.charAt(i), inputString.substring(0, i) + inputString.substring(i + 1, n), permutationList, wordSet);
            }
    }
}
