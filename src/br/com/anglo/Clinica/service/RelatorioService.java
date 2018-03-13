package br.com.anglo.Clinica.service;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Disjunction;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;

import br.com.anglo.Clinica.model.Paciente;
import br.com.anglo.Clinica.util.HibernateUtil;

public class RelatorioService {

	@SuppressWarnings({ "unchecked" })
	public List<Paciente> listRelatorio(String busca, Boolean alta,
			Boolean media, Boolean baixa, Boolean ortopedia,
			Boolean neurologia, Boolean cardiorrespiratorio,
			Boolean poliambulatorio, Boolean naodefinido) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Criteria consulta = session.createCriteria(Paciente.class);
		Disjunction or = Restrictions.disjunction();
		consulta.createAlias("triagem", "t");
		or.add(Restrictions.like("nome","%"+ busca+"%" , MatchMode.START));
		or.add(Restrictions.isNull("triagem"));
		if (alta) {
			or.add(Restrictions.like("t.prioridade", "alta"));
		}
		if (media) {
			or.add(Restrictions.like("t.prioridade", "media"));
		}
		if (baixa) {
			or.add(Restrictions.like("t.prioridade", "baixa"));
		}
		if (ortopedia) {
			or.add(Restrictions.like("t.area", "ortopedia"));
		}
		if (neurologia) {
			or.add(Restrictions.like("t.area", "neurologia"));
		}
		if (cardiorrespiratorio) {
			or.add(Restrictions.like("t.area", "cardiorrespiratorio"));
		}
		if (poliambulatorio) {
			or.add(Restrictions.like("t.area", "poliambulatorio"));
		}
		if (naodefinido) {
			or.add(Restrictions.like("t.area", "nao definido"));
		}
		consulta.add(or);
		consulta.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);
		return consulta.list();
	}

}
