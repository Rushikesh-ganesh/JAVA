import java.util.Scanner;

public class Ftoc {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("1.Convert Temp in Fahrenheit. ");
        System.out.println("2.Convert Temp in Celsius. ");
        System.out.println("Enter Your Choice : ");
        int choice = sc.nextInt();
        switch (choice){
            case 1:
                System.out.println("Enter the Temprature :");
                int cel=sc.nextInt();
                int covFahrenheit = ((cel-32)*5)/9;
                System.out.println("Converted Temp in Fahrenheit :"+covFahrenheit);
            break;
            case 2:
                System.out.println("Enter the Temprature : :");
                int far = sc.nextInt();
                int conCel =((far*9)/5)+32;
                System.out.println("Converted Temp in Celsius : " +conCel);
            break;
            default:
                System.out.println("Wrong choice");
            break;
        }
    }
}
