package sortingMethods;

import sortowanie.SortInterface;

import static sortowanie.StaticMethods.swapMe;

public class SelectionSort implements SortInterface {

    @Override
    public void sort(int[] tab) {
        for (int i = 0; i < tab.length - 1; i++) {
            swapMe(tab, i, getMinValueIdx(tab, i));
        }
    }

    private int getMinValueIdx(int[] tab, int start) {
        int minValueIdx = 0;
        int minValue = Integer.MAX_VALUE;
        for (int i = start; i < tab.length; i++) {
            if (tab[i] < minValue) {
                minValue = tab[i];
                minValueIdx = i;
            }
        }
        return minValueIdx;
    }
}
