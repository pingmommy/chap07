package com.example;

import util.Alpha;
import util.VT100;

public class DecoAlphaExample {

	static class DecoAlpha extends Alpha{ //패키지가 달라서 필드가 프라이빗이 아니라더라도 직접접근이 안 된다. 
		
		@Override
		public void show() {

			super.show();  //부모가 정의해놓은 show(); 메소드는 super()를 꼭 안 써도 된다. 
			VT100.cursorMove(getLine()+1, getColumn());
			VT100.reset();
			VT100.print('=');
		}
		
		@Override
		public void hide() {
				super.hide();
				VT100.cursorMove(getLine()+1, getColumn());
				VT100.reset();
				VT100.print('-');
			}
		
		public void blink() throws InterruptedException {
			show();
			Thread.sleep(5000);
			
			hide();
			//Thread.sleep(100);
			
		}
		
		
	}
	
	
	public static void main(String[] args) throws InterruptedException {
		
		VT100.clearScreen();
		
		DecoAlpha da = new DecoAlpha();
		
		da.blink();
		
		VT100.reset();
		System.out.println("End");
		
	}

}
