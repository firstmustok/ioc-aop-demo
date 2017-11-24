package com.singtel.digital.ioc.aop.spring;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class AspectCoder
{
    @Pointcut( "execution(* com.singtel.digital..*.writeCode(..))" )
    private void doTask()
    {
    }

    @Before( "doTask()" )
    public void doBeforeTask( JoinPoint joinPoint )
    {
        System.out.println( "[spring] Begin to work" );
    }

    @After( "doTask()" )
    public void doAfterTask( JoinPoint joinPoint )
    {
        System.out.println( "[spring] finish work" );
    }
}
