자바에서는 값이 작은 기본형에서 큰 기본형으로 자동 형변환(예: `int`→`double`)이 가능하며, 큰 형을 작은 형으로 변환할 때는 강제 형변환이 필요합니다.

### 초급 문제 1

**문제 설명:** 두 개의 정수형 값을 입력받아 `double`형으로 자동 형변환 후 합을 구하고, 결과를 다시 정수형으로 강제 형변환하여 출력하는 프로그램을 작성하시오.

**입력 예시:**

```
3 4
```

**출력 예시:**

```
7
```

**조건:**

- 자동 형변환(정수→실수)과 강제 형변환(실수→정수)을 모두 사용하세요.

```java
import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        // TODO: a와 b를 double로 자동 형변환하여 더한 뒤 int로 강제 변환하여 출력
    }
}
```

### 초급 문제 2

**문제 설명:** 하나의 `double`형 값을 입력받아 이를 `int`형으로 강제 형변환하고, 강제 형변환 후의 값과 원래 값의 차이를 출력하는 프로그램을 작성하시오.

**입력 예시:**

```
3.14
```

**출력 예시:**

```
0.14
```

**조건:**

- `double` 값을 `int`로 강제 형변환하여 소수부를 제거한 뒤, 원래 값에서 빼서 차이를 구합니다.

```java
import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double d = sc.nextDouble();
        // TODO: d를 int로 강제 형변환하여 차이를 계산 후 출력
    }
}
```

### 중급 문제 1

**문제 설명:** `byte`, `short`, `int`, `long`형 데이터를 순서대로 입력받아 모두 `long`형으로 자동 형변환하여 합을 구한 뒤, 그 결과를 `float`형으로 다시 변환하여 출력하시오.

**입력 예시:**

```
1 2 3 4
```

**출력 예시:**

```
10.0
```

**조건:**

- 작은 타입에서 큰 타입으로의 자동 형변환을 활용합니다.

```java
import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte b = sc.nextByte();
        short s = sc.nextShort();
        int i = sc.nextInt();
        long l = sc.nextLong();
        // TODO: b, s, i, l을 long으로 변환해 합산 후 float으로 변환하여 출력
    }
}
```

### 중급 문제 4

**문제 설명:** 두 개의 `float` 값을 입력받아 첫 번째 값을 `int`로 강제 형변환하고, 두 번째 값은 자동 형변환을 이용하여 `double`로 변환한 후, 두 값의 합을 출력하시오.

**입력 예시:**

```
2.5 3.7
```

**출력 예시:**

```
5.0
```

**조건:**

- 첫 번째 값은 소수부를 제거하고, 두 번째 값은 `double`로 변환한 뒤 합산합니다

```java
import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float f1 = sc.nextFloat();
        float f2 = sc.nextFloat();
        // TODO: f1을 int로 강제 변환, f2를 double로 자동 변환해 합산 후 출력
    }
}
```

### 고급 문제 5

**문제 설명:** 사용자로부터 실수형(`double`) 세 개를 입력받아 각각을 `int`로 강제 형변환한 후, 세 값의 평균을 `float`으로 출력하는 프로그램을 작성하시오.

**입력 예시:**

```
3.8 4.2 5.9
```

**출력 예시:**

```
4.0
```

**조건:**

- 강제 형변환으로 소수부를 모두 버린 뒤 평균을 `float`으로 출력합니다.

```java
import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        double z = sc.nextDouble();
        // TODO: x, y, z를 int로 변환 후 평균을 float으로 출력
    }
}
```

### 고급 문제 6

**문제 설명:** 문자열로 표현된 두 개의 정수를 입력받아 `int`로 변환한 다음, 두 수의 차이를 `byte`형으로 강제 형변환하여 출력하는 프로그램을 작성하시오.

**입력 예시:**

```
100 50
```

**출력 예시:**

```
50
```

**조건:**

- `Integer.parseInt()`를 활용해 문자열을 정수로 변환합니다.
- 차이를 `byte`로 강제 형변환한 뒤 출력합니다.

```java
import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        // TODO: s1, s2를 int로 변환 후 차이를 byte로 변환하여 출력
    }
}
```

---