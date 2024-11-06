package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import visual.Frame;
import visual.PanelAgendamento;
import visual.PanelCadastrarMaterial;
import visual.PanelCadastrarMedico;
import visual.PanelCadastrarPaciente;
import visual.PanelConsulta;
import visual.PanelExame;
import visual.PanelRelatorio;

public class ControladorFrame implements ActionListener{
	Frame frame; 
	
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
	
	
	public ControladorFrame() {
		frame = new Frame();
		addEventos();
	}
	
	private void addEventos() {
		frame.getMenuHome().addActionListener(this);
		frame.getCadastrarPaciente().addActionListener(this);
		frame.getCadastrarMedico().addActionListener(this);	
		frame.getCadastrarMaterial().addActionListener(this);	
		frame.getItemCadastrarConsulta().addActionListener(this);
		frame.getItemCadastrarExame().addActionListener(this);

	}
	
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == frame.getCadastrarPaciente()) {
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
		}
	}

	public static void main(String[] args) {
		new ControladorFrame();
		
	}

}
