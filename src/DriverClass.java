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

    }
}
