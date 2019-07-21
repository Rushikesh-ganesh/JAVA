import java.util.Scanner;

public class LFN {
    public static void main(String args[]){
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter the three numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if(a>b && a>c ){
            System.out.println("1st Number is bigger ");
        }else if(b>a&&b>c){
            System.out.println("2nd Number is bigger ");
        }else if(c>a&&c>b){
            System.out.println("3rd number is bigger ");
        }else if(a==b && a==c ||b==c && b==a || c==a&&c==b){
            System.out.println("number is equal");
        }
    }
}
