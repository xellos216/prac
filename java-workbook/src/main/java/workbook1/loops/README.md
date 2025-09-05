`while`, `for`, `do-while` 반복문은 조건에 따라 코드를 반복 실행하며, 반복문 내부에 또 다른 반복문을 넣어 이중 반복을 만들 수 있습니다.

### 초급 문제 1

**문제 설명:** 1부터 N까지의 합을 구하는 프로그램을 `while` 문으로 작성하시오.

**입력 예시:**

```
10
```

**출력 예시:**

```
55
```

**조건:**

- `while` 루프에서 반복 변수를 증가시키며 합산합니다.

```java
import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // TODO: while 문을 이용하여 1부터 n까지의 합 출력
    }
}
```

### 초급 문제 2

**문제 설명:** N을 입력받아 1부터 N까지 홀수의 합과 짝수의 합을 각각 출력하는 프로그램을 `for` 문으로 작성하시오.

**입력 예시:**

```
6
```

**출력 예시:**

```
9 12
```

**조건:**

- 반복문 내에서 `if` 문을 사용하지 않고, 반복 변수의 증가 간격을 조절하여 홀수와 짝수를 구분합니다.

```java
import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // TODO: 홀수 합과 짝수 합 계산 후 출력
    }
}
```

### 중급 문제 3

**문제 설명:** 정수 N을 입력받아 1부터 N까지의 수 중 3의 배수의 합을 출력하는 프로그램을 `do-while` 문으로 작성하시오.

**입력 예시:**

```
10
```

**출력 예시:**

```
18
```

**조건:**

- 최소 한 번은 실행되어야 하므로 `do-while`을 사용합니다.

```java
import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // TODO: do-while 문으로 3의 배수의 합 계산 후 출력
    }
}
```

### 중급 문제 4

**문제 설명:** 두 개의 정수 M과 N을 입력받아 M행 N열의 별(*) 패턴을 출력하는 프로그램을 작성하시오.

**입력 예시:**

```
3 4
```

**출력 예시:**

```
****
****
****
```

**조건:**

- 중첩 `for` 반복문을 사용하여 행과 열을 출력합니다.

```java
import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        // TODO: 이중 for 문으로 별 패턴 출력
    }
}
```

### 고급 문제 5

**문제 설명:** 삼각형 높이 H를 입력받아 아래와 같은 역삼각형(*) 패턴을 출력하는 프로그램을 작성하시오.

예를 들어 H = 4일 때

```
****
***
**
*
```

**입력 예시:**

```
4
```

**출력 예시:**

```
****
***
**
*
```

**조건:**

- 중첩 `for` 반복문을 사용하고, 행이 진행될수록 출력하는 별의 수를 감소시킵니다.

```java
import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        // TODO: 역삼각형 패턴 출력
    }
}
```

### 고급 문제 6

**문제 설명:** 2부터 9까지의 구구단을 세로 형태로 출력하는 프로그램을 작성하시오.

**출력 예시:**

```
2*1=2 3*1=3 ... 9*1=9
2*2=4 3*2=6 ... 9*2=18
...
2*9=18 3*9=27 ... 9*9=81
```

**조건:**

- 중첩 `for` 문을 이용하여 행(1~9)과 열(2~9)을 반복합니다.

```java
public class Q6 {
    public static void main(String[] args) {
        // TODO: 구구단 전체를 출력
    }
}
```