package main.java.workbook3.exception;

import java.util.Scanner;

class FileMissingException extends Exception {
    FileMissingException(String msg) {
        super(msg);
    }
}

public class Q6 {
    static void openFile(String name) throws FileMissingException {
        if (name.equals("existed")) {
            System.out.println("File opened");
        } else {
            throw new FileMissingException("File not found");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String filename = sc.next();
        try {
            openFile(filename);
        } catch (FileMissingException e) {
            System.out.println("File not found");
        }
    }
}
