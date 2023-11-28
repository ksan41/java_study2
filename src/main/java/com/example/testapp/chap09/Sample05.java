package com.example.testapp.chap09;

public class Sample05 {
    
    public static void main(String[] args) {
        ICompute a = new Apartment();
        float area = a.compute(30);
        System.out.printf("아파트의 면적은 %f 제곱미터입니다.", area);
    }
}

class Apartment implements ICompute {

    @Override
    public float compute(int area) {
        // pyung++;
        return area * pyung;
    }

}

interface ICompute {

    float pyung = 3.3f;

    float compute(int area);
}
