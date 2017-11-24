package com.singtel.digital.ioc.aop.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan
public class AppConfig
{
    @Bean( name = "java" )
    public Coder java()
    {
        return new Javaer( "Rio" );
    }

    @Bean( name = "php" )
    public Coder php()
    {
        return new Phper( "Jill" );
    }

    @Bean
    public AspectCoder aspect()
    {
        return new AspectCoder();
    }
}
