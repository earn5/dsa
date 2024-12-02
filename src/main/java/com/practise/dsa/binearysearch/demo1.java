package com.practise.dsa.binearysearch;

public class demo1 {
    public static void main(String[] args) {
        int[] arr = {1,3,4,5,6,9};
        int target = 3;
        int index = binearSearchSorting(arr, target);
        if(index != -1)
            System.out.println("Target Matches At Index: " + index);
        else
            System.out.println("Target Not Matches");
    }

    public static int binearSearchSorting(int[] arr, int target) {
        //1,3,4,5,6,9
        int left = 0;
        int right = arr.length-1;
        while (left <= right) {
            int mid = (left+right)/2;
            if(arr[mid] == target)
                return mid;
            else if(arr[mid] < target)
                left = mid + 1;
            else
                right = mid - 1;
        }
        return -1;
    }
}
