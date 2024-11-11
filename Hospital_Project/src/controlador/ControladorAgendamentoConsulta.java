package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import modelo.Agendamento;
import visual.PanelAgendamentoConsulta;

public class ControladorAgendamentoConsulta implements ActionListener {
	PanelAgendamentoConsulta panelAgendamentoConsulta;
	ArrayList<Agendamento> consultasAgendadas;
	
	public ControladorAgendamentoConsulta(PanelAgendamentoConsulta panelAgendamentoConsulta) {
		this.panelAgendamentoConsulta = panelAgendamentoConsulta;
		consultasAgendadas = new ArrayList<Agendamento>();
		addEventos();
	}
	
	private void addEventos() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
