/* Write a program to convert each 1st char to uppercase from a string
Input: rahim lives in sylhet
Output: Rahim Lives in Sylhet */

package string_manipulation;

public class ConvertUppercase {
    public static void main(String[] args) {
        String str="rahim lives in sylhet";
        String[] words=str.split(" ");
        for(int i=0;i<words.length;i++) {


            String firstLetter = String.valueOf(words[i].charAt(0)).toUpperCase();
            if (words[i].charAt(0)=='i'){
                firstLetter = String.valueOf(words[i].charAt(0)).toLowerCase();
            }

            String othersLetter = words[i].substring(1);

                System.out.println(firstLetter + othersLetter);

        }
    }
}
