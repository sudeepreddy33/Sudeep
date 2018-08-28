package com.myhibernate;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DisplayServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String id = req.getParameter("empID");
		int empID = Integer.parseInt(id);

		Configuration c = new Configuration();
		c.configure();
		SessionFactory sf = c.buildSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();
		Employee e = (Employee) session.get(Employee.class, empID);
		PrintWriter pw = resp.getWriter();
		pw.println("Employee ID =" + e.getEmployeeId());
		pw.println("Employee Name =" + e.getEmployeeName());
		pw.println("Employee Salary =" + e.getEmployeeSalary());
		pw.println("Employee Age =" + e.getEmployeeAge());
		session.getTransaction().commit();
		session.close();
		sf.close();
	}

}
