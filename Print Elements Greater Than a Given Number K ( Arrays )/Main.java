//Problem: Print Elements Greater Than a Given Number K

public class Main {

    static void PrintArray(int[] arr, int K){
        for(int i:arr){
            if(i > K) System.out.print(i+" ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {3, 17, 8, 22, 5, 11, 30, 2};
        int K = 10;

        System.out.println("Array Elements greater than "+K);
        PrintArray(arr,K);
    }
}
/*
Test Cases:

Input
   arr = {3, 17, 8, 22, 5, 11, 30, 2}
   K = 10
   Expected Output:17 22 11 30

Input:
   arr = {5, 12, 18, 3, 25, 7}
   K = 10
   Expected Output: 12 18 25

Input:
   arr = {50, 60, 70, 80, 90}
   K = 75
   Expected Output: 80 90
*/