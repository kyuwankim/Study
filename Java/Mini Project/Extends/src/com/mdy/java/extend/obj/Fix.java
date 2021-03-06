package com.mdy.java.extend.obj;

public abstract class Fix {
	// 추상 클래스의 특징
	// 1. 인터페이스와 동일하다.
	// 2. 인터페이스 + 클래스
	
	public void process(){
		disassemble();
		for(int i=0 ; i<3 ; i++){
			replacePart(); // 항상 세번씩 교체
		}
		runLogic();
		clean();
		assemble();
	}
	
	private void runLogic(){
		// 이 로직은 바뀌면 안되고 내부적으로만 써야돼...
	}
	
	public abstract void disassemble();
	
	public abstract void replacePart();
	
	public abstract void clean();
	
	public abstract void assemble();
}
