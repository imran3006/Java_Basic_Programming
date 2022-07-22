/*  Extract the transaction ID from the HTML body
<html><title>Test</title><body>Your trnx is successful. Trnx Id is: TXN123456</body>
</html> */

package string_manipulation;

public class TransactionProblem {
    public static void main(String[] args) {
        String str = "<html><title>Test</title><body>Your trnx is successful. Trnx Id is: TXN123456</body></html>";

        String aa= str.substring(str.indexOf("TX"));
        //System.out.println(aa);
        System.out.println(aa.substring(aa.indexOf("TX"), 9));


//
//
//
//       String a[] = aa.split("<");
//        System.out.println(a[0]);

//
////        for (int i = 0; i < a.length; i++) {
////            System.out.println( a[i]);
////        }
//////     String bb= str.substring(str.indexOf("TX"));
//        //String cc= String.valueOf(bb.charAt(0));
//        System.out.println("After 1st split: ");
//        System.out.println(a[2]);
//        String t1 = a[2];
//        String t2[] = t1.split(" ");
////        for (int i = 0; i < t2.length; i++) {
////            System.out.println(t2[i]);
////        }
//        System.out.println("After 2nd split: ");
//        System.out.println(t2[7]);
//        String t4 = t2[7];
//        String t5[] = t4.split("<");
////        for (int i = 0; i < t5.length; i++) {
//////            System.out.println(t5[i]);
//////
//////        }
//        System.out.println("After 3rd split: ");
//        System.out.println(t5[0]);

    }
}

