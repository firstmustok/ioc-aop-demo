package com.singtel.digital.ioc.ifacefactorymap;

public class Task
{
    private String name;
    private Coder  owner;

    public Task( String name )
    {
        this.name = name;
    }

    public void setOwner( final Coder owner )
    {
        this.owner = owner;
    }

    public void start()
    {
        System.out.println( this.name + " started" );
        this.owner.writeCode();
    }
}
