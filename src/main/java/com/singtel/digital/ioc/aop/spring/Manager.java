package com.singtel.digital.ioc.aop.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Manager
{
    public static void main( String[] args )
    {
        ApplicationContext context = new AnnotationConfigApplicationContext( AppConfig.class );
        Coder coder = (Coder)context.getBean( "php" );

        // System.out.println( "class: " + coder.getClass() );

        Task t = new Task( "Task #1", coder );
        t.start();
    }
}
