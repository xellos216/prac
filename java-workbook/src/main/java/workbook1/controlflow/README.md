반복문 안에서 조건문을 사용하면 복합적인 로직을 구현할 수 있습니다.

### 초급 문제 1

**문제 설명:** 1부터 N까지의 수 중 짝수이면 합에 더하고, 홀수이면 곱에 곱하는 프로그램을 작성하시오. 초기 합은 0, 초기 곱은 1이다. 합과 곱을 공백으로 출력한다.

**입력 예시:**

```
5
```

**출력 예시:**

```
6 15
```

**조건:**

- `for` 문과 `if-else` 문을 함께 사용합니다.

```java
import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // TODO: 짝수는 합, 홀수는 곱에 반영 후 최종 결과 출력
    }
}
```

### 초급 문제 2

**문제 설명:** N개의 정수를 입력받아 양수의 개수와 음수의 합을 출력하는 프로그램을 작성하시오.

**입력 예시:**

```
5
1 -2 3 -4 5
```

**출력 예시:**

```
3 -6
```

**조건:**

- 반복문으로 N개의 값을 읽으면서 `if` 문으로 양수 여부를 판단합니다.

```java
import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        // TODO: count개의 정수를 입력받아 양수 개수와 음수 합을 계산 후 출력
    }
}
```

### 중급 문제 3

**문제 설명:** 정수 N을 입력받아 1부터 N까지의 수 중 소수(prime number)를 찾아 모두 출력하는 프로그램을 작성하시오.

**입력 예시:**

```
10
```

**출력 예시:**

```
2 3 5 7
```

**조건:**

- 반복문 안에서 또 다른 반복문을 사용하여 소수 여부를 판단합니다.
- 소수는 1과 자신만을 약수로 갖는 수입니다.

```java
import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // TODO: 1~n까지의 소수를 찾아 출력
    }
}
```

### 중급 문제 4

**문제 설명:** 한 줄에 정수들을 입력받아 0이 입력될 때까지 양수만 합산하여 출력하는 프로그램을 작성하시오.

**입력 예시:**

```
3 5 -2 7 0 4
```

**출력 예시:**

```
15
```

**조건:**

- `while` 문을 사용하고, 입력값이 0이면 즉시 반복을 종료합니다.

```java
import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // TODO: 0이 나올 때까지 양수만 합산하는 코드 작성
    }
}
```

### 고급 문제 5

**문제 설명:** 0 이상의 정수를 입력받아 각 자리수의 합이 한 자리 수가 될 때까지 반복적으로 각 자리수의 합을 구하는 프로그램을 작성하시오.

**입력 예시:**

```
9875
```

**출력 예시:**

```
2
```

**조건:**

- 반복문과 조건문을 조합하여 자리수 합을 반복 계산합니다.

```java
import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        // TODO: 각 자리수의 합을 반복해 한 자리 수가 될 때까지 계산 후 출력
    }
}
```

### 고급 문제 6

**문제 설명:** 1부터 N까지의 수에서 각 숫자의 자릿수 합이 5의 배수인 수의 개수를 세는 프로그램을 작성하시오.

**입력 예시:**

```
20
```

**출력 예시:**

```
3
```

**조건:**

- 반복문과 조건문을 조합하여 자리수 합이 5로 나누어떨어지는 수를 찾습니다.

```java
import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // TODO: 1~n까지 중 자리수 합이 5의 배수인 수의 개수 출력
    }
}
```