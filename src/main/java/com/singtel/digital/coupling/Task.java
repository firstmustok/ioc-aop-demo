package com.singtel.digital.coupling;

public class Task
{
    private String name;
    private Phper  owner;

    public Task( String name )
    {
        this.name = name;
        this.owner = new Phper( "Jill" );
    }

    public void start()
    {
        System.out.println( this.name + " started" );
        this.owner.writeCode();
    }
}
