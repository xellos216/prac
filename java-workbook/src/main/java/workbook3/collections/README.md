`ArrayList`는 크기가 변하는 배열을 제공하며 데이터를 순차적으로 저장합니다. `HashMap`은 키-값 쌍을 저장하는 맵 구현체로 키가 유일해야 합니다. `HashSet`은 중복을 허용하지 않는 집합 자료 구조입니다.

### 초급 문제 1

**문제 설명:** 문자열을 N개 입력받아 `ArrayList`에 저장한 후 모든 원소를 순서대로 출력하는 프로그램을 작성하시오.

**입력 예시:**

```
3
apple banana cherry
```

**출력 예시:**

```
apple
banana
cherry
```

**조건:**

- `ArrayList<String>`을 사용합니다.

```java
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // TODO: 입력받은 문자열을 N개를 ArrayList에 저장한 후 모든 원소를 순서대로 출력하는 프로그램을 작성하시오.
    }
}
```

### 초급 문제 2

**문제 설명:** 정수 N을 입력받아 1부터 N까지의 값을 `ArrayList`에 저장하고, 역순으로 출력하는 프로그램을 작성하시오.

**입력 예시:**

```
5
```

**출력 예시:**

```
5 4 3 2 1
```

**조건:**

- `for` 루프를 이용하여 역순으로 출력합니다.

```java
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        for(int i=1;i<=n;i++) list.add(i);
        // TODO: list를 역순으로 출력
    }
}
```

### 중급 문제 3

**문제 설명:** 문자열과 정수 쌍을 N개 입력받아 `HashMap<String,Integer>`에 저장한 후, 주어진 키에 대한 값을 출력하는 프로그램을 작성하시오.

**입력 예시:**

```
3
apple 3
banana 5
cherry 2
banana
```

**출력 예시:**

```
5
```

**조건:**

- `HashMap`의 `get()` 메서드를 사용합니다.

```java
import java.util.Map;
import java.util.Scanner;
import java.util.HashMap;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // TODO: 문자열과 정수 쌍을 N개 입력받아 HashMap<String,Integer>에 저장한 후, 주어진 키에 대한 값을 출력하는 프로그램을 작성하시오.
        for(int i=0;i<n;i++) {
            String key = sc.next();
            int val = sc.nextInt();
        }
        String query = sc.next();
    }
}
```

### 중급 문제 4

**문제 설명:** 키-값 쌍을 입력받아 `HashMap`에 저장하고, 모든 키와 값의 목록을 각각 출력하는 프로그램을 작성하시오.

**입력 예시:**

```
2
A 1
B 2
```

**출출력 예시:**

```
A B
1 2
```

**조건:**

- `keySet()`과 `values()` 메서드를 사용합니다.

```java
import java.util.Map;
import java.util.Scanner;
import java.util.HashMap;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Map<String,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(sc.next(), sc.nextInt());
        }
        // TODO: map의 키와 값 목록 출력
    }
}
```

### 고급 문제 5

**문제 설명:** 중복된 정수를 제거하기 위해 N개의 정수를 입력받아 `HashSet`에 저장하고, 집합에 저장된 값을 오름차순으로 출력하는 프로그램을 작성하시오.

**입력 예시:**

```
5
3 1 2 3 2
```

**출력 예시:**

```
1 2 3
```

**조건:**

- `HashSet`과 `ArrayList`를 조합하여 정렬 후 출력합니다.

```java
import java.util.*;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<n;i++) {
            set.add(sc.nextInt());
        }
        // TODO: 집합에 저장된 값을 오름차순으로 출력하는 프로그램을 작성하시오. (HashSet과 ArrayList를 조합하여 정렬)
    }
}

```

### 고급 문제 6

**문제 설명:** 두 개의 `ArrayList`를 입력받아 합집합과 교집합을 각각 구하여 출력하는 프로그램을 작성하시오.

**입력 예시:**

```
3
1 2 3
3
3 4 5
```

**출력 예시:**

```
1 2 3 4 5
3
```

**조건:**

- `HashSet`을 이용하여 합집합과 교집합을 구합니다.

```java
import java.util.*;

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        ArrayList<Integer> list1 = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list1.add(sc.nextInt());
        }

        int m = sc.nextInt();
        ArrayList<Integer> list2 = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            list2.add(sc.nextInt());
        }

        // TODO: 합집합과 교집합 구해 출력
    }
}
```