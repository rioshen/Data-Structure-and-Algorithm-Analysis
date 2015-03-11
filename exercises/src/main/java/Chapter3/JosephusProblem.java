package Chapter3;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Carl Shen on 3/11/15.
 *
 * Exercise 3.6
 * The Josephus Problem is the following game: N people, numbered 1 to N, are sitting in a circle. Starting at a person
 * 1, a hot potato is passed. After M passes, the person holding the hot potato is eliminated, the circle closes the
 * ranks and the game continues with the person who was sitting after the eliminated person picking up.
 */
public class JosephusProblem {

    /**
     * Similar to circular array, after eliminate one gamer, we need to recalculate the position because the size
     * of the array is changed. Also notice that, people is started as 1 but we are 0 based.
     *
     * Time Complexity is O(N)
     * Space Complexity is O(N)
     *
     * @param n    the number of gamers
     * @param m    the number of passes
     * @return     winner's position started from 1.
     */
    public int Winner(int n, int m) {
        if (n < 1) {
            return -1;
        }

        List<Integer> gamers = new ArrayList<Integer>(n);
        for (int i = 0; i < n; i++) {
            gamers.add(i + 1);
        }

        int position = 0;
        while (gamers.size() > 1) {
            position = (position + m) % gamers.size();
            gamers.remove(position);
        }

        return gamers.get(0);
    }
}
