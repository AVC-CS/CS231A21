package com.example.project;

import java.util.Scanner;

public class A21 {

    static int getMed(int n1, int n2, int n3) {
        int result = 0;

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();

        int result = getMed(n1, n2, n3);
        System.out.println("Result Median " + result);
        sc.close();
    }
}
