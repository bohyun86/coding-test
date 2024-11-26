package Sort;

import java.util.*;

public class Problem4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        long[] numbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToLong(Long::parseLong)
                .toArray();

        // 중복 제거 및 정렬
        TreeSet<Long> sortedSet = new TreeSet<>();
        for (long number : numbers) {
            sortedSet.add(number);
        }

        // 정렬된 값을 기반으로 인덱스 맵 생성
        Map<Long, Integer> indexMap = new HashMap<>();
        int index = 0;
        for (long value : sortedSet) {
            indexMap.put(value, index++);
        }

        // 입력 배열의 값을 정렬된 인덱스로 변환
        StringBuilder result = new StringBuilder();
        for (long number : numbers) {
            result.append(indexMap.get(number)).append(" ");
        }

        // 출력
        System.out.println(result.toString().trim());
    }
}

/*
* 위 코드는 데이터 입력, 처리, 출력 과정에서 다음과 같은 주요 작업들을 수행합니다. 각각의 작업에 대해 시간 복잡도를 계산해 보겠습니다.

---

### 1. **입력 처리**
```java
long[] numbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToLong(Long::parseLong)
                .toArray();
```
- `scanner.nextLine()`로 한 줄을 읽는 시간은 데이터 크기에 비례하여 **O(n)**입니다.
- `split(" ")`로 문자열을 공백 기준으로 분리: **O(n)** (n은 입력 문자열의 길이).
- `mapToLong`으로 변환: **O(n)**.
- 최종 배열 생성: **O(n)**.

#### 합계:
**O(n)** (입력 데이터를 `numbers` 배열로 처리).

---

### 2. **중복 제거 및 정렬**
```java
TreeSet<Long> sortedSet = new TreeSet<>();
for (long number : numbers) {
    sortedSet.add(number);
}
```
- `TreeSet`은 내부적으로 **이진 검색 트리**(balanced binary search tree)로 구현되어 있으며, 삽입 연산의 시간 복잡도는 **O(log k)** (k는 현재 `TreeSet`에 저장된 요소 개수).
- n개의 요소를 삽입할 때 최대 **O(n log n)**.

#### 합계:
중복 제거와 정렬이 동시에 처리되며, 이 단계는 **O(n log n)**.

---

### 3. **정렬된 값의 인덱스 매핑**
```java
Map<Long, Integer> indexMap = new HashMap<>();
int index = 0;
for (long value : sortedSet) {
    indexMap.put(value, index++);
}
```
- `TreeSet` 순회: 모든 요소를 한 번 순회하므로 **O(k)** (k는 중복 제거 후 요소의 개수, 최대 n).
- `HashMap` 삽입: 평균적으로 **O(1)**, 따라서 전체 삽입 연산은 **O(k)**.

#### 합계:
이 단계는 **O(k)**, 여기서 k ≤ n.

---

### 4. **결과 인덱스 변환**
```java
for (long number : numbers) {
    result.append(indexMap.get(number)).append(" ");
}
```
- `numbers` 배열을 순회: **O(n)**.
- 각 `indexMap.get(number)` 호출: `HashMap`에서 조회 연산은 평균적으로 **O(1)**.
- 결과 조합: `StringBuilder`를 사용해 조합하는 작업도 **O(n)**.

#### 합계:
이 단계는 **O(n)**.

---

### 5. **전체 시간 복잡도**
이제 각 단계의 시간 복잡도를 합산합니다:
1. 입력 처리: **O(n)**.
2. 중복 제거 및 정렬: **O(n log n)**.
3. 정렬된 값의 인덱스 매핑: **O(k)** (k ≤ n).
4. 결과 인덱스 변환: **O(n)**.

가장 높은 복잡도는 **O(n log n)**이므로, **전체 시간 복잡도는 O(n log n)**입니다.

---

### 6. **공간 복잡도**
- `numbers` 배열: **O(n)**.
- `TreeSet`: 중복 제거된 요소만 저장하므로 **O(k)**.
- `indexMap`: 중복 제거된 요소만 저장하므로 **O(k)**.
- `StringBuilder`: 최종 출력 문자열을 저장하므로 **O(n)**.

#### 합계:
전체 공간 복잡도는 **O(n + k)**. (k ≤ n이므로 최종적으로 **O(n)**).

---

### 최적화 이유
- 중복 제거와 정렬을 한 번에 처리(`TreeSet` 사용).
- 평균적으로 빠른 조회를 보장(`HashMap` 사용).
- 출력 조합을 효율적으로 수행(`StringBuilder` 사용).

따라서, 이 코드는 입력 크기가 매우 큰 경우에도 **O(n log n)**으로 안정적으로 동작합니다.
* */
