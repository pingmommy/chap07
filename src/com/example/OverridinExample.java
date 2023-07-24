package com.example;

import java.util.TimerTask;

public class OverridinExample {

	static class A{
		void show() {
			System.out.println("A.show...");
		}
	}
	
	static class B extends A{
		
		//메소드의 적용범위를 더 좁혀서 오버라이딩하는 건 안 된다.(ex> default -> private 으로 재정의하는 건 안 됨.)
		
		@Override // 컴파일러한테 오버라이딩한 것을 알리고 확인할 것을 요청 (어노테이션) 
		void show(){
			System.out.println("B.show..");
		}
		
	}
	
	static class C extends TimerTask{

		@Override
		public void run() {
			// TODO Auto-generated method stub
			
		}
		
		
	}
	
	
	public static void main(String[] args) {
		
		B b = new B();
		A a = b; // 상속관계에서만 자동형변환이 된다. (자식을 부모타입으로 바꿀 때만)
		
		// b =(B)a;  =>(O) 부모를 자식타입으로 바꾸는 것도 가능하지만 강제형변환을 해야 한다. 
		
		
		a.show(); // b에 오버라이딩된 메소드가 호출된다. 똑같은 메소드가 있으면 무조건 자동으로 오버라이딩된다. 
	}

}
