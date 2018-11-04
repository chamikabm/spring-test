package com.spring.handson;

public class BaseballCoach implements Coach {

    private FourtuneService fourtuneService;

    public BaseballCoach(FourtuneService fourtuneService) {
        this.fourtuneService = fourtuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Spend 30 min on Batting Practices.";
    }

    @Override
    public String getDailyFortune() {
        return fourtuneService.getFortune();
    }
}
