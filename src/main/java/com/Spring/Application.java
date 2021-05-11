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

			// Bean con Interfaz
			com.Models.Automovil fiat = context.getBean("miAuto", com.Models.Automovil.class);
			System.out.println(fiat.andar());

			// Bean con clase Singleton
			com.Models.SomeService s = context.getBean("miServicio", com.Models.SomeService.class);
			s.setData("Esto es Spring Framework - Probando la Inversion de Control");
			System.out.println(s.getData());

			context.close();
		}catch(BeanCreationException | BeanInstantiationException ignore){

		}
	}


}
