자바 변수는 선언 위치에 따라 지역변수, 인스턴스 변수, 클래스 변수(static 변수)가 있습니다.

### 초급 문제 1

**문제 설명:** 클래스 `Sample`에서 지역변수, 인스턴스 변수, 클래스 변수를 선언하고, `main` 메서드에서 이들의 사용 예를 출력하는 프로그램을 작성하시오.

**출력 예시:**

```
local instance class
```

**조건:**

- 클래스 변수는 `static` 키워드를 사용합니다.

```java
class Sample {
    static String classVar = "class";
    String instanceVar = "instance";
    void printLocal() {
        String localVar = "local";
        // TODO: localVar 출력
    }
}

public class Q1 {
    public static void main(String[] args) {
        Sample s = new Sample();
        s.printLocal();
        // TODO: instanceVar와 classVar 출력
    }
}
```

### 초급 문제 2

**문제 설명:** 메서드 내부에서 선언된 지역변수는 메서드가 종료되면 사라짐을 보여주는 프로그램을 작성하시오. 메서드 호출 후 지역변수에 접근하려 하면 오류가 발생해야 한다.

**출력 예시:**

```
inside
```

**조건:**

- 지역변수는 메서드 내부에서만 접근 가능하므로, 메서드 외부에서 출력하려고 하면 주석 등으로 설명합니다.

```java
public class Q2 {
    static void showLocal() {
        String msg = "inside";
        System.out.println(msg);
    }
    public static void main(String[] args) {
        showLocal();
        // TODO: msg 변수에 접근하려고 하면 컴파일 오류
    }
}
```

### 중급 문제 3

**문제 설명:** `Counter` 클래스에 클래스 변수 `count`와 인스턴스 변수 `id`를 선언하고, 객체가 생성될 때마다 `count`를 증가시키며 `id`에 현재 값을 할당하는 프로그램을 작성하시오. 마지막에 생성된 객체의 `id`와 전체 `count`를 출력한다.

**출력 예시:**

```
3 3
```

**조건:**

- 클래스 변수 `count`는 `static`으로 선언하고, 생성자에서 증가시킵니다.

```java
class Counter {
    static int count = 0;
    int id;
    Counter() {
        // TODO: count 증가 후 id에 할당
    }
}

public class Q3 {
    public static void main(String[] args) {
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();
        // TODO: c3.id와 Counter.count 출력
    }
}
```

### 중급 문제 4

**문제 설명:** 클래스 `Demo`에 static 초기화 블록과 인스턴스 초기화 블록을 사용하여 변수값을 설정하는 프로그램을 작성하고, 객체 생성 시 실행 순서를 출력하시오.

**출력 예시:**

```
static block
instance block
constructor
```

**조건:**

- static 블록은 클래스 로딩 시 실행되고, 인스턴스 블록은 객체 생성 시 실행됩니다.

```java
public class Q4 {
    static {
        System.out.println("static block");
    }
    {
        System.out.println("instance block");
    }
    Q4() {
        System.out.println("constructor");
    }

    public static void main(String[] args) {
        Q4 d = new Q4();
    }
}
```

### 고급 문제 5

**문제 설명:** `Calculator` 클래스에서 클래스 변수 `history`에 연산 기록을 저장하고, 인스턴스 메서드로 연산을 수행하는 프로그램을 작성하시오. 사용자가 덧셈, 뺄셈 연산을 3번 입력하면 각 연산 결과와 역사(history) 전체를 출력한다.

**입력 예시:**

```
add 1 2
sub 5 3
add 4 6
```

**출력 예시:**

```
3 2 10
1 + 2, 5 - 3, 4 + 6
```

**조건:**

- `history`는 `static` 변수로 전체 계산 기록을 누적합니다.

```java
import java.util.Scanner;

class Calculator {
    static String history = "";
    int add(int a, int b) {
        // TODO: 연산 결과 저장 후 반환
        return 0;
    }
    int sub(int a, int b) {
        // TODO: 연산 결과 저장 후 반환
        return 0;
    }
}

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator calc = new Calculator();
        int[] results = new int[3];
        for (int i = 0; i < 3; i++) {
            String op = sc.next();
            int x = sc.nextInt();
            int y = sc.nextInt();
            if (op.equals("add")) {
                results[i] = calc.add(x, y);
            } else {
                results[i] = calc.sub(x, y);
            }
        }
        // TODO: results 배열과 Calculator.history 출력
    }
}
```

### 고급 문제 6

**문제 설명:** `Bank` 클래스에서 클래스 변수 `totalBalance`를 사용하여 모든 계좌의 총합을 관리하고, 각 계좌 객체의 입출금에 따라 총합이 갱신되는 프로그램을 작성하시오. 2개의 계좌에 대해 입금과 출금을 수행하고 최종 총합을 출력한다.

**입력 예시:**

```
1000 2000
deposit 1 500
withdraw 2 1000
```

**출력 예시:**

```
2500
```

**조건:**

- `totalBalance`는 `static` 변수이며, 입금/출금 시 반영됩니다.

```java
import java.util.Scanner;

class Bank {
    static int totalBalance = 0;
    int balance;
    Bank(int balance) {
        this.balance = balance;
        totalBalance += balance;
    }
    void deposit(int amount) {
        // TODO: balance와 totalBalance 증가
    }
    void withdraw(int amount) {
        // TODO: balance와 totalBalance 감소
    }
}

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bal1 = sc.nextInt();
        int bal2 = sc.nextInt();
        Bank acc1 = new Bank(bal1);
        Bank acc2 = new Bank(bal2);
        String op1 = sc.next();
        int id1 = sc.nextInt();
        int amt1 = sc.nextInt();
        // 첫 번째 명령 처리
        // 두 번째 명령 처리 후 Bank.totalBalance 출력
    }
}
```