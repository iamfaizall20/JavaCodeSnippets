public class SmallestElementinArray {
    public static void main(String[] args) {

        int [] arr = {12,25,35,45,55};
        int smallest = arr[4];

        System.out.println("Array: ");
        for(int i:arr){
            System.out.print(i+" ");
            if(i<smallest){
                smallest = i;
            }
        }
        System.out.println("\nLargest Number in Array: " + smallest);
        }
    }
