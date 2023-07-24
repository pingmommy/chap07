package com.example;

import util.Alpha;
import util.VT100;

public class nn {
	
	public static void main(String[] args) throws InterruptedException {
		VT100.clearScreen();
		Alpha a = new Alpha();
		
//		for(int i =0;i<10;i++) {
//			Alpha a = new Alpha();
//
//			a.show();
//			Thread.sleep(2000);
//			a.hide();
//		}
		
		
		
		a.show();
		Thread.sleep(5000);
		a.hide();
		

	}

}
