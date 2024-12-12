package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import modelo.Agendamento;
import visual.PanelRelatorioExame;

public class ControladorRelatorioExame implements ActionListener {
	PanelRelatorioExame panelRelatorioExame;

	public ControladorRelatorioExame(PanelRelatorioExame panelRelatorioExame) {
		this.panelRelatorioExame = panelRelatorioExame;
		addEventos();
	}

	private void addEventos() {
		panelRelatorioExame.getBtnGerar().addActionListener(this);
		panelRelatorioExame.getBtnLimpar().addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == panelRelatorioExame.getBtnGerar()) {
			gerarRelatorioExame();
		} else if (e.getSource() == panelRelatorioExame.getBtnLimpar()) {
			limparCampos();
		}
	}

	public void gerarRelatorioExame() {
		try {
			String periodo = (String) panelRelatorioExame.getComboBoxTipoExame().getSelectedItem();
			String tipoExame = (String) panelRelatorioExame.getComboBoxPeriodo().getSelectedItem();
			String data = panelRelatorioExame.getTextFieldData().getText().trim();
			String formato = (String) panelRelatorioExame.getComboBoxTipoFormato().getSelectedItem();

			if (periodo.isEmpty() || tipoExame.isEmpty() || data.isEmpty() || data.isEmpty() || formato.isEmpty()) {
				throw new IllegalArgumentException("Todos os campos devem ser preenchidos.");
			}

			if (panelRelatorioExame.getComboBoxTipoExame().getSelectedIndex() == 0) {
				throw new IllegalArgumentException("Selecione um tipo de exame.");
			}
			
			if (panelRelatorioExame.getComboBoxPeriodo().getSelectedIndex() == 0) {
				throw new IllegalArgumentException("Selecione um período.");
			}
			
			if (panelRelatorioExame.getComboBoxTipoFormato().getSelectedIndex() == 0) {
				throw new IllegalArgumentException("Selecione um tipo de formato.");
			}

			if (!data.matches("\\d{2}/\\d{2}/\\d{4}")) {
				throw new IllegalArgumentException("Data deve estar no formato DD/MM/AAAA.");
			}

			JOptionPane.showMessageDialog(panelRelatorioExame, "[SUCESSO ✅ ]: Relatorio gerado com sucesso!",
					"Sucesso!", JOptionPane.INFORMATION_MESSAGE);
			limparCampos();

		} catch (Exception e) {
			JOptionPane.showMessageDialog(panelRelatorioExame, "[ERRO ❌ ]: " + e.getMessage(), "Erro",
					JOptionPane.WARNING_MESSAGE);
		}
	}

	public void limparCampos() {
		panelRelatorioExame.getComboBoxPeriodo().setSelectedIndex(0);
		panelRelatorioExame.getComboBoxTipoExame().setSelectedIndex(0);
		panelRelatorioExame.getTextFieldData().setText("");
		panelRelatorioExame.getComboBoxTipoFormato().setSelectedIndex(0);
	}
}
