public class ArrayType {
    public static void main(String args[]){
        int[] score = new int[10];
        int[] another ={ 1,3,4,5,6,7};
        score[0]=5;
        score[2]=9;
//        System.out.println(score[0]);
        for(int i=0;i < score.length;i++){
            score[i] = i*10;
        }
        for(int i=0;i<score.length;i++){
            System.out.println(score[i]);
        }

    }
}
