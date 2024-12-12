package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import modelo.Consulta;
import modelo.Exame;
import modelo.Material;
import modelo.Medico;
import visual.PanelExame;

public class ControladorExame implements ActionListener {
	PanelExame panelExame;
	ArrayList<Exame> examesCadastrados;

	public ControladorExame(PanelExame panelExame) {
		this.panelExame = panelExame;
		examesCadastrados = new ArrayList<Exame>();
		addEventos();
		
		carregarMedicos();
	}

	private void addEventos() {
		panelExame.getBtnCadastrar().addActionListener(this);
		panelExame.getBtnLimpar().addActionListener(this);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == panelExame.getBtnCadastrar()) {
			cadastrarExame();
		} else if (e.getSource() == panelExame.getBtnLimpar()) {
			limparCampos();
		}
	}

	public void cadastrarExame() {
		try {
			String nomeExame = panelExame.getTextFieldNomeExame().getText().trim();
			String descricao = panelExame.getTextAreaDescricao().getText().trim();
			String tipoExame = (String) panelExame.getTipoExame().getSelectedItem();
			String valorParticularText = panelExame.getTextFieldValorParticular().getText().trim();
			String materiaisUtilizados = panelExame.getTextAreaMateriaisUtilizados().getText().trim();
			String medico = (String) panelExame.getMedico().getSelectedItem();

			if (nomeExame.isEmpty() || descricao.isEmpty() || tipoExame.isEmpty() || valorParticularText.isEmpty()
					|| materiaisUtilizados.isEmpty() || medico.isEmpty()) {
				throw new Exception("Todos os campos devem ser preenchidos!");
			}

			if (!nomeExame.matches("^[A-Za-zÀ-ÿ][A-Za-zÀ-ÿ0-9\\s]*$")) {
				throw new Exception("O nome do exame deve conter apenas letras e espaços.");
			}


			if (panelExame.getTipoExame().getSelectedIndex() == 0) {
				throw new Exception("Selecione um tipo de exame.");
			}

			float valorParticular = Float.parseFloat(valorParticularText);

			if (valorParticular <= 0) {
				throw new Exception("O valor particular deve ser um valor maior que 0.");
			}

			Exame exame = new Exame(nomeExame, descricao, tipoExame, valorParticular, materiaisUtilizados, medico);
			examesCadastrados.add(exame);

			JOptionPane.showMessageDialog(panelExame, "[SUCESSO ✅ ]: Exame cadastrado com sucesso!", "Sucesso!",
					JOptionPane.INFORMATION_MESSAGE);
			limparCampos();

		} catch (NumberFormatException ex) {
			JOptionPane.showMessageDialog(panelExame,
					"Por favor, insira valores numéricos válidos para valor particular.", "Erro de Formato",
					JOptionPane.WARNING_MESSAGE);
		} catch (Exception ex) {
			JOptionPane.showMessageDialog(panelExame, "[ERRO ❌ ]: " + ex.getMessage(), "Erro",
					JOptionPane.WARNING_MESSAGE);
		}
	}
	
	
	
	private void carregarMedicos() {
	    try {
	        File arquivo = new File("src/dados/dadosMedicos.txt");
	        if (!arquivo.exists()) {
	            JOptionPane.showMessageDialog(panelExame, "Arquivo de médicos não encontrado!", "Erro", JOptionPane.ERROR_MESSAGE);
	            return;
	        }

	        BufferedReader br = new BufferedReader(new FileReader(arquivo));
	        String linha;
	        panelExame.getMedico().removeAllItems(); 
	        //panelExame.getMedico().addItem("Selecione um médico"); 

	        while ((linha = br.readLine()) != null) {
	            String[] dados = linha.split(";");
	            if (dados.length >= 3) {
	                String nome = dados[0].trim();
	                String crm = dados[1].trim();
	                String especialidade = dados[2].trim();
	                String medicoFormatado = nome + " - CRM: " + crm + " (" + especialidade + ")";
	                panelExame.getMedico().addItem(medicoFormatado);
	            }
	        }
	        br.close();
	    } catch (IOException e) {
	        JOptionPane.showMessageDialog(panelExame, "Erro ao carregar médicos: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
	    }
	}

	
	

	private void limparCampos() {
		panelExame.getTextFieldNomeExame().setText("");
		panelExame.getTextAreaDescricao().setText("");
		panelExame.getTipoExame().setSelectedIndex(0);
		panelExame.getTextFieldValorParticular().setText("");
		panelExame.getTextAreaMateriaisUtilizados().setText("");
		panelExame.getMedico().setSelectedIndex(0);

	}

}