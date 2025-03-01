import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MonthDaysProgram {

    private static final Map<String, Integer> MONTH_MAP = new HashMap<>();
    static {
        MONTH_MAP.put("january", 1);   MONTH_MAP.put("jan", 1);  MONTH_MAP.put("1", 1);
        MONTH_MAP.put("february", 2);  MONTH_MAP.put("feb", 2);  MONTH_MAP.put("2", 2);
        MONTH_MAP.put("march", 3);     MONTH_MAP.put("mar", 3);  MONTH_MAP.put("3", 3);
        MONTH_MAP.put("april", 4);     MONTH_MAP.put("apr", 4);  MONTH_MAP.put("4", 4);
        MONTH_MAP.put("may", 5);       MONTH_MAP.put("5", 5);
        MONTH_MAP.put("june", 6);      MONTH_MAP.put("jun", 6);  MONTH_MAP.put("6", 6);
        MONTH_MAP.put("july", 7);      MONTH_MAP.put("jul", 7);  MONTH_MAP.put("7", 7);
        MONTH_MAP.put("august", 8);    MONTH_MAP.put("aug", 8);  MONTH_MAP.put("8", 8);
        MONTH_MAP.put("september", 9); MONTH_MAP.put("sep", 9);  MONTH_MAP.put("9", 9);
        MONTH_MAP.put("october", 10);  MONTH_MAP.put("oct", 10); MONTH_MAP.put("10", 10);
        MONTH_MAP.put("november", 11); MONTH_MAP.put("nov", 11); MONTH_MAP.put("11", 11);
        MONTH_MAP.put("december", 12); MONTH_MAP.put("dec", 12); MONTH_MAP.put("12", 12);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int monthValue = -1;
        int year = -1;


        while (monthValue == -1) {
            System.out.print("Enter a month (full name, 3-letter abbreviation, or number 1-12): ");
            String userMonth = scanner.nextLine().trim().toLowerCase();

            if (MONTH_MAP.containsKey(userMonth)) {
                monthValue = MONTH_MAP.get(userMonth);
            } else {
                System.out.println("Invalid month. Please try again.");
            }
        }


        while (year <= 0) {
            System.out.print("Enter a 4-digit year (e.g., 1999): ");
            String inputYear = scanner.nextLine().trim();


            if (inputYear.matches("\\d{4}")) {
                year = Integer.parseInt(inputYear);
                if (year == 0) {
                    System.out.println("Year cannot be 0. Please try again.");
                    year = -1;
                }
            } else {
                System.out.println("Invalid year. Please enter a 4-digit numeric year (e.g., 1999).");
            }
        }

        int days = getDaysInMonth(monthValue, year);
        System.out.println("Number of days in this month: " + days);

        scanner.close();
    }

    private static int getDaysInMonth(int month, int year) {
        switch (month) {
            case 2: 
                return isLeapYear(year) ? 29 : 28;
            case 4: case 6: case 9: case 11:
                return 30;
            default:
                return 31;
        }
    }

    private static boolean isLeapYear(int year) {

        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}
