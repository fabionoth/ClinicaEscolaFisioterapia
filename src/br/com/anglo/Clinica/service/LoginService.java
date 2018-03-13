package br.com.anglo.Clinica.service;

import java.awt.EventQueue;
import java.util.ArrayList;
import java.util.List;

import javax.swing.UIManager;

import br.com.anglo.Clinica.dao.GenericDao;
import br.com.anglo.Clinica.model.Sessao;
import br.com.anglo.Clinica.model.Usuario;
import br.com.anglo.Clinica.view.MainFrame;

public class LoginService {
	private String usuario;
	private String senha;
	private boolean valido = false;
	private Usuario usuarioBean;
	
	public LoginService(){
	}
	public LoginService(String usuario, String senha) {
		this.usuario = usuario;
		this.senha = senha;
		busca();
	}

	public void busca() {
		GenericDao<Usuario> dao = new GenericDao<Usuario>();
		List<Usuario> usuarios = new ArrayList<Usuario>(); 
		usuarios = dao.listar("FROM Usuario");
		for (Usuario u : usuarios) {
			if (usuario.equals(u.getUsuario()) && senha.equals(u.getSenha())) {
				usuarioBean = u;
				Sessao sessao = Sessao.getInstance();
				sessao.setUsuario(u);
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							 UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
					            EventQueue.invokeLater(new Runnable() {
					                public void run() {
					                	new MainFrame();
					                }
					            });
					            MainFrame window =  new MainFrame();
					            window.frmJfisio.setVisible(true);
							
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
				valido = true;
				break;
			} 
		}
	}

	public boolean isValido() {
		return valido;
	}

	public void setValido(boolean valido) {
		this.valido = valido;
	}

	public Usuario getUsuarioBean() {
		return usuarioBean;
	}

	public void setUsuarioBean(Usuario usuarioBean) {
		this.usuarioBean = usuarioBean;
	}
	
	
}

