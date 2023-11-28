package com.example.testapp.java_bread.chap09.test;

import java.util.Arrays;
import java.util.Collections;

public class Test1 {
    public static void main(String[] args) {
        Integer[] arr = {1, 2, 6, 9, 4};
        Data asc = new AscData();
        asc.sort(arr);

        Data desc = new DescData();
        desc.sort(arr);
    }
}

interface Data {

    public void sort(Integer[] arr);
}

class AscData implements Data {

    @Override
    public void sort(Integer[] arr) {
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }

}

class DescData implements Data {

    @Override
    public void sort(Integer[] arr) {
        Arrays.sort(arr, Collections.reverseOrder());
        System.out.println(Arrays.toString(arr));
    }

}