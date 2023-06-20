package practiceProblemday1;

import java.util.Scanner;

class LeapYear {
    public static void main(String[] args) {

        Scanner Scanner = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = Scanner.nextInt();

        boolean isLeapYear = (year % 4 == 0) && (year % 100 != 0 || year % 400 == 0);

        if (isLeapYear) {
            System.out.println(year + "is a leap year.");
        } else  {
            System.out.println(year + "is not a leap year.");

        }

        Scanner.close();
    }

}
