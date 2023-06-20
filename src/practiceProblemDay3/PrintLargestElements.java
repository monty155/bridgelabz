package practiceProblemDay3;


import java.util.Arrays;

public class PrintLargestElements {

        public static void main(String[] args) {
            int arr[] = {10, 324, 45, 90, 9808};
            int max = Arrays.stream(arr).max().getAsInt();
            System.out.println("Largest element of array " + max);

        }
   }


