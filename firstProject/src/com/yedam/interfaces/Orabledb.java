package com.yedam.interfaces;

public class Orabledb implements DataAccessObject{
	public	void select() {
		System.out.println("오라클 db조회");
	}
	public	void insert() {
		System.out.println("오라클 db 입력");
	}
	public	void update() {
		System.out.println("오라클 db수정");
	}
}
