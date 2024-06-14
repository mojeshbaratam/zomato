package com.zomato.controller;

import java.util.Scanner;

import com.zomato.entity.ZomatoUser;
import com.zomato.service.ZomatoService;
import com.zomato.service.ZomatoServieInterface;

public class ZomatoController implements ZomatoControllerInterface {

	@Override
	public void createProfileController() 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name");
		String name=sc.next();
		
		System.out.println("Enter Password");
		String pass=sc.next();
		
		System.out.println("Enter email");
		String email=sc.next();
		
		System.out.println("Enter address");
		String add=sc.next();
		
		ZomatoUser zu=new ZomatoUser();
		zu.setName(name);
		zu.setPass(pass);
		zu.setEmail(email);
		zu.setAdd(add);
		
		ZomatoServieInterface zs=new ZomatoService();
		int i=zs.createProfileService(zu);
		
		if(i>0)
			System.out.println("Profile Creation Success");
		else
			System.out.println("Profile Creation Failed");
		sc.close();
		}

}
