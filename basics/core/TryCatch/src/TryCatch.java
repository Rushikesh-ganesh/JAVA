public class TryCatch {
    public static void main(String args[]){
        try {
            int[] callArray = {1,3,4};
            System.out.println(callArray[3]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("check index value "+e);
        }
        System.out.println("i am crashed");
    }
}
