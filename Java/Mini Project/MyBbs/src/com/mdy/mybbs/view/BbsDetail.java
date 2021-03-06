package com.mdy.mybbs.view;

import com.mdy.mybbs.model.Bbs;

public class BbsDetail {
	
	public void showNo(long id){
		System.out.println("글번호:"+id);
	}
	
	public void showTitle(String title){
		System.out.println("제목:"+title);
	}
	
	public void showAuthor(String author){
		System.out.println("작성자:"+author);
	}
	
	public void showDate(String date){
		System.out.println("작성일자:"+date);
	}
	
	public void showViewCount(int i){
		System.out.println("조회수:"+i);
	}
	
	public void showContent(String content){
		System.out.println("내용:"+content);
	}
	
	public void endDetail(){
		System.out.println("----------------------");
	}
}
