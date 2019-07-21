import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class DateDayFinder {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Date(1-31): ");
        int dd = sc.nextInt();
        System.out.println("Enter the Month(1-12): ");
        int mm = sc.nextInt()-1;
        System.out.println("Enter the year : ");
        int yy = sc.nextInt();

        Date date = (new GregorianCalendar(yy,mm,dd)).getTime();
        Date date1 = new Date();
        SimpleDateFormat sdf;
        sdf = new SimpleDateFormat("EEEE");
        String day = sdf.format(date);
        System.out.println(day);

        sdf = new SimpleDateFormat("hh:mm:ss");
        System.out.println("hh:mm:ss - "+sdf.format(date1));

        sdf = new SimpleDateFormat("dd MMM yyyy hh:mm:ss zzz");
        System.out.println("dd MMM yyyy hh:mm:ss zzz - "+sdf.format(date1));

        sdf = new SimpleDateFormat("E MMM dd yyyy");
        System.out.println("E MMM dd yyyy - "+sdf.format(date1));


    }
}
