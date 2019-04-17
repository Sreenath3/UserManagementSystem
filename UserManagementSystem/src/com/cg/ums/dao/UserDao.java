package com.cg.ums.dao;

import com.cg.ums.entities.User;
import java.util.List;



public interface UserDao {
	public List<User> findByName(char i);
	public Long findCount();
	public List<User> findAllByEmailAsc();
	
	

}
