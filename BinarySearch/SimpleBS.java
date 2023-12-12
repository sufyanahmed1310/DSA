public static void main(String []args) {
        int a[] = {10,20,30,40,50};
        int start = 0, end = a.length-1, mid, ans, target =40;
        while (start <= end) {
                mid = start + (end - start)/2;
                if (a[mid] < target)
                        start = mid + 1;
                else if (a[mid] > target)
                        end = mid - 1;
                else
                        ans = mid;
                break;
        }
        return ans;
}
