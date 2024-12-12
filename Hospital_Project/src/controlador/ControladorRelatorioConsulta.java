package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import visual.PanelRelatorioConsulta;

public class ControladorRelatorioConsulta implements ActionListener {
	PanelRelatorioConsulta panelRelatorioConsulta;

	public ControladorRelatorioConsulta(PanelRelatorioConsulta panelRelatorioConsulta) {
		this.panelRelatorioConsulta = panelRelatorioConsulta;
		addEventos();
	}

	private void addEventos() {
		panelRelatorioConsulta.getBtnImprimir().addActionListener(this);
		panelRelatorioConsulta.getBtnLimpar().addActionListener(this);
		panelRelatorioConsulta.getBtnGerar().addActionListener(this);
		
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == panelRelatorioConsulta.getBtnGerar()) {
			gerarRelatorioConsulta();
		} else if (e.getSource() == panelRelatorioConsulta.getBtnLimpar()) {
			limparCampos();
		}
	}

	public void gerarRelatorioConsulta() {
		try {
			String periodo = (String) panelRelatorioConsulta.getComboBoxPeriodo().getSelectedItem();
			String tipoExame = (String) panelRelatorioConsulta.getComboBoxTipoConsulta().getSelectedItem();
			String data = panelRelatorioConsulta.getTextFieldData().getText().trim();
			String formato = (String) panelRelatorioConsulta.getComboBoxTipoFormato().getSelectedItem();

			if (periodo.isEmpty() || tipoExame.isEmpty() || data.isEmpty() || data.isEmpty() || formato.isEmpty()) {
				throw new IllegalArgumentException("Todos os campos devem ser preenchidos.");
			}

			if (panelRelatorioConsulta.getComboBoxTipoConsulta().getSelectedIndex() == 0) {
				throw new IllegalArgumentException("Selecione um tipo de consulta.");
			}
			
			if (panelRelatorioConsulta.getComboBoxPeriodo().getSelectedIndex() == 0) {
				throw new IllegalArgumentException("Selecione um período.");
			}

			if (panelRelatorioConsulta.getComboBoxTipoFormato().getSelectedIndex() == 0) {
				throw new IllegalArgumentException("Selecione um tipo de formato.");
			}

			if (!data.matches("\\d{2}/\\d{2}/\\d{4}")) {
				throw new IllegalArgumentException("Data em formato inválido. Formato: XX/XX/XXXX");
			}

			JOptionPane.showMessageDialog(panelRelatorioConsulta, "[SUCESSO ✅ ]:Relatorio gerado com sucesso!",
					"Sucesso!", JOptionPane.INFORMATION_MESSAGE);
			limparCampos();

		} catch (Exception e) {
			JOptionPane.showMessageDialog(panelRelatorioConsulta, "[ERRO ❌ ]: " + e.getMessage(), "Erro",
					JOptionPane.WARNING_MESSAGE);
		}
	}

	public void limparCampos() {
		panelRelatorioConsulta.getComboBoxPeriodo().setSelectedIndex(0);
		panelRelatorioConsulta.getComboBoxTipoConsulta().setSelectedIndex(0);
		panelRelatorioConsulta.getTextFieldData().setText("");
		panelRelatorioConsulta.getComboBoxTipoFormato().setSelectedIndex(0);
	}
}
