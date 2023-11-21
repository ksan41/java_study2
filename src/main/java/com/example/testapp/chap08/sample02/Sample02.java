package com.example.testapp.chap08.sample02;

public class Sample02 {
    
    public static void main(String agrs[]) {
        VO vo = new VO();
        vo.name = "빵형";
        vo.age = 21;

        System.out.printf("%s은 %d살\n", vo.name, vo.age);
        System.out.printf("%d + %d = %d", VO.ONE, VO.TWO, VO.THREE);
    }
}
