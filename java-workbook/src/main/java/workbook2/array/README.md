자바 배열은 동일한 타입의 여러 값을 하나의 변수에 저장할 수 있으며 인덱스로 접근합니다. 배열은 `type[] arr = { ... }` 형태로 선언·초기화할 수 있습니다.

### 초급 문제 1

**문제 설명:** 5개의 정수를 입력받아 순서대로 배열에 저장한 뒤, 배열의 모든 요소를 공백으로 구분하여 출력하는 프로그램을 작성하시오.

**입력 예시:**

```
1 2 3 4 5
```

**출력 예시:**

```
1 2 3 4 5
```

**조건:**

- 정수형 배열을 선언하고 반복문으로 채웁니다.

```java
import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        // TODO: arr에 5개 정수 저장 후 출력
    }
}
```

### 초급 문제 2

**문제 설명:** 10개의 실수를 입력받아 배열에 저장하고, 배열의 최대값과 최소값을 출력하는 프로그램을 작성하시오.

**입력 예시:**

```
1.2 3.5 0.7 5.6 2.1 9.4 4.3 3.3 6.6 0.5
```

**출력 예시:**

```
9.4 0.5
```

**조건:**

- 반복문을 사용하여 배열을 탐색하면서 최대, 최소를 구합니다.

```java
import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] arr = new double[10];
        // TODO: arr에 값 저장 후 최대값과 최소값 출력
    }
}
```

### 중급 문제 3

**문제 설명:** N을 입력받아 크기 N의 정수형 배열을 선언하고, 배열의 요소를 거꾸로 입력받아 출력하는 프로그램을 작성하시오.

**입력 예시:**

```
4
1 2 3 4
```

**출력 예시:**

```
4 3 2 1
```

**조건:**

- 배열을 뒤집어서 출력합니다.

```java
import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        // TODO: arr에 n개의 정수 저장 후 역순으로 출력
    }
}
```

### 중급 문제 4

**문제 설명:** 2차원 배열을 이용하여 3x3 행렬의 두 개를 입력받아 행렬 덧셈을 수행하고, 결과 행렬을 출력하는 프로그램을 작성하시오.

**입력 예시:**

```
1 2 3
4 5 6
7 8 9
9 8 7
6 5 4
3 2 1
```

**출력 예시:**

```
10 10 10
10 10 10
10 10 10
```

**조건:**

- 2차원 배열 두 개를 선언하여 각 요소를 더합니다.

```java
import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] A = new int[3][3];
        int[][] B = new int[3][3];
        int[][] C = new int[3][3];
        // TODO: A, B에 값 저장 후 C = A + B 계산, C 출력
    }
}
```

### 고급 문제 5

**문제 설명:** N개의 정수를 입력받아 배열에 저장한 후, 버블 정렬 알고리즘을 사용하여 오름차순으로 정렬하고 정렬된 배열을 출력하는 프로그램을 작성하시오.

**입력 예시:**

```
5
4 2 9 1 5
```

**출력 예시:**

```
1 2 4 5 9
```

**조건:**

- 버블 정렬 알고리즘을 직접 구현합니다.

```java
import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        // TODO: arr에 값 저장 후 버블 정렬 구현, 정렬된 배열 출력
    }
}
```

### 고급 문제 6

**문제 설명:** 2차원 배열을 활용하여 아래와 같은 스네이크 패턴을 출력하는 프로그램을 작성하시오.

예를 들어 3행 4열일 때:

```
1 2 3 4
8 7 6 5
9 10 11 12
```

**입력 예시:**

```
3 4
```

**출력 예시:**

```
1 2 3 4
8 7 6 5
9 10 11 12
```

**조건:**

- 행이 홀수번째일 때와 짝수번째일 때 출력 순서를 달리합니다.

```java
import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int[][] arr = new int[rows][cols];
        // TODO: 스네이크 패턴으로 arr 채우고 출력
    }
}
```