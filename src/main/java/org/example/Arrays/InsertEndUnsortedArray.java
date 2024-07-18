package org.example.Arrays;

public class InsertEndUnsortedArray {

    //function inserts a given key in the array
    static int insertedSorted(int arr[], int n, int key, int capacity) {

        if (n >= capacity)
            return n;

        arr[n] = key;

        return n +1;
    }

    public static void main(String[] args) {

        int[] arr = new int[20];
        arr[0] = 12;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 35;
        arr[4] = 60;
        arr[5] = 75;
        arr[6] = 90;
        int capacity = 20;
        int n = 6;
        int i, key = 26;

        System.out.println("Before Insertion: ");
        for (i = 0; i < n; i++)
            System.out.println(arr[i] + " ");

        n = insertedSorted(arr, n, key, capacity);

        System.out.println("After Insertion: ");
        for (i = 0; i <n; i++)
            System.out.println(arr[i] + " ");
    }
}
