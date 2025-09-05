추상클래스는 인스턴스화할 수 없으며 추상 메서드를 포함할 수 있습니다. 인터페이스는 모든 메서드가 추상적이며, 여러 인터페이스 구현을 통해 다중 상속을 흉내낼 수 있습니다.

### 초급 문제 1

**문제 설명:** 추상 클래스 `Animal`을 설계하여 추상 메서드 `sound()`를 선언하고, `Cat`과 `Dog` 클래스가 이를 상속하여 각각 “Meow”, “Woof”를 출력하도록 구현한다.

**입력 예시:**

```
cat dog
```

**출출력 예시:**

```
Meow
Woof
```

**조건:**

- `Animal`은 인스턴스화할 수 없습니다.

```java
import java.util.Scanner;

abstract class Animal {
    abstract void sound();
}

class Cat extends Animal {
    void sound() {
        // TODO: "Meow" 출력
    }
}

class Dog extends Animal {
    void sound() {
        // TODO: "Woof" 출력
    }
}

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a1 = sc.next();
        String a2 = sc.next();
        Animal animal1 = a1.equals("cat") ? new Cat() : new Dog();
        Animal animal2 = a2.equals("cat") ? new Cat() : new Dog();
        animal1.sound();
        animal2.sound();
    }
}
```

### 초급 문제 2

**문제 설명:** `Playable` 인터페이스를 정의하여 `play()` 메서드를 선언하고, `Piano`와 `Guitar` 클래스가 이를 구현하도록 한다. `main`에서 악기 종류를 입력받아 `play()`를 호출한다.

**입력 예시:**

```
piano guitar
```

**출력 예시:**

```
Piano plays
Guitar plays
```

**조건:**

- 인터페이스의 메서드는 자동으로 public abstract입니다.

```java
import java.util.Scanner;

interface Playable {
    void play();
}

class Piano implements Playable {
    public void play() {
        // TODO: "Piano plays" 출력
    }
}

class Guitar implements Playable {
    public void play() {
        // TODO: "Guitar plays" 출력
    }
}

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String i1 = sc.next();
        String i2 = sc.next();
        Playable inst1 = i1.equals("piano") ? new Piano() : new Guitar();
        Playable inst2 = i2.equals("piano") ? new Piano() : new Guitar();
        inst1.play();
        inst2.play();
    }
}
```

### 중급 문제 3

**문제 설명:** 추상 클래스 `Shape`에 추상 메서드 `perimeter()`를 선언하고, `Rectangle`과 `Triangle` 클래스를 설계하여 둘레를 계산하도록 구현한다.

**입력 예시:**

```
rect 3 4
tri 3 4 5
```

**출력 예시:**

```
14
12
```

**조건:**

- `Rectangle`은 둘레를 `2*(w+h)`로, `Triangle`은 세 변 합으로 계산합니다.

```java
import java.util.Scanner;

abstract class Shape {
    abstract double perimeter();
}

class Rectangle extends Shape {
    double w, h;

    Rectangle(double w, double h) {
        this.w = w;
        this.h = h;
    }

    double perimeter() {
        // TODO: 둘레 계산
        return 0;
    }
}

class Triangle extends Shape {
    double a, b, c;

    Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    double perimeter() {
        // TODO: 둘레 계산
        return 0;
    }
}

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String type1 = sc.next();
        Shape s;
        if (type1.equals("rect")) {
            double w = sc.nextDouble();
            double h = sc.nextDouble();
            s = new Rectangle(w, h);

        } else {
            double a = sc.nextDouble();
            double b = sc.nextDouble();
            double c = sc.nextDouble();
            s = new Triangle(a, b, c);
        }
        System.out.println(s.perimeter());
    }
}

```

### 중급 문제 4

**문제 설명:** 인터페이스 `Movable`에 `move()` 메서드를 선언하고, 클래스 `Robot`과 `Car`에서 이 인터페이스를 구현하여 각각 이동 메시지를 출력한다. 여러 객체를 만들어 `move()`를 호출한다.

**입력 예시:**

```
robot car robot
```

**출력 예시:**

