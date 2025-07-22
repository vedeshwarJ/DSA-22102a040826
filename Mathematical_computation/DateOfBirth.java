import java.util.*;
import java.time.LocalDate;

class DateOfBirth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the date of birth in the format yyyy-mm-dd");
        int year = sc.nextInt();
        int month = sc.nextInt();
        int day = sc.nextInt();

        LocalDate currentDate = LocalDate.now();

        int pyear = currentDate.getYear() - year;
        int pmonth = currentDate.getMonthValue() - month;
        int pday = currentDate.getDayOfMonth() - day;

        if (pday < 0) {
            pmonth--;
            pday += currentDate.minusMonths(1).lengthOfMonth(); 
        }   

        if (pmonth < 0) {
            pyear--;
            pmonth += 12;
        }

        System.out.println( pyear+" years : " + pmonth + " months : "+ pday+" days" );
        sc.close();
    }
}