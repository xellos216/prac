package main.java.workbook2.varscope;

class Counter {
    static int count = 0;
    int id;
    Counter() {
        count++;
        this.id = count;
    }
}

public class Q3 {
    public static void main(String[] args) {
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();

        System.out.println(c3.id + " " + Counter.count);
    }
}