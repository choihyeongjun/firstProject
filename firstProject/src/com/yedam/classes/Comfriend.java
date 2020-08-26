package com.yedam.classes;

public class Comfriend extends Friend{

	private String comName;
	public Comfriend() {
		super();
	}
	public String getComName() {
		return comName;
	}
	public void setComName(String comName) {
		this.comName = comName;
	}
	@Override
	public String toString() {
		return "회사친구 이름: "+super.getName()+", 연락처: "+super.phoneName()+", 회사이름 : "+this.comName;
	}
	

}
