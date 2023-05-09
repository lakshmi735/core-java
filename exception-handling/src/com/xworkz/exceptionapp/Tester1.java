package com.xworkz.exceptionapp;

import java.io.File;
import java.io.IOException;

public class Tester1 {
	public static void main(String[] args) {
		System.out.println("main() started");
		
		
		File file = new File("myFile.txt");
		try {
			file.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}



