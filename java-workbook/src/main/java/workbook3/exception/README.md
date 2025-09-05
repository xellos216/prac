자바에서 예외는 `try-catch-finally` 블록을 통해 처리하며, 필요에 따라 `throw`와 `throws` 키워드로 사용자 정의 예외를 발생시킬 수 있습니다.

### 초급 문제 1

**문제 설명:** 두 정수를 입력받아 나눗셈 결과를 출력하는 프로그램을 작성하되, 0으로 나누면 `ArithmeticException`을 catch하여 “Division by zero”를 출력한다.

**입력 예시:**

```
4 0
```

**출력 예시:**

```
Division by zero
```

**조건:**

- `try-catch` 블록을 사용합니다.

```java
import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        try {
            // TODO: a/b 결과 출력
        } catch (ArithmeticException e) {
            System.out.println("Division by zero");
        }
    }
}
```

### 초급 문제 2

**문제 설명:** 배열의 인덱스를 입력받아 해당 요소를 출력하는 프로그램을 작성하되, 범위를 벗어나면 `ArrayIndexOutOfBoundsException`을 catch하여 “Index out of bounds”를 출력한다.

**입력 예시:**

```
3 
1 2 3
5
```

**출력 예시:**

```
Index out of bounds
```

**조건:**

- 배열 길이는 두 번째 입력 값이며, 범위를 벗어난 인덱스를 입력할 수 있습니다.

```java
import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        try {
            // TODO: index 입력 받기
            // TODO: arr[index] 출력
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index out of bounds");
        }
    }
}
```

### 중급 문제 3

**문제 설명:** 사용자로부터 문자열을 입력받아 정수로 변환하고 2를 곱한 값을 출력하는 프로그램을 작성하시오. 숫자가 아닌 문자열을 입력하면 `NumberFormatException`을 catch하여 “Invalid number”를 출력한다.

**입력 예시:**

```
abc
```

**출력 예시:**

```
Invalid number
```

**조건:**

- `Integer.parseInt()`를 사용하고 `try-catch`를 적용합니다.

```java
import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        try {
            // TODO: s를 int로 변환 후 2 곱해 출력
        } catch (NumberFormatException e) {
            System.out.println("Invalid number");
        }
    }
}
```

### 중급 문제 4

**문제 설명:** 두 개의 정수와 연산자(+,-,*,/)를 입력받아 계산하는 프로그램을 작성하시오. 0으로 나눌 경우와 잘못된 연산자를 입력할 경우 각각 예외를 처리하여 적절한 메시지를 출력한다.

**입력 예시:**

```
10 0 /
```

**출력 예시:**

```
Division by zero
```

**조건:**

- 잘못된 연산자인 경우 “Invalid operator”를 출력합니다.

```java
import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        String op = sc.next();
        try {
            // TODO: op에 따라 계산 및 출력
        } catch (ArithmeticException e) {
            System.out.println("Division by zero");
        } catch (Exception e) {
            System.out.println("Invalid operator");
        }
    }
}
```

### 고급 문제 5

**문제 설명:** 사용자로부터 나이를 입력받아, 0보다 작은 값이면 사용자 정의 예외 `NegativeAgeException`을 발생시키고 catch하여 “Invalid age”를 출력하는 프로그램을 작성하시오.

**입력 예시:**

```
-3
```

**출력 예시:**

```
Invalid age
```

**조건:**

- 사용자 정의 예외 클래스는 `Exception`을 상속받아 구현합니다.

```java
import java.util.Scanner;

class NegativeAgeException extends Exception {
    NegativeAgeException(String msg) {
        super(msg);
    }
}

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        try {
            // TODO: age가 0보다 작으면 NegativeAgeException throw
            throw new NegativeAgeException("Invalid age");
        } catch (NegativeAgeException e) {
            System.out.println(e.getMessage());
        }
    }
}
```

### 고급 문제 6

**문제 설명:** 파일 이름을 입력받아 존재하지 않는 파일일 경우 사용자 정의 예외 `FileMissingException`을 throw하고 catch하여 “File not found” 메시지를 출력하는 프로그램을 작성하시오.

**입력 예시:**

```
nofile.txt
```

**출력 예시:**

```
File not found
```

**조건:**

- 실제 파일 존재 여부는 확인하지 않고, 임의로 존재하지 않는다고 가정합니다.

```java
import java.util.Scanner;

class FileMissingException extends Exception {
    FileMissingException(String msg) {
        super(msg);
    }
}

public class Q6 {
    static void openFile(String name) throws FileMissingException {
        // TODO: 파일이 없다고 가정하고 예외 throw
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String filename = sc.next();
        try {
            openFile(filename);
        } catch (FileMissingException e) {
            System.out.println("File not found");
        }
    }
}

```