package main.java.workbook3.accesslevel;

import java.util.Scanner;

class SecureFile {
    private final String fileName;

    SecureFile(String fileName) {
        this.fileName = fileName;
    }

    public void read(boolean hasPermission) {
        if (hasPermission) System.out.println(fileName);
        else System.out.println("You don't have permission to read this file.");
    }
}

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String file = sc.next();
        String p1 = sc.next();
        String p2 = sc.next();
        SecureFile sf = new SecureFile(file);
        sf.read("granted".equals(p1));
        sf.read("granted".equals(p2));
//      sf.read(p1.equals("granted"));
//      sf.read(p2.equals("granted"));
    }
}

// NPE == Null Pointer Exception