package main.java.workbook3.thissuper;

import java.util.Scanner;

abstract class Building {
    int floors;
    Building(int floors) {
        this.floors = floors;
    }
    abstract void showInfo();
}

class House extends Building {
    // showInfo()에서 사용하는 floors는 자식 클래스에 따로 선언되지 않았기 때문에
    // 부모 Building 클래스의 floors 필드를 참조한다.
    House(int floors) { super(floors); }

    @Override
    void showInfo() { System.out.println(floors + " " + "주거"); }
}

class Office extends Building {
    // showInfo()에서 사용하는 floors는 자식 클래스에 따로 선언되지 않았기 때문에
    // 부모 Building 클래스의 floors 필드를 참조한다.
    Office(int floors) { super(floors); }

    @Override
    void showInfo() { System.out.println(floors + " " + "업무"); }
}



public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String type1 = sc.next();
        int f1 = sc.nextInt();
        String type2 = sc.next();
        int f2 = sc.nextInt();
        Building b1 = type1.equals("house") ? new House(f1) : new Office(f1);
        Building b2 = type2.equals("house") ? new House(f2) : new Office(f2);
        b1.showInfo();
        b2.showInfo();
    }
}