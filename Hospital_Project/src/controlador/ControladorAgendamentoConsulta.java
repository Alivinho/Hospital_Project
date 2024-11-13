package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JOptionPane;

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
		panelAgendamentoConsulta.getBtnAgendar().addActionListener(this);  
		panelAgendamentoConsulta.getBtnLimpar().addActionListener(this);  
		
	}

	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == panelAgendamentoConsulta.getBtnAgendar()) {
			agendarConsulta();
		}else if(e.getSource() == panelAgendamentoConsulta.getBtnLimpar()){
			limparCampos();
		}	
		
	}


	public void agendarConsulta() {
		try {
			
			String medico = panelAgendamentoConsulta.getTextFieldMedico().getText().trim();
			String paciente = panelAgendamentoConsulta.getTextFieldPaciente().getText().trim();
			String data = panelAgendamentoConsulta.getTextFieldData().getText().trim();
			String hora = panelAgendamentoConsulta.getTextFieldHorario().getText().trim();
			
			if (medico.isEmpty() || paciente.isEmpty() || data.isEmpty() || hora.isEmpty()) {
				throw new IllegalArgumentException("Todos os campos devem ser preenchidos.");
			}
			
			
			if (!data.matches("\\d{2}/\\d{2}/\\d{4}") || !hora.matches("\\d{2}:\\d{2}")) {
				throw new IllegalArgumentException("Data ou horário em formato inválido.");
			}
			
			if (!medico.matches("^[A-Za-zÀ-ÿ][A-Za-zÀ-ÿ0-9\\s]*$")) {
	                throw new Exception("O nome do material deve conter apenas letras e espaços.");
	           }
	            
	        if (!paciente.matches("^[A-Za-zÀ-ÿ][A-Za-zÀ-ÿ0-9\\s]*$")) {
	                throw new Exception("A especialidade deve conter apenas letras e espaços.");
	           }
	        
	        Agendamento agendamento = new Agendamento(data, hora, medico, paciente, null);
	        consultasAgendadas.add(agendamento);
	        
	        JOptionPane.showMessageDialog(panelAgendamentoConsulta, "[SUCESSO ✅ ]: Consulta agendada com sucesso!", "Sucesso!", JOptionPane.INFORMATION_MESSAGE);
            limparCampos();
			
			
		} catch (Exception e) {
			JOptionPane.showMessageDialog(panelAgendamentoConsulta, "[ERRO ❌ ]: " + e.getMessage(), "Erro", JOptionPane.WARNING_MESSAGE);
		}
		
	}
	
	public void limparCampos() {
		panelAgendamentoConsulta.getTextFieldMedico().setText("");
		panelAgendamentoConsulta.getTextFieldPaciente().setText("");
		panelAgendamentoConsulta.getTextFieldHorario().setText("");
		panelAgendamentoConsulta.getTextFieldData().setText("");
	}
}
