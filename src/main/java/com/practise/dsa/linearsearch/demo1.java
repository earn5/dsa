package com.practise.dsa.linearsearch;

public class demo1 {
    public static void main(String[] args) {
        int[] array = {5,3,8,1};
        int target = 1;
        int result = linearSearchResult(array, target);
        if(result != -1)
            System.out.println("Target Found In Array:: " + result);
        else
            System.out.println("Target Not Found");
    }

    private static int linearSearchResult(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if(target == array[i]) {
                return i;
            }
        }
        return -1;
    }
}
