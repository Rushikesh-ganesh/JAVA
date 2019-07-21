class Bankar{
    private String name;
    public Bankar(String name){
        this.name=name;
    }
    public  String greet(){
        return "Default greeting";
    }
}

class SBIBank extends Bankar{
    public SBIBank() {
        super("SBIBANK");
    }

    @Override
    public String greet() {
        return "welcome to SBI .";
    }
}
class BOABank extends Bankar{
    public BOABank() {
        super("BDA bank");
    }

    @Override
    public String greet() {
        return "Welcome to BDA";
    }
}

class  MyBank extends Bankar{
    public MyBank(){
        super("mybank");
    }

    @Override
    public String greet() {
        return "my bank";
    }
}

public class Main {
    public static void main(String[] args){
            for (int i=1;i<5;i++){
                Bankar bankar = GenObjects();
                System.out.println("bank greet is:"+ bankar.greet());
            }
    }
    public static Bankar GenObjects(){
        int ramdom = (int)(Math.random()*3)+1;
       // System.out.println(ramdom);
        switch (ramdom){
            case 1:
                return new SBIBank();
               // break;
            case 2:
                return  new BOABank();
               // break;
            case 3:
                return new MyBank();
               // break;
            default:
                    return null;
        }
    }
}
