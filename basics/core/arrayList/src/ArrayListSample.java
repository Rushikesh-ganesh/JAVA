import java.util.ArrayList;

public class ArrayListSample {
    public  static  void main(String args[]){
//        String[] stringAarray =new String[10];
        ArrayList<String> heroes = new ArrayList<String>();
        heroes.add("ironman");
        heroes.add("spider");
        heroes.add("antman");
        heroes.add(0,"capt.america");
        System.out.println("My super Hero : "+heroes.get(0));
        
    }
}
