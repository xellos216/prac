자바는 산술, 비교, 논리, 증감, 대입 연산자 등을 제공합니다. 산술 연산자(+, -, *, /, %)는 기본적인 수학 연산을 수행하고, 비교 연산자는 두 값을 비교하여 불리언 값을 반환합니다. 증감 연산자(++/--)와 대입 연산자(=, += 등)도 자주 사용됩니다.초급 문제 1

**문제 설명:** 두 개의 정수를 입력받아 산술 연산자(+, -, *, /, %)를 모두 적용한 결과를 한 줄에 출력하는 프로그램을 작성하시오.

**입력 예시:**

```
7 3
```

**출력 예시:**

```
10 4 21 2 1
```

**조건:**

- 나눗셈 결과는 정수 부분만 출력합니다.
- 각 결과는 공백으로 구분합니다.

```java
import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        // TODO: 산술 연산자(+, -, *, /, %) 결과 출력
    }
}
```

### 초급 문제 2

**문제 설명:** 하나의 정수를 입력받아 이 값의 전위 증가(++i)와 후위 증가(i++) 결과를 각각 출력하는 프로그램을 작성하시오.

**입력 예시:**

```
5
```

**출력 예시:**

```
6 6
```

**조건:**

- 두 출력값은 전위 증가 결과와 후위 증가 후의 변수 값을 나타냅니다.

```java
import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        // TODO: 전위 증가와 후위 증가 결과 출력
    }
}
```

### 중급 문제 3

**문제 설명:** 두 개의 실수를 입력받아 첫 번째 값이 두 번째 값보다 큰지 비교하고(true/false) 논리 NOT 연산을 적용한 결과를 출력하는 프로그램을 작성하시오.

**입력 예시:**

```
3.5 5.2
```

**출력 예시:**

```
false true
```

**조건:**

- 비교 연산자(>)와 논리 NOT 연산자(!)를 사용합니다.
- 결과는 첫 번째 비교 결과와 NOT을 적용한 결과를 공백으로 구분해 출력합니다.

```java
import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        // TODO: x &gt; y 결과와 !(x &gt; y) 결과 출력
    }
}
```

### 중급 문제 4

**문제 설명:** 세 개의 정수를 입력받아, 두 번째 값이 첫 번째 값보다 크고 세 번째 값보다 작은지를 논리 연산자와 비교 연산자를 이용하여 평가하고 결과를 출력하시오.

**입력 예시:**

```
2 5 10
```

**출력 예시:**

```
true
```

**조건:**

- `&&` 연산자를 사용하여 두 조건을 동시에 판단합니다.

```java
import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        // TODO: b가 a보다 크고 c보다 작은지 평가하여 출력
    }
}
```

### 고급 문제 5

**문제 설명:** 정수형 변수 세 개(a, b, c)를 입력받아 `a += b * c` 연산 후 `a`와 `b`, `c`의 값을 출력하는 프로그램을 작성하시오.

**입력 예시:**

```
2 3 4
```

**출력 예시:**

```
14 3 4
```

**조건:**

- 복합 대입 연산자를 사용해 계산합니다.
- 연산 후 원본 `b`, `c` 값은 변경되지 않아야 합니다.

```java
import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        // TODO: a += b * c 연산 후 a, b, c 출력
    }
}
```

### 고급 문제 6

**문제 설명:** 두 정수 `x`, `y`를 입력받아 삼항 연산자를 사용하여 두 수 중 큰 값을 선택하고, 선택된 값에 5를 곱한 후 결과를 출력하는 프로그램을 작성하시오.

**입력 예시**

```
7 9
```

**출력 예시:**

```
45
```

**조건:**

- 삼항 연산자 `? :`를 사용하세요.

```java
import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        // TODO: x와 y 중 큰 값에 5를 곱해 출력
    }
}
```