package br.com.anglo.Clinica.service;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Transaction;
import org.hibernate.classic.Session;

import br.com.anglo.Clinica.dao.GenericDao;
import br.com.anglo.Clinica.model.Paciente;
import br.com.anglo.Clinica.model.Usuario;
import br.com.anglo.Clinica.util.HibernateUtil;

public class UsuarioService {
	
	@SuppressWarnings("unchecked")
	public List<Usuario> buscaUsuario(String nome){
		Session session = HibernateUtil.getSessionFactory().openSession();
		Query q = session.createQuery("SELECT p FROM "+ Usuario.class.getName() + " as p WHERE p.nome like :nome");
		q.setParameter("nome", nome);
		List<Usuario> lista = q.list();
		session.close();
		return lista;
	}
	public List<Usuario> buscaTodosUsuarios(){
		Usuario u = new Usuario();
		GenericDao<Usuario> dao = new GenericDao<Usuario>(u);
		return dao.listar("From Usuario");
	}
	public void deleteUsuario(Usuario u){
		GenericDao<Usuario> dao = new GenericDao<Usuario>(u);
		dao.deletar();
	}
	public void adicionarUsuario(Usuario u){
		GenericDao<Usuario> dao = new GenericDao<Usuario>(u);
		dao.gravar();
	}
	public void atualizaUsuario(Usuario u){
		GenericDao<Usuario> dao = new GenericDao<Usuario>(u);
		dao.atualizar();
	}
}
