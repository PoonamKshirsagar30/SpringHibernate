package com.springhibernate;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springhibernate.dao.StudentDao;
import com.springhibernate.entity.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       
    ApplicationContext context= new ClassPathXmlApplicationContext("config.xml");
    StudentDao sd = context.getBean("studentDao",StudentDao.class);
    
    //student obj
    Student student = new Student(1234,"Tom","NY");
	/*
	 * student.setStudentId(1234); student.setStudentName("Tom");
	 * student.setCity("NY");
	 */
    
    int r = sd.insert(student);
    System.out.println("Done!" + r);
    	
    }
}
