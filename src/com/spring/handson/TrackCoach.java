package com.spring.handson;

public class TrackCoach implements Coach {

    private FourtuneService fortuneService;

    public TrackCoach(FourtuneService fortuneService) {
        System.out.println("Hello!! Initializing the Track Coach.");
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
