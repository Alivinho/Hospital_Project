package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import modelo.Agendamento;
import visual.PanelPesquisaHorario;

public class ControladorPesquisaHorario implements ActionListener {
	PanelPesquisaHorario panelPesquisaHorario;
	
	public ControladorPesquisaHorario(PanelPesquisaHorario panelPesquisaHorario) {
		this.panelPesquisaHorario = panelPesquisaHorario;
		addEventos();
	}
	
	private void addEventos() {
		panelPesquisaHorario.getBtnPesquisar().addActionListener(this);  
		panelPesquisaHorario.getBtnLimpar().addActionListener(this); 
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == panelPesquisaHorario.getBtnPesquisar()) {
			pesquisarHorario();
		}else if(e.getSource() == panelPesquisaHorario.getBtnLimpar()){
			limparCampos();
		}			
	}
	
	public void pesquisarHorario() {
		try {
			
			String medico = panelPesquisaHorario.getTextFieldMedico().getText().trim();
			String tipoExame = (String) panelPesquisaHorario.getComboBoxTipoExame().getSelectedItem();
			String data = panelPesquisaHorario.getTextFieldData().getText().trim();
			
			
			if (medico.isEmpty() || tipoExame.isEmpty() || data.isEmpty()) {
				throw new IllegalArgumentException("Todos os campos devem ser preenchidos.");
			}
			
			if(panelPesquisaHorario.getComboBoxTipoExame().getSelectedIndex() == 0) {
				throw new IllegalArgumentException("Selecione um tipo de exame.");
			}
			
			
			if (!medico.matches("^[A-Za-zÀ-ÿ][A-Za-zÀ-ÿ0-9\\s]*$")) {
	                throw new Exception("O nome do medico deve conter apenas letras e espaços.");
	           }
	            
			if(panelPesquisaHorario.getComboBoxTipoExame().getSelectedIndex() == 0) {
            	throw new Exception("Selecione um tipo de exame.");
			}
			
			if (!data.matches("\\d{2}/\\d{2}/\\d{4}")) {
				throw new IllegalArgumentException("Data deve estar no formato xx/xx/xxxx.");
			}
			
	        JOptionPane.showMessageDialog(panelPesquisaHorario, "[SUCESSO ✅ ]: Pesquisado com sucesso!", "Sucesso!", JOptionPane.INFORMATION_MESSAGE);
            limparCampos();	
			
		} catch (Exception e) {
			JOptionPane.showMessageDialog(panelPesquisaHorario, "[ERRO ❌ ]: " + e.getMessage(), "Erro", JOptionPane.WARNING_MESSAGE);

		}
		
	}
	
	public void limparCampos() {
		panelPesquisaHorario.getTextFieldMedico().setText("");		
		panelPesquisaHorario.getComboBoxTipoExame().setSelectedIndex(0);	
		panelPesquisaHorario.getTextFieldData().setText("");	
	}

}
