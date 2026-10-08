package com.DAO;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.Entity.Student;

@Repository
public class DaoImpl implements DaoService {
//	 This layer is use to write the logic of database.

	@Autowired
	private SessionFactory sf;
	
	@Override
	public void registerInDao(Student st) {
		System.out.println("I am in DAO Layer");
		
		System.out.println(st);
		
		Session s = sf.openSession();
		s.save(st);
		s.beginTransaction().commit();
		
		System.out.println("Student Saved...");
		
		
	}

}
