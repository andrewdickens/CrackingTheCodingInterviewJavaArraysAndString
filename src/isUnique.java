import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Created by anddica on 7/10/17.
 */
public class isUnique {

    //Implement an algorithm to determine if a string has all unique characters.

    //Both implementations assume valid strings are passed to the method

    public static boolean isStringUnique(String uniqueCharacters){
        Set characterSet = new HashSet();
        char[] uniqueCharacterArray = uniqueCharacters.toCharArray();

        return addNewCharsToSetAndCheckForDuplicatesInSet(characterSet, uniqueCharacterArray);
    }

    private static boolean addNewCharsToSetAndCheckForDuplicatesInSet(Set characterSet, char[] uniqueCharacterArray) {
        for(int x=0; x<uniqueCharacterArray.length; x++){
            if(characterSet.contains(uniqueCharacterArray[x])){
                return false;
            }
            addCharToSet(characterSet, uniqueCharacterArray[x]);
        }
        return true;
    }

    private static void addCharToSet(Set characterSet, char e) {
        characterSet.add(e);
    }

    //What if you cannot use additional data structures?

    public static boolean isStringUniqueNoOtherDataStructure(String uniqueCharacters){
        char[] characterArray = uniqueCharacters.toCharArray();

        return !checkCharAgainstAllOtherCharsInArray(characterArray);
    }

    private static boolean checkCharAgainstAllOtherCharsInArray(char[] characterArray) {
        for(int x=0; x<characterArray.length; x++){
            for(int y=x+1; y<characterArray.length; y++){
                if(characterArray[x]==characterArray[y]){
                    return true;
                }
            }
        }
        return false;
    }
}
