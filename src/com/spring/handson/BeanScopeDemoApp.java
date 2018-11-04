package com.spring.handson;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context
                = new ClassPathXmlApplicationContext("bean-scope-applicationContext.xml");

        // Testing with Singleton Scope.
        Coach theCoach = context.getBean("myCoach", Coach.class);
        Coach alphaCoach = context.getBean("myCoach", Coach.class);

        // Check if they are same
        /**
         * We can use == operators for reference comparison (address comparison) and
         * .equals() method for content comparison. In simple words,
         * == checks if both objects point to the same memory location whereas
         * .equals() evaluates to the comparison of values in the objects.
         */
        boolean isReferenceToSameObject = theCoach == alphaCoach;
        System.out.println("isReferenceToSameObject : " + isReferenceToSameObject);
        System.out.println("Memory location of theCoach : " + theCoach);
        System.out.println("Memory location of alphaCoach : " + alphaCoach);


        System.out.println();
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        System.out.println();

        // Testing with prototype scope.
        // Going to Initialize theSecondCoach
        System.out.println("Going to Initialize Track Coach for theSecondCoach");
        Coach theSecondCoach = context.getBean("mySecondCoach", Coach.class);
        System.out.println();
        // Going to initialize alphaSecondCoach
        System.out.println("Going to initialize Track Coach for alphaSecondCoach");
        Coach alphaSecondCoach = context.getBean("mySecondCoach", Coach.class);
        System.out.println();

        boolean isReferenceToSameObjects = theSecondCoach == alphaSecondCoach;
        System.out.println("isReferenceToSameObjects : " + isReferenceToSameObjects);
        System.out.println("Memory location of theSecondCoach : " + theSecondCoach);
        System.out.println("Memory location of alphaSecondCoach : " + alphaSecondCoach);

        context.close();
    }
}
