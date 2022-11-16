import java.util.Scanner;

public class Reverse_array {
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
//        Take the input for the number of elements from the user
        System.out.println("Enter the number of elements in the array: ");
        int num = in.nextInt();
        int[] arr = new int[num];
        System.out.println("Enter the elements of the array: ");
        for(int i = 0;i<num;i++){
            arr[i] = in.nextInt();
        }
//        Reversing the array
        swap_elements(arr);
        System.out.println("The Reverse of the array is: ");
        for (int i: arr){
            System.out.print(i + " ");
        }

    }
    static void swap_elements(int[] arr){
        int end = arr.length-1;
        int i = 0;
        int temp;
        while(i<end){
            temp = arr[i];
            arr[i] = arr[end];
            arr[end] = temp;
            i++;
            end--;
        }
    }
}
