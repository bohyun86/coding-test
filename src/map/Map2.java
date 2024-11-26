package map;

import java.util.*;

public class Map2 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numAcc = scanner.nextInt();
        int numQueries = scanner.nextInt();
        scanner.nextLine();

        Set<String> accountSet = new HashSet<>();
        for (int i = 0; i < numAcc; i++) {
            accountSet.add(scanner.nextLine());
        }

        List<String> queryList = new ArrayList<>();
        for (int i = 0; i < numQueries; i++) {
            queryList.add(scanner.nextLine());
        }

        long count = queryList.stream()
                .filter(accountSet::contains)
                .count();

        System.out.println(count);
    }
}
