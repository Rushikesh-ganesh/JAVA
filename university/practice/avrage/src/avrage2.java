import java.util.Scanner;

public class avrage2 {
    public static  void main(String args[]){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the Rating :");
        int star =sc.nextInt();
        switch (star){
            case 1:
                System.out.println("very bad");
            break;
            case 2:
                System.out.println("bad");
                break;
            case 3:
                System.out.println("medium");
                break;
            case 4:
                System.out.println("good");
                break;
            case 5:
                System.out.println("excellent");
                break;
            default:
                System.out.println("Enter valid rating .");
                break;

        }

    }
}
