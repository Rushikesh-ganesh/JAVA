public class MaxyFinder {
   public static <T extends Comparable<T>> T maxy(T x,T y,T z){
       T maxy =x;
       if(y.compareTo(maxy)>0){
           maxy =y ;
       }
       if(z.compareTo(maxy)>0){
           maxy =z ;
       }
       return maxy;
   }
    public static void main(String[] args){
        System.out.printf("Max of %d,%d,%d :%d ",2,4,3,maxy(2,4,3));
    }
}
