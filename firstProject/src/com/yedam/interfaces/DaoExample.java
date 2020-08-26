package com.yedam.interfaces;

public class DaoExample {
	public static void main(String[] args) {
		DataAccessObject dao=new MysqlDb();
		dao.select();
		dao.update();
		dao.insert();
	}
}
