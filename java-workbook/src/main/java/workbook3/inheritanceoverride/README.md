상속을 통해 새로운 클래스가 기존 클래스의 필드와 메서드를 물려받을 수 있습니다. 오버라이딩을 통해 자식 클래스에서 부모 클래스의 메서드를 재정의할 수 있습니다.

### 초급 문제 1

**문제 설명:** `Animal` 클래스를 정의하여 `eat()` 메서드와 `name` 필드를 포함하고, `Dog` 클래스가 `Animal`을 상속받아 `bark()` 메서드를 추가한다. `main`에서 `Dog` 객체를 생성하여 `eat()`과 `bark()`를 호출한다. (코드 관찰하기)

**출력 예시:**

```
Eating...
Barking...
```

**조건:**

- `Dog` 클래스는 `extends Animal`로 정의합니다.

```java
class Animal {
    String name;
    void eat() {
        System.out.println("Eating...");
    }
}

class Dog extends Animal {
    public Dog() {
        super.name = "Dog"; // super 키워드 맛보기
    }
    void bark() {
        System.out.println("Barking...");
    }
}

public class Q1 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        System.out.println("dog.name = " + dog.name);
        dog.eat();
        dog.bark();
    }
}

```

### 초급 문제 2

**문제 설명:** `Shape` 클래스에서 `draw()` 메서드를 정의하고, `Circle` 클래스와 `Rectangle` 클래스가 이를 상속받아 각기 다른 그림을 그리는 메시지를 출력하도록 오버라이딩한다.

**입력 예시:**

```
circle rect circle
```

**출력 예시:**

```
Draw Circle
Draw Rectangle
Draw Circle
```

**조건:**

- 부모 클래스 타입의 배열을 사용하여 동적 바인딩을 확인합니다.

```java
import java.util.Scanner;

abstract class Shape {
    abstract void draw();
}

class Circle extends Shape {
    void draw() {
        // TODO: "Draw Circle" 출력
    }
}

class Rectangle extends Shape {
    void draw() {
        // TODO: "Draw Rectangle" 출력
    }
}

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Shape[] arr = new Shape[3];
        for (int i = 0; i < 3; i++) {
            String type = sc.next();
            if (type.equals("circle")) {
                arr[i] = new Circle();
            } else {
                arr[i] = new Rectangle();
            }
        }
        for (Shape s : arr) {
            s.draw();
        }
    }
}
```

### 중급 문제 3

**문제 설명:** `Vehicle` 클래스를 정의하여 `move()` 메서드를 포함시키고, `Car`, `Bike` 클래스가 `Vehicle`을 상속하여 `move()` 메서드를 오버라이딩한다. `Vehicle` 타입의 배열을 이용하여 다형성을 확인한다.

**입력 예시:**

```
car bike car
```

**출력 예시:**

```
Car is moving
Bike is moving
Car is moving
```

**조건:**

- 오버라이딩된 메서드는 각 클래스에 맞게 구현합니다.

```java
import java.util.Scanner;

class Vehicle {
    void move() {
        System.out.println("Vehicle is moving");
    }
}

class Car extends Vehicle {
    void move() {
        // TODO: "Car is moving" 출력
    }
}

class Bike extends Vehicle {
    void move() {
        // TODO: "Bike is moving" 출력
    }
}

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Vehicle[] vehicles = new Vehicle[3];
        for (int i = 0; i < 3; i++) {
            String type = sc.next();
            vehicles[i] = type.equals("car") ? new Car() : new Bike();
        }
        for (Vehicle v : vehicles) {
            v.move();
        }
    }
}
```

### 중급 문제 4

**문제 설명:** `Person` 클래스를 상속받은 `Student` 클래스와 `Teacher` 클래스를 설계하고, 공통 메서드 `introduce()`를 오버라이딩하여 학생과 교사에 맞는 소개를 하도록 구현한다.

**입력 예시:**

```
student John teacher Alice
```

**출력 예시:**

```
Hello, I'm John student.
Hello, I'm Alice teacher.
```

**조건:**

- `Person` 클래스는 이름(name)을 필드로 갖고 `introduce()`를 정의합니다.

```java
import java.util.Scanner;

class Person {
    String name;
    Person(String name) {
        this.name = name;
    }
    void introduce() {
        System.out.println("Hello, I'm " + name + ".");
    }
}

class Student extends Person {
    Student(String name) {
        super(name); // super() 맛보기
    }
    void introduce() {
        // TODO: 학생 소개 출력
    }
}

class Teacher extends Person {
    Teacher(String name) {
        super(name); // super() 맛보기
    }
    void introduce() {
        // TODO: 교사 소개 출력
    }
}

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String type1 = sc.next();
        String name1 = sc.next();
        String type2 = sc.next();
        String name2 = sc.next();
        Person p1 = type1.equals("student") ? new Student(name1) : new Teacher(name1);
        Person p2 = type2.equals("student") ? new Student(name2) : new Teacher(name2);
        p1.introduce();
        p2.introduce();
    }
}
```

### 고급 문제 5

**문제 설명:**

1. 첫 줄에 **계좌 종류**(`saving` 또는 `checking`)와 초기 **잔액**을 입력한다.
2. 이어서 여러 개의 명령을 입력한다. 각 명령은

    ```
    deposit 금액
    withdraw 금액
    ```

   형식을 가지며, 더 이상 입력이 없을 때까지 반복된다.

