import java.util.Scanner;

public class ArrayExersice2 {
    public static void main(String args[]){
        //declare array
        double[] arr1 = {20.0,38.9,45.3,22,56,34};
        //print array
        for(int i=0;i<arr1.length;i++){
            System.out.println(arr1[i]);
        }
        //find largest one in array
         double largest =arr1[0];
        for(int i = 1 ;i<arr1.length;i++){
            if(arr1[i]>largest){
                largest=arr1[i];
            }
        }
        System.out.println("Largest Number is "+largest);



        //sum of all array elements
//        double sum =0;
//        for(int i=0;)

    }
}
