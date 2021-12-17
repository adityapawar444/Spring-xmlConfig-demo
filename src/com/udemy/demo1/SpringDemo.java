package com.udemy.demo1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringDemo {

	public static void main(String[] args) {
		//load the spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		
		//Coach coach = context.getBean("myCoach1",Coach.class);
		
		//print the message
		
				/*
				 * String msg = "Hi\n" + "I am your coach, "+ coach.getName()+ ". \n" +
				 * coach.getMotivated() + "\n" + "Today's task: " + coach.getAdvice() +"\n" +
				 * "if you need help, feel free to contact me: " + coach.getContact() +
				 * "\nBest Wishes!!!"; System.out.println(msg);
				 */
		
		/*
		 * this code here test the scope & life-cycle of objects
		 */
		Quote quotes1 = context.getBean("quotes",Quote.class);
		
		System.out.println("object1 created " + quotes1);
		
		Quote quotes2 = context.getBean("quotes",Quote.class);
		
		System.out.println("object2 craeted " + quotes2);
		
		System.out.println((quotes1==quotes2));
		
		
		
		
		//close the context
		context.close();

	}

}