3. 명령이 수행될 때마다 현재 잔액을 출력한다.
    - `SavingsAccount` 입금 시 5 % 이자를 추가한다.
    - `CheckingAccount` 인출 시 1 % 수수료(금액의 1 %)를 함께 차감한다.

**입력 예시:**

```
saving 1000
deposit 500
withdraw 100
```

**출력 예시:**

```
1575
1475
```

**조건**

- `Account`는 **추상 클래스**로 선언하고 `deposit()`·`withdraw()`는 기본 동작(수수료·이자 없음)을 구현한다.
- 하위 클래스에서 필요한 메서드만 **오버라이딩**한다.
- 메인에서는 `Account` 타입 한 개만 생성해 **다형성**을 확인한다.

---

```java
import java.util.Scanner;

abstract class Account {
    int balance;
    Account(int balance) {
        this.balance = balance;
    }

    /** 기본 입금: 수수료·이자 없음 */
    void deposit(int amount) {
        balance += amount;
    }

    /** 기본 인출: 수수료·이자 없음 */
    void withdraw(int amount) {
        balance -= amount;
    }
}

class SavingsAccount extends Account {
    SavingsAccount(int balance) { 
        super(balance);
    }

    /** 입금 시 5 % 이자 포함 */
    @Override
    void deposit(int amount) {
        // TODO: 5 % 이자 포함 로직 작성
    }
}

class CheckingAccount extends Account {
    CheckingAccount(int balance) { 
        super(balance); 
    }

    /** 인출 시 1 % 수수료 차감 */
    @Override
    void withdraw(int amount) {
        // TODO: 1 % 수수료 차감 로직 작성
    }
}

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /* ---------- 계좌 생성 ---------- */
        String kind = sc.next(); // "saving" or "checking"
        int initBal = sc.nextInt();

        // TODO: 아래 [알맞은 타입 선언]에 알맞은 타입을 선언 후 주석 해제
        /*
        [알맞은 타입 선언] acc = kind.equals("saving")
                ? new SavingsAccount(initBal)
                : new CheckingAccount(initBal);
        */

        /* ---------- 명령 반복 ---------- */
        while (sc.hasNext()) {
            String cmd = sc.next(); // deposit / withdraw
            int amount = sc.nextInt();

            // TODO: 계좌 생성 주석 해제 후 아래 주석 해제
            if (cmd.equals("deposit")) {
                // acc.deposit(amount);
            } else { // withdraw
                // acc.withdraw(amount);
            }
            // System.out.println(acc.balance);
        }
    }
}

```

> Account 하나의 참조로 두 파생 클래스의 서로 다른 오버라이딩 규칙이 자연스럽게 적용되므로,
>
>
> **입·출금 로직 변경 시 메인 코드를 수정할 필요 없이** 동적 바인딩만으로 확장 가능합니다.
>

### 고급 문제 6

**문제 설명:** 추상 클래스 `Employee`를 설계하고 추상 메서드 `getPay()`를 선언합니다. 이를 상속하는 두 클래스 `FullTimeEmployee`와 `PartTimeEmployee`를 작성하여 급여를 다음과 같이 계산·출력하세요.

- **정규직(`full`)** : 입력으로 월급(monthlySalary)을 한 개 받으며, 그대로 급여로 사용
- **시간제(`part`)** : 입력으로 시급(hourlyRate)과 근무시간(hours)을 두 개 받아 `hourlyRate × hours` 를 급여로 계산

**입력 예시:**

```
full 3000
part 20 15
```

**출력 예시:**

```
3000.0
300.0
```

**조건:**

- `Employee`는 인스턴스화할 수 없습니다.
- `getPay()`는 `double` 값을 반환해야 합니다.
- 두 직원 정보를 차례대로 입력받아 급여를 한 줄씩 출력합니다.

---

```java
import java.util.Scanner;

abstract class Employee {
    abstract double getPay(); // TODO: 급여 반환
}

class FullTimeEmployee extends Employee {
    double monthlySalary;
    FullTimeEmployee(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }
    double getPay() {
        // TODO: 정규직 급여 계산
        return 0;
    }
}

class PartTimeEmployee extends Employee {
    double hourlyRate, hours;
    PartTimeEmployee(double hourlyRate, double hours) {
        this.hourlyRate = hourlyRate;
        this.hours = hours;
    }
    double getPay() {
        // TODO: 시간제 급여 계산
        return 0;
    }
}

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 첫 번째 직원
        String type1 = sc.next();
        Employee e1;
        if (type1.equals("full")) {
            double salary = sc.nextDouble();
            e1 = new FullTimeEmployee(salary);
        } else { // type1 == "part"
            double rate = sc.nextDouble();
            double h = sc.nextDouble();
            e1 = new PartTimeEmployee(rate, h);
        }

        // 두 번째 직원
        String type2 = sc.next();
        Employee e2;
        if (type2.equals("full")) {
            double salary = sc.nextDouble();
            e2 = new FullTimeEmployee(salary);
        } else {
            double rate = sc.nextDouble();
            double h = sc.nextDouble();
            e2 = new PartTimeEmployee(rate, h);
        }

        System.out.println(e1.getPay());
        System.out.println(e2.getPay());
    }
}

```