package com.zomato.view;

import java.util.Scanner;

import com.zomato.controller.ZomatoController;
import com.zomato.controller.ZomatoControllerInterface;

public class ZomatoView {

	public static void main(String[] args) 
	{
		String s="y";
		while(s.equals("y"))
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter your choice");
			System.out.println("Press 1 to create profile");
			System.out.println("Press 2 to view profile");
			System.out.println("Press 3 to view all profiles");
			int choice =sc.nextInt();
			
			ZomatoControllerInterface zc=new ZomatoController();
			switch(choice)
			{
			case 1:
				zc.createProfileController();
				break;
			case 2:
				break;
			case 3:
				break;
			default:
	
			}
			System.out.println("Press y to continue");
			s=sc.next();
		}
	}

}
