/* Write a program that will count how many vowels in the given string:
"roadtosdet"
Output: 4 */

package string_manipulation;

public class FindVowels {
    public static void main(String[] args) {
        String st = "ROADTOSDET";
        int count = 0;
        for (int i=0;i<st.length();i++){
            if (st.charAt(i)=='A' ||
                    st.charAt(i)=='E' ||
                    st.charAt(i)=='I' ||
                    st.charAt(i)=='O' ||
                    st.charAt(i)=='U'){
                count++;
            }
        }
        System.out.println(count);
    }
}
