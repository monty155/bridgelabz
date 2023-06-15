package Programsjava;

public class functions {
   public static int calculateSum (int a, int b){
        int sum = a + b;
        return sum;

     }

     public static int substractNum(int a ,int b){
       return a - b;
     }
     public static int multiplyNum(int a ,int b){
       return a * b;
     }
     public static int dividetwoNum(int a , int b){
       return b / a;
     }
     public static int modulusTwoNum(int a, int b){
       return b % a;
     }
     public static int incrementNum(int a , int b){
       return a++;
     }
     public static int decrementNum(int a, int b){
       return a--;
     }
    public static void main(String[] args) {
          int a = 10;
          int b = 20;


          System.out.println("increment of 2 numbers is : "+ incrementNum(a, b));

     }


}