package main.java.workbook2.varcompare;

class Counter {
    static int count = 0;
    int id;
    Counter() {
        count++;
        this.id = count;
    }
}

public class Q1 {
    public static void main(String[] args) {
        Counter c1 = new Counter();
        System.out.println(c1.id + " " + Counter.count);
        Counter c2 = new Counter();
        System.out.println(c2.id + " " + Counter.count);
    }
}
