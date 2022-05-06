import java.time.LocalDate;
import java.util.Scanner;

// https://www.hackerrank.com/challenges/java-date-and-time/problem?isFullScreen=true



public class localdateandtime {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // take input date month and year
        int day = sc.nextInt();
        int month = sc.nextInt();
        int year = sc.nextInt();

        // String ch = findDay(day, month, year);

        // System.out.println(ch);

        LocalDate dt = LocalDate.of(year, month, day);

        System.out.println(dt.getDayOfWeek());

        sc.close();
    }

    // public static int findDay(int day, int month, int year) {

    //     LocalDate dt = LocalDate.of(year, month, day);

    //     String str = dt.getDayOfWeek();

    //     return str;

    // }
}
