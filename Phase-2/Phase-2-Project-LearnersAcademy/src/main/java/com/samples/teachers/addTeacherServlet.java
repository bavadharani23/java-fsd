package com.samples.teachers;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.samples.domain.MasterClasses;
import com.samples.domain.MasterSubjects;
import com.samples.domain.MasterTeachers;
import com.samples.utils.HibernateUtil;

@WebServlet("/addTeacherServlet")
public class addTeacherServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	List<MasterTeachers> mtList = new ArrayList<>();
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Session session = HibernateUtil.getSessionFactory().openSession();

		Transaction txn = session.getTransaction();

		try {

			txn.begin();
			
			MasterTeachers mt = new MasterTeachers("T03","Paul");
		
			session.persist(mt);
			
			txn.commit();
			
			// saves data to the mtList
			mtList.add(mt);
			request.setAttribute("Teachers_List", mtList);
			
			RequestDispatcher rd = request.getRequestDispatcher("/listTeachers.jsp");
			rd.forward(request, response);
			
			PrintWriter out =response.getWriter();
			out.println("Operation Complete!");
			
		} catch (Exception ex) {
			if (txn != null) {
				txn.rollback();
			}
			ex.printStackTrace();
		} finally {
			if (session != null) {
				session.close();
			}
		}
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Session session = HibernateUtil.getSessionFactory().openSession();

		Transaction txn = session.getTransaction();

		try {

			txn.begin();
			
			MasterTeachers mt = new MasterTeachers("T03","Paul");
		
			session.persist(mt);
			
			txn.commit();
			
			// saves data to the mtList
			mtList.add(mt);
			request.setAttribute("Teachers_List", mtList);
			
			RequestDispatcher rd = request.getRequestDispatcher("/listTeachers.jsp");
			rd.forward(request, response);
						
			PrintWriter out =response.getWriter();
			out.println("Operation Complete!");

		} catch (Exception ex) {
			if (txn != null) {
				txn.rollback();
			}
			ex.printStackTrace();
		} finally {
			if (session != null) {
				session.close();
			}
		}
	}

}
