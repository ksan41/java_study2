package com.example.testapp.java_bread.chap08.sample03;

public class Compute {
    int result;

    void setValue(int val) {
        result += val;
    }

    void setValue(int val1, int val2) {
        result += val1 + val2;
    }

    int getValue() {
        return result;
    }
}
