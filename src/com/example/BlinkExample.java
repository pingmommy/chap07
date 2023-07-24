package com.example;

import util.Alpha;
import util.VT100;

public class BlinkExample {
	
	
	
	static class Blink extends Alpha{
		
		int speed;
		// 기본생성자는 생략해도 기본으로 생성된다. 
		//public Blink() {
		//	super();  // 나를 지칭할 때는 this , 부모를 지칭할 때는 super();;
		//}
		
		
		public Blink() {
			this(100); // this를 호출해서 super()가 호출되지 않음. 
		}
		
		public Blink(int speed) {
//			super();  생략해도 super();가 있다. 컴파일러가 알아서 추가. 
			// 왜 super로 부모생성자가 호출되나..
			//상속받은 것일 뿐 모든 요소들이 원래 부모의 것이니까 부모가 초기화해야 한다.
			//부모 생성자는 반드시 호출된다. 
			//부모가 기본생성자가 아닌 다른 생성자가 있을 경우
			// 자동으로 부모생성자가 호출되지 않기 때문에 따로 명시해주어야 한다. 
			this.speed =speed;
		}
		
		void blink() throws InterruptedException  {
			show();
			Thread.sleep(speed);
			
			hide();
			Thread.sleep(speed);
			
		}
	}

	public static void main(String[] args) throws InterruptedException {
		
		VT100.clearScreen();
		
		Blink b = new Blink();
		
		b.blink();
		
//		for(int i =1; i<=1000;i++) {
//			b.blink();
//
//		}
		
		VT100.reset();
		System.out.println("End");

		
	}

}
