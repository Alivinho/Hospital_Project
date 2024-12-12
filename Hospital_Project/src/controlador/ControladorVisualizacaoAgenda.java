package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
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
		
		carregarMedicos();
	}

	private void addEventos() {
		panelVisualizacaoAgenda.getBtnVisualizar().addActionListener(this);
		panelVisualizacaoAgenda.getBtnLimpar().addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == panelVisualizacaoAgenda.getBtnVisualizar()) {
			visualizarAgenda();
		} else if (e.getSource() == panelVisualizacaoAgenda.getBtnLimpar()) {
			limparCampos();
		}
	}

	public void visualizarAgenda() {
		try {
			String medico = panelVisualizacaoAgenda.getTextFieldPesquisarData().getText().trim();
			String data = panelVisualizacaoAgenda.getTextFieldPesquisarData().getText().trim();

			if (medico.isEmpty() || data.isEmpty()) {
				throw new IllegalArgumentException("Todos os campos devem ser preenchidos.");
			}

			if (!data.matches("\\d{2}/\\d{2}/\\d{4}")) {
				throw new IllegalArgumentException("Data deve estar no formato DD/MM/AAAA.");
			}
			
			if (panelVisualizacaoAgenda.getMedico().getSelectedIndex() == 0) {
				throw new Exception("Selecione um médico.");
			}

			JOptionPane.showMessageDialog(panelVisualizacaoAgenda, "[SUCESSO ✅ ]: Visualizando com sucesso!",
					"Sucesso!", JOptionPane.INFORMATION_MESSAGE);
			limparCampos();
			
		} catch (Exception e) {
			JOptionPane.showMessageDialog(panelVisualizacaoAgenda, "[ERRO ❌ ]: " + e.getMessage(), "Erro",
					JOptionPane.WARNING_MESSAGE);
		}
	}
	
	private void carregarMedicos() {
		try {
			BufferedReader br = new BufferedReader(new FileReader("./dados/dadosMedico.txt"));
			String linha;
			panelVisualizacaoAgenda.getMedico().removeAllItems();
			panelVisualizacaoAgenda.getMedico().addItem("Selecionar Médico");


			while ((linha = br.readLine()) != null) {
				String[] dados = linha.split(";");
				if (dados.length >= 3) {
					String nome = dados[0].trim();
					String crm = dados[1].trim();
					String especialidade = dados[2].trim();
					String medicoFormatado = nome + " - CRM: " + crm + " (" + especialidade + ")";
					panelVisualizacaoAgenda.getMedico().addItem(medicoFormatado);
				}
			}
			br.close();
		} catch (IOException e) {
			JOptionPane.showMessageDialog(panelVisualizacaoAgenda, "Erro ao carregar médicos: " + e.getMessage(), "Erro",
					JOptionPane.ERROR_MESSAGE);
		}
	}
	
//	public void inserirDados() {
//		String 
//	}

	public void limparCampos() {
		panelVisualizacaoAgenda.getTextFieldPesquisarData().setText("");
		panelVisualizacaoAgenda.getMedico().setSelectedIndex(0);
	}
}
