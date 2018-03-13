package br.com.anglo.Clinica.view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

import br.com.anglo.Clinica.model.Sessao;

public class MainFrame {

	public JFrame frmJfisio;
	public JPanel panelPaciente;
	public JPanel panelUsuario;

	/**
	 * Create the application.
	 */
	public MainFrame() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmJfisio = new JFrame();
		frmJfisio.setTitle("jFisio");
		frmJfisio.setResizable(false);
		frmJfisio.setMinimumSize(new Dimension(800,600));
		frmJfisio.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmJfisio.setLocationRelativeTo(null);
		JMenuBar menuBar = new JMenuBar();
		frmJfisio.setJMenuBar(menuBar);
		

		JMenuItem mntmInicio = new JMenuItem("Inicio");
		mntmInicio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				inicio();
			}
		});
		mntmInicio.setIcon(new ImageIcon(MainFrame.class.getResource("/br/com/anglo/Clinica/icons/home.png")));
		mntmInicio.setMaximumSize(new Dimension(100,100));
		menuBar.add(mntmInicio);
		
		JMenuItem mntmPacientes = new JMenuItem("Pacientes");
		mntmPacientes.setIcon(new ImageIcon(MainFrame.class.getResource("/br/com/anglo/Clinica/icons/hire-me.png")));
		mntmPacientes.setBackground(new Color(240, 240, 240));
		mntmPacientes.setMaximumSize(new Dimension(100,100));
		mntmPacientes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frmJfisio.getContentPane().removeAll();
				panelPaciente = new PanelPacientes();
				frmJfisio.getContentPane().add(panelPaciente);
				frmJfisio.repaint();
			}
		});
		mntmPacientes.setMaximumSize(new Dimension(100,100));
		menuBar.add(mntmPacientes);
		
		
		JMenuItem mntmUsuarios = new JMenuItem("Usuarios");
		mntmUsuarios.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmJfisio.getContentPane().removeAll();
				panelUsuario= new PanelUsuario();
				frmJfisio.getContentPane().add(panelUsuario);
				frmJfisio.repaint();
			}
		});
		mntmUsuarios.setIcon(new ImageIcon(MainFrame.class.getResource("/br/com/anglo/Clinica/icons/suppliers.png")));
		mntmUsuarios.setMaximumSize(new Dimension(100,100));
		menuBar.add(mntmUsuarios);
		
		JMenuItem mntmRelatrios = new JMenuItem("Relat\u00F3rios");
		mntmRelatrios.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frmJfisio.getContentPane().removeAll();
				frmJfisio.getContentPane().add(new PanelRelatorios());
				frmJfisio.repaint();
			}
		});
		mntmRelatrios.setIcon(new ImageIcon(MainFrame.class.getResource("/br/com/anglo/Clinica/icons/attibutes.png")));
		mntmRelatrios.setMaximumSize(new Dimension(100,100));
		menuBar.add(mntmRelatrios);
		
		JMenuItem mntmAjuda = new JMenuItem("Ajuda");
		mntmAjuda.setIcon(new ImageIcon(MainFrame.class.getResource("/br/com/anglo/Clinica/icons/ajuda.png")));
		mntmAjuda.setMaximumSize(new Dimension(100,100));
		menuBar.add(mntmAjuda);
		frmJfisio.getContentPane().setLayout(new GridLayout(1, 0, 0, 0));
	}
	void inicio(){
		System.out.println(Sessao.getInstance().getUsuario().getTipo());
		if(Sessao.getInstance().getUsuario().getTipo().equals("estagiario")){
			frmJfisio.getContentPane().removeAll();
			frmJfisio.getContentPane().add(new PanelInicialEstagiario());
			frmJfisio.repaint();
		}else if(Sessao.getInstance().getUsuario().getTipo().equals("supervisor")){
			frmJfisio.getContentPane().removeAll();
			frmJfisio.getContentPane().add(new PanelInicialSupervisor());
			frmJfisio.repaint();
		}
	}

}
