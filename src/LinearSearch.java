
class LinearSearch {
    public static int search(int arr[], int x)
    {
        int N = arr.length;
        for (int i = 0; i < N; i++) {
            if (arr[i] == x)
                return i;
        }
        return -1;
    }

    // Driver's code
    public static void main(String args[])
    {
        int arr[] = { 2, 3, 4, 10, 40 };
        int x = 10;

        System.out.print("\nThe starting array is { 2, 3, 4, 10, 40 }.\n");
        System.out.print("The element being searched for is 10.\n");

        // Function call
        int result = search(arr, x);
        if (result == -1)
            System.out.print(
                    "Element is not present in array");
        else
            System.out.print("Element is present at index "
                    + result + "\n");
    }
}