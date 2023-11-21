package com.example.testapp.chap08;

public class Sample06 {
    static int sum;

    public static void main(String[] args) {
        System.out.println(sum(10));
    }

    public static int sum(int a) {
        sum += a;
        if (a == 0) {
            return sum;
        } else {
            a--;
            return sum(a);
        }
    }
}
