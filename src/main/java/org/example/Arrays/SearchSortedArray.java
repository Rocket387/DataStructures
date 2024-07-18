package org.example.Arrays;

public class SearchSortedArray {

    //binary search
    //compares the key value with the middle element of the array;
    // if they are unequal, the half in which the key cannot be part of is eliminated,
    // and the search continues for the remaining half until it succeeds.
    static int binarySearch(int arr[], int low, int high, int key) {

        if (high < low)
            return -1;

        int mid = (low + high) /2;
        if (key == arr[mid])
            return mid;
        if (key > arr[mid])
            return binarySearch(arr, (mid +1), high, key);
        return binarySearch(arr, low, (mid -1), key);
    }

    public static void main(String[] args) {

        int arr[] = {5, 6, 7, 8, 9, 10};
        int n, key;
        n = arr.length - 1;
        key = 10;

        System.out.println("Index: " + binarySearch(arr, 0, n, key));
    }
}
