package com.singtel.digital.ioc.aop.ifacefactory;

public class Manager
{
    public static void main( String[] args )
    {
        Task t = new Task( "Task #1", "java" );
        t.start();
    }
}
