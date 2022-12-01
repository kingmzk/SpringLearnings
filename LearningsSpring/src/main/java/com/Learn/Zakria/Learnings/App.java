package com.Learn.Zakria.Learnings;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	
    	//getBean() is Obtained by ApplicationCOntext or BeanFactory Interface
  ApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");
         
//    	
//    Vehicle obj = (Vehicle) context.getBean("car");  //car is Car DOne By COmponent
//      obj.drive();
  
  
//  Tyre ty = (Tyre) context.getBean("tyre");
//  System.out.println(ty);
//  
  
     Car obj = (Car) context.getBean("car");
     obj.drive();
  
    }
}
