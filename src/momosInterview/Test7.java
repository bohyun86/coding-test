package momosInterview;

import java.util.Arrays;
import java.util.Scanner;

public class Test7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter sorted integers separated by spaces:");
        int[] numArrays = Arrays.stream(scanner.nextLine().trim().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        System.out.println("Enter the target number:");
        int target = Integer.parseInt(scanner.nextLine().trim());

        if (numArrays.length == 0) {
            System.out.println("Array is empty. No search possible.");
            return;
        }

        // Recursive binary search
        int resultRecursive = binarySearchRecursive(numArrays, target, 0, numArrays.length - 1);
        System.out.println("Recursive Binary Search Result: " + (resultRecursive != -1 ? resultRecursive : "Not Found"));

        // Iterative binary search
        int resultIterative = binarySearchIterative(numArrays, target);
        System.out.println("Iterative Binary Search Result: " + (resultIterative != -1 ? resultIterative : "Not Found"));
    }

    private static int binarySearchRecursive(int[] arrays, int target, int firstIndex, int lastIndex) {
        if (firstIndex > lastIndex) {
            return -1; // Target not found
        }

        int midIndex = (firstIndex + lastIndex) / 2;

        if (arrays[midIndex] == target) {
            return midIndex;
        }

        if (arrays[midIndex] > target) {
            return binarySearchRecursive(arrays, target, firstIndex, midIndex - 1);
        } else {
            return binarySearchRecursive(arrays, target, midIndex + 1, lastIndex);
        }
    }

    private static int binarySearchIterative(int[] arrays, int target) {
        int firstIndex = 0;
        int lastIndex = arrays.length - 1;

        while (firstIndex <= lastIndex) {
            int midIndex = (firstIndex + lastIndex) / 2;

            if (arrays[midIndex] == target) {
                return midIndex;
            }

            if (arrays[midIndex] > target) {
                lastIndex = midIndex - 1;
            } else {
                firstIndex = midIndex + 1;
            }
        }

        return -1; // Target not found
    }
}
