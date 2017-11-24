package com.singtel.digital.ioc.aop.ifacefactory;

public class Phper implements Coder
{
    private String name;

    public Phper( final String name )
    {
        this.name = name;
    }

    @Override
    public void writeCode()
    {
        System.out.println( this.name + " is developing API in *PHP*" );
    }
}
