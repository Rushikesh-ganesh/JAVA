import java.util.Scanner;

public class LeapYear {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year for finding year is leap or not :");
        int year = sc.nextInt();
        if((year % 400 == 0)||(year % 4 == 0 && year % 100 != 0)) {
            System.out.println("This is leap year");
        }else{
            System.out.println("This is not leap year");
        }
    }
}
