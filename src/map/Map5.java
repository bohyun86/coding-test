package map;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Map5 {

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int num1 = Integer.parseInt(bufferedReader.readLine());

        Map<String, Integer> cards = new HashMap<>();
        String[] cardsValue = bufferedReader.readLine().split(" ");
        for (int i = 0; i < num1; i++) {
            cards.put(cardsValue[i], cards.getOrDefault(cardsValue[i], 0) + 1);
        }

        int num2 = Integer.parseInt(bufferedReader.readLine());
        List<String> inputNums = Arrays.stream(bufferedReader.readLine().split(" "))
                .collect(Collectors.toList());

        inputNums.stream().map(num -> cards.getOrDefault(num, 0))
                .forEach(num -> {
                    try {
                        bufferedWriter.write(num + " ");
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                });

        bufferedWriter.flush();
        bufferedReader.close();
        bufferedWriter.close();

    }
}
