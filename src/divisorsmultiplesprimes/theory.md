
### 1. **약수 구하기 (Divisor)**
어떤 수의 모든 약수를 구하는 방법입니다.

#### **Java 코드 예시**:
```java
import java.util.ArrayList;
import java.util.List;

public class DivisorExample {
    public static void main(String[] args) {
        int n = 36;
        List<Integer> divisors = getDivisors(n);
        System.out.println("약수: " + divisors);
    }

    public static List<Integer> getDivisors(int n) {
        List<Integer> divisors = new ArrayList<>();
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                divisors.add(i);
                if (i != n / i) {  // 제곱수가 아닌 경우 반대쪽 값 추가
                    divisors.add(n / i);
                }
            }
        }
        divisors.sort(Integer::compareTo);  // 약수 정렬
        return divisors;
    }
}
```

#### **출력**:
```
약수: [1, 2, 3, 4, 6, 9, 12, 18, 36]
```

---

### 2. **배수 구하기 (Multiples)**
어떤 수의 첫 `k`개의 배수를 구하는 방법입니다.

#### **Java 코드 예시**:
```java
import java.util.ArrayList;
import java.util.List;

public class MultipleExample {
    public static void main(String[] args) {
        int n = 5;
        int k = 5;
        List<Integer> multiples = getMultiples(n, k);
        System.out.println("배수: " + multiples);
    }

    public static List<Integer> getMultiples(int n, int k) {
        List<Integer> multiples = new ArrayList<>();
        for (int i = 1; i <= k; i++) {
            multiples.add(n * i);
        }
        return multiples;
    }
}
```

#### **출력**:
```
배수: [5, 10, 15, 20, 25]
```

---

### 3. **소수 판별하기 (Prime Number)**
소수는 1과 자기 자신만을 약수로 가지는 1보다 큰 자연수를 의미합니다.

#### **소수 판별 방법**
- **1부터 √N까지 반복하며 N이 i로 나누어 떨어지면 소수가 아님**.

#### **Java 코드 예시**:
```java
public class PrimeNumberExample {
    public static void main(String[] args) {
        int number = 29;
        boolean isPrime = isPrime(number);
        System.out.println(number + "는 소수인가? " + isPrime);
    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;  // 1 이하는 소수가 아님
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;  // 나누어 떨어지면 소수가 아님
            }
        }
        return true;  // 나누어 떨어지지 않으면 소수임
    }
}
```

#### **출력**:
```
29는 소수인가? true
```

---

### 4. **소수 목록 구하기 (Prime Numbers within a Range)**
어떤 범위 내의 모든 소수를 구하는 방법입니다.

#### **Java 코드 예시**:
```java
import java.util.ArrayList;
import java.util.List;

public class PrimeListExample {
    public static void main(String[] args) {
        int start = 10;
        int end = 50;
        List<Integer> primes = getPrimesInRange(start, end);
        System.out.println("소수 목록: " + primes);
    }

    public static List<Integer> getPrimesInRange(int start, int end) {
        List<Integer> primes = new ArrayList<>();
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                primes.add(i);
            }
        }
        return primes;
    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
```

#### **출력**:
```
소수 목록: [11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47]
```

---

최소공배수(Least Common Multiple, LCM)와 최대공약수(Greatest Common Divisor, GCD)를 구하는 공식과 방법을 아래에 설명할게요.

---

### 1. **최대공약수 (GCD) 구하기**
최대공약수는 두 수의 공통된 약수 중 가장 큰 값을 말합니다.

#### **유클리드 호제법 (Euclidean Algorithm)**
1. 두 수 A와 B에서 (A > B)라 가정합니다.
2. A를 B로 나눈 나머지 R을 구합니다.
3. R이 0이 될 때까지, A를 B로 대체하고 B를 R로 대체하며 반복합니다.
4. 나머지가 0이 되면 그때의 B가 최대공약수입니다.

#### 예제:
- A = 48, B = 18
    1. 48 ÷ 18 = 2 (나머지 12)
    2. 18 ÷ 12 = 1 (나머지 6)
    3. 12 ÷ 6 = 2 (나머지 0) → 최대공약수는 **6**

---

### 2. **최소공배수 (LCM) 구하기**
최소공배수는 두 수의 공통된 배수 중 가장 작은 값을 말합니다.

#### 공식:
\[
LCM(A, B) = \frac{A \times B}{GCD(A, B)}
\]

#### 예제:
- A = 48, B = 18
    1. GCD(48, 18) = 6 (위에서 계산)
    2. \( LCM(48, 18) = \frac{48 \times 18}{6} = 144 \)

---

### Python 코드로 구현
아래는 Python을 사용한 구현 예입니다:

```python
def gcd(a, b):
    while b:
        a, b = b, a % b
    return a

def lcm(a, b):
    return a * b // gcd(a, b)

# 예제
a, b = 48, 18
print("최대공약수:", gcd(a, b))
print("최소공배수:", lcm(a, b))
```

출력:
```
최대공약수: 6
최소공배수: 144
```

