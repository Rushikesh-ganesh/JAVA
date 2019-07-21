
public class TypeCasting {
    public static void main(String args[]){
        byte b ;
        int i =500;
        float f = 29.30f;
        b = (byte)f;
        System.out.println("Float is "+f+"Byte is"+b);
        f=i;
        int intMY =(int)f ;
        float fe=i;

        System.out.println(fe);
        System.out.println("intMY = " + intMY);
        
        System.out.println("integer converted to float : " + f);
    }
}
