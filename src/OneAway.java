/**
 * Created by anddica on 7/11/17.
 */
public class OneAway {
    public static final int SINGLE_CHAR = 1;

    //1.5 There are three types of edits that can be performed on strings: insert a character, remove a character, or replace a
    //character.  Given two strings, write a function to check if they are one edit (or zero edits) away.

    //EXAMPLE
    //pale, ple -> true
    //pales, pale -> true
    //pale, bale -> true
    //pale, bake -> false

    public static boolean isOneAway(String inputOne, String inputTwo){
        if(inputOne.length()>inputTwo.length()+ SINGLE_CHAR || inputOne.length()<inputTwo.length()-SINGLE_CHAR){
            return false;
        }

        if(inputOne.length()>inputTwo.length()){
            return isOneDeletionAway(inputOne, inputTwo);
        }else if(inputOne.length()<inputTwo.length()){
            return isOneInsertionAway(inputOne, inputTwo);
        }else {
            return isOneEditAway(inputOne, inputTwo);
        }
    }

    private static boolean isOneDeletionAway(String baseString, String compareString){
        return true;
    }

    private static boolean isOneInsertionAway(String baseString, String compareString){
        return true;
    }

    private static boolean isOneEditAway(String baseString, String compareString){
        return true;
    }
}
