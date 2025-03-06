package part3;

public class ques1 {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int d = 2; 
        rotateArray(arr, d);
        System.out.println("Rotated Array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void rotateArray(int[] arr, int d) {
        int n = arr.length;

        d = d % n;

        int[] temp = new int[d];

        for (int i = 0; i < d; i++) {
            temp[i] = arr[i];
        }

        for (int i = 0; i < n - d; i++) {
            arr[i] = arr[i + d];
        }

        for (int i = 0; i < d; i++) {
            arr[n - d + i] = temp[i];
        }
    }
}
