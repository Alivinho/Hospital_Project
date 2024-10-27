package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import visual.Frame;
import visual.PanelCadastrarPaciente;

public class ControladorFrame implements ActionListener{
	
	Frame frame; 
	
	PanelCadastrarPaciente panelCadastrarPaciente;
	ControladorCadastrarPaciente controladorCadastrarPaciente; 
	
	
	
	
	public ControladorFrame() {
		frame = new Frame();
		addEventos();
	}
	
	private void addEventos() {
		frame.getCadastrarPaciente().addActionListener(this);		
	}
	
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == frame.getCadastrarPaciente()) {
			panelCadastrarPaciente = new PanelCadastrarPaciente();
			controladorCadastrarPaciente = new ControladorCadastrarPaciente(panelCadastrarPaciente);
			frame.setContentPane(panelCadastrarPaciente);
		}
		
	}

	


	public static void main(String[] args) {
		new ControladorFrame();
		

	}

}
