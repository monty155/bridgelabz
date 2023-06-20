package practiceProblemDay3;

public class PrintReverseOrder {
    public static void main(String[] args) {
        int arr[] = {5,6,7,8,9};

        int n=arr.length;
        for(int i=n-1; i>=0; i--)
            System.out.print(arr[i]+" ");
    }
}



