package com.mdy.java.exception;

public class ExceptionMain {

	public static void main(String[] args) {
		int array[] = new int[6];
		try{
			array[0] = 5;
//			array[5] = 10;
			// ������ �߻��ϴ��� ������� �����ؾ� �Ѵ�.
//			array[6] = 11;
			
//			int x = 1/0;
			
			String s = "a";
			int a = Integer.parseInt(s);
			
		}catch(ArrayIndexOutOfBoundsException e){
			e.printStackTrace();
		}catch(ArithmeticException e){
			e.printStackTrace();
		}catch(NumberFormatException e){
			e.printStackTrace();
		}finally{
			System.out.println("�ټ���° ��="+array[5]);
		}
		System.out.println("�ý����� �Ϸ�Ǿ����ϴ�.");
	}
}