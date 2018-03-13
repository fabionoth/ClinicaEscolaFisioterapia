package br.com.anglo.Clinica.service;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.classic.Session;

import br.com.anglo.Clinica.dao.GenericDao;
import br.com.anglo.Clinica.model.Paciente;
import br.com.anglo.Clinica.util.HibernateUtil;

public class PacienteService {
	List<Paciente> pacientes;

	public List<Paciente> getAllPacientes() {
		Paciente p = new Paciente();
		GenericDao<Paciente> dao = new GenericDao<Paciente>(p);
		pacientes = dao.listar("FROM Paciente");
		return pacientes;
	}
	public void deletePaciente(Paciente p){
		GenericDao<Paciente> dao = new GenericDao<Paciente>(p);
		dao.deletar();
	}
	public void adicionarPaciente(Paciente p){
		GenericDao<Paciente> dao = new GenericDao<Paciente>(p);
		dao.gravar();
	}
	public void atualizaPaciente(Paciente p){
		GenericDao<Paciente> dao = new GenericDao<Paciente>(p);
		dao.atualizar();
	}
	
	public List<Paciente> buscaPaciente(String nome){
		Session session = HibernateUtil.getSessionFactory().openSession();
		Query q = session.createQuery("SELECT p FROM "+ Paciente.class.getName() + " as p WHERE p.nome like :nome");
		q.setParameter("nome", nome);
		List<Paciente> lista = q.list();
		session.close();
		return lista;
	}
	public void editPaciente(Paciente p){
		GenericDao<Paciente> dao = new GenericDao<Paciente>(p);
		dao.atualizar();
	}
}
