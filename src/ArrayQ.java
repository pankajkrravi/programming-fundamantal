/**
 * @Author pankaj
 * @create 10/19/21 9:37 AM
 */
public class ArrayQ {
      // int arr[] = {5,4,6,8,9,7,10,9}
    //5 - 6
    //4-6
    //6-8.
    //8-9
    //9 -10
    //7 -10
    //10 -none
    //9 = none

    // 0 to last index
    // if arr[i] < arr[i+1]
    // print arr [i ] and arr[i+1]
    // else
    // print arr[i] -> none

    public static void main(String[] args) {
        int arr[] = {5,4,6,8,9,7,10,9};
        for(int i=0;i<arr.length-1;i++){
            if(arr[i] < arr[i+1]){
                System.out.println(arr[i]+" - "+arr[i+1]);
            } else {
                System.out.println(arr[i]+" --> None");
            }
        }
    }
}
