package Sort;

import java.util.*;

public class Problem2 {

    public static void main(String[] args) {

        Comparator<String> stringComparator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        };

        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        Set<String> stringList = new HashSet<>();

        for (int i = 0; i < num; i++) {
            stringList.add(scanner.nextLine());
        }

        stringList.stream().sorted(stringComparator.thenComparing(Comparator.naturalOrder())).forEach(System.out::println);

    }
}
