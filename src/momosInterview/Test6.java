package momosInterview;

import java.util.Scanner;

public class Test6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();

        String reversed = new StringBuilder(str).reverse().toString();

        System.out.println(str.equals(reversed));

    }
}
