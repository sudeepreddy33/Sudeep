package com.myhibernate;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class UpdateServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String id = req.getParameter("empID");
		String name = req.getParameter("empname");
		String salary = req.getParameter("empsalary");
		String age = req.getParameter("empage");
		int empID = Integer.parseInt(id);
		int empSalary = Integer.parseInt(salary);
		int empAge = Integer.parseInt(age);
		Configuration c = new Configuration();
		c.configure();
		SessionFactory sf = c.buildSessionFactory();
		Session session = sf.openSession();
		Employee e = new Employee();
		e.setEmployeeId(empID);
		e.setEmployeeName(name);
		e.setEmployeeSalary(empSalary);
		e.setEmployeeAge(empAge);
		session.beginTransaction();
		session.update(e);
		session.getTransaction().commit();
		session.close();
		sf.close();

	}

}
