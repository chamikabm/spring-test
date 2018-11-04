package com.spring.handson;

public class HappyFortuneService implements FourtuneService {
    @Override
    public String getFortune() {
        return "Today is Your Lucky Day!!";
    }
}
