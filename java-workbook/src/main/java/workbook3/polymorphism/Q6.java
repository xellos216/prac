package main.java.workbook3.polymorphism;

import java.util.Scanner;

interface Playable {
    void play();
}

class Piano implements Playable {
    public void play() {
        System.out.println("Piano plays");
    }
}

class Guitar implements Playable {
    public void play() {
        System.out.println("Guitar plays");
    }
}

class Drum implements Playable {
    public void play() {
        System.out.println("Drum plays");
    }
}

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Playable[] instruments = new Playable[3];
        for (int i = 0; i < 3; i++) {
            String t = sc.next();
            if (t.equals("piano")) instruments[i] = new Piano();
            else if (t.equals("guitar")) instruments[i] = new Guitar();
            else if (t.equals("drum")) instruments[i] = new Drum();
        }
        for (Playable p : instruments) p.play();
    }
}
