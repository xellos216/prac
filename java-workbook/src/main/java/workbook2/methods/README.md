메서드는 재사용 가능한 코드 블록으로, 매개변수와 반환값을 가질 수 있습니다.

### 초급 문제 1

**문제 설명:** 두 정수의 합을 반환하는 `sum` 메서드를 작성하고, `main` 메서드에서 두 값을 입력받아 `sum` 메서드를 호출한 후 결과를 출력하는 프로그램을 작성하시오.

**입력 예시:**

```
3 5
```

**출력 예시:**

```
8
```

**조건:**

- `sum` 메서드는 두 정수를 매개변수로 받고 정수형을 반환합니다.

```java
import java.util.Scanner;

public class Q1 {
    // TODO: 두 정수를 더해 반환하는 sum 메서드를 작성하세요.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        // TODO: sum 메서드를 호출하여 결과 출력
    }
}
```

### 초급 문제 2

**문제 설명:** 문자열을 입력받아 해당 문자열의 길이를 반환하는 메서드를 작성하고, `main`에서 호출하여 길이를 출력하는 프로그램을 작성하시오.

**입력 예시:**

```
Hello
```

**출력 예시:**

```
5
```

**조건:**

- 메서드 이름은 `stringLength`로 하고, 매개변수로 문자열을 받아 `int`를 반환합니다.

```java
import java.util.Scanner;

public class Q2 {
    // TODO: 문자열 길이를 반환하는 stringLength 메서드 작성
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        // TODO: stringLength 호출 후 결과 출력
    }
}
```

### 중급 문제 3

**문제 설명:** 두 개의 정수 배열을 입력받아 두 배열의 요소를 모두 더한 결과를 새로운 배열로 반환하는 메서드를 작성하시오. 배열 길이는 같다고 가정한다.

**입력 예시:**

```
3
1 2 3
4 5 6
```

**출력 예시:**

```
5 7 9
```

**조건:**

- 메서드 이름은 `addArrays`, 매개변수는 두 개의 `int[]`, 반환형은 `int[]` 입니다.

```java
import java.util.Scanner;

public class Q3 {
    // TODO: addArrays 메서드 작성
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            arr2[i] = sc.nextInt();
        }
        // TODO: addArrays 호출 후 결과 배열 출력
    }
}
```

### 중급 문제 4

**문제 설명:** 세 개의 정수를 매개변수로 받아 평균을 실수형으로 반환하는 메서드를 작성하고, 이를 호출하여 출력하는 프로그램을 작성하시오.

**입력 예시:**

```
5 7 9
```

**출력 예시:**

```
7.0
```

**조건:**

- 메서드 이름은 `average`, 매개변수는 세 개의 `int`, 반환형은 `double`로 합니다.

```java
import java.util.Scanner;

public class Q4 {
    // TODO: 세 정수의 평균을 반환하는 average 메서드 작성
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        // TODO: average 호출 후 결과 출력
    }
}
```

### 고급 문제 5

**문제 설명:** 문자열 배열을 매개변수로 받아, 각 문자열을 거꾸로(reverse) 변환하여 새로운 배열로 반환하는 메서드를 작성하시오.

**입력 예시:**

```
3
apple banana cherry
```

**출력 예시:**

```
elppa ananab yrrehc
```

**조건:**

- 메서드 이름은 `reverseStrings`, 반환형은 `String[]`입니다.

  **스켈레톤 코드**


```java
import java.util.Scanner;

public class Q5 {
    // TODO: reverseStrings 메서드 작성
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] words = new String[n];
        for (int i = 0; i < n; i++) {
            words[i] = sc.next();
        }
        // TODO: reverseStrings 호출 후 결과 출력
    }
}
```

### 고급 문제 6

**문제 설명:** 재귀를 사용하여 정수 n의 팩토리얼을 계산하는 메서드 `factorial`을 작성하고, 입력받은 n에 대해 결과를 출력하는 프로그램을 작성하시오.

**입력 예시:**

```
5
```

**출력 예시:**

```
120
```

**조건:**

- `factorial` 메서드는 정수가 1 이하가 되면 1을 반환합니다.

```java
import java.util.Scanner;

public class Q6 {
    // TODO: 재귀를 이용한 factorial 메서드 작성
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // TODO: factorial 호출 후 결과 출력
    }
}
```