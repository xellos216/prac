package main.java.workbook3.collections;

import java.util.*;

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        ArrayList<Integer> list1 = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list1.add(sc.nextInt());
        }

        int m = sc.nextInt();
        ArrayList<Integer> list2 = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            list2.add(sc.nextInt());
        }

        Set<Integer> set1 = new HashSet<>(list1);
        Set<Integer> set2 = new HashSet<>(list2);

        Set<Integer> union = new HashSet<>(set1);
        union.addAll(set2);

        Set<Integer> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);

        System.out.println("union : " + union);
        System.out.println("intersection : " + intersection);

    }
}