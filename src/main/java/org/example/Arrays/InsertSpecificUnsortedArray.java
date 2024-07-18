package org.example.Arrays;

public class InsertSpecificUnsortedArray {

    static void insertedElement(int arr[], int n, int x, int pos) {

        //shift elements on the right side of pos (including pos) to the right
        for (int i = n -1; i >= pos; i--)
            arr[i + 1] = arr[i];
        arr[pos] = x;
    }

    public static void main(String[] args) {

        int[] arr = new int[20];
        arr[0] = 12;
        arr[1] = 20;
        arr[2] = 3;
        arr[3] = 5;
        arr[4] = 60;
        int n = 5;
        int x = 10, pos = 2;

        System.out.println("Before Insertion: ");
        for (int i = 0; i < n; i++)
            System.out.println(arr[i] + " ");

        insertedElement(arr, n, x, pos);
        n += 1;

        System.out.println("After Insertion: ");
        for (int i = 0; i < n; i++)
            System.out.println(arr[i] + " ");
    }
}
