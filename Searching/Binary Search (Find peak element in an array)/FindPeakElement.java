public class FindPeakElement {

    public static int peakIndex(int start, int end, int n, int nums[]) {

            while(start < end) {
                int mid = start + (end - start)/2;

                if(nums[mid] > nums[mid + 1]) {
                    end = mid;
                }
                else {
                    start = mid + 1;
                }
            }

            return start;
    }

    public static void main(String[] args) {

        int nums[] = {2, 5, 6, 4, 8};
        int n = nums.length;
        int start = 0;
        int end = n - 1;

        System.out.println("peak element index = " + peakIndex(start, end, n, nums));
    }
}
