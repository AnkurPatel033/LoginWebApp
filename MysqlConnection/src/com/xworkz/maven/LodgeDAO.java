package com.xworkz.maven;

import org.hibernate.HibernateError;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.mysql.jdbc.interceptors.SessionAssociationInterceptor;

public class LodgeDAO {

	public LodgeDAO() {

		System.out.println("created /t:" + this.getClass().getName());
	}

	public void save(LoadgDTO dto) {
		SessionFactory sf = null;
		Session ss = null;
		Transaction tx = null;
		
		try {
			Configuration config = new Configuration();
			config.configure("resources/hibernate.cfg.xml");
			sf = config.buildSessionFactory();
			ss = sf.openSession();
			tx = ss.beginTransaction();
			int i = (int) ss.save(dto);
			tx.commit();
			System.out.println("Inserted Record sucessfully..");
		} catch (HibernateError e) {
			e.printStackTrace();
		} finally {
			ss.close();
		}
	}

}
