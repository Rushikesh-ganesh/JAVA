import java.util.Scanner;

public class GradeGreeting {
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the grade :");
        String grade = sc.nextLine();
        switch (grade){
            case "a":
            System.out.println("Your Topper ,Congratulations.");
            break;

            case "b":
                System.out.println("Your good almost there");
                break;
            case "c":
                System.out.println("your so close ");
                break;
            case "d":
                System.out.println("Your need to be study");
                break;
            case "e":
                System.out.println("Your almost fail");
                break;
            case "f":
                System.out.println("Your fail");
                break;
            default:
                System.out.println("Choice will be only  a to f ");
                break;

        }

    }
}
