package com.yedam.cond;
import java.io.IOException;
public class whileexample2 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		boolean run=true;
		int num=10;
		int keycode=0;
		System.out.println("키함 눌러봐라");
		while(run)
		{
			keycode=System.in.read();
			if(keycode!=13&&keycode!=10)
			{
				System.out.println(keycode);
				System.out.println("키함 눌러봐라");
			
			}
			else if(keycode==13&&keycode==10)
			  System.out.println("키함 눌러봐라");
			
			
			if(keycode==9)
				run=false;
		}
		
	}

}
