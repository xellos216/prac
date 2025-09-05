package main.java.workbook3.collections;

import java.util.Map;
import java.util.Scanner;
import java.util.HashMap;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String key = sc.next();
            int val = sc.nextInt();
            map.put(key, val);
        }
        String query = sc.next();
        Integer result = map.get(query);
        System.out.println(result == null ? 0 : result);
    }
}