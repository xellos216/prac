자바의 접근 제어자는 public, private, protected, default 네 가지이며, 접근 범위를 제어하여 캡슐화를 구현합니다.

### 초급 문제 1

**문제 설명:** `Account` 클래스에서 잔액(balance)을 private으로 선언하고, 입금과 출금을 위한 public 메서드를 작성하여 잔액을 안전하게 조작하는 프로그램을 작성하시오.

**입력 예시:**

```
1000 deposit 500 withdraw 700
```

**출력 예시:**

```
800
```

**조건:**

- 잔액은 private이며, 직접 접근할 수 없습니다.

```java
import java.util.Scanner;

class Account {
    private int balance;
    Account(int balance) {
        this.balance = balance;
    }
    public void deposit(int amount) {
        // TODO: balance 증가
    }
    public void withdraw(int amount) {
        // TODO: balance 감소
    }
    public int getBalance() {
        return balance;
    }
}

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bal = sc.nextInt();
        String cmd1 = sc.next();
        int amt1 = sc.nextInt();
        String cmd2 = sc.next();
        int amt2 = sc.nextInt();
        Account acc = new Account(bal);
        if (cmd1.equals("deposit")) {
            acc.deposit(amt1);
        } else {
            acc.withdraw(amt1);
        }
        if (cmd2.equals("deposit")) {
            acc.deposit(amt2);
        } else {
            acc.withdraw(amt2);
        }
        System.out.println(acc.getBalance());
    }
}
```

### 초급 문제 2

**문제 설명:** 클래스 `Student`에서 이름(name)은 private으로 두고, public 메서드를 통해 값을 설정(setName)하고 얻는(getName) 프로그램을 작성하시오.

**입력 예시:**

```
Alice
```

**출력 예시:**

```
Alice
```

**조건:**

- setter와 getter를 사용합니다.

```java
import java.util.Scanner;

class Student {
    private String name;
    public void setName(String name) {
        // TODO: name 설정
    }
    public String getName() {
        // TODO: name 반환
        return "";
    }
}

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        Student s = new Student();
        s.setName(n);
        System.out.println(s.getName());
    }
}
```

### 중급 문제 3

**문제 설명:** `Employee` 클래스를 설계하여 이름(name)은 public, 연봉(salary)은 private로 선언하고, 연봉을 읽고 설정할 수 있는 public 메서드를 작성한다. 두 명의 직원의 정보를 입력받아 첫 번째 직원의 연봉을 증가시키고 두 직원의 연봉을 출력한다.

**입력 예시:**

```
Alice 30000 Bob 40000 5000
```

**출력 예시:**

```
35000 40000
```

**조건:**

- 연봉 증가는 setter를 통해 구현합니다.

```java
import java.util.Scanner;

class Employee {
    public String name;
    private int salary;

    Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        // TODO: salary 설정
    }
}

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n1 = sc.next();
        int s1 = sc.nextInt();
        String n2 = sc.next();
        int s2 = sc.nextInt();
        int raise = sc.nextInt();
        Employee e1 = new Employee(n1, s1);
        Employee e2 = new Employee(n2, s2);
        e1.setSalary(e1.getSalary() + raise);
        System.out.println(e1.getSalary() + " " + e2.getSalary());
    }
}

```

### 중급 문제 4

**문제 설명:** `LibraryBook` 클래스에서 도서 제목과 저자를 private으로 선언하고, 모든 필드를 읽을 수 있는 public getter 메서드를 작성하시오. 3권의 도서를 입력받아 정보 출력 프로그램을 작성하시오.

**입력 예시:**

```
Title1 Author1
Title2 Author2
Title3 Author3
```

**출력 예시:**

```
Title1 Author1
Title2 Author2
Title3 Author3
```

**조건:**

- Setter는 제공하지 않아 읽기 전용입니다.

```java
import java.util.Scanner;

class LibraryBook {
    String title;
    String author;

    LibraryBook(String title, String author) {
        this.title = title;
        this.author = author;
    }

    // TODO: title getter
    // TODO: author getter
}

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LibraryBook[] books = new LibraryBook[3];
        for (int i = 0; i < 3; i++) {
            String t = sc.next();
            String a = sc.next();
            books[i] = new LibraryBook(t, a);
        }
        // TODO: 등록한 모든 도서들의 title, author를 출력
    }
}
```

### 고급 문제 5

**문제 설명:** `BankAccount` 클래스에서 계좌번호(accountNo)는 public으로, 잔액(balance)은 private으로 선언한다. 계좌번호는 누구나 볼 수 있지만, 잔액은 계좌 주인만 볼 수 있도록 getter 메서드에 비밀번호를 전달하여 일치할 때만 반환하도록 구현한다.

**입력 예시:**

```
12345 1000 
get 1111 
get 2222
```

**출력 예시:**

```
1000
비밀번호 오류
```

**조건:**

- 비밀번호가 맞지 않으면 “비밀번호 오류” 메시지를 출력합니다.

```java
import java.util.Scanner;

class BankAccount {
    public String accountNo;
    private int balance;
    private String password = "1111";

    BankAccount(String accountNo, int balance) {
        this.accountNo = accountNo;
        this.balance = balance;
    }

    public int getBalance(String inputPw) {
        // TODO: 비밀번호가 맞으면 balance 반환, 아니면 -1 반환
        return 0;
    }
}

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String accNo = sc.next();
        int bal = sc.nextInt();
        BankAccount acc = new BankAccount(accNo, bal);

        String cmd1 = sc.next();
        String pw1 = sc.next();
        if (cmd1.equals("get")) {
            int res = acc.getBalance(pw1);
            System.out.println(res >= 0 ? res : "비밀번호 오류");
        }

        String cmd2 = sc.next();
        String pw2 = sc.next();
        if (cmd2.equals("get")) {
            int res = acc.getBalance(pw2);
            System.out.println(res >= 0 ? res : "비밀번호 오류");
        }
    }
}
```

### 고급 문제 6

**문제 설명:** `SecureFile` 클래스에서 파일 이름(fileName)은 private이고, 공개된 `read()` 메서드를 통해서만 읽을 수 있다. 파일 내용을 읽으려면 권한이 필요하며, 권한이 없을 경우 예외 메시지를 출력한다.

**입력 예시:**

```
secret.txt granted denied
```

**출출력 예시:**

```
Reading secret.txt
권한 없음
```

**조건:**

- 권한(boolean type)을 메서드 매개변수로 받아 권한 여부를 검사합니다.

```java
import java.util.Scanner;

class SecureFile {
    private String fileName;
    SecureFile(String fileName) {
        this.fileName = fileName;
    }
    public void read(boolean hasPermission) {
        // TODO: 권한이 있으면 파일 이름 출력, 없으면 "권한 없음" 출력
    }
}

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String file = sc.next();
        String p1 = sc.next();
        String p2 = sc.next();
        SecureFile sf = new SecureFile(file);
        sf.read(p1.equals("granted"));
        sf.read(p2.equals("granted"));
    }
}
```