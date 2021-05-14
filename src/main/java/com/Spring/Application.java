package com.Spring;


import org.springframework.beans.BeanInstantiationException;
import org.springframework.beans.factory.BeanCreationException;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static java.lang.System.out;
import com.Models.*;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		try{
			ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("service.xml");

			//Bean con Interfaz
			Automovil fiat = context.getBean("miAuto", Automovil.class);
			out.println(fiat.andar());

			// Bean con llamada a Constructor constructor-arg
			SomeService s = context.getBean("miServicio-I", SomeService.class);
			out.println(s.getData());

			// Bean con patron de diseño Singleton
			SomeService service = context.getBean("miServicio", SomeService.class);
			service.setData("Data seteada - Some Service");
			out.println(service.getData());

			context.close();
		}catch(BeanCreationException | BeanInstantiationException ignore){

		}
	}


}
