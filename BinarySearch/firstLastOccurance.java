public class firstLastOccurance{
public static void main(String [] args){
	int nums[] = {1,1,2,2,2,3,3,3,4,4,4,5,5};
	System.out.println(first(nums,3));
    }
public static void first(int[] a, int target) {
        int start = 0, end = a.length-1;
        while (start <= end) {
            int mid = start + (end - start)/2;
            if (a[mid] < target)
                start = mid + 1;
            else
                end = mid - 1;
        }
        System.out.println("The first occurance is "+start);
    }
}

