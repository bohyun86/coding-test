package map;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Map9 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println(getUniqueSubstringCount(str));
        scanner.close();
    }

    private static int getUniqueSubstringCount(String str) {
        Set<String> uniqueSubstrings = new HashSet<>();

        for (int length = 1; length <= str.length(); length++) {
            for (int start = 0; start <= str.length() - length; start++) {
                uniqueSubstrings.add(str.substring(start, start + length));
            }
        }

        return uniqueSubstrings.size();
    }
}

/*
리팩토링 내용:
1. 반복되는 조건문 제거하고, 코드 가독성을 높이기 위해 메서드 분리:
   'getUniqueSubstringCount' 메서드를 만들어 가독성을 높였습니다.
2. 변수명을 의미에 맞게 변경: 변수명 'i'와 'j'를 'length'와 'start'로 변경하여 명확성을 높였습니다.
3. scanner를 사용 후 닫지 않는 문제 수정: 리소스 관리를 위해 scanner.close()를 추가하는 것이 좋습니다.
*/
