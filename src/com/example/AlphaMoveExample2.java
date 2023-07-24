package com.example;

import java.util.Timer;
import java.util.TimerTask;

import util.Alpha;
import util.VT100;

public class AlphaMoveExample2 {
	
	static class AlphaMove extends Alpha {
		
		public AlphaMove() {
			
			line =1;
			column =1;
		}
		
		void right() {
			
			hide();
			column ++;
			show();
		}

		public void down() {
			hide();
			line ++;
			show();
		}
		
		void left() {
			
			hide();
			column --;
			show();
		}
		
		public void up() {
			hide();
			line --;
			show();
		}
	}
	
	enum Direction{
		UP,DOWN,LEFT,RIGHT
	}
			
	
	static class MoveTimerTask extends TimerTask {
		
		AlphaMove alphaMove = new AlphaMove();
		
		
		Direction direction = Direction.RIGHT;
		@Override
		public void run() {
			switch(direction) {
			
			case RIGHT: 
				alphaMove.right();
				break;
			case DOWN:
				alphaMove.down();
							
				break;
			case LEFT:
				alphaMove.left();
	
			     break;
			case UP:
				alphaMove.up();
		
		        break;
		
			}
			
			if(alphaMove.getLine()==1 && alphaMove.getColumn()==1 )
				direction =Direction.RIGHT;
			else if(alphaMove.getLine()==1 && alphaMove.getColumn()==40 )
				direction =Direction.DOWN;
			else if(alphaMove.getLine()==20 && alphaMove.getColumn()==40 )
				direction =Direction.LEFT;
			else if(alphaMove.getLine()==20 && alphaMove.getColumn()==1 )
				direction =Direction.UP;
			
			
		}
	}
	
	static Timer timer = new Timer();

	public static void main(String[] args) throws InterruptedException {

		VT100.clearScreen();
		
		
		for(int i=0; i<10;i++) {
			MoveTimerTask t = new MoveTimerTask();
			int speed =(int)(Math.random()*500+20);
			timer.schedule(t, 0, speed);
		}
		
		
		
		
		
		
   
	}

}
