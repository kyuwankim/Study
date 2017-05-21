package com.mdy.polymorphism_upcasting;

public class Child extends Parent {
	
	public String schoolName;
	
	
	public Child(String name, int age, String schoolName){
		super(name, age);
		//super(name, age); ���� �Ʒ�ó�� ����ϸ� ��������.
  	/*	this.age = age;
		this.name = name;*/
		this.schoolName = schoolName;
	}
	
	@Override
	public void goSomewhere(){
		System.out.println("�б��� ���ϴ�.");
	}
	
	@Override
	public void showInformation(){
		System.out.println("�̸��� "+ name + " �Դϴ�.");
		System.out.println("���̴� "+ age + " �Դϴ�.");
		System.out.println("�б��� "+ schoolName + " �Դϴ�.");
	}
}