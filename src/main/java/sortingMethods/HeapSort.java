package sortingMethods;

import sortowanie.SortInterface;

import static sortowanie.StaticMethods.swapMe;

public class HeapSort implements SortInterface {
    @Override
    public void sort(int[] tab) {
        int size = tab.length;
        int maxParent = size / 2 - 1;

        for (int i = maxParent; i >= 0; i--) {
            checkParentNode(tab, size, i);
        }

        for (int i = size - 1; i > 0; i--) {
            swapMe(tab, 0, i);
            size--;
            checkParentNode(tab, size, 0);
        }
    }

    private void checkParentNode(int[] tab, int size, int parentIdx) {
        int maxIdx = parentIdx;
        int leftCIdx = 2 * parentIdx + 1;
        int rightCIdx = 2 * parentIdx + 2;

        if (leftCIdx < size && tab[parentIdx] < tab[leftCIdx]) {
            maxIdx = leftCIdx;
        }
        if (rightCIdx < size && tab[maxIdx] < tab[rightCIdx]) {
            maxIdx = rightCIdx;
        }

        if (parentIdx != maxIdx) {
            swapMe(tab, maxIdx, parentIdx);
            checkParentNode(tab, size, maxIdx);
        }
    }
}
