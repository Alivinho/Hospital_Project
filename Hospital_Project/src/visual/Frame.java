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
	private JLabel labelHome;
	private JMenu menuExame;
	private JMenu menuConsulta;
	private JMenuItem itemRelatorioConsulta;
	private JMenuItem itemAgendamentoConsulta;
	private JMenuItem itemRelatorioExame;
	private JMenuItem itemRelatorioFinanceiro;
	private JMenuItem itemRelatorioMateriais;
	private JMenuItem itemCadastrarExame;
	private JMenuItem itemAgendamentoExame;
	private JMenuItem itemVisualizacaoAgenda;
	private JMenuItem itemPesquisaHorario;
	private JMenuItem itemCancelamentoReagendamento;
	private JMenuItem itemCadastrarConsulta;
	
	public Frame() {
		super();
		getContentPane().setBackground(new Color(83, 169, 255));
		getContentPane().setLayout(null);
		getContentPane().add(getLabelHome());
		setBackground(new Color(0, 128, 255));
		this.setVisible(true);
		this.setSize(960, 790);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setJMenuBar(getBarraMenu());
	}
	
	public JLabel getLabelHome() {
		if (labelHome == null) {
			labelHome = new JLabel("Home");
			labelHome.setBounds(395, 329, 155, 73);
			labelHome.setForeground(new Color(255, 255, 255));
			labelHome.setFont(new Font("Tahoma", Font.PLAIN, 60));
		}
		return labelHome;
	}
	
	/****************************** COMPONENTES DA BARRA DE MENU ******************************/ 
	
	public JMenuBar getBarraMenu() {
		if(barraMenu == null) {
			barraMenu = new JMenuBar();
			barraMenu.add(getCadastrar());
			barraMenu.add(getAgendamento());
			barraMenu.add(getRelatorio());
			barraMenu.add(getMenuExame());
			barraMenu.add(getMenuConsulta());
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
			menuAgendamento.add(getItemAgendamentoConsulta());
			menuAgendamento.add(getItemAgendamentoExame());
			menuAgendamento.add(getItemVisualizacaoAgenda());
			menuAgendamento.add(getItemPesquisaHorario());
			menuAgendamento.add(getItemCancelamentoReagendamento());
		}
		return menuAgendamento;
	}
	
	public JMenu getRelatorio() {
		if(menuRelatorio == null) {
			menuRelatorio = new JMenu();
			menuRelatorio.setText("Relatórios");
			menuRelatorio.add(getItemRelatorioConsulta());
			menuRelatorio.add(getItemRelatorioExame());
			menuRelatorio.add(getItemRelatorioFinanceiro());
			menuRelatorio.add(getItemRelatorioMateriais());
		}
		return menuRelatorio;
	}
	
	public JMenu getMenuExame() {
		if (menuExame == null) {
			menuExame = new JMenu();
			menuExame.setText("Exames");
			menuExame.add(getItemCadastrarExame());
		}
		return menuExame;
	}
	public JMenu getMenuConsulta() {
		if (menuConsulta == null) {
			menuConsulta = new JMenu();
			menuConsulta.setText("Consultas");
			menuConsulta.add(getItemCadastrarConsulta());
		}
		return menuConsulta;
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
	
	public JMenuItem getItemRelatorioConsulta() {
		if (itemRelatorioConsulta == null) {
			itemRelatorioConsulta = new JMenuItem();
			itemRelatorioConsulta.setText("Relatório de Consulta");
		}
		return itemRelatorioConsulta;
	}
	public JMenuItem getItemAgendamentoConsulta() {
		if (itemAgendamentoConsulta == null) {
			itemAgendamentoConsulta = new JMenuItem("Agendamento de Consultas");
		}
		return itemAgendamentoConsulta;
	}
	public JMenuItem getItemRelatorioExame() {
		if (itemRelatorioExame == null) {
			itemRelatorioExame = new JMenuItem("Relatório de Exame");
		}
		return itemRelatorioExame;
	}
	public JMenuItem getItemRelatorioFinanceiro() {
		if (itemRelatorioFinanceiro == null) {
			itemRelatorioFinanceiro = new JMenuItem("Relatório Financeiro");
		}
		return itemRelatorioFinanceiro;
	}
	public JMenuItem getItemRelatorioMateriais() {
		if (itemRelatorioMateriais == null) {
			itemRelatorioMateriais = new JMenuItem("Relatório de Materiais");
		}
		return itemRelatorioMateriais;
	}
	public JMenuItem getItemCadastrarExame() {
		if (itemCadastrarExame == null) {
			itemCadastrarExame = new JMenuItem("Cadastrar Exame");
		}
		return itemCadastrarExame;
	}
	public JMenuItem getItemAgendamentoExame() {
		if (itemAgendamentoExame == null) {
			itemAgendamentoExame = new JMenuItem("Agendamento de Exames");
		}
		return itemAgendamentoExame;
	}
	public JMenuItem getItemVisualizacaoAgenda() {
		if (itemVisualizacaoAgenda == null) {
			itemVisualizacaoAgenda = new JMenuItem("Visualização de Agenda");
		}
		return itemVisualizacaoAgenda;
	}
	public JMenuItem getItemPesquisaHorario() {
		if (itemPesquisaHorario == null) {
			itemPesquisaHorario = new JMenuItem("Pesquisa de Horários");
		}
		return itemPesquisaHorario;
	}
	public JMenuItem getItemCancelamentoReagendamento() {
		if (itemCancelamentoReagendamento == null) {
			itemCancelamentoReagendamento = new JMenuItem("Cancelamento e Reagendamento");
		}
		return itemCancelamentoReagendamento;
	}
	public JMenuItem getItemCadastrarConsulta() {
		if (itemCadastrarConsulta == null) {
			itemCadastrarConsulta = new JMenuItem("Cadastrar Consulta");
		}
		return itemCadastrarConsulta;
	}
}
