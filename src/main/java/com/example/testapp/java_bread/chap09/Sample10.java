package com.example.testapp.java_bread.chap09;

import java.util.UUID;

public class Sample10 {
    public static void main(String[] args) {
        String legacyKey = Util.getRandom();
        System.out.printf("레거시 시스템에서 처리될 키값은 %s 입니다.\n\n", legacyKey);

        for (int i = 0; i < 5; i++) {
            String key = NewUtil.getRandom();
            System.out.printf("새로운 시스템에서 처리될 키값은 %s 입니다.\n", key);
        }
    }
}

class LagacyUtil {
    public static String getRandom() {
        return "" + (int) (Math.random() * 10 + 1);
    }
}

class NewUtil extends Util {
    public static String getRandom() {
        return "" + UUID.randomUUID();
    }
}