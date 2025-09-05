기본형 변수는 값 자체가 전달되지만, 참조형 변수는 객체의 주소가 전달되어 메서드 내에서 객체의 상태를 변경할 수 있습니다.

### 초급 문제 1

**문제 설명:** 정수형 매개변수 `x`를 받아 `x`에 10을 더하는 메서드를 작성하고, `main`에서 호출 후 `x`의 값이 변경되는지 확인하여 출력하는 프로그램을 작성하시오.

**입력 예시:**

```
5
```

**출력 예시:**

```
5 15
```

**조건:**

- 메서드 내에서 `x`를 변경하지만 호출한 곳의 값은 변경되지 않는 것을 확인합니다.

```java
import java.util.Scanner;

public class Q1 {
    // TODO: primitiveParam 메서드 작성 (int x를 받아 x에 10을 더함)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        // int result = primitiveParam(x); // TODO: primitiveParam 메서드 작성 후 주석 해제
        // TODO: 원래 x와 메서드 반환 값 출력
    }
}
```

### 초급 문제 2

**문제 설명:** 배열을 매개변수로 받아 첫 번째 요소에 100을 더하는 메서드를 작성하고, `main`에서 배열의 변화 여부를 출력하는 프로그램을 작성하시오.

**입력 예시:**

```
3
1 2 3
```

**출력 예시:**

```
101 2 3
```

**조건:**

- 참조형 매개변수의 경우 메서드 내 수정이 호출한 곳에도 반영됨을 확인합니다.

```java
import java.util.Scanner;

public class Q2 {
    // TODO: addHundred 메서드 작성 (int[] arr의 첫 요소에 100을 더함)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // addHundred(arr); // TODO: addHundred 메서드 작성 후 주석 해제
        // TODO: 변경된 arr 출력
    }
}
```

### 중급 문제 3

**문제 설명:** 문자열 두 개를 입력받아 서로 값을 교환하는 메서드를 작성하시오. 단, 기본형 매개변수를 사용하여 교환하는 것이 불가능함을 보여주고, 배열을 사용하여 교환하는 방식을 구현한다.

**입력 예시:**

```
hello world
```

**출력 예시:**

```
world hello
```

**조건:**

- 두 문자열을 요소로 가진 `String[]` 배열을 만들고, 메서드에서 배열 요소를 교환합니다.

```java
import java.util.Scanner;

public class Q3 {
    // TODO: swapStrings 메서드 작성 (배열을 받아 두 문자열을 교환)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        String[] arr = {s1, s2};
        // swapStrings(arr); // TODO: swapStrings 메서드 작성 후 주석 해제
        // TODO: arr[0], arr[1] 출력
    }
}
```

### 중급 문제 4

**문제 설명:** `Person` 클래스를 정의하고 이름을 필드로 가진 후, 메서드에서 `Person` 객체의 이름을 변경하는 프로그램을 작성하시오. 호출 후 객체의 이름이 변경되는지 확인한다.

**입력 예시:**

```
홍길동 김철수
```

**출력 예시:**

```
김철수
```

**조건:**

- 참조형 매개변수의 객체 상태 변경이 호출한 곳에 반영됨을 보여줍니다.

```java
import java.util.Scanner;

class Person {
    String name;
    Person(String name) { this.name = name; }
}

public class Q4 {
    // TODO: changeName 메서드 작성 (Person 객체와 새 이름을 받아 객체의 name 수정)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String oldName = sc.next();
        String newName = sc.next();
        Person p = new Person(oldName);
        // changeName(p, newName); // TODO: changeName 메서드 작성 후 주석 해제
        // TODO: p.name 출력
    }
}
```

### 고급 문제 5

**문제 설명:** 두 개의 정수를 가지고 있는 클래스를 정의하고, 메서드에서 두 정수를 서로 교환하는 프로그램을 작성하시오. 교환 후 객체의 내부 값이 바뀌는지 확인한다.

**입력 예시:**

```
5 10
```

**출력 예시:**

```
10 5
```

**조건:**

- 참조형을 사용하여 메서드에서 객체의 필드 값을 교환합니다.

```java
import java.util.Scanner;

class Pair {
    int a;
    int b;
    Pair(int a, int b) { this.a = a; this.b = b; }
}

public class Q5 {
    // TODO: swapPair 메서드 작성 (Pair 객체의 a와 b 값을 교환)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        Pair pair = new Pair(x, y);
        // swapPair(pair); // TODO: swapPair 메서드 작성 후 주석 해제
        // TODO: pair.a와 pair.b 출력
    }
}
```

### 고급 문제 6

**문제 설명:** 불변(immutable) 객체와 가변(mutable) 객체의 매개변수 전달 차이를 비교하는 프로그램을 작성한다. `String`과 `StringBuilder` 객체를 매개변수로 받아 각각 문자열 뒤에 “!”를 추가하는 메서드를 구현하고, 호출 후 원본 객체의 변화를 비교하여 출력한다.

**입력 예시:**

```
Hello Java
```

**출력 예시:**

```
Hello Java!
```

**조건:**

- `String`은 불변이므로 메서드 내에서 변경해도 원본이 변하지 않으며, `StringBuilder`는 가변이므로 변합니다.

```java
import java.util.Scanner;

public class Q6 {
    // TODO: addExclamation(String s)와 addExclamation(StringBuilder sb) 메서드 작성
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        StringBuilder sb = new StringBuilder(sc.next());
        // addExclamation(s); // TODO: addExclamation(String s) 메서드 작성 후 주석 해제
        // addExclamation(sb); // TODO: addExclamation(StringBuilder sb) 메서드 작성 후 주석 해제
        // TODO: s와 sb 출력
    }
}
```