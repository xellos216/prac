변수는 명시적 초기화, 초기화 블록, 생성자 등을 통해 초기화할 수 있습니다.

### 초급 문제 1

**문제 설명:** 클래스 `InitDemo`에 두 개의 필드를 선언하고, 명시적 초기화로 첫 번째 필드를 10으로, 인스턴스 초기화 블록에서 두 번째 필드를 20으로 초기화한 후 생성자에서 두 값을 더한 결과를 출력하는 프로그램을 작성하시오.

**출력 예시:**

```
30
```

**조건:**

- 명시적 초기화는 필드 선언 시 값을 대입합니다.

```java
class InitDemo {
    int a = 10;
    int b;
    {
        // TODO: b 초기화
    }
    InitDemo() {
        // TODO: a와 b의 합 출력
    }
}

public class Q1 {
    public static void main(String[] args) {
        new InitDemo();
    }
}
```

### 초급 문제 2

**문제 설명:** `Q2` 클래스에서 static 변수 `count`를 static 초기화 블록에서 5로 초기화하고, `main`에서 이를 출력하는 프로그램을 작성하시오.

**출력 예시:**

```
5
```

**조건:**

- static 초기화 블록은 클래스가 로딩될 때 한 번 실행됩니다.

```java
public class Q2 {
    static int count;
    static {
        // TODO: count 초기화
    }
    public static void main(String[] args) {
        System.out.println(count);
    }
}
```

### 중급 문제 3

**문제 설명:** `Q3` 클래스에서 static 변수, 인스턴스 변수, static 초기화 블록, 인스턴스 초기화 블록, 생성자의 실행 순서를 출력하는 프로그램을 작성하시오. 객체를 생성할 때 어떤 순서로 실행되는지 관찰한다.

**출력 예시:**

```
static block
static variable
instance block
constructor
instance variable
```

**조건:**

- 각 위치에서 System.out.println()을 사용하여 실행 순서를 출력합니다.

```java
public class Q3 {
    static int s;
    int i;
    static {
        System.out.println("static block");
    }
    {
        System.out.println("instance block");
    }
    Q3() {
        System.out.println("constructor");
    }
    public static void main(String[] args) {
        System.out.println("static variable");
        Q3 obj = new Q3();
        System.out.println("instance variable");
    }
}
```

### 중급 문제 4

**문제 설명:** `RandomInit` 클래스에서 배열을 필드로 선언하고, 인스턴스 초기화 블록에서 배열을 난수로 채운 후 값을 출력하는 프로그램을 작성하시오.

**출력 예시:**

```
3 7 1 4 9
```

**조건:**

- 배열의 크기는 5로 하고, 0~9 사이의 난수를 사용합니다.

```java
import java.util.Random;

class RandomInit {
    int[] arr = new int[5];
    {
        // TODO: arr 배열을 난수로 채움
    }
    void printArray() {
        // TODO: arr 요소 출력
    }
}

public class Q4 {
    public static void main(String[] args) {
        RandomInit obj = new RandomInit();
        obj.printArray();
    }
}
```

### 고급 문제 5

**문제 설명:** `InitPerson` 클래스에서 static 초기화 블록, 인스턴스 초기화 블록, 생성자를 이용해 이름(name)과 id를 초기화하고, 객체를 3개 생성하여 각각의 값을 출력하는 프로그램을 작성하시오. id는 생성 순서대로 1,2,3을 부여한다.

**입력 예시:**

```
Kim Lee Park
```

**출력 예시:**

```
class loaded
Kim 1
Lee 2
Park 3
```

**조건:**

- static 블록에서 “class loaded”를 출력합니다.
- 인스턴스 초기화 블록에서 id를 증가시킵니다.

```java
 import java.util.Scanner;

class InitPerson {
    static int counter = 0;
    static {
        // TODO: "class loaded" 출력
    }
    String name;
    int id;
    {
        // TODO: id 부여
    }
    InitPerson(String name) {
        // TODO: name 초기화
    }
}

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n1 = sc.next();
        String n2 = sc.next();
        String n3 = sc.next();
        InitPerson p1 = new InitPerson(n1);
        InitPerson p2 = new InitPerson(n2);
        InitPerson p3 = new InitPerson(n3);
        System.out.println(p1.name + " " + p1.id);
        System.out.println(p2.name + " " + p2.id);
        System.out.println(p3.name + " " + p3.id);
    }
}
```

### 고급 문제 6

**문제 설명:** `BankAccount` 클래스에서 잔액(balance)을 필드로 선언하고, 생성자에서 초기 잔액을 설정하며, static 초기화 블록에서 은행 이름을 출력한다. 또한 인스턴스 초기화 블록에서 계좌 개설 메시지를 출력한다. 두 개의 계좌를 생성하고 잔액을 출력하는 프로그램을 작성하시오.

**입력 예시:**

```
1000 2000
```

**출력 예시:**

```
Bank Opened
Account Created
Account Created
1000
2000
```

**조건:**

- static 블록은 한 번만 실행되고, 인스턴스 블록은 객체 생성마다 실행됩니다.

```java
import java.util.Scanner;

class BankAccount {
    static {
        // TODO: 은행 이름 출력
    }
    {
        // TODO: 계좌 개설 메시지 출력
    }
    int balance;
    BankAccount(int balance) {
        this.balance = balance;
    }
}

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int b1 = sc.nextInt();
        int b2 = sc.nextInt();
        BankAccount a1 = new BankAccount(b1);
        BankAccount a2 = new BankAccount(b2);
        System.out.println(a1.balance);
        System.out.println(a2.balance);
    }
}
```