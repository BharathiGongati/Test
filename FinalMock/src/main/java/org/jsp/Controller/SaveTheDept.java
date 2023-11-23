package org.jsp.Controller;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.jsp.Dto.Department;
import org.jsp.Dto.Employee;

public class SaveTheDept {
	public static void main(String[] args) {
		Employee e1=new Employee();
		e1.setName("bharu");
		e1.setPhone(777);
		e1.setPassword("bah@123");
		e1.setSalary(20000);
		e1.setDesignation("software");
		
		Employee e2=new Employee();
		
		e2.setName("harshu");
		e2.setPhone(999);
		e2.setPassword("har@123");
		e2.setSalary(30000);
		e2.setDesignation("accounting");
		
		Employee e3=new Employee();
		
		e3.setName("bittu");
		e3.setPhone(888);
		e3.setPassword("bit@123");
		e3.setSalary(40000);
		e3.setDesignation("trainer");
		
		Department d=new Department();
		d.setName("ABC");
		d.setLocation("Bangalore");
		List<Employee> emp=new ArrayList<Employee>();
		emp.add(e1);
		emp.add(e2);
		emp.add(e3);
		
		d.setEmployees(emp);
		
		EntityManager manager=Persistence.createEntityManagerFactory("dev").createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		manager.persist(d);
		transaction.begin();
		transaction.commit();
		
		
	}

}
