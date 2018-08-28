package com.myhibernate;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DeleteServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String id = req.getParameter("empID");
		int empID = Integer.parseInt(id);
		Configuration c = new Configuration();
		c.configure();
		SessionFactory sf = c.buildSessionFactory();
		Session session = sf.openSession();
		Employee e = new Employee();
		e.setEmployeeId(empID);
//		Query query = session.createQuery("delete from employee_1 where employeeId='empID'" );
		session.beginTransaction();
		session.delete(e);
		PrintWriter pw = resp.getWriter();
		pw.println("New Employee Record Deleted with Employee ID"+empID);
		session.getTransaction().commit();
		session.close();
		sf.close();

	}

}
