package com.example;

import java.util.Timer;
import java.util.TimerTask;

public class TimerExample {
	
	static class A extends TimerTask {
		
		@Override
		public void run() {

			System.out.println(" bbb ");
		}
	}

	public static void main(String[] args) {

		Timer timer = new Timer();
		
		TimerTask t1 = new A();
		
//		timer.schedule(t1, 5000); // 5초 후에 t1을 수행한다. 
		
		timer.schedule(t1, 0, 1000);// 1초마다 t1이 수행된다. 
	}

}
