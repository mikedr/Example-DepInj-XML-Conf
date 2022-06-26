package org.learn;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppDepInj {

	public static void main(String... args) {
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Person person = context.getBean("myPerson",Person.class);
		
		System.out.println(person.doSport());
		
		context.close();
	}
}
