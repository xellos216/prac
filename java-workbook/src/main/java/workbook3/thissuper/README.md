`this`는 현재 객체를 가리키며 인스턴스 변수·메서드를 참조하거나 **`this( )`** 로 같은 클래스의 다른 생성자를 호출해 생성자 체이닝에 쓰입니다.

`super`는 부모 클래스의 멤버를 참조하며 **`super( )`** 로 상위 클래스 생성자를 호출해 상속 계층의 초기화를 담당합니다.

### 초급 문제 1

**문제 설명:** `Person` 클래스에서 `this`를 사용하여 이름과 나이를 초기화하고, `printInfo()` 메서드에서 `this`를 사용해 필드를 출력하는 프로그램을 작성하시오.

**입력 예시:**

```
Alice 25
```

**출력 예시:**

```
Alice 25
```

**조건:**

- 생성자에서 `this.name = name` 패턴을 사용합니다.

```java
import java.util.Scanner;

class Person {
    String name;
    int age;
    Person(String name, int age) {
        // TODO: this 사용해 초기화
    }
    void printInfo() {
        // TODO: this를 사용하여 필드 출력
    }
}

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        int a = sc.nextInt();
        Person p = new Person(n, a);
        p.printInfo();
    }
}
```

### 초급 문제 2

**문제 설명:** 두 개의 생성자를 가진 클래스 `Box`를 설계한다. 기본 생성자는 다른 생성자를 호출하여 가로, 세로, 높이를 모두 1로 초기화한다. `main`에서 기본 생성자와 매개변수 생성자를 통해 객체를 생성하고 크기를 출력한다.

**입력 예시:**

```
2 3 4
```

**출력 예시:**

```
1 1 1
2 3 4
```

**조건:**

- 생성자 체이닝을 위해 `this(...)`를 사용합니다.

```java
import java.util.Scanner;

class Box {
    int width, height, depth;
    Box() {
        // TODO: 매개변수 생성자 호출하여 1,1,1로 초기화
    }
    Box(int w, int h, int d) {
        // TODO: 멤버 초기화
    }
}

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int w = sc.nextInt();
        int h = sc.nextInt();
        int d = sc.nextInt();
        Box b1 = new Box();
        Box b2 = new Box(w, h, d);
        System.out.println(b1.width + " " + b1.height + " " + b1.depth);
        System.out.println(b2.width + " " + b2.height + " " + b2.depth);
    }
}
```

### 중급 문제 3

**문제 설명:** `Animal` 클래스에서 이름을 필드로 갖고, `Dog` 클래스가 이를 상속받으며 생성자에서 `super`를 사용해 부모의 생성자를 호출한다. `Dog` 객체 생성 시 부모 생성자와 자식 생성자가 모두 호출되는지 확인한다.

**입력 예시:**

```
Buddy
```

**출출력 예시:**

```
Animal constructor
Dog constructor
Buddy
```

**조건:**

- 부모 클래스는 생성자에서 “Animal constructor”를 출력하고, 자식 클래스는 “Dog constructor”를 출력합니다.

```java
import java.util.Scanner;

class Animal {
    String name;

    Animal(String name) {
        System.out.println("Animal constructor");
        this.name = name;
    }
}

class Dog /* TODO: Animal 클래스 상속 */ {
    Dog(String name) {
        // TODO: super() 호출
        System.out.println("Dog constructor");
    }
}

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
         Dog dog = new Dog(n);
         // TODO: Dog 클래스 완성 후 아래 주석 해제
         // System.out.println(dog.name);
    }
}
```

### 중급 문제 4

**문제 설명:** `Employee` 클래스의 `printInfo()` 메서드를 `Manager` 클래스에서 오버라이딩하여, `super`를 사용해 부모의 `printInfo()`를 호출하고 추가 정보를 출력하는 프로그램을 작성하시오.

**입력 예시:**

```
Alice HR 50000 Sales
```

**출력 예시:**

```
Name: Alice, Dept: HR, Salary: 50000, Team: Sales
```

**조건:**

