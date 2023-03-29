package com.xworkz.spring;

import java.util.Scanner;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
//only .java
@Configuration
public class SpringConfiguration {
	//bean can be used for both .class(String)/.java(our projects-- person,manager)
	@Bean(name="person")
	public Person getPerson() {
		Person per=new Person();
		per.setId(1);
		per.setName("dhruvi");
		return per;
	}
	@Bean(name="person1")
	public Person getPerson1() {
		Person per= new Person();
		per.setId(2);
		per.setName("Bhuvana");
		return per;
	}
	@Bean(name="person2")
	public Person getPerson2() {
		Person per= new Person();
		per.setId(3);
		per.setName("harshith");
		return per;
	}
	@Bean(name="person3")
	public Person getPerson3() {
		Person per= new Person();
		per.setId(4);
		per.setName("yashu");
		return per;
	}
	@Bean(name="person4")
	public Person getPerson4() {
		Person per= new Person();
		per.setId(5);
		per.setName("chaitra");
		return per;
	}
	
	@Bean(name = "String")
	public String getString() {
		return "to be managed by spring ApplicationContext";
	}
	@Bean(name = "String1")
	public String getString1() {
		return "this is string1";
	}
	@Bean(name="String2")
	public String getString2() {
		return "this is string2";
	}
	@Bean(name="String3")
	public String getString3() {
		return "this is string3";
	}
	@Bean(name="String4")
	public String getString4() {
		return "this is string4";
	}

	
	
	@Bean(name="Integer")
	public Integer getInteger() {
		return 100;
	}
	@Bean(name="Integer1")
	public Integer getInteger1() {
		return 200;
	}
	@Bean(name="Integer2")
	public Integer getInteger2() {
		return 300;
	}
	@Bean(name="Integer3")
	public Integer getInteger3() {
		return 400;
	}
	@Bean(name="Integer4")
	public Integer getInteger4() {
		return 500;
	}
	
	@Bean
	public Float getFloat() {
		return 2.00f;
	}
	@Bean(name="Character")
	public Character getCharacter()
	{
		return 'A';
	}
	@Bean(name="Character1")
	public Character getCharacter1()
	{
		return 'B';
	}
	@Bean(name="Character2")
	public Character getCharacter2()
	{
		return 'C';
	}
	@Bean(name="Character3")
	public Character getCharacter3()
	{
		return 'D';
	}
	@Bean(name="Character4")
	public Character getCharacter4()
	{
		return 'E';
	}
	@Bean
	public Long getLong() {
		return 895623568L;
	}
	@Bean
	public Byte getByte()
	{
		return 2;
	}
	@Bean
	public Double getDouble() {
		return 6.0;
	}
	@Bean(name="Short")
	public Short getShort() {
		return 1;
	}
	@Bean(name="Short1")
	public Short getShort1() {
		return 'A';
	}
	@Bean(name="Short2")
	public Short getShort2() {
		return 'B';
	}
	@Bean(name="Short3")
	public Short getShort3() {
		return 'C';
	}
	@Bean(name="Short4")
	public Short getShort4() {
		return 'D';
	}
		
		
	@Bean
	public Boolean getBoolean() {
		return true;
	}
	@Bean
	public Scanner getScanner() {
		return new Scanner(System.in);
	}

}
