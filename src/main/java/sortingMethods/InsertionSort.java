package sortingMethods;

import sortowanie.SortInterface;

public class InsertionSort implements SortInterface {
    @Override
    public void sort(int[] tab) {
        for (int i = 1; i < tab.length; i++) {
            int tmp = tab[i];
            int j = i;

            while (j > 0 && (tab[j - 1] > tmp)) {
                tab[j] = tab[j - 1];
                j--;
            }
            tab[j] = tmp;
        }
    }
}
