package com.yedam.interfaces;

public class MysqlDb implements DataAccessObject{
	public	void select() {
		System.out.println("mysql db조회");
	}
	public	void insert() {
		System.out.println("mysql db 입력");
	}
	public	void update() {
		System.out.println("mysql db수정");
	}
}
