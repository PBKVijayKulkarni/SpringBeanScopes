package com.p1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PersonConfig 
{
	 @Bean(name="personobj1")
	   public Person retPersonbean()
	   {
		   Person pobj= new Person();
		   pobj.setName("Larsen&Tourbo");
		   return pobj;
	   }
}
