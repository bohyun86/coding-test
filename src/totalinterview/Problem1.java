package totalinterview;

import java.util.Arrays;

public class Problem1 {
    public static void main(String[] args) {
        int[][] score = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int[][] expandScore = copyAndSum(score);

        System.out.println(Arrays.deepToString(expandScore));
        
    }
    
    private static int[][] copyAndSum(int[][] score) {
        
        int[][] result = new int[score.length +1][score[0].length + 1];

        for (int i = 0; i < score.length; i++) {
            for (int j = 0; j < score[i].length; j++) {
                int value = score[i][j];
                result[i][j] = value;
                result[i][result[i].length - 1] += value;
                result[result.length - 1][j] += value;
                result[result.length - 1][result[i].length - 1] += value;
            }
        }
        return result;
    }
}
