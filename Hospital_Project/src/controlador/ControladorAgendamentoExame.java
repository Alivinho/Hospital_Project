package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import modelo.Agendamento;
import visual.PanelAgendamentoExame;

public class ControladorAgendamentoExame implements ActionListener {
	PanelAgendamentoExame panelAgendamentoExame;
	ArrayList<Agendamento> examesAgendados;
	
	public ControladorAgendamentoExame(PanelAgendamentoExame panelAgendamentoExame) {
		this.panelAgendamentoExame = panelAgendamentoExame;
		examesAgendados = new ArrayList<Agendamento>();
		addEventos();
	}
	
	private void addEventos() {
		panelAgendamentoExame.getBtnAgendar().addActionListener(this);  
		panelAgendamentoExame.getBtnLimpar().addActionListener(this);  		
	}

	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == panelAgendamentoExame.getBtnAgendar()) {
			agendarConsulta();
		}else if(e.getSource() == panelAgendamentoExame.getBtnLimpar()){
			limparCampos();
		}		
	}

	
	public void agendarConsulta() {
		try {
			
			String paciente = panelAgendamentoExame.getTextFieldPaciente().getText().trim();
			String tipoExame = (String) panelAgendamentoExame.getComboBoxTipoExame().getSelectedItem();
			String data = panelAgendamentoExame.getTextFieldData().getText().trim();
			String hora = panelAgendamentoExame.getTextField_1_1().getText().trim();
			
			
			if (paciente.isEmpty() || tipoExame.isEmpty() || data.isEmpty() || hora.isEmpty()) {
				throw new IllegalArgumentException("Todos os campos devem ser preenchidos.");
			}
			
			
			if (!data.matches("\\d{2}/\\d{2}/\\d{4}") || !hora.matches("\\d{2}:\\d{2}")) {
				throw new IllegalArgumentException("Data ou horário em formato inválido.");
			}
			
			 String[] dataParts = data.split("/");
		        int anoInformado = Integer.parseInt(dataParts[2]);
		        int anoAtual = java.time.Year.now().getValue();

		        if (anoInformado < anoAtual) {
		            throw new IllegalArgumentException("O ano da data não pode ser menor que o ano atual.");
		        }

			
			if (!paciente.matches("^[A-Za-zÀ-ÿ][A-Za-zÀ-ÿ0-9\\s]*$")) {
	                throw new Exception("O nome do material deve conter apenas letras e espaços.");
	           }
	            
			if(panelAgendamentoExame.getComboBoxTipoExame().getSelectedIndex() == 0) {
            	throw new Exception("Selecione um tipo de exame.");
            }
			
			Agendamento agendamento = new Agendamento(null, paciente, tipoExame, data, hora);
			examesAgendados.add(agendamento);
			
			 
	        JOptionPane.showMessageDialog(panelAgendamentoExame, "[SUCESSO ✅ ]: Exame agendada com sucesso!", "Sucesso!", JOptionPane.INFORMATION_MESSAGE);
            limparCampos();
			
			
		} catch (Exception e) {
			JOptionPane.showMessageDialog(panelAgendamentoExame, "[ERRO ❌ ]: " + e.getMessage(), "Erro", JOptionPane.WARNING_MESSAGE);

		}
		
	}
	
	public void limparCampos() {
		panelAgendamentoExame.getTextField_1_1().setText("");
		panelAgendamentoExame.getTextFieldPaciente().setText("");		
		panelAgendamentoExame.getComboBoxTipoExame().setSelectedIndex(0);	
		panelAgendamentoExame.getTextFieldData().setText("");		


	}


}
