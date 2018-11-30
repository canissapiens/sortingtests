package main;

import sortingMethods.*;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] tab = {0, 3, 2, 7, 2, 12, 5, -4, 7};
        int[] tab1 = {0, 3, 2, 2, 5, -4};
        int[] tab2 = {9, 1, 2, 4, 5, 7, 8, 6, 3};
        int[] tab3 = {9, 7, 4, 3, 6, 5, 1, 2, 8, 11};

//        BubbleSort bubbleSort = new BubbleSort();
//        bubbleSort.sort(tab);
//        bubbleSort.sort(tab, false);
//        bubbleSort.sort(tab, -1);
//        System.out.println(Arrays.toString(tab));
//        System.out.println();

//        InsertionSort insertionSort = new InsertionSort();
//        insertionSort.sort(tab);

//        SelectionSort selectionSort = new SelectionSort();
//        selectionSort.sort(tab);


//        QuickSort quickSort = new QuickSort();
//        quickSort.sort(tab);

        HeapSort heapSort = new HeapSort();
        heapSort.sort(tab3);

        System.out.println(Arrays.toString(tab3));
    }


}
