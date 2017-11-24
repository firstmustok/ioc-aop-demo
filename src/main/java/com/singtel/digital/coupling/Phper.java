package com.singtel.digital.coupling;

public class Phper
{
    private String name;

    public Phper( final String name )
    {
        this.name = name;
    }

    public void writeCode()
    {
        System.out.println( this.name + " is developing API in *PHP*" );
    }
}
