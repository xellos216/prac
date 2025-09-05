package main.java.workbook2.returntype;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class Person {
    String name;
    int age;
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class Q5 {
    public static Person olderPerson(Person p1, Person p2) {
      return (p1.age > p2.age) ? p1 : p2;
//      return Collections.max(Arrays.asList(p1, p2), Comparator.comparingInt(p -> p.age));
//      return Arrays.asList(p1, p2).stream().max(Comparator.comparingInt(p -> p.age)).get();
        }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name1 = sc.next();
        int age1 = sc.nextInt();
        String name2 = sc.next();
        int age2 = sc.nextInt();
        Person p1 = new Person(name1, age1);
        Person p2 = new Person(name2, age2);
        Person older = olderPerson(p1, p2);

        System.out.println(older.name + " " + older.age);
    }
}