package br.com.anglo.Clinica.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	private static final SessionFactory sessionFactory;
	static {
		try{
			Configuration cfg = new AnnotationConfiguration();
			cfg.configure("br/com/anglo/Clinica/util/hibernate.cfg.xml");
			sessionFactory = cfg.buildSessionFactory();
		} catch(Throwable ex){
			 System.err.println("-----------------------------Erro SessionFactory---------------------------------");
	         System.err.println("Initial SessionFactory creation failed." + ex);  
	         System.err.println("-----------------------------Fim SessionFactory---------------------------------");
	         throw new ExceptionInInitializerError(ex);  
		}
	}
	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}
}