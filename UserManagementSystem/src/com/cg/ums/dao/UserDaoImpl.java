package com.cg.ums.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import com.cg.ums.entities.User;

public class UserDaoImpl implements UserDao {
	

	private EntityManager entityManager;

	public UserDaoImpl() {
		entityManager = JPAUtil.getEntityManager();
	}

	@Override
	public List<User> findByName(char i) {
		String qStr = "SELECT user FROM User user WHERE user.name LIKE:pname";
		TypedQuery<User> query = entityManager.createQuery(qStr, User.class);
		query.setParameter("pname", "%"+i);
		return query.getResultList();
		
		
		
		
		
		
		// TODO Auto-generated method stub
		
	}

	@Override
	public Long findCount() {
		// TODO Auto-generated method stub
		String qStr = "SELECT COUNT(user.id) FROM User user";
		TypedQuery<Long> query = entityManager.createQuery(qStr,
				Long.class);
		Long count = query.getSingleResult();
		return count;
		
	}

	@Override
	public List<User> findAllByEmailAsc() {
		// TODO Auto-generated method stub
		Query query = entityManager.createNamedQuery("getAllUsers");
		@SuppressWarnings("unchecked")
		List<User> nameList = query.getResultList();
		return nameList;
	}

}
