/* Find out how many images are in the given array:
["photo1.jpg", "doc1.pdf", "doc2.docx", "photo2.png", "doc3.pdf",
"msoffice.exe", "photo3.jpg"]
Output: 3 */

package string_manipulation;

public class FindImages {
    public static void main(String[] args) {
        int count=0;
        String st[] = new String[]{"photo1.jpg","doc1.pdf","doc2.docx", "photo2.png", "doc3.pdf",
                "msoffice.exe", "photo3.jpg"};
      for (int i=0;i<st.length;i++){
          if (st[i].contains("jpg") || st[i].contains("png")){
              count++;
          }
      }
        System.out.println(count);


    }
}
