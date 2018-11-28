package sortowanie;

public class StaticMethods {
    public static void swapMe(int[] tab, int m, int n) {
        if (m != n) {
            int tmp = tab[n];
            tab[n] = tab[m];
            tab[m] = tmp;
        }
    }
}
