package com.factory;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FactoryProvider {

	private static SessionFactory sf ;
	
	static
	{
		sf = new Configuration().configure().buildSessionFactory();
	}
	public static Session getsession()
	{
		return sf.openSession();
	}
}
