package totalinterview;

public class Problem2 {

    public static void main(String[] args) {

        int[] numbers = {9, 1, 4, 7, 5, 3, 8};
        printMatchedItem(numbers, 12);

    }

    private static void printMatchedItem (int[] numbers, int targetNum) {
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] + numbers[j] == targetNum) {
                    System.out.println(numbers[i] + "+" + numbers[j]);
                }
            }
        }
    }
}
