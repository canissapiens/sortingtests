package sortingMethods;

import sortowanie.SortInterface;

import static sortowanie.StaticMethods.swapMe;

public class QuickSort implements SortInterface {


    @Override
    public void sort(int[] tab) {
        quickSort(tab, 0, tab.length - 1);
    }

    private void quickSort(int[] tab, int begin, int end) {
        int pivotPosition = begin;
        int pivot = tab[end];
        for (int i = begin; i < end; i++) {
            if (tab[i] < pivot) {
                swapMe(tab, pivotPosition, i);
                pivotPosition++;
            }
        }
        swapMe(tab, pivotPosition, end);
        if ((pivotPosition - begin) > 1) {
            quickSort(tab, begin, pivotPosition - 1);
        }
        if ((end - pivotPosition) > 1) {
            quickSort(tab, pivotPosition + 1, end);
        }

    }
}

