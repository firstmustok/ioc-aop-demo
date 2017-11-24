package com.singtel.digital.ioc.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Manager
{
    public static void main( String[] args )
    {
        @SuppressWarnings( "resource" )
        ApplicationContext context = new ClassPathXmlApplicationContext( "beans.xml" );
        Coder coder = (Coder)context.getBean( "java" );

        Task t = new Task( "Task #1", coder );
        t.start();
    }
}
