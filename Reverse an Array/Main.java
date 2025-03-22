// Problem: Reverse an Array
public class Main {

    static void ArrayReverse(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        ArrayReverse(arr);
        System.out.print("Reversed Array: ");
        for (int k : arr) {
            System.out.print(k + " ");
        }
    }
}

/*
Test Cases:

Input:
   arr = {1, 2, 3, 4, 5}
   Expected Output:** 5 4 3 2 1

Input:
   arr = {10, 20, 30, 40}
   Expected Output: 40 30 20 10

Input:
   arr = {7, 9, 2, 8, 1, 6}
   Expected Output: 6 1 8 2 9 7
*/
