package Sort;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Problem1 {

    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        List<Coordinates> coordinatesList = new ArrayList<>();

        for (int i = 0; i < num; i++) {
            Coordinates coordinate = new Coordinates();
            coordinate.setX(scanner.nextInt());
            coordinate.setY(scanner.nextInt());
            coordinatesList.add(coordinate);
        }

        coordinatesList.stream().sorted(Comparator.comparing(Coordinates::getY).thenComparing(Coordinates::getX)).forEach(coordinate -> {
            System.out.println(coordinate.getX() + " " + coordinate.getY());
        });

    }
}

class Coordinates {

    private int x;
    private int y;

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
}