```
Robot moves
Car moves
Robot moves
```

**조건:**

- 인터페이스는 다형성을 위한 타입으로 사용됩니다.

```java
import java.util.Scanner;

interface Movable {
    void move();
}

class Robot implements Movable {
    public void move() {
        // TODO: "Robot moves" 출력
    }
}

class Car implements Movable {
    public void move() {
        // TODO: "Car moves" 출력
    }
}

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Movable[] objs = new Movable[3];
        for (int i = 0; i < 3; i++) {
            String t = sc.next();
            objs[i] = t.equals("robot") ? new Robot() : new Car();
        }
        for (Movable m : objs) {
            m.move();
        }
    }
}
```

### 고급 문제 5

**문제 설명:** 추상 클래스 `Employee`에 추상 메서드 `calculateSalary()`를 선언하고, `FullTimeEmployee`와 `PartTimeEmployee`가 이를 상속하여 급여를 계산한다. 정규직 급여 = 기본급 + 보너스, 시간제 급여 = 시간당 급여 × 근무시간.

**입력 예시:**

```
full 2000 500
part 20 10
```

**출력 예시:**

```
2500
200
```

**조건:**

- 사용자 입력에 따라 적절한 객체를 생성하고 `calculateSalary()`를 호출합니다.

```java
import java.util.Scanner;

abstract class Employee {
    abstract double calculateSalary();
}

class FullTimeEmployee extends Employee {
    double base, bonus;

    FullTimeEmployee(double base, double bonus) {
        this.base = base;
        this.bonus = bonus;
    }

    double calculateSalary() {
        // TODO: 급여 계산
        return 0;
    }
}

class PartTimeEmployee extends Employee {
    double hourly, hours;

    PartTimeEmployee(double hourly, double hours) {
        this.hourly = hourly;
        this.hours = hours;
    }

    double calculateSalary() {
        // TODO: 급여 계산
        return 0;
    }
}

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String type1 = sc.next();
        Employee e;
        if (type1.equals("full")) {
            double base = sc.nextDouble();
            double bonus = sc.nextDouble();
            e = new FullTimeEmployee(base, bonus);
        } else {
            double hourly = sc.nextDouble();
            double hours = sc.nextDouble();
            e = new PartTimeEmployee(hourly, hours);
        }
        System.out.println(e.calculateSalary());
    }
}
```

### 고급 문제 6

**문제 설명:** 인터페이스 `Drawable`과 `Rotatable`을 정의하고, 클래스 `Square`가 두 인터페이스를 모두 구현하여 `draw()`와 `rotate()` 메서드를 구현한다. 다른 한 클래스 `Circle`은 `Drawable`만 구현한다. 객체를 생성하여 두 메서드를 호출한다.

**입력 예시:**

```
square circle
```

**출력 예시:**

```
Square drawn
Square rotated
Circle drawn
```

**조건:**

- 인터페이스 다중 구현을 이용합니다.

```java
import java.util.Scanner;

interface Drawable {
    void draw();
}

interface Rotatable {
    void rotate();
}

class Square implements Drawable, Rotatable {
    public void draw() {
        // TODO: "Square drawn" 출력
    }

    public void rotate() {
        // TODO: "Square rotated" 출력
    }
}

class Circle implements Drawable {
    public void draw() {
        // TODO: "Circle drawn" 출력
    }
}

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String t1 = sc.next();
        String t2 = sc.next();
        Drawable d1 = t1.equals("square") ? new Square() : new Circle();
        Drawable d2 = t2.equals("square") ? new Square() : new Circle();
        d1.draw();
        if (d1 instanceof Rotatable) { // d1이 Rotatable 인터페이스(또는 그 하위 타입)를 실제로 구현한 객체인지 확인
            // TODO: d1 객체를 활용하여 rotate() 메서드를 호출한다.
        }
        d2.draw();
        if (d2 instanceof Rotatable) { // d2이 Rotatable 인터페이스(또는 그 하위 타입)를 실제로 구현한 객체인지 확인
            // TODO: d2 객체를 활용하여 rotate() 메서드를 호출한다.
        }
    }
}

```