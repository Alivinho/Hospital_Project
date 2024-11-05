package visual;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;

import java.awt.Color;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.BoxLayout;
import java.awt.Font;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

public class Frame extends JFrame{
	
	JMenuBar barraMenu;
	JMenu menuCadastrar;
	JMenu menuAgendamento;
	JMenu menuRelatorio; 
	
	JMenuItem itemCadastrarPaciente;
	JMenuItem itemCadastrarMedico;
	JMenuItem itemCadastrarMaterial;
	private JLabel lblNewLabel;
	private JMenu mnExame;
	private JMenu mnConsulta;
	
	public Frame() {
		super();
		getContentPane().setBackground(new Color(83, 169, 255));
		getContentPane().setLayout(null);
		getContentPane().add(getLblNewLabel());
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
			barraMenu.add(getAgendamento());
			barraMenu.add(getRelatorio());
			barraMenu.add(getMnExame());
			barraMenu.add(getMnConsulta());
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
	
	public JMenu getAgendamento() {
		if(menuAgendamento == null) {
			menuAgendamento = new JMenu();
			menuAgendamento.setText("Agendamentos");
		}
		return menuAgendamento;
	}
	
	public JMenu getRelatorio() {
		if(menuRelatorio == null) {
			menuRelatorio = new JMenu();
			menuRelatorio.setText("Relatórios");
		}
		return menuRelatorio;
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
			lblNewLabel.setBounds(395, 329, 155, 73);
			lblNewLabel.setForeground(new Color(255, 255, 255));
			lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 60));
		}
		return lblNewLabel;
	}
	private JMenu getMnExame() {
		if (mnExame == null) {
			mnExame = new JMenu();
			mnExame.setText("Exames");
		}
		return mnExame;
	}
	private JMenu getMnConsulta() {
		if (mnConsulta == null) {
			mnConsulta = new JMenu();
			mnConsulta.setText("Consultas");
		}
		return mnConsulta;
	}
}
