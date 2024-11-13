package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import visual.PanelRelatorioMaterial;

public class ControladorRelatorioMaterial implements ActionListener {
	PanelRelatorioMaterial panelRelatorioMaterial;
	
	public ControladorRelatorioMaterial(PanelRelatorioMaterial panelRelatorioMaterial) {
		this.panelRelatorioMaterial = panelRelatorioMaterial;
		addEventos();
	}
	
	private void addEventos() {
		panelRelatorioMaterial.getBtnGerar().addActionListener(this);  
		panelRelatorioMaterial.getBtnLimpar().addActionListener(this); 				
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == panelRelatorioMaterial.getBtnGerar()) {
			gerarRelatorioConsulta();
		}else if(e.getSource() == panelRelatorioMaterial.getBtnLimpar()){
			limparCampos();
		}			
	}

	
	public void gerarRelatorioConsulta() {
		try {	
			String periodo = panelRelatorioMaterial.getTextFieldPeriodo().getText().trim();
			String tipoExame = (String) panelRelatorioMaterial.getComboBoxTipoMaterial().getSelectedItem();
			String data = panelRelatorioMaterial.getTextFieldData().getText().trim();
			String formato = (String) panelRelatorioMaterial.getComboBoxTipoFormato().getSelectedItem();
			
			
			if (periodo.isEmpty() || tipoExame.isEmpty() || data.isEmpty() || data.isEmpty() || formato.isEmpty()) {
				throw new IllegalArgumentException("Todos os campos devem ser preenchidos.");
			}
			
			if(panelRelatorioMaterial.getComboBoxTipoMaterial().getSelectedIndex() == 0) {
				throw new IllegalArgumentException("Selecione um tipo de material.");
			}

			if(panelRelatorioMaterial.getComboBoxTipoFormato().getSelectedIndex() == 0) {
				throw new IllegalArgumentException("Selecione um tipo de formato.");
			}

			if (!data.matches("\\d{2}/\\d{2}/\\d{4}")) {
				throw new IllegalArgumentException("Data em formato inválido. Formato: XX/XX/XXXX");
			}	
			 
	        JOptionPane.showMessageDialog(panelRelatorioMaterial, "[SUCESSO ✅ ]:Relatorio gerado com sucesso!", "Sucesso!", JOptionPane.INFORMATION_MESSAGE);
            limparCampos();
			
			
		} catch (Exception e) {
			JOptionPane.showMessageDialog(panelRelatorioMaterial, "[ERRO ❌ ]: " + e.getMessage(), "Erro", JOptionPane.WARNING_MESSAGE);

		}
		
	}
	
	public void limparCampos() {
		panelRelatorioMaterial.getTextFieldPeriodo().setText("");
		panelRelatorioMaterial.getComboBoxTipoMaterial().setSelectedIndex(0);	
		panelRelatorioMaterial.getTextFieldData().setText("");		
		panelRelatorioMaterial.getComboBoxTipoFormato().setSelectedIndex(0);		


	}

}
