/**
 * Created by anddica on 7/10/17.
 */
public class DriverClass {

    public static void main(String[] args){
        //1.1
        System.out.println(isUnique.isStringUnique("test"));
        System.out.println(isUnique.isStringUnique("house"));

        System.out.println(isUnique.isStringUniqueNoOtherDataStructure("test"));
        System.out.println(isUnique.isStringUniqueNoOtherDataStructure("house"));

        //1.2
        System.out.println(checkPermutation.checkIfStringsArePermutations("test", "estt"));
        System.out.println(checkPermutation.checkIfStringsArePermutations("test", "ettt"));

        //1.3

        System.out.println(URLify.StringToURL("this is a test"));

        //1.4

        System.out.println(palindromePermutation.getPalindromePermutations("tat"));
        System.out.println(palindromePermutation.getPalindromePermutations("tact coa"));

        //1.5
        System.out.println(OneAway.isOneAway("test", "text"));
        System.out.println(OneAway.isOneAway("test", "tes"));
        System.out.println(OneAway.isOneAway("test", "teste"));


    }
}
