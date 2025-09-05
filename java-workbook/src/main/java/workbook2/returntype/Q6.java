package main.java.workbook2.returntype;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class Student {
    String name;
    int score;

    Student(String name, int score) {
        this.name = name;
        this.score = score;
    }
}

public class Q6 {
    public static Student bestStudent(Student s1, Student s2, Student s3) {
        return Collections.max(Arrays.asList(s1, s2, s3), Comparator.comparingInt(s -> s.score));
//      return (s1.score > s2.score && s1.score > s3.score) ? s1 : (s2.score > s3.score) ? s2 : s3;
//      return Arrays.asList(s1, s2, s3).stream().max(Comparator.comparingInt(s -> s.score)).get();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n1 = sc.next();
        int s1 = sc.nextInt();
        String n2 = sc.next();
        int s2 = sc.nextInt();
        String n3 = sc.next();
        int s3 = sc.nextInt();
        Student st = bestStudent(new Student(n1, s1), new Student(n2, s2), new Student(n3, s3));

        System.out.println(st.name + " " + st.score);
    }
}
