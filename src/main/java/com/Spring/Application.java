package com.Spring;

import org.springframework.beans.BeanInstantiationException;
import org.springframework.beans.factory.BeanCreationException;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		try{
			ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("service.xml");
			com.Models.Automovil fiat = context.getBean("miAuto", com.Models.Automovil.class);
			System.out.println(fiat.andar());
			context.close();
		}catch(BeanCreationException | BeanInstantiationException ignore){
			System.out.println(ignore.getMessage());
		}


	}


}
