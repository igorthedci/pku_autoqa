import java.util.ArrayList;
import java.util.Date;

public class Main {

    // display an array
    public static void arrInfo (int[] arr) {
        String arrInfo = "array is = ";
        for (int i = 0;  i < arr.length; i++) {
            arrInfo += arr[i] + ", ";
        }
        System.out.println(arrInfo);
    }

    // sort an array
    public static void arrSort (int[] arr) {
        int posMin;
        int swap;
        for (int i = 0;  i < arr.length - 1; i++) {
            posMin = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[posMin] > arr[j]) {
                    posMin = j;
                }
            }
            if (i != posMin) {
                swap = arr[i];
                arr[i] = arr[posMin];
                arr[posMin] = swap;
            }
        }
    }

    public static void main(String[] args) {
	// write your code here
        int[] arr = new int[15];
    // initialize the array
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 10);
        }
    // display the array
        arrInfo(arr);
    // count even values
        int evenCounter = 0;
        for (int i = 0;  i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                evenCounter++;
            }
        }
        System.out.println("# even values = " + evenCounter);
    // sort the array
        System.out.println("Sorting...");
        arrSort(arr);
        arrInfo(arr);

    }  // end of main
}
