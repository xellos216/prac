메서드 오버로딩은 같은 이름의 메서드를 매개변수 리스트를 다르게 하여 여러 번 정의하는 것으로, 컴파일 시점에 호출될 메서드가 결정됩니다.

### 초급 문제 1

**문제 설명:** `printValue` 메서드를 정수, 실수, 문자열 세 가지 매개변수 타입에 대해 오버로딩하여 각각 값을 출력하는 프로그램을 작성하시오.

**입력 예시:**

```
10 3.14 Hello
```

**출력 예시:**

```
10
3.14
Hello
```

**조건:**

- 오버로딩된 `printValue` 메서드 세 개를 정의합니다.

```java
import java.util.Scanner;

public class Q1 {
    // TODO: printValue 오버로딩 (int), (double), (String)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        double d = sc.nextDouble();
        String s = sc.next();
        // TODO: printValue (int), (double), (String) 메서드 작성 후 아래 주석 해제
        // printValue(i);
        // printValue(d);
        // printValue(s);
    }
}

```

### 초급 문제 2

**문제 설명:** `max` 메서드를 오버로딩하여 두 정수 중 큰 값을 반환하는 메서드, 세 정수 중 큰 값을 반환하는 메서드를 작성하시오.

**입력 예시:**

```
3 5 7
```

**출력 예시:**

```
5
7
```

**조건:**

- 두 정수 버전과 세 정수 버전에서 같은 이름 `max`를 사용합니다.

```java
import java.util.Scanner;

public class Q2 {
    // TODO: max 메서드 오버로딩 (int,int)와 (int,int,int)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        // TODO: max 메서드 작성 후 아래 주석 해제
        // System.out.println(max(a,b));
        // System.out.println(max(a,b,c));
    }
}
```

### 중급 문제 3

**문제 설명:** `concat` 메서드를 오버로딩하여 두 문자열을 이어붙이거나 세 문자열을 이어붙이는 두 버전을 작성하시오.

**입력 예시:**

```
Hello Java World
```

**출력 예시:**

```
HelloJava
HelloJavaWorld
```

**조건:**

- `concat(String a, String b)`와 `concat(String a, String b, String c)`를 정의합니다.

```java
import java.util.Scanner;

public class Q3 {
    // TODO: concat 메서드 오버로딩
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        String s3 = sc.next();
        // TODO: concat 메서드 작성 후 아래 주석 해제
        // System.out.println(concat(s1,s2));
        // System.out.println(concat(s1,s2,s3));
    }
}

```

### 중급 문제 4

**문제 설명:** `area` 메서드를 오버로딩하여 원의 넓이(반지름), 직사각형의 넓이(가로, 세로), 삼각형의 넓이(밑변, 높이)를 계산하는 세 가지 버전을 작성하시오.

**입력 예시:**

```
circle 3
rect 4 5
tri 3 4
```

**출력 예시:**

```
28.274333882308138
20.0
6.0
```

**조건:**

- `circle` 입력 시 반지름을 사용하고, `rect` 입력 시 두 값으로 계산, `tri` 입력 시 (밑변*높이/2)로 계산합니다.

```java
import java.util.Scanner;

public class Q4 {
    // TODO: area 오버로딩 (double r), (double w, double h), (double base, double height)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String type = sc.next();
        if (type.equals("circle")) {
            double r = sc.nextDouble();
            // System.out.println(area(r)); // TODO: area 메서드 작성 후 주석 해제
        } else if (type.equals("rect")) {
            double w = sc.nextDouble();
            double h = sc.nextDouble();
            // System.out.println(area(w,h)); // TODO: area 메서드 작성 후 주석 해제
        } else {
            double b = sc.nextDouble();
            double h = sc.nextDouble();
            // System.out.println(area(b,h)); // TODO: area 메서드 작성 후 주석 해제
        }
    }
}
```

### 고급 문제 5

**문제 설명:** `format` 메서드를 오버로딩하여 정수와 문자열을 받아 “정수: 값” 또는 “문자열: 값” 형식으로 출력하는 메서드, 그리고 이름과 나이를 받아 “이름(나이)” 형식으로 출력하는 세 번째 버전을 작성하시오.

**입력 예시:**

```
Alice 30
```

**출력 예시:**

```
문자열: Alice
정수: 30
Alice(30)
```

**조건:**

- 메서드 이름은 동일하며 매개변수 수나 타입이 다릅니다.

```java
import java.util.Scanner;

public class Q5 {
    // TODO: format 오버로딩 (int), (String), (String,int)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        int age = sc.nextInt();
        // TODO: format 메서드 작성 후 아래 주석 해제
        // System.out.println(format(name));
        // System.out.println(format(age));
        // System.out.println(format(name, age));
    }
}
```

### 고급 문제 6

**문제 설명:** `multiply` 메서드를 오버로딩하여 정수 배열을 받아 모든 요소의 곱을 구하는 버전과, 두 개의 행렬을 받아 행렬 곱셈을 수행하는 버전을 작성하시오.

**입력 예시:**

```
3
1 2
3 4
5 6
7 8
```

**출력 예시:**

```
19 22
43 50
```

**조건:**

- 첫 입력 줄이 2이면 배열 곱을 계산하고, 3이면 2×2 행렬 곱을 계산합니다.

```java
import java.util.Scanner;

public class Q6 {
    // TODO: multiply 오버로딩 (int[]), (int[][], int[][])
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int type = sc.nextInt();
        if (type == 2) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            // System.out.println(multiply(arr)); // TODO: multiply(int[]) 메서드 작성 후 주석 해제
        } else {
            int[][] m1 = new int[2][2];
            int[][] m2 = new int[2][2];
            
            // 첫 번째 행렬 입력
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 2; j++) {
                    m1[i][j] = sc.nextInt();
                }
            }

            // 두 번째 행렬 입력
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 2; j++) {
                    m2[i][j] = sc.nextInt();
                }
            }

            // 행렬 곱셈 수행 및 출력
            // int[][] result = multiply(m1, m2); // TODO: multiply(int[][], int[][]) 메서드 작성 후 주석 해제
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 2; j++) {
                    System.out.print(result[i][j] + (j == 1 ? "" : " "));
                }
                System.out.println();
            }
        }
    }
}
```