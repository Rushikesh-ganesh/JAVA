public class BankApp {
    String name ;
    int age;
    String taxDetail;
    double amount;

    //constructor
    public BankApp(String name){
        this.name = name;
        System.out.println("constructor called");
    }
    public  void accAge(int age){
        this.age = age;
    }
    public void accTax(String taxDetail){
        this.taxDetail =taxDetail;
    }
    public void depositAmount(double amount){
        this.amount = amount;
    }
    public  void  getUserInfo(){
        System.out.println("Name of user is " +this.name);
        System.out.println("Amount of user is " +this.amount);
    }

}
