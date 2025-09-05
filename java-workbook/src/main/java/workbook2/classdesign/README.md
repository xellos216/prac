실생활 객체를 모델링한 클래스를 설계하고, 객체를 생성하여 메서드를 활용해보는 문제입니다.

### 초급 문제 1

**문제 설명:** `Rectangle` 클래스를 설계하여 가로(width)와 세로(height)를 필드로 가지고, 넓이를 반환하는 메서드 `getArea()`를 작성하시오. `main`에서 객체를 생성하고 넓이를 출력한다.

**입력 예시:**

```
5 3
```

**출력 예시:**

```
15
```

**조건:**

- 생성자는 매개변수로 가로와 세로 값을 받아 필드를 초기화합니다.

```java
import java.util.Scanner;

class Rectangle {
    int width;
    int height;
    // TODO: 생성자 작성
    int getArea() {
        // TODO: 넓이 반환
        return 0;
    }
}

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int w = sc.nextInt();
        int h = sc.nextInt();
        // Rectangle rect = new Rectangle(w, h); // TODO: 생성자 작성 후 주석 해제 
        // TODO: rect.getArea() 출력
    }
}
```

### 초급 문제 2

**문제 설명:** `Circle` 클래스를 설계하여 반지름 `r`를 필드로 갖고, 원의 둘레를 계산하는 메서드 `getCircumference()`를 작성하시오.

**입력 예시:**

```
2
```

**출력 예시:**

```
12.566370614359172
```

**조건:**

- 원주율은 `Math.PI`를 사용합니다.
- 생성자를 통해 반지름을 초기화합니다.

```java
import java.util.Scanner;

class Circle {
    double r;
    // TODO: 생성자 작성
    double getCircumference() {
        // TODO: 둘레 반환
        return 0;
    }
}

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double radius = sc.nextDouble();
        // Circle c = new Circle(radius); // TODO: 생성자 작성 후 주석 해제
        // TODO: c.getCircumference() 출력
    }
}

```

### 중급 문제 3

**문제 설명:** `Book` 클래스를 설계하여 제목(title), 저자(author), 가격(price)을 필드로 갖고, 책 정보를 출력하는 `printInfo()` 메서드를 작성하시오. `main`에서 책 두 권을 생성하고 정보를 출력한다.

**입력 예시:**

```
JavaProgramming John 20000
PythonCoding Alice 25000
```

**출력 예시:**

```
Title: JavaProgramming, Author: John, Price: 20000
Title: PythonCoding, Author: Alice, Price: 25000
```

**조건:**

- 생성자에서 모든 필드를 초기화합니다.

```java
import java.util.Scanner;

class Book {
    String title;
    String author;
    int price;
    // TODO: 생성자 작성
    void printInfo() {
        // TODO: 정보 출력
    }
}

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String t1 = sc.next();
        String a1 = sc.next();
        int p1 = sc.nextInt();
        String t2 = sc.next();
        String a2 = sc.next();
        int p2 = sc.nextInt();
        // Book b1 = new Book(t1, a1, p1); // TODO: 생성자 작성 후 주석 해제
        // Book b2 = new Book(t2, a2, p2); // TODO: 생성자 작성 후 주석 해제
        // b1.printInfo(); // TODO: 생성자 작성 후 주석 해제
        // b2.printInfo(); // TODO: 생성자 작성 후 주석 해제
    }
}
```

### 중급 문제 4

**문제 설명:** `Point` 클래스를 설계하여 x, y 좌표를 필드로 갖고, 두 점 사이의 거리를 계산하는 메서드 `distanceTo(Point other)`를 작성하시오.

**입력 예시:**

```
0 0 3 4
```

**출력 예시:**

```
5.0
```

**조건:**

- 거리 공식은 `Math.sqrt((x2-x1)^2 + (y2-y1)^2)`를 사용합니다.

```java
import java.util.Scanner;

class Point {
    double x;
    double y;
    // TODO: 생성자 및 distanceTo 메서드 작성
}

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();
        // Point p1 = new Point(x1, y1); // TODO: 생성자 작성 후 주석 해제
        // Point p2 = new Point(x2, y2); // TODO: 생성자 작성 후 주석 해제
        // TODO: p1.distanceTo(p2) 출력
    }
}
```

### 고급 문제 5

**문제 설명:** `Account` 클래스를 설계하여 계좌번호(accountNo), 잔액(balance)를 필드로 갖고, 입금(deposit)과 출금(withdraw) 메서드를 작성하시오. 출금 시 잔액보다 큰 금액을 출금하려고 하면 “잔액 부족”을 출력한다.

**입력 예시:**

```
12345 1000
deposit 500
withdraw 2000
```

**출력 예시:**

```
1500
잔액 부족
```

**조건:**

- 메서드 호출 결과를 출력합니다.
- 입금 후 잔액을 출력하고, 출금 요청 시 잔액 미만이면 메시지를 출력합니다.

```java
import java.util.Scanner;

class Account {
    String accountNo;
    int balance;
    // TODO: 생성자, deposit, withdraw 메서드 작성
}

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String accNo = sc.next();
        int bal = sc.nextInt();
        // Account acc = new Account(accNo, bal); // TODO: 생성자 작성 후 주석 해제
        String cmd1 = sc.next();
        int amt1 = sc.nextInt();
        if (cmd1.equals("deposit")) {
            // acc.deposit(amt1); // TODO: deposit 메서드 작성 후 주석 해제
        } else {
            // acc.withdraw(amt1); // TODO: withdraw 메서드 작성 후 주석 해제
        }
        String cmd2 = sc.next();
        int amt2 = sc.nextInt();
        if (cmd2.equals("deposit")) {
            // acc.deposit(amt2); // TODO: deposit 메서드 작성 후 주석 해제
        } else {
            // acc.withdraw(amt2); // TODO: withdraw 메서드 작성 후 주석 해제
        }
    }
}
```

### 고급 문제 6

**문제 설명:** `Time` 클래스를 설계하여 시(hour), 분(minute), 초(second) 필드를 가지고, 일정 초를 더하는 `addSeconds(int s)` 메서드를 작성한다. 초를 더한 후 시간이 넘어가면 분과 시간도 적절히 증가시키도록 한다.

**입력 예시:**

```
23 59 50
20
```

**출력 예시:**

```
0 0 10
```

**조건:**

- 예를 들어 23:59:50에 20초를 더하면 자정 0:0:10이 된다.

```java
import java.util.Scanner;

class Time {
    int hour;
    int minute;
    int second;
    // TODO: 생성자 및 addSeconds 메서드 작성
}

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int m = sc.nextInt();
        int s = sc.nextInt();
        int add = sc.nextInt();
        // Time time = new Time(h, m, s); // TODO: 생성자 작성 후 주석 해제
        // time.addSeconds(add); // TODO: addSeconds 메서드 작성 후 주석 해제
        // TODO: time.hour time.minute time.second 출력
    }
}
```