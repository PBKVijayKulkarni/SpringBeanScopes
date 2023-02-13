package com.p1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{	
    public static void main(String[] args)
    {
      //ApplicationContext ap= new AnnotationConfigApplicationContext(PersonConfig.class);
         ApplicationContext ap= new AnnotationConfigApplicationContext(PersonConfig.class);
     // ap.register(PersonConfig.class);
      //ap.refresh();

    	Person pobj1 = (Person) ap.getBean("personobj1");
    	System.out.println("Person object pobj1 is "+ pobj1.getName());
    	Person pobj2 = (Person) ap.getBean("personobj1");
    	System.out.println("Person object pobj2 is "+ pobj1.getName());
    	
    	 System.out.println("pobj1 and pobj2 are referring to the same object: "+ (pobj1 == pobj2));

         System.out.println("Address of object pobj1:"+ pobj1);
         System.out.println("Address of object pobj2: "+ pobj2);	
    	}   
}
