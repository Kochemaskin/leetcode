package SortingAndSearching.MergeSortedArray;

public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p = m-1;
        int q = n -1;
        int index = m + n -1;
        while (q >= 0) {
            if (p>=0 && nums1[p] >nums2[q]) {
                nums1[index --] = nums1[p--];
            } else {
                nums1[index --] = nums2[q--];
            }
        }
    }
}
/*
88
TC O(n)
SC O(1)
 */