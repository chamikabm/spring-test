package com.spring.handson;

public class TrachCoach implements Coach {

    private FourtuneService fortuneService;

    public TrachCoach(FourtuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Run Hard 5K";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
