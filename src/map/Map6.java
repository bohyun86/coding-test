package map;

import java.io.*;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Map6 {
    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        Set<String> heardPeople = new HashSet<>();
        Set<String> notHeardLookedPeople = new HashSet<>();

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < num1; i++) {
            heardPeople.add(scanner.nextLine());
        }

        for (int i = 0; i < num2; i++) {
            String name = scanner.nextLine();
            if (heardPeople.contains(name)) {
                notHeardLookedPeople.add(name);
            }
        }

        System.out.println(notHeardLookedPeople.size());
        notHeardLookedPeople.stream().sorted().forEach(System.out::println);

        scanner.close();


    }
}
