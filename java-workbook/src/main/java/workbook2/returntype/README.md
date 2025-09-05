메서드는 다양한 타입을 반환할 수 있으며, 참조형을 반환할 때는 객체의 주소가 반환됩니다.

### 초급 문제 1

**문제 설명:** 두 정수를 더한 값을 반환하는 메서드를 작성하고, 결과를 받아 그대로 출력하는 프로그램을 작성하시오.

**입력 예시:**

```
4 6
```

**출력 예시:**

```
10
```

**조건:**

- 메서드 반환 타입은 `int`입니다.

```java
import java.util.Scanner;

public class Q1 {
    // TODO: add 메서드 작성
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        // TODO: add 호출 후 결과 출력
    }
}
```

### 초급 문제 2

**문제 설명:** 문자열을 입력받아, 해당 문자열을 대문자로 변환한 후 반환하는 메서드를 작성하시오.

**입력 예시:**

```
java
```

**출력 예시:**

```
JAVA
```

**조건:**

- 메서드 이름은 `toUpper`, 매개변수는 `String`, 반환형은 `String`입니다.

```java
import java.util.Scanner;

public class Q2 {
    // TODO: toUpper 메서드 작성 (문자열을 대문자로 반환)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        // TODO: toUpper 호출 후 결과 출력
    }
}
```

### 중급 문제 3

**문제 설명:** 정수 배열을 입력받아 배열의 복사본을 반환하는 메서드를 작성하고, 원본 배열을 수정해도 복사본이 변하지 않는지 확인하는 프로그램을 작성하시오.

**입력 예시:**

```
3
1 2 3
4 5 6
```

**출력 예시:**

```
1 2 3
```

**조건:**

- 메서드는 배열을 깊은 복사(deep copy)하여 반환합니다.
- 원본 배열 값 변경 후 복사본을 출력합니다.

```java
import java.util.Scanner;

public class Q3 {
    // TODO: copyArray 메서드 작성 (int[] 배열을 받아 깊은 복사 후 반환)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] original = new int[n];
        for (int i = 0; i < n; i++) original[i] = sc.nextInt();
        // int[] copy = copyArray(original); // TODO: copyArray 메서드 작성 후 주석 해제
        // 원본 배열 변경
        for (int i = 0; i < n; i++) {
            original[i] = sc.nextInt();
        }
        // TODO: copy 배열을 출력
    }
}
```

### 중급 문제 4

**문제 설명:** 두 개의 문자열을 입력받아, 두 문자열을 이어붙인 새로운 문자열을 반환하는 메서드를 작성하시오.

**입력 예시:**

```
Hello World
```

**출력 예시:**

```
HelloWorld
```

**조건:**

- 반환형은 `String`이며, 원본 문자열에는 영향을 주지 않습니다.

```java
import java.util.Scanner;

public class Q4 {
    // TODO: concatStrings 메서드 작성
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        // TODO: concatStrings 호출 후 결과 출력
    }
}
```

### 고급 문제 5

**문제 설명:** 두 사람의 이름과 나이를 입력받아 `Person` 객체 두 개를 생성한 후, 나이가 더 많은 `Person`을 반환하는 메서드를 작성하시오.

**입력 예시:**

```
Alice 30 Bob 25
```

**출력 예시:**

```
Alice 30
```

**조건:**

- 클래스 `Person`은 이름과 나이를 필드로 가지며, 비교 로직을 구현한 메서드를 사용합니다.

```java
import java.util.Scanner;

class Person {
    String name;
    int age;
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class Q5 {
    // TODO: olderPerson 메서드 작성 (두 Person 중 나이가 더 많은 객체를 반환)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name1 = sc.next();
        int age1 = sc.nextInt();
        String name2 = sc.next();
        int age2 = sc.nextInt();
        Person p1 = new Person(name1, age1);
        Person p2 = new Person(name2, age2);
        // Person older = olderPerson(p1, p2); // TODO: olderPerson 메서드 작성 후 주석 해제
        // TODO: older.name과 older.age 출력
    }
}
```

### 고급 문제 6

**문제 설명:** 학생 3명의 이름과 점수를 입력받아, 평균 점수가 가장 높은 학생의 정보를 `Student` 객체로 반환하는 메서드를 작성하시오.

**입력 예시:**

```
Kim 80 Lee 90 Park 85
```

**출력 예시:**

```
Lee 90
```

**조건:**

- `Student` 클래스는 이름과 점수를 필드로 가진다.
- 반환된 객체를 통해 이름과 점수를 출력한다.

```java
import java.util.Scanner;

class Student {
    String name;
    int score;
    Student(String name, int score) {
        this.name = name; this.score = score;
    }
}

public class Q6 {
    // TODO: bestStudent 메서드 작성 (Student 세 명 중 최고 점수를 받은 학생 반환)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n1 = sc.next(); int s1 = sc.nextInt();
        String n2 = sc.next(); int s2 = sc.nextInt();
        String n3 = sc.next(); int s3 = sc.nextInt();
        // Student st = bestStudent(new Student(n1,s1), new Student(n2,s2), new Student(n3,s3)); // TODO: bestStudent 메서드 작성 후 주석 해제
        // TODO: st.name과 st.score 출력
    }
}
```