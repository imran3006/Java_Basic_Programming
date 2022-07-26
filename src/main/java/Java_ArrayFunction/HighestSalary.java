/* Suppose, in a company , here are some employee salaries in an array
[35000, 25000, 28000, 32500, 44000, 32800]
Find out the 3rd highest salary
 */

package Java_ArrayFunction;

import java.util.Arrays;

public class HighestSalary {
    public  static void main(String[] args) {
        //int aa[];
        int salary[] ={35000, 25000, 28000, 32500, 44000, 32800};
        Arrays.sort(salary);
        for (int i=salary.length-1; i>=0;i--){
            System.out.println(salary[i]);
        }
        System.out.println("3rd highest salary: " + salary[3]);
    }

}
