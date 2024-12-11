package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import modelo.Agendamento;
import modelo.AgendamentoExame;
import modelo.VisualizacaoAgenda;
import visual.PanelVisualizacaoAgenda;

public class ControladorVisualizacaoAgenda implements ActionListener {
	PanelVisualizacaoAgenda panelVisualizacaoAgenda;
	
	public ControladorVisualizacaoAgenda(PanelVisualizacaoAgenda panelVisualizacaoAgenda) {
		this.panelVisualizacaoAgenda = panelVisualizacaoAgenda;

		addEventos();
	}
	
	private void addEventos() {
		panelVisualizacaoAgenda.getBtnVisualizar().addActionListener(this);  
		panelVisualizacaoAgenda.getBtnLimpar().addActionListener(this); 
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == panelVisualizacaoAgenda.getBtnVisualizar()) {
			visualizarAgenda();
		}else if(e.getSource() == panelVisualizacaoAgenda.getBtnLimpar()){
			limparCampos();
		}	
	}
	
	public void visualizarAgenda() {
		try {
			
			String medico = panelVisualizacaoAgenda.getTextFieldPesquisarData().getText().trim();
			String data = panelVisualizacaoAgenda.getTextFieldPesquisarData().getText().trim();
			
			if (medico.isEmpty() || data.isEmpty() ) {
				throw new IllegalArgumentException("Todos os campos devem ser preenchidos.");
			}
			
			
			if (!data.matches("\\d{2}/\\d{2}/\\d{4}")) {
				throw new IllegalArgumentException("Data deve estar no formato xx/xx/xxxx.");
			}
			
//			 if (!medico.matches("^[A-Za-zÀ-ÿ][A-Za-zÀ-ÿ0-9\\s]*$")) {
//	                throw new Exception("O nome do médico deve conter apenas letras e espaços.");
//	           }
	        
	        JOptionPane.showMessageDialog(panelVisualizacaoAgenda, "[SUCESSO ✅ ]: Visualizando com sucesso!", "Sucesso!", JOptionPane.INFORMATION_MESSAGE);
            limparCampos();			
		} catch (Exception e) {
			JOptionPane.showMessageDialog(panelVisualizacaoAgenda, "[ERRO ❌ ]: " + e.getMessage(), "Erro", JOptionPane.WARNING_MESSAGE);
		}
	}
	
	public void limparCampos() {
		panelVisualizacaoAgenda.getTextFieldPesquisarData().setText("");
		panelVisualizacaoAgenda.getTextFieldPesquisarMedico().setText("");
		
	}

}
