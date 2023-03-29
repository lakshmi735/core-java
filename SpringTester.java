package com.xworkz.spring;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class SpringTester {
	public static void main(String[] args) {
		
		ApplicationContext application=new AnnotationConfigApplicationContext(SpringConfiguration.class);
	Person per=application.getBean("person",Person.class);
	System.out.println(per);
	Person per1=application.getBean("person1",Person.class);
	System.out.println(per1);
	Person per2=application.getBean("person2",Person.class);
	System.out.println(per2);
	Person per3=application.getBean("person3",Person.class);
	System.out.println(per3);
	Person per4=application.getBean("person4",Person.class);
	System.out.println(per4);
	
	String string = (String)application.getBean("String",String.class);
	System.out.println(string);
	
	String string1 = application.getBean("String1",String.class);
	System.out.println(string1);
	
	String string2 = application.getBean("String2",String.class);
	System.out.println(string2);
	
	String string3 = application.getBean("String3",String.class);
	System.out.println(string3);
	
	String string4 = application.getBean("String4",String.class);
	System.out.println(string4);
	
	
	
	Integer integer = application.getBean("Integer",Integer.class);
	System.out.println(integer);
	Integer integer1 = application.getBean("Integer2",Integer.class);
	System.out.println(integer1);
	Integer integer2 = application.getBean("Integer3",Integer.class);
	System.out.println(integer);
	Integer integer3 = application.getBean("Integer4",Integer.class);
	System.out.println(integer3);
	Integer integer4 = application.getBean("Integer1",Integer.class);
	System.out.println(integer4);
	
	Float flt=application.getBean(Float.class);
	System.out.println(flt);
	System.out.println("---------------------CHARACTER----------------------");
	Character chara=application.getBean("Character",Character.class);
	System.out.println(chara);
	
	Character chara1=application.getBean("Character1",Character.class);
	System.out.println(chara1);
	
	Character chara2=application.getBean("Character2",Character.class);
	System.out.println(chara2);
	
	Character chara3=application.getBean("Character3",Character.class);
	System.out.println(chara3);
	
	Character chara4=application.getBean("Character4",Character.class);
	System.out.println(chara4);
	
	Long lon=application.getBean(Long.class);
	System.out.println(lon);
	
	Byte by=application.getBean(Byte.class);
	System.out.println(by);
	
	Double dou=application.getBean(Double.class);	
	System.out.println(dou);
	
	System.out.println("-----SHORT-------");
	Short sr=application.getBean("Short",Short.class);
	System.out.println(sr);
	Short sr1=application.getBean("Short1",Short.class);
	System.out.println(sr1);
	Short sr2=application.getBean("Short2",Short.class);
	System.out.println(sr2);
	Short sr3=application.getBean("Short3",Short.class);
	System.out.println(sr3);
	Short sr4=application.getBean("Short4",Short.class);
	System.out.println(sr4);
	
	Boolean boo=application.getBean(Boolean.class);
	System.out.println(boo);
			
	Scanner sc=application.getBean(Scanner.class);
	System.out.println(sc);
	
}
}
