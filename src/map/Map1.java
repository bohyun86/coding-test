package map;

import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Map1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numCards = Integer.parseInt(scanner.nextLine());
        Set<String> cardSet = Stream.of(scanner.nextLine().split(" "))
                .limit(numCards)
                .collect(Collectors.toSet()); // HashSet

        int numQueries = Integer.parseInt(scanner.nextLine());
        String[] queryCards = scanner.nextLine().split(" ");

        String result = Stream.of(queryCards)
                .limit(numQueries)
                .map(card -> cardSet.contains(card) ? "1" : "0")
                .collect(Collectors.joining(" "));

        System.out.println(result);
    }
}