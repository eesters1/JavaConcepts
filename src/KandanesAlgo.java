public class KandanesAlgo {
    public static int kandaneForMaxSubArray(int[] arr) {
        int maxEndHere = 0;
        int maxSoFar = 0;
        for (int i = 0; i < arr.length; i++) {
            maxEndHere += arr[i];
            if (maxEndHere < 0) {
                maxEndHere = 0;
            }
            if (maxSoFar < maxEndHere) {
                maxSoFar = maxEndHere;
            }
        }
        return maxSoFar;
    }

    public static void main(String args[]) {
        int arr[] = { 2, -3, 4, 10, -40 };

        System.out.print("The starting array is { 2, -3, 4, 10, -40 }.\n");

        int result = kandaneForMaxSubArray(arr);

        System.out.print("The maximum subarray is " + result + "\n");
    }
}
