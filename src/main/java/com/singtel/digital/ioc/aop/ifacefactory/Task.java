package com.singtel.digital.ioc.aop.ifacefactory;

public class Task
{
    private String name;
    private Coder  owner;

    public Task( String name, String type )
    {
        this.name = name;
        this.owner = Factory.getCoder( type );
    }

    public void start()
    {
        System.out.println( this.name + " started" );

        this.owner.reportBefore();
        this.owner.writeCode();
        this.owner.reportAfter();
    }
}
