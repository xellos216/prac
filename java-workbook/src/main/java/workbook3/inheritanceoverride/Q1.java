package main.java.workbook3.inheritanceoverride;

class Animal {
    String name;
    void eat() {
        System.out.println("Eating...");
    }
}

class Dog extends Animal {
    public Dog() {
        super.name = "Jim"; // super 키워드 맛보기
    }
    void bark() {
        System.out.println("Barking...");
    }
}

public class Q1 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        System.out.println("dog.name = " + dog.name);
        dog.eat();
        dog.bark();
    }
}
