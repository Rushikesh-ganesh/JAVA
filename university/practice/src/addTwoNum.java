import java.util.Scanner;

public class addTwoNum {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1St Number : ");
        int number1 = sc.nextInt();
        System.out.println("Enter the 2nd Number : ");
        int number2 = sc.nextInt();
        if(number1 > number2){
            System.out.println( number1+ " is greater then "+number2);
        }else if(number1 < number2){
            System.out.println(number2+" is greater then "+number1);
        }else {
            System.out.println("The numbers are equal ");
        }
    }
}
