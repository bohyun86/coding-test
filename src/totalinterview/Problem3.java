package totalinterview;

import java.util.Arrays;

public class Problem3 {
    public static void main(String[] args) {

        System.out.println(revert("Hello"));

    }

    private static String revert(String value) {
        String revertValue = "";
        char[] valueArray = null;

        valueArray = value.toCharArray();

        for (int i = 0; i < valueArray.length / 2; i++) {
            char temp = valueArray[i];
            valueArray[i] = valueArray[valueArray.length - i - 1];
            valueArray[valueArray.length - i -1] = temp;
        }

        revertValue = String.valueOf(valueArray);

        return revertValue;

    }

}
