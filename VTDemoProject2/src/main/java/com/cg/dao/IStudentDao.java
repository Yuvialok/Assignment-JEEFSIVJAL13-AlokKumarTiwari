package com.cg.dao;

import java.util.List;

import com.cg.entity.Student;

public interface IStudentDao 
{
	public void create(Student s);
	public List<Student> retrive();
	public Student findById(int id);
	public void delete(int id);
	public void update(int id);
}
