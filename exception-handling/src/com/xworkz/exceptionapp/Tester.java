package com.xworkz.exceptionapp;

import java.io.File;
import java.io.IOException;

public class Tester {
	public static void main(String[] args)                                                                               {
		System.out.println("main started");
		try {
			m1();
		} catch (ClassNotFoundException | IOException |NullPointerException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
		
	}

	private static void m1() throws ClassNotFoundException , IOException,NullPointerException {
		System.out.println("m1 started");
		m2();
		System.out.println("m1 ended");
		
	}

	private static void m2() throws ClassNotFoundException,IOException,NullPointerException {
		System.out.println("m2 started");
		m3();
		System.out.println("m2 ended");
		
	}

	private static void m3() throws ClassNotFoundException ,IOException ,NullPointerException{
		System.out.println("m3 started");
		Class.forName("com.xworkz.exceptionapp.Tester");
		File file = new File("myfile.txt");
		file.createNewFile();
		
			String str = null;
			System.out.println(str.charAt(6));
			
			System.out.println("m3 ended");
		System.out.println("main ended");
		
		
		
	}

}
