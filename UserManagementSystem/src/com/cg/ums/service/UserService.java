package com.cg.ums.service;

import java.util.List;

import com.cg.ums.entities.User;

public interface UserService {
	
	public List<User> findByName(char i);
	public Long findCount();
	public List<User> findAllByEmailAsc();

}
