package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import visual.Frame;
import visual.PanelAgendamentoConsulta;
import visual.PanelAgendamentoExame;
import visual.PanelCadastrarMaterial;
import visual.PanelCadastrarMedico;
import visual.PanelCadastrarPaciente;
import visual.PanelCancelamentoReagendamento;
import visual.PanelConsulta;
import visual.PanelExame;
import visual.PanelHome;
import visual.PanelPesquisaHorario;
import visual.PanelRelatorioConsulta;
import visual.PanelRelatorioExame;
import visual.PanelRelatorioFinanceiro;
import visual.PanelRelatorioMaterial;
import visual.PanelVisualizacaoAgenda;


public class ControladorFrame implements ActionListener{
	Frame frame; 
	
	PanelHome panelHome;
//	ControladorHome controladorHome; 
	
	PanelCadastrarPaciente panelCadastrarPaciente;
	ControladorCadastrarPaciente controladorCadastrarPaciente; 
	
	PanelCadastrarMedico panelCadastrarMedico;
	ControladorCadastrarMedico controladorCadastrarMedico; 
	
	PanelCadastrarMaterial panelCadastrarMaterial;
	ControladorCadastrarMaterial controladorCadastrarMaterial;
	
	PanelConsulta panelConsulta;
	ControladorConsulta controladorConsulta;
	
	PanelExame panelExame;
	ControladorExame controladorExame;
	
	PanelAgendamentoConsulta panelAgendamentoConsulta;
//	ControladorAgendamentoConsulta controladorAgendamentoConsulta;
	
	PanelAgendamentoExame panelAgendamentoExame;
//	ControladorAgendamentoExame controladorAgendamentoExame;
	
	PanelVisualizacaoAgenda panelVisualizacaoAgenda;
//	ControladorExame controladorExame;
	
	PanelPesquisaHorario panelPesquisaHorario;
//	ControladorPesquisaHorario controladorPesquisaHorario;
	
	PanelCancelamentoReagendamento panelCancelamentoReagendamento;
//	ControladorExame controladorExame;
	
	PanelRelatorioConsulta panelRelatorioConsulta;
//	ControladorRelatorioConsulta controladorRelatorioConsulta;
	
	PanelRelatorioExame panelRelatorioExame;
//	ControladorRelatorioExame controladorRelatorioExame;
	
	PanelRelatorioFinanceiro panelRelatorioFinanceiro;
//	ControladorRelatorioFinanceiro controladorRelatorioFinanceiro;
	
	PanelRelatorioMaterial panelRelatorioMaterial;
//	ControladorlRelatorioMaterial controladorlRelatorioMaterial;
	
	
	public ControladorFrame() {
		frame = new Frame();
		addEventos();
	}
	
