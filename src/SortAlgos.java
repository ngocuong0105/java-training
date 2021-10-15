package src;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

// Run algos from here
public class SortAlgos {
    public static void main(String[] args) {
        InsertionSort insertionSort = new InsertionSort();
        BubbleSort bubbleSort = new BubbleSort();
        MergeSort mergeSort = new MergeSort();
        QuickSort quickSort = new QuickSort();

        int[] nums = {1,2,-10,30,2,4,1,11,23,2,5,7}; 
        insertionSort.sort(nums);
        System.out.println("Insertion Sort: " + Arrays.toString(nums));

        int[] nums1 = {1,2,-10,30,2,4,1,11,23,2,5,7}; 
        bubbleSort.sort(nums1);
        System.out.println("Bubble Sort: " + Arrays.toString(nums1));

        int[] nums2 = {1,2,-10,30,2,4,1,11,23,2,5,7}; 
        int[] arr = mergeSort.sorted(nums2);
        System.out.println("Merge Sort: " + Arrays.toString(arr));

        int[] nums3 = {1,2,-10,30,2,4,1,11,23,2,5,7}; 
        quickSort.sort(nums3);
        System.out.println("Quick Sort: " + Arrays.toString(nums3));

        ArrayList<Integer> nums4 = new ArrayList<Integer>(Arrays.asList(1,2,-10,30,2,4,1,11,23,2,5,7)); 
        nums4= quickSort.sorted(nums4);
        System.out.println(nums4);
        
    }
}

// Insertion Sort
class InsertionSort {
    public void sort(int[] nums) {
        for (int i=0; i<nums.length; i++) {
            int j = i;
            while (j>0 && nums[j-1]>nums[j]) {
                int tmp = nums[j-1];
                nums[j-1] = nums[j];
                nums[j] = tmp;
                j--;
            }
        }
    }
}
// Bubble Sort
class BubbleSort {
    public void sort(int[] nums) {
        int j = nums.length-1;
        while (j>0) {
            for (int i=0; i<j; i++) {
                if (nums[i]>nums[i+1]) {
                    int tmp = nums[i];
                    nums[i] = nums[i+1];
                    nums[i+1] = tmp;
                }
            }
            j--;
        }
    }
}

// Merge Sort
class MergeSort {
    public int[] sorted(int[] nums) {
        return mergeSort(nums);
    }
    
    public int[] merge(int[] l, int[] r) {
        int i = 0;
        int j = 0;
        int li = 0;
        int rj = 0;
        int[] merged = new int[l.length+r.length]; 
        while (i<l.length || j<r.length) {
            if (i<l.length) {
                li = l[i];
            }
            else {
                li = Integer.MAX_VALUE;
            }
            if (j<r.length) {
                rj = r[j];
            }
            else {
                rj = Integer.MAX_VALUE;
            }
            if (li<rj) {
                merged[i+j] = li;
                i++;
            }
            else {
                merged[i+j] = rj;
                j++;
            }
        }
        return merged;
    }
    
    public int[] mergeSort(int[] nums) {
        if (nums.length<=1) {
            return nums;
        }
        int[] l = Arrays.copyOfRange(nums, 0, nums.length/2);
        int[] r = Arrays.copyOfRange(nums, nums.length/2, nums.length);
        int[] lsort = mergeSort(l);
        int[] rsort = mergeSort(r);
        return merge(lsort,rsort);
    }
}
// QuickSort
class QuickSort {
    private int nums[];
    

    public void sort(int[] nums) {
        this.nums = nums;
        quickSort(0, nums.length-1);
    }
    // ArrayList accepts only reference types as its element, not primitive datatypes. 
    // When trying to do so it produces a compile time error.
    public ArrayList<Integer> sorted(ArrayList<Integer> nums) {
        if (nums.size() <=1) {
            return nums;
        }
        int rnd = new Random().nextInt(nums.size());
        int pivot = nums.get(rnd);
        ArrayList<Integer> lower = new ArrayList<Integer>();
        ArrayList<Integer> mid = new ArrayList<Integer>();
        ArrayList<Integer> upper = new ArrayList<Integer>();
        for (int i = 0; i<nums.size(); i++) {
            if (nums.get(i)<pivot) {
                lower.add(nums.get(i));
            }
            else if (nums.get(i)==pivot) {
                mid.add(nums.get(i));
            }
            else if (nums.get(i)>pivot) {
                upper.add(nums.get(i));
            }
        }
        lower = sorted(lower);
        upper = sorted(upper);
        lower.addAll(mid);
        lower.addAll(upper);
        return lower;
    }

    private int partition(int l, int r) {
        int rnd = new Random().nextInt(r-l);
        swap(rnd+l,r);
        int pivot = nums[r];
        int i = l-1;
        for (int j=l; j<r; j++) {
            if (nums[j]<=pivot) {
                i++;
                swap(i,j);
            }
        }
        swap(i+1,r);
        return i+1;
    }

    private void quickSort(int l, int r) {
        if (l<r){
            int q = partition(l,r);
            quickSort(l,q-1);
            quickSort(q+1,r);
        }
    }
    
    private void swap(int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
        }
}





