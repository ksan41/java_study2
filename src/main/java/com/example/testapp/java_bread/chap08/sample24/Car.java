package com.example.testapp.java_bread.chap08.sample24;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor // final 이나 NonNull 필드만 생성자에 포함
public class Car {
    
    @NonNull
    private String color;
    private int doors;
    private String manufacturer;
}
