package com.spring.handson;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/spring/handson/applicationContext.xml");

        Coach coach = context.getBean("myCoach", Coach.class);
        System.out.println(coach.getDailyWorkout());
        System.out.println(coach.getDailyFortune());

        Coach cricketCoach = context.getBean("myCricketCoach", Coach.class);
        System.out.println(cricketCoach.getDailyWorkout());
        System.out.println(cricketCoach.getDailyFortune());

        context.close();
    }
}
