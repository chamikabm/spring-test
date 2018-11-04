package com.spring.handson;

public class TrachCoach implements Coach {

    private FourtuneService fourtuneService;

    public TrachCoach(FourtuneService fourtuneService) {
        this.fourtuneService = fourtuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Run Hard 5K";
    }

    @Override
    public String getDailyFortune() {
        return fourtuneService.getFortune();
    }
}
