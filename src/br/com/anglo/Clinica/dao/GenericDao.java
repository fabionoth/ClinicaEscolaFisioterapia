package br.com.anglo.Clinica.dao;


import java.util.ArrayList;
import java.util.List;
import org.hibernate.Transaction;
import org.hibernate.classic.Session;

import br.com.anglo.Clinica.util.HibernateUtil;



public class GenericDao<T> {

	private T t;

	public GenericDao() {
	}

	public GenericDao(T t) {
		this.t = t;
	}

	public void gravar() {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tr = session.beginTransaction();
		session.save(t);
		tr.commit();
		session.close();
	}

	public void deletar() {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tr = session.beginTransaction();
		session.delete(t);
		tr.commit();
		session.close();
	}

	public void atualizar() {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tr = session.beginTransaction();
		session.update(t);
		tr.commit();
		session.close();
	}

	public List<T> listar(String hql) {
		List<T> lista = new ArrayList<T>();
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tr = session.beginTransaction();
		lista = session.createQuery(hql).list();
		session.close();
		return lista;
	}
}
