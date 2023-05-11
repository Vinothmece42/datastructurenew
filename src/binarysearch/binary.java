package binarysearch;

import java.util.Scanner;

public class binary {

    public static void main(String[] args) {

        int[] arr = { -34,-1,2,4,6,8,10,34,56,78,90};
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter the binary search value");
        int target = Sc.nextInt();
        int ans = val( arr, target);
        System.out.println(ans);

    } static  int  val( int[] arr ,int target ){
        int start = 0;
        int end = arr.length-1;
         while(start <= end ) {

             int mid = start + (end - start) / 2;
            if(target < arr[mid]){
                end = mid-1;
             }else if (target > arr[mid]) {
                start = mid + 1;
            }else {
                return mid;
            }
         }
        return -1;
    }
}
