public class GenStr {
    public static<T extends  Comparable<T>> T maxy( T x,T y ,T z){
        T maxy =x;
        if(y.compareTo(maxy)>0){
            maxy = y;
        }
        if(z.compareTo(maxy)>0){
            maxy = z;
        }
        return maxy;
    }

    public static void main(String args[]){
        System.out.printf("%s",maxy("Apple","Mi","Microsoft"));
        Holder<String> StringValue = new Holder<>();
        StringValue.setMyVar(new String("Hello World"));
        System.out.println(StringValue.getMyVar());

        Holder<Integer> integerValue = new Holder<>();
        integerValue.setMyVar(new Integer(3));
        System.out.println(integerValue.getMyVar());
    }
}
