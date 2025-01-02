package com.springhibernate.dao;

import javax.transaction.Transactional;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.springhibernate.entity.Student;


public class StudentDao {
private HibernateTemplate hibernateTemplate;


	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	
	@Transactional
	public int insert(Student student)
	{
		//insert student
		Integer i =(Integer) this.hibernateTemplate.save(student);
		return i;
	}
}
