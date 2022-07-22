/*  Writea program that will give following output:
Input: chattogram
Output: C8M */

package string_manipulation;

public class MyChattogram {
    public static void main(String[] args) {
        String st= "chattogram";
        String st1 =String.valueOf(st.charAt(0)).toUpperCase();
        //System.out.println(st1);
        String st2 = String.valueOf(st.charAt(9)).toUpperCase();
        //System.out.println(st2);
        int b=st.length();
        int a = b-2;
        //System.out.println(b);
        System.out.println(st1+a+st2);

    }
}
