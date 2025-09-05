제네릭은 클래스와 메서드를 다양한 타입으로 사용할 수 있게 해 주며, 열거형(enum)은 고정된 상수 집합을 정의합니다.

### 초급 문제 1

**문제 설명:** 제네릭 클래스를 설계하여 타입 매개변수 `T`의 값을 저장하고 반환하는 메서드를 작성하고, `Integer`와 `String` 타입으로 객체를 생성하여 값을 출력한다. (코드 관찰하기)

**입력 예시:**

```
123 Hello
```

**출력 예시:**

```
123
Hello
```

**조건:**

- 클래스 이름은 `GenericBox`이며, `get()` 메서드로 값을 반환합니다.

```java
import java.util.Scanner;

class GenericBox<T> {
    T value;

    GenericBox(T value) {
        this.value = value;
    }

    T get() {
        return value;
    }
}

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        String s = sc.next();
        GenericBox<Integer> box1 = new GenericBox<>(i);
        GenericBox<String> box2 = new GenericBox<>(s);
        System.out.println(box1.get());
        System.out.println(box2.get());
    }
}
```

### 초급 문제 2

**문제 설명:** 제네릭 메서드 `swap`을 작성하여 배열의 두 요소를 교환하고, 문자열 배열과 정수 배열 모두에 대해 동작하는지 확인한다.

**입력 예시:**

```
apple banana
1 2
```

**출력 예시:**

```
banana apple
2 1
```

**조건:**

- 메서드 정의 시 `<T>`를 사용합니다.

```java
import java.util.Scanner;

public class Q2 {
    static <T> void swap(T[] arr, int i, int j) {
        // TODO: arr[i]와 arr[j] 교환
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] strArr = {sc.next(), sc.next()};
        Integer[] intArr = {sc.nextInt(), sc.nextInt()};
        swap(strArr, 0, 1);
        swap(intArr, 0, 1);
        System.out.println(strArr[0] + " " + strArr[1]);
        System.out.println(intArr[0] + " " + intArr[1]);
    }
}
```

### 중급 문제 3

**문제 설명:** 상한(bounded) 타입 파라미터를 사용하여 `sumNumbers` 메서드를 작성한다. 이 메서드는 `Number` 클래스를 상속한 타입의 배열을 받아 합을 반환한다.

**입력 예시:**

```
3
1 2.5 3
```

**출출력 예시:**

```
6.5
```

**조건:**

- 제네릭 메서드 선언에서 `<T extends Number>`를 사용합니다.

```java
import java.util.Scanner;

public class Q3 {
    static <T extends Number> double sumNumbers(T[] arr) {
        // TODO: arr 요소의 합을 반환
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Number[] nums = new Number[n];
        for(int i=0;i<n;i++) {
            nums[i] = sc.nextDouble();
        }
        System.out.println(sumNumbers(nums));
    }
}
```

### 중급 문제 4

**문제 설명:** 열거형 `Level`을 선언하여 상수 값 `LOW`, `MEDIUM`, `HIGH`를 가지도록 하고, 입력된 문자열에 따라 해당 열거형 값을 출력하는 프로그램을 작성하시오. (코드 관찰하기)

**입력 예시:**

```
MEDIUM
```

**출력 예시:**

```
MEDIUM
```

**조건:**

- 열거형 값은 모두 대문자로 정의합니다.

```java
import java.util.Scanner;

enum Level { LOW, MEDIUM, HIGH }

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        Level level = Level.valueOf(input);
        System.out.println(level);
    }
}
```

### 고급 문제 5

**문제 설명:** 열거형 `Day`를 설계하여 요일 상수(MON, TUE, WED, THU, FRI, SAT, SUN)를 정의하고, 주어진 요일에 따라 평일이면 “Work” 주말이면 “Rest”를 출력하는 프로그램을 작성하시오.

**입력 예시:**

```
SAT
```

**출력 예시:**

```
Rest
```

**조건:**

- `switch` 문을 사용합니다.

```java
import java.util.Scanner;

enum Day { MON, TUE, WED, THU, FRI, SAT, SUN }

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Day day = Day.valueOf(sc.next());
        // TODO: switch 문으로 Work 또는 Rest 출력
    }
}
```

### 고급 문제 6

**문제 설명:** 제네릭 클래스 `Pair<K,V>`를 정의하여 키와 값을 저장하고, 두 개의 `Pair`를 생성하여 출력하는 프로그램을 작성하시오.

**입력 예시:**

```
id 123 name Alice
```

**출력 예시:**

```
id:123
name:Alice
```

**조건:**

- 두 타입 매개변수를 가진 제네릭 클래스를 설계합니다.

```java
import java.util.Scanner;

class Pair<K, V> {
    K key;
    V value;

    Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public String toString() {
        return key + ":" + value;
    }
}

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String k1 = sc.next();
        int v1 = sc.nextInt();
        String k2 = sc.next();
        String v2 = sc.next();
        // TODO: 위 입력값에 알맞은 타입의 Pair 제네릭 클래스 선언

        // TODO: 선언한 제네릭 객체 2개 출력

    }
}
```