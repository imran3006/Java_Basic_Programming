/*  Core i 7 HP laptop price is 76000 tk and cash payment discount 10%.
What will be the purchase price? */

package string_manipulation;

public class LaptopPurchase {
    public static void main(String[] args) {
        String st= "Core i 7 HP laptop price is 76000 tk and cash payment discount 10%";
        st= st.replaceAll("[^\\d,^\\%]"," ");
        st=st.trim();
        st=st.replaceAll(" +"," ");
        //st=st.replace(, " ");
        st=st.replace("10%","0.1");
        st=st.trim();
      String[] aa= st.split(" ");
//        for (int i=0;i<aa.length;i++){
//            System.out.println(aa[i]);
//        }
//        double core= Double.parseDouble(aa[0]);
        double Price= Double.parseDouble(aa[1]);
        double Percent= Double.parseDouble(aa[2]);

        Double ppurchase = Price-(Price *Percent);
        System.out.println(ppurchase);

    }
}
