package Sort;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {

        List<Members> membersList = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < num; i++) {

            String[] input = scanner.nextLine().split(" ");

            membersList.add(new Members(Integer.parseInt(input[0]), input[1]));
        }

        membersList.stream().sorted(Comparator.comparing(Members::getAge)).forEach(member -> {
            System.out.println(member.getAge() + " " + member.getName());
                }
        );

        // 나이 역순으로 하고 싶다면
        /* membersList.stream().sorted(Comparator.comparing(Members::getAge).reversed()).forEach(member -> {
            System.out.println(member.getAge() + " " + member.getName());
        }); */

    }
}

class Members {

    private int age;
    private String name;

    public Members(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
