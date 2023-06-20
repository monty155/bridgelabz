package practiceProblemsDay2;

import java.util.Scanner;

public class DisplayUnit {
    Scanner input = new Scanner(System.in);

    int hundreds = 0;
    int tens = 0;
    int ones = 0;

        System.out.println("Enter a 3 digit number: ");
    int number = input.nextInt();

    hundreds = number / 100;
        System.out.println("Hundreds place digit: " , hundreds);

    tens = (number - hundreds) / 10;
        System.out.println("\nTens place digit: " , tens);


    ones = (number - tens - hundreds);
        System.out.println("\nOnes place digit: " , ones);


        if (number > 999);
        System.out.println("\nError! Number more then 3 digits.");
        if (number < 100);
        System.out.println("Error! Number less then 3 digits.");
}



