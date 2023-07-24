package com.example;

public class InheritanceExample {

	
	//class Parent도 class InheritanceExample의 멤버다. 
	// static으로 설정하지 않으면 인스턴스 특성을 갖기 때문에 현재 class InheritanceExample의 static main에서 사용할 수 없다.
	// static main이 만들어지는 시점에는 인스턴스 요소는 생성되지 않기 때문에
	
	static class Parent{
		
	}
	
	
	//이런 식으로 쓸 수는 있다.  
/*	public static void main2(String[] args) {

		InheritanceExample x = new InheritanceExample();
		Parent p =x.new Parent();
		
	} */
	
	public static void main(String[] args) {
		
		Parent p = new Parent();
		
	}
	
	

}
