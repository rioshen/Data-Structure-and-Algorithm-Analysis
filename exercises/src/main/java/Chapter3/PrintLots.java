package Chapter3;

import java.util.ArrayList;

/**
 * Created by Carl Shen on 3/10/15.
 *
 * <title>Exercise 3.1</title>
 * You are given a List L and another list P, contains integers sorted in ascending order.
 * The operation printLots will print the elements in L that are positioned in P.
 * For instance, if P = 2, 3, 4, 6, the elements in position 2, 3, 4, 6 in L are printed
 */
public class PrintLots {
    /**
     * Iterate through List P and use the element index to print from L
     * The time complexity should be O(N) where N means the length of P
     * @param L
     * @param P
     */
    public void printLots(ArrayList<Integer> L, ArrayList<Integer> P) {
        if (L == null || P == null) {
            return;
        }
        for (int elem : L) {
            if (elem < P.size()) {
                System.out.print(P.get(elem));
            }
        }
        System.out.println();
    }
}
