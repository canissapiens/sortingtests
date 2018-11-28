package sortingMethods;

import sortowanie.*;

// import static sortowanie.StaticMethods.*;

public class BubbleSort implements SortInterface {

    @Override
    // sorting ascending
    public void sort(int[] tab) {
        int size = tab.length;
        for (int i = size - 2; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                if (tab[j] > tab[j + 1]) {
                    sortowanie.StaticMethods.swapMe(tab, j, j + 1);
                }
            }
        }
    }

    // sorting in a given direction v.1
    public void sort(int[] tab, boolean direction) {
        if (!direction) {
            for (int i = 0; i < tab.length; i++) {
                tab[i] *= -1;
            }
        }
        sort(tab);
        if (!direction) {
            for (int i = 0; i < tab.length; i++) {
                tab[i] *= -1;
            }
        }
    }

    // sort in a given direction v.2
    public void sort(int[] tab, int direction) {
        int size = tab.length;
        for (int i = size - 2; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                if ((direction * tab[j]) > (direction * tab[j + 1])) {
                    sortowanie.StaticMethods.swapMe(tab, j, j + 1);
                }
            }
        }
    }
}
