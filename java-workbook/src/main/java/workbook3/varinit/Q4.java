package main.java.workbook3.varinit;

import java.util.Random;

class RandomInit {
    Random rand = new Random();
    int[] arr = new int[5];

    {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(10);
        }
    }

    void printArray() {
        for (int n : arr) System.out.print(n + " ");
    }
}

public class Q4 {
    public static void main(String[] args) {
        RandomInit obj = new RandomInit();
        obj.printArray();
    }
}
