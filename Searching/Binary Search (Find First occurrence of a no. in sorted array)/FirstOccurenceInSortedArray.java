public class FirstOccurenceInSortedArray {

    public static int firstOccurence(int arr[], int n, int k) {
         int start = 0;
         int end = n-1;
         int result = -1;
         while(start <= end) {
             int mid = (start + end)/2;
             if(arr[mid] == k) {
                 result = mid;
                 end = mid - 1;
             }
             else if(arr[mid] < k) {
                 start = mid + 1;
             }
             else {
                 end = mid - 1;
             }
         }
         return result;
    }

    public static void main(String args[]) {
        int arr[] = {2, 3, 3, 5, 5, 7, 8, 9, 9, 12};
        int n = 10;
        int k = 5;
        int index = firstOccurence(arr, n, k);
        if(index == -1) {
            System.out.println("No occurence of " + k + " found in the array");
        }
        else {
            System.out.println("index of " + "k = " + index);
        }
    }

}