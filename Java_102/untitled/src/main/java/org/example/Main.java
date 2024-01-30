package org.example;

import java.awt.event.MouseWheelEvent;

public class Main {
    public static void main(String[] args) {
        //int a[] = {4, 3, 2, 1};
        int a[] = {4, 3, 2 ,1};
        int b[] = {4, 3, 2 ,1};

        MergeSort.printArray(a);


        InsertionSort(a);
        MergeSort.printArray(a);

        MergeSort.printArray(b);
        MergeSort.mergeSort(b);
        MergeSort.printArray(b);


    }

    public static void InsertionSort(int a[]) {
        int key, i;
        for (int j = 1; j < a.length; j++){
            key = a[j];
            i = j - 1;
            while ( i >= 0 && a[i] > key){
                a[i + 1] = a[i];
                i = i - 1;
            }
            a[i + 1] = key;
        }
    }

    public class MergeSort {

        public static void mergeSort(int[] array) {
            if (array == null) {
                return;
            }

            if (array.length > 1) {
                int mid = array.length / 2;

                int[] leftArray = new int[mid];
                System.arraycopy(array, 0, leftArray, 0, mid);

                int[] rightArray = new int[array.length - mid];
                System.arraycopy(array, mid, rightArray, 0, array.length - mid);

                mergeSort(leftArray);
                mergeSort(rightArray);

                merge(array, leftArray, rightArray);
            }
        }

        private static void merge(int[] result, int[] leftArray, int[] rightArray) {
            int i = 0, j = 0, k = 0;

            while (i < leftArray.length && j < rightArray.length) {
                if (leftArray[i] <= rightArray[j]) {
                    result[k++] = leftArray[i++];
                } else {
                    result[k++] = rightArray[j++];
                }
            }

            while (i < leftArray.length) {
                result[k++] = leftArray[i++];
            }

            while (j < rightArray.length) {
                result[k++] = rightArray[j++];
            }
        }

        public static void printArray(int[] array) {
            for (int element : array) {
                System.out.print(element + " ");
            }
            System.out.println();
        }

    }


}

