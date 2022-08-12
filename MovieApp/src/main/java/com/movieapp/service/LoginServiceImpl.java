package com.movieapp.service;

import java.util.stream.Stream;

public class LoginServiceImpl implements ILoginService {

	String[] usernames= {"John","Pam","Pramod","Rahul","Virat","Joe"};
//	String upassword="Pramod";
	@Override
	public boolean validateUsername(String username,String password) {


//		
//		for (String uname : usernames) {
//			if(username.equals(uname)) {
//				return true;
//			}
//		}
//		if(password.equals(upassword)) {
//			return true;
//		}
//	
//		return false;
		
		return Stream.of(usernames).filter(str->str.equals(username)&& password.equals("Pramod")).findAny().isPresent();
		
	}

	

}
