package com.singtel.digital.ioc;

public class Factory
{
    public static Coder getCoder( String type )
    {
        if ( "java".equalsIgnoreCase( type ) )
        {
            return new Javaer( "Jill" );
        }
        else if ( "php".equalsIgnoreCase( type ) )
        {
            return new Javaer( "Rio" );
        }

        return null;
    }
}
