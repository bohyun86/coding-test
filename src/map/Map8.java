package map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Map8 {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            // Input the size of each list
            int size1 = scanner.nextInt();
            int size2 = scanner.nextInt();
            scanner.nextLine();

            // Initialize map to store occurrences
            Map<String, Integer> numberOccurrences = new HashMap<>();

            // Read and process the first list of numbers
            addNumbersToMap(scanner.nextLine(), numberOccurrences);

            // Read and process the second list of numbers
            addNumbersToMap(scanner.nextLine(), numberOccurrences);

            // Count and print the number of entries that occurred only once
            long uniqueCount = numberOccurrences.values().stream().filter(value -> value == 1).count();
            System.out.println(uniqueCount);
        }
    }

    // Helper method to add numbers to the map
    private static void addNumbersToMap(String input, Map<String, Integer> map) {
        for (String number : input.split(" ")) {
            map.put(number, map.getOrDefault(number, 0) + 1);
        }
    }
}
