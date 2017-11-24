package com.singtel.digital.ioc.ifacefactorymap;

import java.util.HashMap;
import java.util.Map;

public class Factory
{
    private static Map<String, Coder> coders = new HashMap<String, Coder>();

    public static Coder getCoder( final String type )
    {
        return coders.get( type );
    }

    public static void hire( final Coder coder )
    {
        coders.put( coder.getType(), coder );
    }
}
