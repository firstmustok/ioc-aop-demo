package com.singtel.digital.ioc.aop.spring;

public class Phper implements Coder
{
    private String name;

    public Phper()
    {
    }

    public Phper( final String name )
    {
        this.name = name;
    }

    @Override
    public void writeCode()
    {
        System.out.println( this.name + " is developing API in *PHP*" );
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
