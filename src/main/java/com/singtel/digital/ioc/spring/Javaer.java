package com.singtel.digital.ioc.spring;

public class Javaer implements Coder
{
    private String name;

    public Javaer()
    {
    }

    public Javaer( String name )
    {
        this.name = name;
    }

    @Override
    public void writeCode()
    {
        System.out.println( this.name + " is developing API in *JAVA*" );
    }

    public String getName()
    {
        return name;
    }

    public void setName( String name )
    {
        this.name = name;
    }
}
