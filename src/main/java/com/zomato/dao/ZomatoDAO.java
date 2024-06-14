package com.zomato.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import com.zomato.entity.ZomatoUser;

public class ZomatoDAO implements ZomatoDAOInterface {

	@Override
	public int createProfileDAO(ZomatoUser zu) 
	{
		int res=0;
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mojesh", "root", "Root");
			
			PreparedStatement ps=con.prepareStatement("insert into zomato values(?,?,?,?)");
			ps.setString(1, zu.getName());
			ps.setString(2, zu.getPass());
			ps.setString(3, zu.getEmail());
			ps.setString(4, zu.getAdd());
			
			res=ps.executeUpdate();
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		
		return res;
	}

}
