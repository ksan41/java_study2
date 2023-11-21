package com.example.testapp.chap08.sample03;

public class Sample03 {
    
    public static void main(String[] args) {
        // Data data = new Data();
        // data.setValue(10);

        // System.out.println(data.getValue());

        Compute cmpt = new Compute();
        cmpt.setValue(4);
        cmpt.setValue(10, 2);
        System.out.println(cmpt.getValue());
    }
}
