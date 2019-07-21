import java.util.Iterator;
import java.util.LinkedList;

public class Main {
    public static  void main(String[] args){

        LinkedList<String> Programming =new LinkedList<>();
        Programming.add("c");
        Programming.add("java");
        Programming.add("JavaScript");
        for(int i=0;i<Programming.size();i++){
            System.out.println(i+"-->"+Programming.get(i));
        }
        System.out.println("============");
        Programming.add(1,"C++");
         for(int i=0;i<Programming.size();i++){
             System.out.println(i+"-->"+Programming.get(i));
         }
        System.out.println("============");

        //Iterators
        Iterator<String> i =Programming.iterator();
        while (i.hasNext()){
            System.out.println("your Language  :"+i.next());
        }

    }
}
