public class SbiUser extends BankApp{
    public SbiUser(String name){
        super(name);
        System.out.println("constructor from new");
    }

    @Override
    public void getUserInfo() {
        super.getUserInfo();
        System.out.println("name of tax info " +taxDetail);
    }
}
