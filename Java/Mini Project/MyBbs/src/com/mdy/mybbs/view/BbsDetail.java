package com.mdy.mybbs.view;

import com.mdy.mybbs.model.Bbs;

public class BbsDetail {
	
	public void showNo(long id){
		System.out.println("�۹�ȣ:"+id);
	}
	
	public void showTitle(String title){
		System.out.println("����:"+title);
	}
	
	public void showAuthor(String author){
		System.out.println("�ۼ���:"+author);
	}
	
	public void showDate(String date){
		System.out.println("�ۼ�����:"+date);
	}
	
	public void showViewCount(int i){
		System.out.println("��ȸ��:"+i);
	}
	
	public void showContent(String content){
		System.out.println("����:"+content);
	}
	
	public void endDetail(){
		System.out.println("----------------------");
	}
}