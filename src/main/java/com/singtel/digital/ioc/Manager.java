package com.singtel.digital.ioc;

public class Manager
{
    public static void main( String[] args )
    {
        Coder coder = Factory.getCoder( "php" );

        Task t = new Task( "Task #1", coder );
        t.start();
    }
}
