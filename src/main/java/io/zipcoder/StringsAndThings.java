package io.zipcoder;


import com.sun.corba.se.impl.orb.PrefixParserAction;

/**
 * @author tariq
 */
public class StringsAndThings {

    /**
     * Given a string, count the number of words ending in 'y' or 'z' -- so the 'y' in "heavy" and the 'z' in "fez" count,
     * but not the 'y' in "yellow" (not case sensitive). We'll say that a y or z is at the end of a word if there is not an alphabetic
     * letter immediately following it. (Note: Character.isLetter(char) tests if a char is an alphabetic letter.)
     * example : countYZ("fez day"); // Should return 2
     * countYZ("day fez"); // Should return 2
     * countYZ("day fyyyz"); // Should return 2
     */



    /**
     * Given two strings, base and remove, return a version of the base string where all instances of the remove string have
     * been removed (not case sensitive). You may assume that the remove string is length 1 or more.
     * Remove only non-overlapping instances, so with "xxx" removing "xx" leaves "x".
     * <p>
     * example : removeString("Hello there", "llo") // Should return "He there"
     * removeString("Hello there", "e") //  Should return "Hllo thr"
     * removeString("Hello there", "x") // Should return "Hello there"
     * @return
     */

    public String removeString(String base, String remove) {
        return base.replaceAll(remove, "");
    }

    public Boolean countYZ(String input) {
        input = input.toLowerCase();
        input = input.replaceAll("x", "");
        input = input.replaceAll("y", "");
        input = input.replaceAll("is", "x");
        input = input.replaceAll("not", "y");

        int x = 0;
        int y = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == 'x') {
                x++;
            }else if (input.charAt(i) =='y') {
                y++;
            }
        }


        return x == y;
    }
    /**
     * Given a string, return true if the number of appearances of "is" anywhere in the string is equal
     * to the number of appearances of "not" anywhere in the string (case sensitive)
     *
     * example : containsEqualNumberOfIsAndNot("This is not")  // Should return false
     *           containsEqualNumberOfIsAndNot("This is notnot") // Should return true
     *           containsEqualNumberOfIsAndNot("noisxxnotyynotxisi") // Should return true
     */
    //will it work just to check if 2 "gg"s are next to each other??

    /**
     * We'll say that a lowercase 'g' in a string is "happy" if there is another 'g' immediately to its left or right.
     * Return true if all the g's in the given string are happy.
     * example : gHappy("xxggxx") // Should return  true
     * gHappy("xxgxx") // Should return  false
     * gHappy("xxggyygxx") // Should return  false
     *
     * @return
     */
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


    /**
     * We'll say that a "triple" in a string is a char appearing three times in a row.
     * Return the number of triples in the given string. The triples may overlap.
     * example :  countTriple("abcXXXabc") // Should return 1
     *            countTriple("xxxabyyyycd") // Should return 3
     *            countTriple("a") // Should return 0
     */
    public Integer countTriple(String input){
        int count = 0;
        for (int i = 0; i <= input.length() -3; i++) {
            if (input.charAt(i) == input.charAt(i + 1) && input.charAt(i) == input.charAt(i +2)){
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
                }else if (this_is_not.charAt(i) =='y') {
                    y++;
                }
            }


            return x == y;
        }
    }

