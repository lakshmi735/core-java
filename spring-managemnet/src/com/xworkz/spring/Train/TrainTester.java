package com.xworkz.spring.Train;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TrainTester {
	public static void main(String[] args) {
		
		ApplicationContext application=new AnnotationConfigApplicationContext(TrainConfigutation.class);
		Train train=application.getBean("Train",Train.class);
		System.out.println(train);
		Train train1=application.getBean("Train1",Train.class);
		System.out.println(train1);
		Train train2=application.getBean("Train2",Train.class);
		System.out.println(train2);
		Train train3=application.getBean("Train3",Train.class);
		System.out.println(train3);
		Train train4=application.getBean("Train4",Train.class);
		System.out.println(train4);
	}

}
