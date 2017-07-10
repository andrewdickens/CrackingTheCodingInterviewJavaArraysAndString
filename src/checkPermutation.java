import java.util.HashMap;
import java.util.Map;

/**
 * Created by anddica on 7/10/17.
 */
public class checkPermutation {

    //Given two strings, write a method to decide if one is a permutation of the other

    //Assumes valid Strings are passed to the method

    public static boolean checkIfStringsArePermutations(String stringOne, String stringTwo){
        Map stringOneCharMap = new HashMap();
        Map stringTwoCharMap = new HashMap();
        char[] stringOneCharArray = stringOne.toCharArray();
        char[] stringTwoCharArray = stringTwo.toCharArray();

        if(stringLengthsAreNotEqual(stringOne, stringTwo)){
            return false;
        }

        addBothStringsToMaps(stringOneCharMap, stringTwoCharMap, stringOneCharArray, stringTwoCharArray);

        return compareMapValuesForEquality(stringOneCharMap, stringTwoCharMap, stringOneCharArray);
    }

    private static boolean compareMapValuesForEquality(Map stringOneCharMap, Map stringTwoCharMap, char[] stringOneCharArray) {
        for(int x=0; x<stringOneCharArray.length; x++){
            if(charValueNotSameInBothMaps(!((Integer) stringOneCharMap.get(stringOneCharArray[x])).equals((Integer) stringTwoCharMap.get(stringOneCharArray[x])), stringOneCharArray[x])){
                return false;
            }
        }
        return true;
    }

    private static boolean charValueNotSameInBothMaps(boolean b, char o) {
        return b;
    }

    private static void addBothStringsToMaps(Map stringOneCharMap, Map stringTwoCharMap, char[] stringOneCharArray, char[] stringTwoCharArray) {
        addCharsToMap(stringOneCharMap, stringOneCharArray);
        addCharsToMap(stringTwoCharMap, stringTwoCharArray);
    }

    private static void addCharsToMap(Map stringMap, char[] stringArray) {
        for(int x = 0; x< stringArray.length; x++){
            if(stringMap.containsKey(stringArray[x])){
                Integer frequencyOfString = (Integer) stringMap.get(stringArray[x]);
                addToMap(stringMap, stringArray[x], frequencyOfString+1);

            }
            addToMap(stringMap, stringArray[x], 1);
        }
    }

    private static void addToMap(Map stringMap, char k, int v) {
        stringMap.put(k, v);
    }

    private static boolean stringLengthsAreNotEqual(String stringOne, String stringTwo) {
        return stringOne.length() != stringTwo.length();
    }
}
