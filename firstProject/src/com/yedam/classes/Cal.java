package com.yedam.classes;

public class Cal {
	public int r;
	
	public int setRadius(int r)
	{
		if(r<0)
		{
			this.r=0;
		return r=0;
		}
		else
		{
			this.r=r;
			return r;
		}
	}
	public int getradius()
	{
		return r;
	}
	public double getArea()
	{
		return 3.14*r*r;
	}
}
