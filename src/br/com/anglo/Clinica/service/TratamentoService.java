package br.com.anglo.Clinica.service;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.classic.Session;

import br.com.anglo.Clinica.dao.GenericDao;
import br.com.anglo.Clinica.model.Paciente;
import br.com.anglo.Clinica.model.Tratamento;
import br.com.anglo.Clinica.util.HibernateUtil;

public class TratamentoService {
	List<Tratamento> tratamentos;

	public List<Tratamento> getAllTratamentos() {
		Tratamento t = new Tratamento();
		GenericDao<Tratamento> dao = new GenericDao<Tratamento>(t);
		tratamentos = dao.listar("FROM Tratamento");
		return tratamentos;
	}
	public void deleteTratamento(Tratamento t){
		GenericDao<Tratamento> dao = new GenericDao<Tratamento>(t);
		dao.deletar();
	}
	public void adicionarTratamento(Tratamento t){
		GenericDao<Tratamento> dao = new GenericDao<Tratamento>(t);
		dao.gravar();
	}
	public void atualizaTratamento(Tratamento t){
		GenericDao<Tratamento> dao = new GenericDao<Tratamento>(t);
		dao.atualizar();
	}
	@SuppressWarnings("unchecked")
	public List<Paciente> buscaPaciente(String descricao){
		Session session = HibernateUtil.getSessionFactory().openSession();
		Query q = session.createQuery("SELECT p FROM "+ Tratamento.class.getName() + " as p WHERE p.nome like :descricao");
		q.setParameter("descricao", descricao);
		List<Paciente> lista = q.list();
		session.close();
		return lista;
	}
}
