package io.zipcoder;


/**
 * @author tariq
 */
public class StringsAndThings {

    public String removeString(String base, String remove) {
        return base.replaceAll(remove, "");
    }



    public int countYZ(String input) {
        String[] arr = input.split(" ");
        int count = 0;
        for (String word : arr) {
            if (word.charAt(word.length() - 1) == 'y' || word.charAt(word.length() - 1) == 'z') {
                count++;
            }

        }
        return count;
    }


    public boolean gIsHappy(String input) {
        //Split string into an array of characters
        char[] arr = input.toCharArray();
        //loop through, starting at index 1 to avoid out of bounds exceptions
        for (int i = 1; i < arr.length - 2; i++) {
            if (arr[i] == 'g') {
                if (!(arr[i - 1] == 'g' || arr[i + 1] == 'g')) {
                    return false;
                }
            }
        }
        return true;
    }


    public Integer countTriple(String input) {
        int count = 0;
        for (int i = 0; i <= input.length() - 3; i++) {
            if (input.charAt(i) == input.charAt(i + 1) && input.charAt(i) == input.charAt(i + 2)) {
                count++;

            }
        }

        return count;
    }


    public Boolean containsEqualNumberOfIsAndNot(String this_is_not) {

        this_is_not = this_is_not.toLowerCase();
        this_is_not = this_is_not.replaceAll("x", "");
        this_is_not = this_is_not.replaceAll("y", "");
        this_is_not = this_is_not.replaceAll("is", "x");
        this_is_not = this_is_not.replaceAll("not", "y");

        int x = 0;
        int y = 0;
        for (int i = 0; i < this_is_not.length(); i++) {
            if (this_is_not.charAt(i) == 'x') {
                x++;
            } else if (this_is_not.charAt(i) == 'y') {
                y++;
            }

        }
        return x == y;

    } 
}


