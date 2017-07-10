/**
 * Created by anddica on 7/10/17.
 */
public class URLify {

    //Write a method to replace all spaces in a string with '%20."  You may assume that the string
    //has sufficient space at the end to hold the additional characters, and that you are given the "true"
    //length of the string.  (Note:  If implementing in Java, please use a character array so that you can perform this operation
    //in place.

    //Note: java implementation does not need the length param, so it is not used.

    public static String StringToURL(String stringToEncode){
        String[] wordArray = stringToEncode.split(" ");
        StringBuilder parsedURL = new StringBuilder(wordArray[0]);

        buildEncodedString(wordArray, parsedURL);
        return parsedURL.toString();
    }

    private static void buildEncodedString(String[] wordArray, StringBuilder parsedURL) {
        for(int x=1; x<wordArray.length; x++){
            parsedURL.append("%20").append(wordArray[x]);
        }
    }


}
