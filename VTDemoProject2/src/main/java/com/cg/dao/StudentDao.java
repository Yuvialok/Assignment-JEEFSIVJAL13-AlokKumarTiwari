package com.cg.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.cg.entity.Student;

@Transactional
@Repository
public class StudentDao implements IStudentDao 
{

	@PersistenceContext
	EntityManager em;
	
	@Override
	public void create(Student s) 
	{
		em.persist(s);
	}

	@Override
	public List retrive() {
		Query q=em.createQuery("from Student s");
		return q.getResultList();
	}

	@Override
	public Student findById(int id) {
		return em.find(Student.class, id);
	}

	@Override
	public void delete(int id) {
		em.remove(em.find(Student.class, 4));
	}

	@Override
	public void update(int id) 
	{
		Student stu = em.find(Student.class, 3);
		stu.setName("Yash");
	}
}
