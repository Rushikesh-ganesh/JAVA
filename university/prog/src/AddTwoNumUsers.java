import java.util.Scanner;

public class AddTwoNumUsers {
    public static void main(String args[]){
        int myfirstNumber;
        int mysecondNumber;
        int result;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number 1 : ");
        myfirstNumber=in.nextInt();
        System.out.println("Enter number 2 : ");
        mysecondNumber =in.nextInt();
        System.out.println("your added value is : ");
        result=myfirstNumber+mysecondNumber;
        System.out.println(result);
//        TODO: Edit to take string input


    }
}
