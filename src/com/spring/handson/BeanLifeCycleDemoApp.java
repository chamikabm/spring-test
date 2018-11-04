package com.spring.handson;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleDemoApp {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("bean-lifeCycle-applicationContext.xml");

        Coach coach = context.getBean("myLifeCycleCoach", Coach.class);
        // Just before use the bean it calls the init method. (init hook)

        System.out.println(coach.getDailyFortune());


        System.out.println("Going to end the context.");
        // Just before close the context it calls the clean up method. (end hook )
        // If we are not closing the context this hook will not get triggered.
        context.close();
        System.out.println("Context destroyed.");
    }
}
