package com.Learn.Zakria.SpringAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */


//It is a Spring Core Annotation
public class App 
{
    public static void main( String[] args )
    {
        
    	ApplicationContext factory = new AnnotationConfigApplicationContext(AppConfig.class);
    	
    	Samsung s7 = factory.getBean(Samsung.class);
    	s7.config();
    }
}
