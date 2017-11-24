package com.singtel.digital.ioc.ifacefactorymap;

public class Phper implements Coder
{
    private String name;

    public Phper( final String name )
    {
        this.name = name;
    }

    @Override
    public String getType()
    {
        return "php";
    }

    @Override
    public void writeCode()
    {
        System.out.println( this.name + " is developing API in *PHP*" );
    }
}
