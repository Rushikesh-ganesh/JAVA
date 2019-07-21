import java.util.Scanner;

public class CompareTwoNum {

        public static void main(String args[]) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the two numbers for camparing ");
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();

            if (num1 > num2) {
                System.out.println("Number 1 is bigger");
            } else if (num1 < num2) {
                System.out.println("Number 2 is bigger ");
            } else {
                System.out.println("Numbers are same");
            }
        }
}