	private void addEventos() {
		frame.getItemHome().addActionListener(this);
		frame.getCadastrarPaciente().addActionListener(this);
		frame.getCadastrarMedico().addActionListener(this);	
		frame.getCadastrarMaterial().addActionListener(this);	
		frame.getItemCadastrarConsulta().addActionListener(this);
		frame.getItemCadastrarExame().addActionListener(this);
		
		frame.getItemAgendamentoConsulta().addActionListener(this);
		frame.getItemAgendamentoExame().addActionListener(this);
		frame.getItemVisualizacaoAgenda().addActionListener(this);
		frame.getItemPesquisaHorario().addActionListener(this);
		frame.getItemCancelamentoReagendamento().addActionListener(this);
		
		frame.getItemRelatorioConsulta().addActionListener(this);
		frame.getItemRelatorioExame().addActionListener(this);
		frame.getItemRelatorioFinanceiro().addActionListener(this);
		frame.getItemRelatorioMaterial().addActionListener(this);
	}
	
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == frame.getItemHome()) {
			panelHome = new PanelHome();
//			controladorCadastrarPaciente = new ControladorCadastrarPaciente(panelCadastrarPaciente);
			frame.setContentPane(panelHome);
	        frame.revalidate(); 
	        frame.repaint(); 
		} else if(e.getSource() == frame.getCadastrarPaciente()) {
			panelCadastrarPaciente = new PanelCadastrarPaciente();
			controladorCadastrarPaciente = new ControladorCadastrarPaciente(panelCadastrarPaciente);
			frame.setContentPane(panelCadastrarPaciente);
	        frame.revalidate(); 
	        frame.repaint(); 
		} else if(e.getSource() == frame.getCadastrarMedico()) {
			panelCadastrarMedico = new PanelCadastrarMedico();
			controladorCadastrarMedico = new ControladorCadastrarMedico(panelCadastrarMedico);
			frame.setContentPane(panelCadastrarMedico); 
	        frame.revalidate(); 
	        frame.repaint();
			
		}else if(e.getSource() == frame.getCadastrarMaterial()) {
			panelCadastrarMaterial = new PanelCadastrarMaterial();
			controladorCadastrarMaterial = new ControladorCadastrarMaterial(panelCadastrarMaterial);
			frame.setContentPane(panelCadastrarMaterial); 
	        frame.revalidate(); 
	        frame.repaint();
		} else if(e.getSource() == frame.getItemCadastrarConsulta()) {
			panelConsulta = new PanelConsulta();
			controladorConsulta = new ControladorConsulta(panelConsulta);
			frame.setContentPane(panelConsulta); 
	        frame.revalidate(); 
	        frame.repaint();
		} else if(e.getSource() == frame.getItemCadastrarExame()) {
			panelExame = new PanelExame();
			controladorExame = new ControladorExame(panelExame);
			frame.setContentPane(panelExame); 
	        frame.revalidate(); 
	        frame.repaint();
		} else if(e.getSource() == frame.getItemAgendamentoConsulta()) {
			panelAgendamentoConsulta = new PanelAgendamentoConsulta();
//			controladorAgendamentoConsulta = new ControladorAgendamentoConsulta(panelExame);
			frame.setContentPane(panelAgendamentoConsulta); 
	        frame.revalidate(); 
	        frame.repaint();
		} else if(e.getSource() == frame.getItemAgendamentoExame()) {
			panelAgendamentoExame = new PanelAgendamentoExame();
//			controladorAgendamentoConsulta = new ControladorAgendamentoConsulta(panelExame);
			frame.setContentPane(panelAgendamentoExame); 
	        frame.revalidate(); 
	        frame.repaint();
		} else if(e.getSource() == frame.getItemVisualizacaoAgenda()) {
			panelVisualizacaoAgenda = new PanelVisualizacaoAgenda();
//			controladorAgendamentoConsulta = new ControladorAgendamentoConsulta(panelExame);
			frame.setContentPane(panelVisualizacaoAgenda); 
	        frame.revalidate(); 
	        frame.repaint();
		} else if(e.getSource() == frame.getItemPesquisaHorario()) {
			panelPesquisaHorario = new PanelPesquisaHorario();
//			controladorAgendamentoConsulta = new ControladorAgendamentoConsulta(panelExame);
			frame.setContentPane(panelPesquisaHorario); 
	        frame.revalidate(); 
	        frame.repaint();
		} else if(e.getSource() == frame.getItemCancelamentoReagendamento()) {
			panelCancelamentoReagendamento = new PanelCancelamentoReagendamento();
//			controladorAgendamentoConsulta = new ControladorAgendamentoConsulta(panelExame);
			frame.setContentPane(panelCancelamentoReagendamento); 
	        frame.revalidate(); 
	        frame.repaint();
		} else if(e.getSource() == frame.getItemRelatorioConsulta()) {
			panelRelatorioConsulta = new PanelRelatorioConsulta();
//			controladorAgendamentoConsulta = new ControladorAgendamentoConsulta(panelExame);
			frame.setContentPane(panelRelatorioConsulta); 
	        frame.revalidate(); 
	        frame.repaint();
		} else if(e.getSource() == frame.getItemRelatorioExame()) {
			panelRelatorioExame = new PanelRelatorioExame();
//			controladorRelatorioExame = new ControladorRelatorioExame(panelExame);
			frame.setContentPane(panelRelatorioExame); 
	        frame.revalidate(); 
	        frame.repaint();
		} else if(e.getSource() == frame.getItemRelatorioFinanceiro()) {
			panelRelatorioFinanceiro = new PanelRelatorioFinanceiro();
//			controladorAgendamentoConsulta = new ControladorAgendamentoConsulta(panelExame);
			frame.setContentPane(panelRelatorioFinanceiro); 
	        frame.revalidate(); 
	        frame.repaint();
		} else if(e.getSource() == frame.getItemRelatorioMaterial()) {
			panelRelatorioMaterial = new PanelRelatorioMaterial();
//			controladorAgendamentoConsulta = new ControladorAgendamentoConsulta(panelExame);
			frame.setContentPane(panelRelatorioMaterial); 
	        frame.revalidate(); 
	        frame.repaint();
		}
			
	}

	public static void main(String[] args) {
		new ControladorFrame();
		
	}

}
