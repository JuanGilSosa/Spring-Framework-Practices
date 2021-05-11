package com.Spring;

import org.springframework.beans.BeanInstantiationException;
import org.springframework.beans.factory.BeanCreationException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.swing.*;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		//SpringApplication.run(Application.class, args);
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
