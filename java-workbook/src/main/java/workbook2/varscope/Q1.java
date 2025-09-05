package main.java.workbook2.varscope;

class Sample {
    static String classVar = "class";
    String instanceVar = "instance";
    void printLocal() {
        String localVar = "local";
        System.out.println(localVar);
    }
}

public class Q1 {
    public static void main(String[] args) {
        Sample s = new Sample();
        s.printLocal();
        System.out.println(s.instanceVar);
        System.out.println(Sample.classVar);
    }
}