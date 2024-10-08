package org.example.Arrays;

/*
search, insert and delete in an unsorted array
 */
public class SearchUnsortedArray {

    static int findElement(int arr[], int n, int key) {
        for (int i = 0; i < n; i++)
            if (arr[i] == key)
                return i;

        return -1;
    }

    public static void main(String[] args) {

        int arr[] = {12, 13, 42, 10, 40};
        int n = arr.length;

        //last element used as search element
        int key = 40;

        int position = findElement(arr, n , key);

        if (position == -1)
            System.out.println("Element not found");
        else
            System.out.println("Element Found at Position: " + (position +1));

    }
}
