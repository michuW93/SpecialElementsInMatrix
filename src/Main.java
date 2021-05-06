import java.util.HashSet;
import java.util.Set;

public class Main {
    public static int[][] input = {
            {1, 3, 4},
            {5, 2, 9},
            {8, 7, 6}
    };

    public static void main(String[] args) {
        int numberOfElements = 0;
        Set<Integer> numberOfUniqueElements = new HashSet<>();

        Set<Integer> specialElements = new HashSet<Integer>();
        for (int i = 0; i < input.length; i++) {
            int maxInRow = Integer.MIN_VALUE;
            int minInRow = Integer.MAX_VALUE;
            int maxInColumn = Integer.MIN_VALUE;
            int minInColumn = Integer.MAX_VALUE;
            for (int j = 0; j < input[i].length; j++) {
                numberOfElements++;
                numberOfUniqueElements.add(input[i][j]);
                if (input[i][j] > maxInRow) {
                    maxInRow = input[i][j];
                }
                if (input[i][j] < minInRow) {
                    minInRow = input[i][j];
                }
                if (input[j][i] > maxInColumn) {
                    maxInColumn = input[j][i];
                }
                if (input[j][i] < minInColumn) {
                    minInColumn = input[j][i];
                }
            }

            specialElements.add(minInRow);
            specialElements.add(maxInRow);
            specialElements.add(minInColumn);
            specialElements.add(maxInColumn);
        }
        if (numberOfUniqueElements.size() != numberOfElements) {
            System.out.println("-1");
        } else {
            System.out.println(specialElements.size());
        }
    }
}
