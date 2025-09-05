자바의 `if-else`와 `switch` 문은 조건에 따라 다른 코드를 실행하는 제어 구조입니다. `switch` 문은 여러 경우를 처리할 때 유용하며, `break`와 `default` 키워드로 제어 흐름을 관리합니다.

### 초급 문제 1

**문제 설명:** 정수를 입력받아 음수, 0, 양수를 구분하여 각각 “음수”, “0”, “양수”를 출력하는 프로그램을 작성하시오.

**입력 예시:**

```
-5
```

**출력 예시:**

```
음수
```

**조건:**

- `if-else if-else` 문을 사용합니다.

```java
import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        // TODO: num의 부호를 판단하여 출력
    }
}
```

### 초급 문제 2

**문제 설명:** 1~7 사이의 정수를 입력받아 요일을 출력하는 프로그램을 작성하시오. 1이면 “월”, 2이면 “화”, … 7이면 “일”을 출력한다.

**입력 예시:**

```
3
```

**출력 예시:**

```
수
```

**조건:**

- `switch` 문을 사용하고, `break`를 적절히 사용합니다.
- 범위를 벗어난 입력은 “잘못된 입력”을 출력합니다.

```java
import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();
        // TODO: switch 문을 이용하여 요일 출력
    }
}
```

### 중급 문제 3

**문제 설명:** 세 과목의 점수를 입력받아 평균이 90 이상이면 “A”, 80 이상이면 “B”, 70 이상이면 “C”, 60 이상이면 “D”, 그 외는 “F”를 출력하는 프로그램을 작성하시오.

**입력 예시:**

```
85 90 92
```

**출력 예시:**

```
B
```

**조건:**

- 중첩 `if-else`를 사용하여 평균 점수에 따라 학점을 출력합니다.

```java
import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s1 = sc.nextInt();
        int s2 = sc.nextInt();
        int s3 = sc.nextInt();
        // TODO: 평균을 계산하고 중첩 if-else로 학점 출력
    }
}
```

### 중급 문제 4

**문제 설명:** 연도를 입력받아 윤년(leap year)인지 여부를 출력하는 프로그램을 작성하시오. 윤년은 연도가 4의 배수이면서 100의 배수가 아니거나 400의 배수인 해이다.

**입력 예시:**

```
2000
```

**출력 예시:**

```
윤년
```

**조건:**

- 중첩 조건문을 사용합니다.

```java
import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        // TODO: 윤년 판별 로직 구현
    }
}
```

### 고급 문제 5

**문제 설명:** 세 정수 `a`, `b`, `c`를 입력받아 세 수 중 가장 큰 값을 찾는 프로그램을 작성하시오. 단, 같은 값이 있는 경우 “같은 수 존재”를 출력한다.

**입력 예시:**

```
10 20 20
```

**출력 예시:**

```
같은 수 존재
```

**조건:**

- 중첩된 조건문을 활용하여 세 수를 비교합니다.

```java
import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        // TODO: a, b, c 중 최대값 또는 같은 값 여부 출력
    }
}
```

### 고급 문제 6

**문제 설명:** BMI(체질량지수)를 계산하는 프로그램을 작성하시오. 몸무게(kg)와 키(cm)를 입력받아 BMI = 몸무게 / (키/100)^2 공식을 적용한다. BMI가 30 이상이면 “비만”, 25 이상이면 “과체중”, 18.5 이상이면 “정상”, 그 외는 “저체중”을 출력한다.

**입력 예시:**

```
70 175
```

**출력 예시:**

```
정상
```

**조건:**

- `double` 연산과 중첩 `if-else`를 사용합니다.

```java
import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double weight = sc.nextDouble();
        double heightCm = sc.nextDouble();
        // TODO: BMI 계산 후 조건문으로 등급 출력
    }
}
```