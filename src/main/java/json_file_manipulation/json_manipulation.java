//in java we will read and write file through json. for that we should import a json package.
package json_file_manipulation;

import org.json.simple.JSONObject;

public class json_manipulation {
    public static void main(String[] args) {

    }
    private static void main(){
        JSONObject empObj =new JSONObject();
        empObj.put("Name","Imran Sarker");
        empObj.put("Deparment","CSE");
        empObj.put("Designation","Sofware Engineer");
//        empObj.put("Address","Dhaka");

         JSONObject adressObj = new JSONObject();
         adressObj.put("preaent_address","nasirabad, Chittagong");
        adressObj.put("preaent_address","nasirabad, Chittagong");
        adressObj.put("preaent_address","nasirabad, Chittagong");


    }
}
