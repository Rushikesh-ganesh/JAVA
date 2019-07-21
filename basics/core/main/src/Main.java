public class Main {
    public static void main(String args[]){
        MyClass jhon =new MyClass();
//        jhon.name="ram";
//        System.out.println(jhon.name);
//            jhon.setAge(4);
          System.out.println(jhon.getAge());

    }
}
class MyClass{
    private String name="jhoe";
    private int age =34;
    private int accNo;
    //getter
    public int getAge(){
        return age;
    }
    //setter
    public  void setAge(int myAge){
        age = myAge;
    }

    public String getName() {
        return name;
    }
}