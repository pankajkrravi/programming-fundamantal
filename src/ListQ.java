import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


/**
 * @Author pankaj
 * @create 10/19/21 9:51 AM
 */
public class ListQ {
    // declare list
    // Contains String --> "1,2,3,4,"'
    // java 8
    // exp-> convert List<integer>
    //print values
    public static void main(String[] args) {
           List<String> stringList= new ArrayList<String>();
           stringList.add("1,2,3,4,5");

           ArrayList<Integer> result= new ArrayList<Integer>();
     //   result.Collectors.toList();
        System.out.println(result);
    }
}
