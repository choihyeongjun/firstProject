package com.yedam.test;

public class Board {
	private String user;
	private String using;//제목
	private String using2;//내용
	private int index;
	
	public Board() {
		
	}
	public Board(int index,String using,String using2,String user) {
		this.index=index;
		this.using=using;
		this.user=user;
		this.using2=using2;
	}
	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getUsing() {
		return using;
	}

	public void setUsing(String using) {
		this.using = using;
	}
	public int getIndex() {
		return index;
	}
	public void setIndex(int index) {
		this.index = index;
	}
	public String getUsing2() {
		return using2;
	}
	public void setUsing2(String using2) {
		this.using2 = using2;
	}
	
	
}
