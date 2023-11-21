package com.example.testapp.chap08.sample13;

/**
 * InnerSample13
 */
interface Greeting {
    public String sayHello(String name);
}

public class Sample13 {
    
    public static void main(String[] args) {
        // 익명 내부 클래스 구현.
        // 이름이 존재하지 않으므로 생성자도 없음
        // 하나의 인터페이스로 구현하거나 추상 클래스로부터 상속받아서 구현할 수 밖에 없음
        Greeting greeting = new Greeting() {

            @Override
            public String sayHello(String name) {
                return name + " 안녕!";
            }
            
        };

        System.out.println(greeting.sayHello("빵형"));
    }
}
