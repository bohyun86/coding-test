package momosInterview;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] strArray = scanner.nextLine().toLowerCase().split("");

        Map<String, Integer> map = new LinkedHashMap<>();

        Pattern pattern = Pattern.compile("[a-zA-Z]");

        for (int i = 0; i < strArray.length; i++) {

            Matcher matcher = pattern.matcher(strArray[i]);
            if (matcher.matches()) {
                map.put(strArray[i], map.getOrDefault(strArray[i], 0) + 1);
            }
        }

        map.forEach((key, value) -> System.out.println(key + ": " + value));
    }
}
