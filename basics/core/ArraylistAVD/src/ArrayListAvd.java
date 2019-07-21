import java.util.ArrayList;

public class ArrayListAvd {
    public static void main(String[] args){
        ArrayList<String> myArrayList = new ArrayList<String>();
        ArrayList<Integer> myNewArrayList = new ArrayList<Integer>();
        //set value
        for(int i=1;i<20;i++){
            myNewArrayList.add(Integer.valueOf(i));//Autoboxing
        }
        //get value
        for(int i =1;i<20;i++){
            System.out.println("value of "+ myNewArrayList.get(i).intValue());
        }
    }
}
