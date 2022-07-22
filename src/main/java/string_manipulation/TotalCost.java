/*  Price of a formal shirt is 1200 tk and Sharee is 3500 tk. If you buy 2 shirt and 1 sharee,
then 400 tk will be discounted. After your purchase what will be your total cost? */

package string_manipulation;

public class TotalCost {
    public static void main(String[] args) {
        String st = "Price of a formal shirt is 1200 tk and Sharee is 3500 tk. If you buy 2 shirt and 1 sharee, then 400 tk will be discounted";
        st = st.replaceAll("[^\\d]" , " ");
        //System.out.println(st);
        st =st.trim();
        st=st.replaceAll(" +", " ");
        String[] aa=st.split(" ");
//        for (int i=0;i<aa.length;i++){
//            System.out.println(aa[i]);
//        }
        double Shirt_price= Double.parseDouble(aa[0]);
        double  Sharee_price = Double.parseDouble(aa[1]);
        double shirt_amount = Double.parseDouble(aa[2]);
        double sharee_amount = Double.parseDouble(aa[3]);
        double discount = Double.parseDouble(aa[4]);

        double Total_cost= (Shirt_price * shirt_amount + Sharee_price * sharee_amount) - discount;
        System.out.println(Total_cost);


    }
}
