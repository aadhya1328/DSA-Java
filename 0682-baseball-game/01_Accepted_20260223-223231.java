 import java.util.*;

public class Solution {
    public int calPoints(String[] ops) {
        ArrayList<Integer> rounds = new ArrayList<>();

        for (String str : ops) {

            // If number (including negative)
            if (Character.isDigit(str.charAt(0)) || str.charAt(0) == '-') {
                rounds.add(Integer.parseInt(str));
            }

            // "+"
            else if (str.equals("+")) {
                int n = rounds.size();
                rounds.add(rounds.get(n - 1) + rounds.get(n - 2));
            }

            // "D"
            else if (str.equals("D")) {
                rounds.add(2 * rounds.get(rounds.size() - 1));
            }

            // "C"
            else if (str.equals("C")) {
                rounds.remove(rounds.size() - 1);
            }
        }

        // Calculate total sum
        int sum = 0;
        for (int score : rounds) {
            sum += score;
        }

        return sum;
    }
}