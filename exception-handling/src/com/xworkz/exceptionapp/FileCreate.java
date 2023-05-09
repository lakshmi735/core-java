package com.xworkz.exceptionapp;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FileCreate {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("main() stated");
		for(int i=0;i<5;i++) {
			System.out.println("Enter the file name");
			File file = new File(sc.next());
			try {
				file.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("main() ended");
		
	}

}
