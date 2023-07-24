package com.example;

// 상속을 통해 코드중복을 피할 수 있다. 

public class InheritanceExample2 {

	//상속되는 부분
	static class Parent{
		int line;
		int column;
		
		public Parent() {
			line = 10;
			column =20;
		}
		
		//상속되는 부분
		void show() {
			System.out.printf("%d %d\n",line, column);
		}
	}
	
	//부모 클래스는 한 개만 된다.(싱글상속)
	static class Child extends Parent{
		
		
	}
	

	
	public static void main(String[] args) {
		
		Child c = new Child();
		
		c.show();
		
	}

}
