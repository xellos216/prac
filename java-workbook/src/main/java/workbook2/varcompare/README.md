클래스(static) 변수는 모든 객체가 공유하며, 인스턴스 변수는 각 객체에 독립적으로 존재합니다.

### 초급 문제 1

**문제 설명:** `Counter` 클래스를 설계하여 클래스 변수 `count`와 인스턴스 변수 `id`를 선언하고, 객체를 2개 생성할 때마다 `id`와 `count`를 출력하는 프로그램을 작성하시오.

**출력 예시:**

```
1 1
2 2
```

**조건:**

- 생성자에서 `count`를 증가시키고, `id`를 할당한다.

```java
class Counter {
    static int count = 0;
    int id;
    Counter() {
        // TODO: count 증가 후 id에 할당
    }
}

public class Q1 {
    public static void main(String[] args) {
        Counter c1 = new Counter();
        System.out.println(c1.id + " " + Counter.count);
        Counter c2 = new Counter();
        System.out.println(c2.id + " " + Counter.count);
    }
}
```

### 초급 문제 2

**문제 설명:** `Car` 클래스에 클래스 변수 `totalCars`와 인스턴스 변수 `name`을 선언하고, 객체를 생성할 때마다 `totalCars`를 증가시키는 프로그램을 작성하시오. 3개의 자동차 객체를 생성하고 각 객체의 이름과 총 자동차 수를 출력한다.

**입력 예시:**

```
Hyundai Kia BMW
```

**출력 예시:**

```
Hyundai 3
Kia 3
BMW 3
```

**조건:**

- `totalCars`는 클래스 변수이며, 모든 객체가 공유합니다.

```java
import java.util.Scanner;

class Car {
    static int totalCars = 0;
    String name;
    Car(String name) {
        this.name = name;
        // TODO: totalCars 증가
    }
}

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n1 = sc.next();
        String n2 = sc.next();
        String n3 = sc.next();
        Car c1 = new Car(n1);
        Car c2 = new Car(n2);
        Car c3 = new Car(n3);
        System.out.println(c1.name + " " + Car.totalCars);
        System.out.println(c2.name + " " + Car.totalCars);
        System.out.println(c3.name + " " + Car.totalCars);
    }
}
```

### 중급 문제 3

**문제 설명:** `Student` 클래스에 클래스 변수 `studentCount`와 인스턴스 변수 `name`을 선언하고, 학생 생성 시 번호를 부여하여 이름과 번호를 출력하는 프로그램을 작성하시오.

**입력 예시:**

```
2
Lee
Kim
```

**출력 예시:**

```
Lee 1
Kim 2
```

**조건:**

- `studentCount`는 `static`으로 선언하고, 생성자에서 증가시킵니다.

```java
import java.util.Scanner;

class Student {
    static int studentCount = 0;
    int id;
    String name;
    Student(String name) {
        // TODO: studentCount 증가 후 id에 할당
    }
}

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            String name = sc.next();
            Student stu = new Student(name);
            System.out.println(stu.name + " " + stu.id);
        }
    }
}
```

### 중급 문제 4

**문제 설명:** `Product` 클래스에 클래스 변수 `totalSold`와 인스턴스 변수 `stock`을 선언하고, 판매 메서드 `sell(int quantity)`를 통해 재고를 감소시키고 `totalSold`를 증가시키는 프로그램을 작성하시오. 2건의 판매 후 재고와 총 판매량을 출력한다.

**입력 예시:**

```
10
sell 3
sell 4
```

**출력 예시:**

```
3 7
```

**조건:**

- `stock`은 인스턴스 변수, `totalSold`는 클래스 변수입니다.

```java
import java.util.Scanner;

class Product {
    static int totalSold = 0;
    int stock;
    Product(int stock) {
        this.stock = stock;
    }
    void sell(int quantity) {
        // TODO: stock 감소, totalSold 증가
    }
}

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int initialStock = sc.nextInt();
        Product p = new Product(initialStock);
        for (int i = 0; i < 2; i++) {
            String cmd = sc.next();
            int q = sc.nextInt();
            p.sell(q);
        }
        // TODO: p.stock과 Product.totalSold 출력
    }
}
```

### 고급 문제 5

**문제 설명:** `Library` 클래스에 클래스 변수 `totalBooks`와 인스턴스 변수 `borrowed`를 선언하고, 책을 대출/반납할 때 각 변수 값이 적절히 수정되도록 하는 프로그램을 작성하시오. 여러 학생이 책을 대출한 후 반납하는 과정을 처리한다.

**입력 예시:**

```
3
borrow 2
borrow 1
return 1
```

**출력 예시:**

```
2 2
```

**조건:**

- `totalBooks`는 전체 대출된 책 수를 나타내며, `borrowed`는 각 객체가 대출한 책 수입니다.

```java
import java.util.Scanner;

class Library {
    static int totalBooks = 0;
    int borrowed = 0;
    void borrow(int n) {
        // TODO: borrowed와 totalBooks 증가
    }
    void returnBooks(int n) {
        // TODO: borrowed와 totalBooks 감소
    }
}

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Library user = new Library();
        int commands = sc.nextInt();
        for (int i = 0; i < commands; i++) {
            String cmd = sc.next();
            int n = sc.nextInt();
            if (cmd.equals("borrow")) user.borrow(n);
            else user.returnBooks(n);
        }
        // TODO: user.borrowed와 Library.totalBooks 출력
    }
}
```

### 고급 문제 6

**문제 설명:** `ChatRoom` 클래스에 클래스 변수 `totalUsers`와 인스턴스 변수 `messagesSent`를 선언하고, 사용자가 메시지를 보낼 때마다 총 사용자 수와 개인 메시지 수를 관리하는 프로그램을 작성하시오. 두 명의 사용자가 각각 메시지를 보내고 통계를 출력한다.

**입력 예시:**

```
user1 3
user2 2
```

**출력 예시:**

```
user1 3 2
user2 2 2
```

**조건:**

- `totalUsers`는 `static`으로 관리하며, 모든 메시지 전송 시 증가합니다.

```java
import java.util.Scanner;

class ChatRoom {
    static int totalUsers = 0;
    String name;
    int messagesSent = 0;
    ChatRoom(String name) {
        this.name = name;
        // TODO: ChatRoom.totalUsers 증가
    }
    void sendMessages(int n) {
        // TODO: messagesSent 증가
    }
}

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name1 = sc.next();
        int m1 = sc.nextInt();
        String name2 = sc.next();
        int m2 = sc.nextInt();
        ChatRoom u1 = new ChatRoom(name1);
        ChatRoom u2 = new ChatRoom(name2);
        u1.sendMessages(m1);
        u2.sendMessages(m2);
        // TODO: 각 사용자 이름과 messagesSent, ChatRoom.totalUsers 출력
    }
}
```