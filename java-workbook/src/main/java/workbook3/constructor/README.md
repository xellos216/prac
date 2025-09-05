생성자는 객체가 생성될 때 호출되어 필드를 초기화하는 특수한 메서드이며, 오버로딩이 가능합니다.

### 초급 문제 1

**문제 설명:** `Student` 클래스를 설계하여 기본 생성자와 이름을 매개변수로 받는 생성자를 작성하고, 두 방식으로 객체를 생성하여 이름을 출력하는 프로그램을 작성하시오.

**입력 예시:**

```
Alice
```

**출력 예시:**

```
Unknown
Alice
```

**조건:**

- 기본 생성자는 이름을 “Unknown”으로 설정합니다.

```java
import java.util.Scanner;

class Student {
    String name;
    Student() {
        // TODO: name 초기화
    }
    Student(String name) {
        // TODO: name 초기화
    }
}

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        Student s1 = new Student();
        Student s2 = new Student(name);
        // TODO: s1.name과 s2.name 출력
    }
}
```

### 초급 문제 2

**문제 설명:** `Point` 클래스에서 기본 생성자는 (0,0)으로, 매개변수 생성자는 전달된 x, y로 초기화하고, 좌표를 출력하는 프로그램을 작성하시오.

**입력 예시:**

```
3 4
```

**출력 예시:**

```
0 0
3 4
```

**조건:**

- 두 개의 생성자를 오버로딩합니다.

```java
import java.util.Scanner;

class Point {
    int x, y;
    Point() {
        // TODO: 기본 생성자에서 x,y 초기화
    }
    Point(int x, int y) {
        // TODO: 매개변수 생성자에서 x,y 초기화
    }
}

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        Point p1 = new Point();
        Point p2 = new Point(x, y);
        System.out.println(p1.x + " " + p1.y);
        System.out.println(p2.x + " " + p2.y);
    }
}
```

### 중급 문제 3

**문제 설명:** `Car` 클래스에서 모델명과 가격을 매개변수로 받는 생성자, 가격만 받는 생성자(모델명은 “Unknown”으로), 매개변수가 없는 생성자를 작성하고, 객체를 세 종류로 생성하여 출력하는 프로그램을 작성하시오.

**입력 예시:**

```
Sedan 20000
30000
```

**출력 예시:**

```
Unknown 0
Sedan 20000
Unknown 30000
```

**조건:**

- 오버로딩된 생성자를 적절히 호출합니다.

```java
import java.util.Scanner;

class Car {
    String model;
    int price;
    Car() {
        // TODO
    }
    Car(String model, int price) {
        // TODO
    }
    Car(int price) {
        // TODO
    }
}

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String m = sc.next();
        int p1 = sc.nextInt();
        int p2 = sc.nextInt();
        Car c1 = new Car();
        Car c2 = new Car(m, p1);
        Car c3 = new Car(p2);
        System.out.println(c1.model + " " + c1.price);
        System.out.println(c2.model + " " + c2.price);
        System.out.println(c3.model + " " + c3.price);
    }
}
```

### 중급 문제 4

**문제 설명:** `Triangle` 클래스에서 세 변의 길이를 필드로 가지고, 각 변을 매개변수로 받는 생성자와 매개변수가 없는 생성자를 작성한다. 기본 생성자에서는 세 변을 모두 1로 초기화한다. 두 객체의 변을 출력하는 프로그램을 작성하시오.

**입력 예시:**

```
3 4 5
```

**출력 예시:**

```
1 1 1
3 4 5
```

**조건:**

- 생성자 오버로딩을 사용합니다.

```java
import java.util.Scanner;

class Triangle {
    int a, b, c;
    Triangle() {
        // TODO: 기본 생성자에서 a,b,c 초기화
    }
    Triangle(int a, int b, int c) {
        // TODO: 매개변수 생성자에서 a,b,c 초기화
    }
}

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        Triangle t1 = new Triangle();
        Triangle t2 = new Triangle(a, b, c);
        System.out.println(t1.a + " " + t1.b + " " + t1.c);
        System.out.println(t2.a + " " + t2.b + " " + t2.c);
    }
}
```

### 고급 문제 5

**문제 설명:** `Employee` 클래스에서 이름, 부서, 연봉을 매개변수로 받는 생성자와 이름만 받는 생성자, 매개변수가 없는 생성자를 작성하여 각각의 객체를 생성하고 정보를 출력하는 프로그램을 작성하시오.

**입력 예시:**

```
Alice HR 50000
Bob
```

**출력 예시:**

```
Unknown Unknown 0
Alice HR 50000
Bob Unknown 0
```

**조건:**

- 이름만 받는 생성자에서는 부서는 “Unknown”, 연봉은 0으로 설정합니다.

```java
import java.util.Scanner;

class Employee {
    String name;
    String dept;
    int salary;
    Employee() {
        // TODO: 기본값 설정
    }
    Employee(String name, String dept, int salary) {
        // TODO
    }
    Employee(String name) {
        // TODO
    }
}

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name1 = sc.next();
        String dept1 = sc.next();
        int sal1 = sc.nextInt();
        String name2 = sc.next();
        Employee e1 = new Employee();
        Employee e2 = new Employee(name1, dept1, sal1);
        Employee e3 = new Employee(name2);
        System.out.println(e1.name + " " + e1.dept + " " + e1.salary);
        System.out.println(e2.name + " " + e2.dept + " " + e2.salary);
        System.out.println(e3.name + " " + e3.dept + " " + e3.salary);
    }
}
```

### 고급 문제 6

**문제 설명:** `Complex` 클래스에서 실수부(real)와 허수부(imag)를 필드로 갖고, 기본 생성자와 매개변수 두 개를 받는 생성자를 정의한다. 또한 복소수 덧셈 메서드를 구현하여 두 복소수 객체를 더한 결과를 출력하는 프로그램을 작성하시오.

**입력 예시:**

```
1 2 3 4
```

**출력 예시:**

```
4 6
```

**조건:**

- 덧셈 메서드는 새로운 `Complex` 객체를 반환합니다.

```java
import java.util.Scanner;

class Complex {
    int real;
    int imag;
    // TODO: 기본 생성자 생성
    // TODO: 매개변수 생성자 생성
    Complex add(Complex other) {
        // TODO: Complex 각각의 실수부와 허수부끼리 덧셈 후 결과 값을 갖는 새로운 Complex 반환
        return null;
    }
}

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r1 = sc.nextInt();
        int i1 = sc.nextInt();
        int r2 = sc.nextInt();
        int i2 = sc.nextInt();
        // TODO: 생성자 작성 후 아래 주석 해제
        // Complex c1 = new Complex(r1, i1);
        // Complex c2 = new Complex(r2, i2);
        // Complex sum = c1.add(c2);
        // TODO: sum.real과 sum.imag 출력
    }
}

```