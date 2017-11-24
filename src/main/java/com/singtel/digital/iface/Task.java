package com.singtel.digital.iface;

public class Task
{
    private String name;
    private Coder  owner;

    public Task( String name, String type )
    {
        this.name = name;
        if ( "java".equalsIgnoreCase( type ) )
        {
            this.owner = new Javaer( "Jill" );
        }
        else if ( "php".equalsIgnoreCase( type ) )
        {
            this.owner = new Javaer( "Rio" );
        }
    }

    public void start()
    {
        System.out.println( this.name + " started" );
        this.owner.writeCode();
    }
}
