package br.com.anglo.Clinica.service;

import org.hibernate.Transaction;
import org.hibernate.classic.Session;

import br.com.anglo.Clinica.dao.GenericDao;
import br.com.anglo.Clinica.model.Paciente;
import br.com.anglo.Clinica.model.Triagem;
import br.com.anglo.Clinica.util.HibernateUtil;

public class TriagemService {
	
	public void addTriagem(Triagem t){
		GenericDao<Triagem> dao = new GenericDao<Triagem>(t);
		dao.gravar();
	}
	public void editTriagem(Triagem t){
		GenericDao<Triagem> dao = new GenericDao<Triagem>(t);
		dao.atualizar();
	}
}
