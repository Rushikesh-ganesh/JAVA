import java.util.Arrays;
import java.util.Scanner;

public class FIndingMissingNum {
    public static void  main(String args[]) {

//–9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
//        long intValue3 =(long)Math.pow(-2,64)-1;
//        long intValue4 =(long)Math.pow( 2,64);
//        System.out.println(intValue3);
//        System.out.println(intValue4);
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] myArray = new int[n];
        for (int i = 0 ;i<n;i++) {
            myArray[i] = in.nextInt();
        }
      //  System.out.println(n);
        int miss = getMissingNum(n,myArray);
        System.out.println(Arrays.toString(myArray));
        System.out.println("Missing number in array : " +miss);

    }
    public static int getMissingNum(int n,int myArray[]){
             int i,total;
             total=(n+1)*(n+2)/2;
             for(i=0;i<n;i++)
                 total -= myArray[i];
                 return total;

    }
}
