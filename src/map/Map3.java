package map;

import java.util.*;

public class Map3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numHistory = Integer.parseInt(scanner.nextLine());
        Map<String, String> history = new HashMap<>();

        for (int i = 0; i < numHistory; i++) {
            String[] input = scanner.nextLine().split(" ");
            history.put(input[0], input[1]);
        }

        history.entrySet().stream()
                .filter(entry -> "enter".equals(entry.getValue()))
                .map(Map.Entry::getKey)
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);
    }
}
