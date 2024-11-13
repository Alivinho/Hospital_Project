package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import visual.PanelRelatorioFinanceiro;

public class ControladorRelatorioFinanceiro implements ActionListener {
	PanelRelatorioFinanceiro panelRelatorioFinanceiro;
	
	public ControladorRelatorioFinanceiro(PanelRelatorioFinanceiro panelRelatorioFinanceiro) {
		this.panelRelatorioFinanceiro = panelRelatorioFinanceiro;
		addEventos();
	}
	
	private void addEventos() {
		panelRelatorioFinanceiro.getBtnGerar().addActionListener(this);  
		panelRelatorioFinanceiro.getBtnLimpar().addActionListener(this); 				
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == panelRelatorioFinanceiro.getBtnGerar()) {
			gerarRelatorioConsulta();
		}else if(e.getSource() == panelRelatorioFinanceiro.getBtnLimpar()){
			limparCampos();
		}			
	}
	
	public void gerarRelatorioConsulta() {
		try {	
			String periodo = panelRelatorioFinanceiro.getTextFieldPeriodo().getText().trim();
			String data = panelRelatorioFinanceiro.getTextFieldData().getText().trim();
			String formato = (String) panelRelatorioFinanceiro.getComboBoxTipoFormato().getSelectedItem();
			
			
			if (periodo.isEmpty() || data.isEmpty() || data.isEmpty() || formato.isEmpty()) {
				throw new IllegalArgumentException("Todos os campos devem ser preenchidos.");
			}
			

			if(panelRelatorioFinanceiro.getComboBoxTipoFormato().getSelectedIndex() == 0) {
				throw new IllegalArgumentException("Selecione um tipo de formato.");
			}

			if (!data.matches("\\d{2}/\\d{2}/\\d{4}")) {
				throw new IllegalArgumentException("Data em formato inválido. Formato: XX/XX/XXXX");
			}	
			 
	        JOptionPane.showMessageDialog(panelRelatorioFinanceiro, "[SUCESSO ✅ ]:Relatorio gerado com sucesso!", "Sucesso!", JOptionPane.INFORMATION_MESSAGE);
            limparCampos();
			
			
		} catch (Exception e) {
			JOptionPane.showMessageDialog(panelRelatorioFinanceiro, "[ERRO ❌ ]: " + e.getMessage(), "Erro", JOptionPane.WARNING_MESSAGE);

		}
		
	}
	
	public void limparCampos() {
		panelRelatorioFinanceiro.getTextFieldPeriodo().setText("");
		panelRelatorioFinanceiro.getTextFieldData().setText("");		
		panelRelatorioFinanceiro.getComboBoxTipoFormato().setSelectedIndex(0);		


	}


}
