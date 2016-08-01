package com.niit.ShopinngCart;

public class LoginDAO {

	public boolean isValidUser(String userId,String password)
	{
		if(userId.equals("sandeep")&&password.equals("sandy"))
		{
			return true;
		}
		else
		{
			return false;
		}
			
	}
	
}