다형성은 동일한 인터페이스를 통해 여러 형태의 객체를 다룰 수 있게 하며, 오버라이딩과 오버로딩으로 구현됩니다.

### 초급 문제 1

**문제 설명:** `Animal` 배열을 생성하여 `Dog`와 `Cat` 객체를 저장하고, 반복문을 통해 `sound()` 메서드를 호출하여 서로 다른 소리를 출력한다. (코드 관찰하기)

**입력 예시:**

```
dog cat dog
```

**출력 예시:**

```
Woof
Meow
Woof
```

**조건:**

- 부모 타입 배열에 자식 객체를 저장하여 다형성을 확인합니다.

```java
import java.util.Scanner;

abstract class Animal {
    abstract void sound();
}

class Dog extends Animal {
    void sound() {
        System.out.println("Woof");
    }
}

class Cat extends Animal {
    void sound() {
        System.out.println("Meow");
    }
}

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Animal[] animals = new Animal[3];
        for (int i = 0; i < 3; i++) {
            String t = sc.next();
            animals[i] = t.equals("dog") ? new Dog() : new Cat();
        }
        for (Animal a : animals) {
            a.sound();
        }
    }
}

```

### 초급 문제 2

**문제 설명:** `Language` 클래스를 상속한 `JavaLanguage`와 `PythonLanguage` 클래스를 설계하고, 배열을 사용하여 다형적으로 `displayInfo()`를 호출한다. (코드 관찰하기)

**입력 예시:**

```
java python java
```

**출력 예시:**

```
This is Java language
This is Python language
This is Java language
```

**조건:**

- `displayInfo()`는 각 언어에 맞는 메시지를 출력합니다.

```java
import java.util.Scanner;

abstract class Language {
    abstract void displayInfo();
}

class JavaLanguage extends Language {
    void displayInfo() {
        System.out.println("This is Java language");
    }
}

class PythonLanguage extends Language {
    void displayInfo() {
        System.out.println("This is Python language");
    }
}

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Language[] arr = new Language[3];
        for (int i = 0; i < 3; i++) {
            String type = sc.next();
            arr[i] = type.equals("java") ? new JavaLanguage() : new PythonLanguage();
        }
        for (Language lang : arr) {
            lang.displayInfo();
        }
    }
}

```

### 중급 문제 3

**문제 설명:** `Shape` 추상 클래스와 이를 상속한 `Circle`, `Square` 클래스에서, 배열을 통해 다형적으로 `area()`를 호출하여 각각의 넓이를 출력하는 프로그램을 작성하시오. (코드 관찰하기)

**입력 예시:**

```
circle 2 square 3 circle 1
```

**출력 예시:**

```
12.566370614359172
9
3.141592653589793
```

**조건:**

- `area()`를 각 클래스에서 오버라이딩합니다.

```java
import java.util.Scanner;

abstract class Shape {
    abstract double area();
}

class Circle extends Shape {
    double r;

    Circle(double r) {
        this.r = r;
    }

    double area() {
        return Math.PI * r * r;
    }
}

class Square extends Shape {
    double s;

    Square(double s) {
        this.s = s;
    }

    double area() {
        return s * s;
    }
}

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Shape[] list = new Shape[3];
        for (int i = 0; i < 3; i++) {
            String type = sc.next();
            if (type.equals("circle")) {
                list[i] = new Circle(sc.nextDouble());
            } else {
                list[i] = new Square(sc.nextDouble());
            }
        }
        for (Shape s : list) {
            System.out.println(s.area());
        }
    }
}
```

### 중급 문제 4

**문제 설명:** 인터페이스 `Renderer`를 정의하고, `SquareRenderer`와 `CircleRenderer`가 구현하여 다형적으로 `render()`를 호출한다.

**입력 예시:**

```
square circle square
```

**출력 예시:**

```
Render square
Render circle
Render square
```

**조건:**

- 인터페이스 타입 배열을 사용하여 `render()`를 호출합니다.

