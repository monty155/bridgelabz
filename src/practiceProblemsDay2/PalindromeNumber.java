package practiceProblemsDay2;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number");
        int input = scanner.nextInt();

        ReverseNumber reverseNumber = new ReverseNumber();

        int Num = reverseNumber.reverseNumber(input);

     if(input == Num) {

         System.out.println("the number palindrome number");
     }else {
         System.out.println("the number is not palindrome");

     }






    }
}
