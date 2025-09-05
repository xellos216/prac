클래스 메서드(static 메서드)는 객체 생성 없이 호출할 수 있으며, 인스턴스 메서드는 객체를 통해 호출합니다.

### 초급 문제 1

**문제 설명:** `Calculator` 클래스에 클래스 메서드 `add`와 인스턴스 메서드 `multiply`를 정의하고, 두 메서드를 각각 호출하여 결과를 출력하는 프로그램을 작성하시오.

**입력 예시:**

```
3 4
```

**출력 예시:**

```
7 12
```

**조건:**

- `add`는 `static`으로 선언하고 두 정수를 더한다.
- `multiply`는 인스턴스 메서드로 두 정수를 곱한다.

```java
import java.util.Scanner;

class Calculator {
    static int add(int a, int b) {
        // TODO: 덧셈 결과 반환
        return 0;
    }
    int multiply(int a, int b) {
        // TODO: 곱셈 결과 반환
        return 0;
    }
}

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int sum = Calculator.add(x, y);
        Calculator calc = new Calculator();
        int prod = calc.multiply(x, y);
        // TODO: sum과 prod 출력
    }
}
```

### 초급 문제 2

**문제 설명:** `MathUtil` 클래스에 클래스 메서드 `square`와 인스턴스 메서드 `cube`를 정의하고, 정수 n에 대해 제곱과 세제곱을 각각 출력하는 프로그램을 작성하시오.

**입력 예시:**

```
3
```

**출력 예시:**

```
9 27
```

**조건:**

- `square`는 `static`, `cube`는 인스턴스 메서드로 구현합니다.

```java
import java.util.Scanner;

class MathUtil {
    static int square(int n) {
        // TODO: n의 제곱 반환
        return 0;
    }
    int cube(int n) {
        // TODO: n의 세제곱 반환
        return 0;
    }
}

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sq = MathUtil.square(n);
        MathUtil util = new MathUtil();
        int cu = util.cube(n);
        // TODO: sq와 cu 출력
    }
}
```

### 중급 문제 3

**문제 설명:** `Converter` 클래스에 클래스 메서드 `toCelsius`(화씨→섭씨)와 인스턴스 메서드 `toFahrenheit`(섭씨→화씨)를 작성하시오.

**입력 예시:**

```
50 10
```

**출력 예시:**

```
10.0 50.0
```

**조건:**

- 화씨→섭씨: `(F - 32) * 5/9`
- 섭씨→화씨: `C * 9/5 + 32`

```java
import java.util.Scanner;

class Converter {
    static double toCelsius(double f) {
        // TODO: 섭씨로 변환
        return 0;
    }
    double toFahrenheit(double c) {
        // TODO: 화씨로 변환
        return 0;
    }
}

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double f = sc.nextDouble();
        double c = sc.nextDouble();
        double cRes = Converter.toCelsius(f);
        Converter conv = new Converter();
        double fRes = conv.toFahrenheit(c);
        // TODO: cRes와 fRes 출력
    }
}
```

### 중급 문제 4

**문제 설명:** `StringUtil` 클래스에 클래스 메서드 `isPalindrome`을 정의하고, 문자열이 회문인지 여부를 판단하는 프로그램을 작성하시오. 회문이면 true, 아니면 false를 출력한다.

**입력 예시:**

```
level
```

**출력 예시:**

```
true
```

**조건:**

- 인스턴스 메서드는 사용하지 않습니다.

```java
import java.util.Scanner;

class StringUtil {
    static boolean isPalindrome(String s) {
        // TODO: 회문 여부 판단
        return false;
    }
}

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        // TODO: StringUtil.isPalindrome 호출 후 출력
    }
}
```

### 고급 문제 5

**문제 설명:** `Statistics` 클래스에 클래스 변수 `count`와 클래스 메서드 `average`를 정의하고, 인스턴스 메서드 `addNumber`를 통해 숫자를 추가하면 `count`와 총합을 갱신하여 평균을 계산하는 프로그램을 작성하시오.

**입력 예시:**

```
3
5
10
15
```

**출력 예시:**

```
10.0
```

**조건:**

- `addNumber`는 인스턴스 메서드, `average`는 클래스 메서드입니다.

```java
import java.util.Scanner;

class Statistics {
    static int count = 0;
    static int sum = 0;
    void addNumber(int n) {
        // TODO: count와 sum 갱신
    }
    static double average() {
        // TODO: 평균 반환
        return 0;
    }
}

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Statistics stat = new Statistics();
        for (int i = 0; i < n; i++) {
            stat.addNumber(sc.nextInt());
        }
        // TODO: Statistics.average() 출력
    }
}
```

### 고급 문제 6

**문제 설명:** `Vector2D` 클래스를 설계하여 x, y 좌표를 필드로 갖고, 클래스 메서드 `distance`로 두 벡터 사이의 거리를 계산하며, 인스턴스 메서드 `add`로 두 벡터를 더하는 프로그램을 작성하시오.

**입력 예시:**

```
1 2 3 4
```

**출력 예시:**

```
2.8284271247461903 4 6
```

**조건:**

- 거리 계산은 `Math.hypot`을 사용할 수 있습니다.

```java
import java.util.Scanner;

class Vector2D {
    double x;
    double y;
    Vector2D(double x, double y) { this.x = x; this.y = y; }
    static double distance(Vector2D a, Vector2D b) {
        // TODO: 두 벡터 사이 거리 반환
        return 0;
    }
    void add(Vector2D other) {
        // TODO: 현재 벡터에 other를 더함
    }
}

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();
        Vector2D v1 = new Vector2D(x1, y1);
        Vector2D v2 = new Vector2D(x2, y2);
        double dist = Vector2D.distance(v1, v2);
        v1.add(v2);
        // TODO: dist와 v1.x, v1.y 출력
    }
}
```