```java
import java.util.Scanner;

interface Renderer {
    void render();
}

class SquareRenderer implements Renderer {
    public void render() {
        System.out.println("Render square");
    }
}

class CircleRenderer implements Renderer {
    public void render() {
        System.out.println("Render circle");
    }
}

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // TODO: 배열의 크기가 3인 Renderer 인터페이스 타입 배열을 선언, 변수명은 arr
        for (int i = 0; i < 3; i++) {
            String t = sc.next();
            // TODO: t 입력값이 "square"인 경우 SquareRenderer 타입 객체 아니면 CircleRenderer 타입 객체를 arr 배열에 추가합니다.
        }
        // TODO: arr 배열에 추가된 객체들의 render() 메서드를 호출합니다.
    }
}

```

### [다형성] - 고급 문제 5

**문제 설명:** `Polygon` 클래스를 상속한 `Triangle`, `Rectangle` 두 클래스가 `perimeter()`와 `area()` 메서드를 오버라이딩한다. 사용자가 도형의 종류와 크기를 입력하면 다형적으로 면적과 둘레를 출력한다.

**입력 예시:**

```
2
triangle 3 4 5
rect 4 5
```

**출력 예시:**

```
6.0 12.0
20.0 18.0
```

**조건:**

- `Polygon`은 추상 클래스로 `area()`와 `perimeter()`를 추상 메서드로 선언합니다.

```java
import java.util.Scanner;

abstract class Polygon {
    abstract double area();
    abstract double perimeter();
}

class Triangle extends Polygon {
    double a, b, c;

    Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    double area() {
        return Math.sqrt(perimeter() / 2 * (perimeter() / 2 - a) * (perimeter() / 2 - b) * (perimeter() / 2 - c));
    }

    double perimeter() {
        return a + b + c;
    }
}

class Rectangle extends Polygon {
    double w, h;

    Rectangle(double w, double h) {
        this.w = w;
        this.h = h;
    }

    double area() {
        return w * h;
    }

    double perimeter() {
        return 2 * (w + h);
    }
}

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        for (int i = 0; i < k; i++) {
            String t = sc.next();
            // TODO: 입력받은 t의 값에 따라 Polygon 타입의 참조변수 p 에 알맞은 구현체를 넣어(참조해)줍니다.
            // TODO: triangle은 세변 a, b, c를 입력받습니다.
            // TODO: rect은 넓이(w)와 높이(h) 값을 입력받습니다.
            // TODO: System.out.println(p.area() + " " + p.perimeter()); 를 선언하여 면적과 둘레를 출력한다.
        }
    }
}
```

### 고급 문제 6

**문제 설명:** 인터페이스 `Playable`과 이를 구현한 `Piano`, `Guitar`, `Drum` 클래스를 생성하고, `Playable` 배열을 통해 다형적으로 `play()`를 호출한다. 각 클래스는 다른 메시지를 출력한다.

**입력 예시:**

```
piano drum guitar
```

**출력 예시:**

```
Piano plays
Drum plays
Guitar plays
```

**조건:**

- 배열의 각 요소 타입은 인터페이스 `Playable`입니다.

```java
import java.util.Scanner;

interface Playable {
    void play();
}

class Piano implements Playable {
    public void play() {
        System.out.println("Piano plays");
    }
}

class Guitar implements Playable {
    public void play() {
        System.out.println("Guitar plays");
    }
}

class Drum implements Playable {
    public void play() {
        System.out.println("Drum plays");
    }
}

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // TODO: 배열의 크기가 3인 Playable 인터페이스 타입 배열을 선언, 변수명은 instruments
        for (int i = 0; i < 3; i++) {
            String t = sc.next();
            // TODO: t 입력값이 "piano"인 경우 Piano 타입 객체, "guitar"인 경우 Guitar 타입 객체, "drum"인 경우 Drum 타입 객체를 instruments 배열에 추가합니다.
        }
        // TODO: instruments 배열에 추가된 객체들의 play() 메서드를 호출합니다.
    }
}
```