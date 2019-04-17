package com.cg.ums.service;

import java.util.List;

import com.cg.ums.dao.UserDao;
import com.cg.ums.dao.UserDaoImpl;
import com.cg.ums.entities.User;

public class UserServiceImpl implements UserService {
	
	private UserDao dao;

	public UserServiceImpl() {
		dao = new UserDaoImpl();
	}

	@Override
	public List<User> findByName(char i) {
		// TODO Auto-generated method stub
		return dao.findByName(i);
	}

	@Override
	public Long findCount() {
		// TODO Auto-generated method stub
		return dao.findCount();
	}

	@Override
	public List<User> findAllByEmailAsc() {
		// TODO Auto-generated method stub
		return dao.findAllByEmailAsc();
	}

}
