package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JOptionPane;
import javax.swing.JTextPane;

import modelo.Agendamento;
import visual.PanelPesquisaHorario;

public class ControladorPesquisaHorario implements ActionListener {
	PanelPesquisaHorario panelPesquisaHorario;

	public ControladorPesquisaHorario(PanelPesquisaHorario panelPesquisaHorario) {
		this.panelPesquisaHorario = panelPesquisaHorario;
		addEventos();
		
		carregarMedicos();
	}

	private void addEventos() {
		panelPesquisaHorario.getBtnPesquisar().addActionListener(this);
		panelPesquisaHorario.getBtnLimpar().addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == panelPesquisaHorario.getBtnPesquisar()) {
			pesquisarHorario();
		} else if (e.getSource() == panelPesquisaHorario.getBtnLimpar()) {
			limparCampos();
		}
	}

	public void pesquisarHorario() {
		try {
			String medico = (String) panelPesquisaHorario.getMedico().getSelectedItem();
			String tipoExame = (String) panelPesquisaHorario.getComboBoxTipoExame().getSelectedItem();
			String data = panelPesquisaHorario.getTextFieldData().getText().trim();

			if (medico.isEmpty() || tipoExame.isEmpty() || data.isEmpty()) {
				throw new IllegalArgumentException("Todos os campos devem ser preenchidos.");
			}

			if (panelPesquisaHorario.getComboBoxTipoExame().getSelectedIndex() == 0) {
				throw new IllegalArgumentException("Selecione um tipo de exame.");
			}

			if (panelPesquisaHorario.getMedico().getSelectedIndex() == 0) {
				throw new Exception("Selecione um médico.");
			}

			if (panelPesquisaHorario.getComboBoxTipoExame().getSelectedIndex() == 0) {
				throw new Exception("Selecione um tipo de exame.");
			}

			if (!data.matches("\\d{2}/\\d{2}/\\d{4}")) {
				throw new IllegalArgumentException("Data deve estar no formato DD/MM/AAAA.");
			}
			
			inserirDadosNoTextPane(panelPesquisaHorario.getTextPainelHorario());

			JOptionPane.showMessageDialog(panelPesquisaHorario, "[SUCESSO ✅ ]: Pesquisado com sucesso!", "Sucesso!",
					JOptionPane.INFORMATION_MESSAGE);
			limparCampos();

		} catch (Exception e) {
			JOptionPane.showMessageDialog(panelPesquisaHorario, "[ERRO ❌ ]: " + e.getMessage(), "Erro",
					JOptionPane.WARNING_MESSAGE);
		}
	}
	
	private void carregarMedicos() {
		try {
			BufferedReader br = new BufferedReader(new FileReader("./dados/dadosMedico.txt"));
			String linha;
			panelPesquisaHorario.getMedico().removeAllItems();
			panelPesquisaHorario.getMedico().addItem("Selecionar Médico");


			while ((linha = br.readLine()) != null) {
				String[] dados = linha.split(";");
				if (dados.length >= 3) {
					String nome = dados[0].trim();
					String crm = dados[1].trim();
					String especialidade = dados[2].trim();
					String medicoFormatado = nome + " - CRM: " + crm + " (" + especialidade + ")";
					panelPesquisaHorario.getMedico().addItem(medicoFormatado);
				}
			}
			br.close();
		} catch (IOException e) {
			JOptionPane.showMessageDialog(panelPesquisaHorario, "Erro ao carregar médicos: " + e.getMessage(), "Erro",
					JOptionPane.ERROR_MESSAGE);
		}
	}
	
	private void inserirDadosNoTextPane(JTextPane textPane) {
	    try {
	        BufferedReader br = new BufferedReader(new FileReader("./dados/dadosAgendamentoConsulta.txt"));
	        BufferedReader br2 = new BufferedReader(new FileReader("./dados/dadosConsulta.txt"));
	        BufferedReader br3 = new BufferedReader(new FileReader("./dados/dadosExame.txt"));
	        

	        StringBuilder conteudo = new StringBuilder();
	        
	        String linhaConsultaAgendada;
	        String linhaConsultaCadastrada;
	        String linhaExame;
	        

	        // Exibição de Consultas 
			conteudo.append("========================> CONSULTAS AGENDADAS <========================\n").append("\n");
	        while ((linhaConsultaAgendada = br.readLine()) != null) {
	            String[] dadosConsultasAgendadas = linhaConsultaAgendada.split(";");
	            
	            if(dadosConsultasAgendadas[0].trim().equals(panelPesquisaHorario.getMedico().getSelectedItem().toString())) {
	            	if (dadosConsultasAgendadas.length >= 3) {
	            		String paciente = dadosConsultasAgendadas[1].trim();
	            		String hora = dadosConsultasAgendadas[3].trim();
	            		String consultaAgendadaFormatada = "Paciente: " + paciente + " - Hora: " + hora;
	            		conteudo.append(consultaAgendadaFormatada).append("\n");
	            	}	            	
	            }
	        }    
	        
	     // Exibição de Consultas 
	     			conteudo.append("\n========================> CONSULTAS CASTRADAS <========================\n").append("\n");
	     	        while ((linhaConsultaCadastrada = br2.readLine()) != null) {
	     	            String[] dadosConsultasCadastradas = linhaConsultaCadastrada.split(";");
	     	          
	     	            if(dadosConsultasCadastradas[2].trim().equals(panelPesquisaHorario.getMedico().getSelectedItem().toString())) {
	     	            	System.out.println("SIm");
	     	            	if (dadosConsultasCadastradas.length >= 3) {
	     	            		String paciente = dadosConsultasCadastradas[3].trim();
	     	            		String data = dadosConsultasCadastradas[0].trim();
	     	            		String hora = dadosConsultasCadastradas[1].trim();
	     	            		String consultaCadastradaFormatada =  paciente + " - " + data + " - " + hora;
	     	            		conteudo.append(consultaCadastradaFormatada).append("\n");
	     	            	}	            	
	     	            }
	     	        }  
	        
//	         Exibição de Exames 
			conteudo.append("\n========================> EXAMES CADASTRADOS <========================\n").append("\n");
	        while ((linhaExame = br3.readLine()) != null) {
	            String[] dadosExamesCadastrados = linhaExame.split(";");
	            
	            if(dadosExamesCadastrados[4].trim().equals(panelPesquisaHorario.getMedico().getSelectedItem().toString())) {
	            	if (dadosExamesCadastrados.length >= 2) {
	            		String nomeExame = dadosExamesCadastrados[0].trim();
	            		String tipoExame = dadosExamesCadastrados[2].trim();
	            		String exameFormatado = "Nome do exame: " + nomeExame + " - Tipo do exame: " + tipoExame;
	            		conteudo.append(exameFormatado).append("\n");
	            	}	            	
	            }
	        }

	        // Atualizar o texto no JTextPane
	        textPane.setText(conteudo.toString());
	        br.close();
	        br2.close();
	        br3.close();
	    } catch (IOException e) {
	        JOptionPane.showMessageDialog(null, 
	            "Erro ao carregar médicos: " + e.getMessage(), 
	            "Erro", 
	            JOptionPane.ERROR_MESSAGE);
	    }
	}
	public void limparCampos() {
		panelPesquisaHorario.getMedico().setSelectedIndex(0);
		panelPesquisaHorario.getComboBoxTipoExame().setSelectedIndex(0);
		panelPesquisaHorario.getTextFieldData().setText("");
	}
}
