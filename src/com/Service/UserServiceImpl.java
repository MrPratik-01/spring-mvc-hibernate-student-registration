package com.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.DAO.DaoService;
import com.Entity.Student;

@Service
public class UserServiceImpl implements UserService{
	
//	In this layer we have to write business logic IF-ELSE
	
	@Autowired
	private DaoService ds;
	
	@Override
	public void Register(Student st) {

		System.out.println("I am in service layer");
		System.out.println(st);
		
		ds.registerInDao(st);
		
		
	}

	
	
}
