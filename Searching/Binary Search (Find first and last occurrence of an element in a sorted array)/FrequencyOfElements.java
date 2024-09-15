public class FrequencyOfElements {

    private static int firstOcc(int[] arr, int l, int r, int x) {
        if (r < l)
            return -1;

        int mid = (l + r) / 2;
        if ((mid == 0 || x > arr[mid - 1]) && arr[mid] == x) {
            return mid;
        }
        else if (x > arr[mid]) {
            return firstOcc(arr, mid + 1, r, x);
        }
        else {
            return firstOcc(arr, l, mid - 1, x);
        }
    }

    private static int lastOcc(int[] arr, int n, int l, int r, int x) {
        if (r < l)
            return -1;

        int mid = (l + r) / 2;
        if ((mid == n - 1 || x < arr[mid + 1]) && arr[mid] == x) {
            return mid;
        }
        else if (x < arr[mid]) {
            return lastOcc(arr, n, l, mid - 1, x);
        }
        else {
            return lastOcc(arr, n, mid + 1, r, x);
        }
    }

    private static int countOccurrences(int[] arr, int n, int x) {
        int first = firstOcc(arr, 0, n - 1, x);
        if (first == -1) {
            return -1;
        }
        int last = lastOcc(arr, n, first, n - 1, x);
        return last - first + 1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 2, 2, 3};
        int n = arr.length;
        int x = 2;
        int occurrences = countOccurrences(arr, n, x);
        System.out.println("Number of occurrences of " + x + ": " + occurrences);
    }
}
