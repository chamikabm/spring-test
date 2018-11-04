package com.spring.handson;

public class CricketCoach implements Coach {
    private FourtuneService fortuneService;

    public CricketCoach() {
        System.out.println("Hey this is Cricket Coach No Arg Constructor.");
    }

    public void setFortuneService(FourtuneService fourtuneService) {
        System.out.println("Hello this is the set method for cricket coach.");
        this.fortuneService = fourtuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Do catch practices";
    }

    @Override
    public String getDailyFortune() {
        return "This is Cricket Daily Fortune " + fortuneService.getFortune();
    }
}
