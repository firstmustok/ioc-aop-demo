package com.singtel.digital.ioc.ifacefactorymap;

public class Manager
{
    public static void main( String[] args )
    {
        // prepare
        Factory.hire( new Javaer( "Rio" ) );
        Factory.hire( new Phper( "Jill" ) );

        // create task
        Task t = new Task( "Task #1" );

        // assign the task to
        t.setOwner( Factory.getCoder( "java" ) );

        t.start();
    }
}
