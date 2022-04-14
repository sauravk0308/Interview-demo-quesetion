package com.demo.exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionDemo {

	public static void main(String[] args) {
		int a = test();
		System.out.println("!!! "+a);
	}

	
	public static int test() {
		FileInputStream file =null;
		String fileName ="test";
		try {
			System.out.println("1111111111");
			   file = new FileInputStream(fileName);
			   Object x;
			int x1 = (byte) file.read();
			System.out.println(1);
			return 1;
			} catch (IOException i) {
				System.out.println("test");
			   i.printStackTrace();
			   return -1;
			} finally {
				return 3;
			}
	//		   catch (FileNotFoundException f) { // Not valid! {
//			   f.printStackTrace();
//			   return -1;
//			}
	}
}
