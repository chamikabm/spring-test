package com.spring.handson;

public class BaseballCoach implements Coach {

    private FourtuneService fortuneService;

    public BaseballCoach(FourtuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Spend 30 min on Batting Practices.";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
