public class ArrayExercise {
    public static void main(String args[]){
        int[] exerciseArray = {3,5,6,8,90,10,15,18};
        for(int i =0 ; i<exerciseArray.length; i++){
            System.out.println(exerciseArray[i]);
        }

        //find the largest number
        int largest=exerciseArray[0];
        for(int i=1;i<exerciseArray.length;i++){
            if(exerciseArray[i] > largest){
                largest = exerciseArray[i];
            }
        }
        System.out.println("Largest Number is "+largest);

        //sum all elements
        int sum = 0;
        for(int i =0;i<exerciseArray.length;i++){
//            sum=sum+exerciseArray[i];
            sum += exerciseArray[i];
        }
        System.out.println("Total is "+sum);
    }
}
