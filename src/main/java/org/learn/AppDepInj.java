package org.learn;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppDepInj {

	public static void main(String... args) {
		//Paso 2: Crear un Spring container
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//Paso 3: Sacar los beans del Spring container
		Person person = context.getBean("myPerson",Person.class);
		
		System.out.println(person.doSport());
		
		context.close();
	}
}
