package com.singtel.digital.ioc.spring;

public class Task
{
    private String name;
    private Coder  owner;

    public Task( final String name, final Coder coder )
    {
        this.name = name;
        this.owner = coder;
    }

    public void start()
    {
        System.out.println( this.name + " started" );
        this.owner.writeCode();
    }
}
