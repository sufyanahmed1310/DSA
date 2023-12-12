public class BinarySearchEasy {
    public static void main(String[] args) {
        int nums[] = {0,2,4,6,8,7,5,3,1,0};
        System.out.println(peakElement(nums));
    }
    public static int peakElement(int a[]) {
        int start = 0, end = a.length-1, mid = 0;
        while (start < end) {
            mid = start + (end - start)/2;
            if (mid < a.length-1 && a[mid] < a[mid+1])//ascending part of array
                start = mid + 1;
            else
                end = mid;//descending part of the array
        }
        return start;
    }
