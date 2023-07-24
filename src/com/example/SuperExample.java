package com.example;


//자식의 생성자를 호출했을 때 부모의 생성자도 호출되는 것을 확인하는 코드 
//상속되는 것은 인스턴스 요소( static (X))
//필드에 대한 초기화정보는 부모클래스에 다 있기 때문에
//부모생성자가 꼭 있어야 된다. 
//super();가 눈에 안 보인다고 해서 없는 게 아니다. 

public class SuperExample {
	
	static class A{
		public A() {
			System.out.println("A");
		}
	}
	
	static class B extends A{
		public B() {
			super(); // 명시를 하든 안하든 기본생성자는 무조건 호출된다.  
			System.out.println("B");
		}
		
	}
	
	// 아래의 코드에서 D의 오류를 해결하는 법은
	// 1. 부모클래스에 기본생성자를 추가하거나
	// 2. 자식클래스에 super()를 명시하고 해당하는 매개값을 준다.  
	
	
	static class C{
	
		// 생성자를 하나라도 명시적으로 정의하면 기본생성자를 컴파일러가 자동으로 추가하지 않는다.
		public C(int speed) {
			
		}
	}
	 
	
	static class D extends C{
		public D() {
			super(100); // 이 생성자는 컴파일러가 추가해주지 않는다. 개발자가 명시해야 한다. 
		}
		
		public D(int a) {
			super(100);
		}
		public D(int a, int b) {
			super(100);
		}
		
 	}

	public static void main(String[] args) {

		B b = new B();
	}

}
