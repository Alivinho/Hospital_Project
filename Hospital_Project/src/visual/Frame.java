package visual;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.BoxLayout;
import java.awt.Font;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;

public class Frame extends JFrame{
	
	JMenuBar barraMenu;
	JMenu menuCadastrar;
	JMenu menuAgendamentos;
	JMenu menuRelatorios; 
	
	JMenuItem itemCadastrarPaciente;
	JMenuItem itemCadastrarMedico;
	JMenuItem itemCadastrarMaterial;
	private JLabel lblNewLabel;
	
	public Frame() {
		super();
		getContentPane().setBackground(new Color(83, 169, 255));
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addContainerGap(421, Short.MAX_VALUE)
					.addComponent(getLblNewLabel())
					.addGap(389))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addContainerGap(316, Short.MAX_VALUE)
					.addComponent(getLblNewLabel())
					.addGap(283))
		);
		getContentPane().setLayout(groupLayout);
		setBackground(new Color(0, 128, 255));
		this.setVisible(true);
		this.setSize(960, 790);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setJMenuBar(getBarraMenu());

	}
	
	/****************************** COMPONENTES DA BARRA DE MENU ******************************/ 
	
	public JMenuBar getBarraMenu() {
		if(barraMenu == null) {
			barraMenu = new JMenuBar();
			barraMenu.add(getCadastrar());
			barraMenu.add(getAgendamentos());
			barraMenu.add(getRelatorios());
		}
		return barraMenu;
	}
	
	public JMenu getCadastrar() {
		if(menuCadastrar == null) {
			menuCadastrar = new JMenu();
			menuCadastrar.setText("Cadastrar");
			menuCadastrar.add(getCadastrarPaciente());
			menuCadastrar.add(getCadastrarMedico());
			menuCadastrar.add(getCadastrarMaterial());

		}
		return menuCadastrar;
	}
	
	public JMenu getAgendamentos() {
		if(menuAgendamentos == null) {
			menuAgendamentos = new JMenu();
			menuAgendamentos.setText("Agendamentos");
		}
		return menuAgendamentos;
	}
	
	public JMenu getRelatorios() {
		if(menuRelatorios == null) {
			menuRelatorios = new JMenu();
			menuRelatorios.setText("Relatórios");
		}
		return menuRelatorios;
	}
	
	
	/****************************** ITENS DOS COMPONENTES DO MENU ******************************/ 
	
	
	public JMenuItem getCadastrarPaciente() {
		if(itemCadastrarPaciente == null) {
			itemCadastrarPaciente = new JMenuItem();
			itemCadastrarPaciente.setText("Paciente");
		}
		return itemCadastrarPaciente;
	}
	
	public JMenuItem getCadastrarMedico() {
		if(itemCadastrarMedico == null) {
			itemCadastrarMedico = new JMenuItem();
			itemCadastrarMedico.setText("Médico");
		}
		return itemCadastrarMedico;
	}
	
	public JMenuItem getCadastrarMaterial() {
		if(itemCadastrarMaterial == null) {
			itemCadastrarMaterial = new JMenuItem();
			itemCadastrarMaterial.setText("Material");
		}
		return itemCadastrarMaterial;
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("Home");
			lblNewLabel.setForeground(new Color(255, 255, 255));
			lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 60));
		}
		return lblNewLabel;
	}
}
