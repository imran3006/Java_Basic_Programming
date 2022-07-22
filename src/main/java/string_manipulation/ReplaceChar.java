/*  Replace "R" from Rahim with "F" from the given String:
Input: Ratul and Rahim lives in Rangpur
Output: Ratul and Fahim lives in Rangpur */

package string_manipulation;

public class ReplaceChar {
    public static void main(String[] args) {
        String st = "Ratul and Rahim lives in Rangpur";
        int index=10;
        char ch= 'F';
        System.out.println("Original Input: " + st);
        st = st.substring(0,index) + ch + st.substring(index+1);
        System.out.println("Modified Input: "+ st);

    }
}
