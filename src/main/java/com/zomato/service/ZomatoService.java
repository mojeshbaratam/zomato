package com.zomato.service;

import com.zomato.dao.ZomatoDAO;
import com.zomato.dao.ZomatoDAOInterface;
import com.zomato.entity.ZomatoUser;

public class ZomatoService implements ZomatoServieInterface {

	@Override
	public int createProfileService(ZomatoUser zu) 
	{
		ZomatoDAOInterface zd=new ZomatoDAO();
		int i=zd.createProfileDAO(zu);
		return i;
	}

}
