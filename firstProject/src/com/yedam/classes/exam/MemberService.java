package com.yedam.classes.exam;

public class MemberService {
	
	public boolean login(String id,String password,Member[] ms)
	{
		boolean result=false;
		for(int i=0;i<ms.length;i++)
		{
			if((id.equals("hong"))&&(password.equals("12345")))
			{
				result=true;
				
			}
			else 
				result=false;
		}
		return result;
	}
	public String logout(String id)
	{
		return id;
	}
}
