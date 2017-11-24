package com.singtel.digital.ioc.ifacefactorymap;

public class Javaer implements Coder
{
    private String name;

    public Javaer( final String name )
    {
        this.name = name;
    }

    @Override
    public String getType()
    {
        return "java";
    }

    @Override
    public void writeCode()
    {
        System.out.println( this.name + " is developing API in *JAVA*" );
    }
}
