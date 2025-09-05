package main.java.workbook3.varinit;

class InitDemo {
    int a = 10;
    int b;

    {
        a = 10;
    }

    {
        b = 20;
    }

    InitDemo() {
        int sum = a + b;
        System.out.println(sum);
    }
}

public class Q1 {
    public static void main(String[] args) {
        new InitDemo();
    }
}
