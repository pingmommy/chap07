package com.example;

import java.util.Timer;
import java.util.TimerTask;

import util.Alpha;
import util.VT100; 

public class BlinkTimerExample2 {

	static class Blink extends TimerTask{
		
		Alpha al = new Alpha(); // Blink 클래스가 생성될 때 
		
		boolean isShow = false;
		@Override
		public void run() {
			if(!isShow) {
				al.show();
			}else
				al.hide();
			
			isShow=!isShow;
		}
	}
	
	
	public static void main(String[] args) {

		VT100.clearScreen();
	
		Timer timer = new Timer();
		Blink b = new Blink();
		int speed = (int)(Math.random()*500+20);
		for(int i = 0; i<10; i++) {
			timer.schedule(b, 0, speed);
		
		//System.out.println((int)(Math.random()*20 + 1));
		
		//b.al.show();
		//b.al.hide();
		}
		
		
	}}


