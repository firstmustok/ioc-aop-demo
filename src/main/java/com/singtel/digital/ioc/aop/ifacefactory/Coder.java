package com.singtel.digital.ioc.aop.ifacefactory;

public interface Coder
{
    public void writeCode();

    public default void reportBefore()
    {
        System.out.println( "Begin to work" );
    }

    public default void reportAfter()
    {
        System.out.println( "Finsh work" );
    }
}
