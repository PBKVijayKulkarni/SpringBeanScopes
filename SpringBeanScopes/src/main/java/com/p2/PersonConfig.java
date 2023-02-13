package com.p2;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class PersonConfig 
{
	 @Bean(name="personobj1")
	 @Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
	   public Person retPersonbean()
	   {
		   Person pobj= new Person();
		   pobj.setName("Larsen&Tourbo");
		   return pobj;
	   }
}
