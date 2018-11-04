package com.spring.handson;

public class CricketCoach implements Coach {
    private FourtuneService fortuneService;
    private String emailAddress;
    private String team;

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

    public void setEmailAddress(String emailAddress) {
        System.out.println("Hello!! Cricket coach setting up email.");
        this.emailAddress = emailAddress;
    }

    public void setTeam(String team) {
        System.out.println("Hello!! Cricket coach setting up team");
        this.team = team;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public String getTeam() {
        return team;
    }
}