- `Employee` 클래스는 이름, 부서, 연봉을 필드로 갖고 `printInfo()`를 정의한다.
- `Manager` 클래스는 `team` 필드를 추가하고 정보를 출력할 때 `super.printInfo()`를 호출한 뒤 팀 정보를 출력한다.

```java
import java.util.Scanner;

class Employee {
    String name, dept;
    int salary;

    Employee(String name, String dept, int salary) {
        // TODO: 필드 초기화
    }

    void printInfo() {
        System.out.print("Name: " + name + ", Dept: " + dept + ", Salary: " + salary);
    }
}

class Manager /* TODO: Employee 상속 */ {
    String team;

    Manager(String name, String dept, int salary, String team) {
        // TODO: super() 호출 및 team 초기화
    }

    void printInfo() {
        // TODO: super.printInfo() 호출 후 팀 정보 출력
    }
}

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        String d = sc.next();
        int s = sc.nextInt();
        String t = sc.next();
        Manager m = new Manager(n, d, s, t);
        m.printInfo();
    }
}

```

### 고급 문제 5

**문제 설명:** `Vehicle` 클래스와 이를 상속한 `Car` 클래스에서, `Car` 생성자에서 `super`를 사용하여 `Vehicle`의 생성자를 호출하고, `toString()` 메서드를 오버라이딩하여 부모 정보와 자식 정보를 모두 반환하는 프로그램을 작성하시오.

**입력 예시:**

```
Sedan 2021 Gasoline
```

**출력 예시:**

```
Model: Sedan, Year: 2021, Fuel: Gasoline
```

**조건:**

- `Vehicle` 클래스는 모델명과 연식을 필드로 갖고, `toString()`을 정의합니다.
- `Car`는 연료 타입을 추가로 갖고, `toString()`을 오버라이딩합니다.

```java
import java.util.Scanner;

class Vehicle {
    String model;
    int year;
    Vehicle(String model, int year) {
        this.model = model;
        this.year = year;
    }
    public String toString() {
        return "Model: " + model + ", Year: " + year;
    }
}

class Car /* TODO: Vehicle 클래스 상속 */ {
    String fuel;
    Car(String model, int year, String fuel) {
        // TODO: super() 호출 및 fuel 초기화
    }
    public String toString() {
        // TODO: super 키워드 활용해서 Model, Year 정보와 함께 Fuel: " + fuel 출력
        return "";
    }
}

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String model = sc.next();
        int year = sc.nextInt();
        String fuel = sc.next();
        Car car = new Car(model, year, fuel);
        System.out.println(car.toString());
    }
}
```

### 고급 문제 6

**문제 설명:** `Building` 클래스와 이를 상속한 `House`와 `Office` 클래스에서 층수와 용도를 필드로 갖고, `showInfo()` 메서드를 오버라이딩한다. `House`에서는 “층수, 주거”를, `Office`에서는 “층수, 업무”를 출력한다. 생성자에서 `super`를 사용한다.

**입력 예시:**

```
house 3 office 5
```

**출력 예시:**

```
3 주거
5 업무
```

**조건:**

- `Building` 클래스는 층수만 필드로 갖고 `showInfo()`를 추상 메서드로 정의합니다.
- `House`와 `Office`는 각자의 용도를 출력합니다.

```java
import java.util.Scanner;

abstract class Building {
    int floors;

    Building(int floors) {
        this.floors = floors;
    }

    abstract void showInfo();
}

class House /* TODO: Building 상속 */ {
    House(int floors) {
        // TODO: super() 호출
    }

    void showInfo() {
        // TODO: "층수, 주거" 출력
    }
}

class Office /* TODO: Building 상속 */ {
    Office(int floors) {
        // TODO: super() 호출
    }

    void showInfo() {
        // TODO: "층수, 업무" 출력
    }
}

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String type1 = sc.next();
        int f1 = sc.nextInt();
        String type2 = sc.next();
        int f2 = sc.nextInt();
        // TODO: 위 House 및 Office 클래스 구현 완료 후 아래 주석 해제
        /*
        Building b1 = type1.equals("house") ? new House(f1) : new Office(f1);
        Building b2 = type2.equals("house") ? new House(f2) : new Office(f2);
        b1.showInfo();
        b2.showInfo();
       */
    }
}
```