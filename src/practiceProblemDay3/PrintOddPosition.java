package practiceProblemDay3;

public class PrintOddPosition {
    public static void main(String[] args) {

        int [] arr = new int [] {5,6,7,8,9,10};
        System.out.println("Elements of given array present on odd position: ");

        for (int i = 0; i < arr.length; i = i+2) {
            System.out.println(arr[i]);
        }
    }
}



