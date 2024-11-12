package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import modelo.Material;
import modelo.Medico;
import visual.PanelCadastrarMedico;

public class ControladorCadastrarMedico implements ActionListener{
	PanelCadastrarMedico panelCadastrarMedico;
	  ArrayList<Medico> medicosCadastrados;
	
	public ControladorCadastrarMedico(PanelCadastrarMedico panelCadastrarMedico) {
		this.panelCadastrarMedico = panelCadastrarMedico; 
		medicosCadastrados = new ArrayList<Medico>();
        addEventos();
	}
	
	private void addEventos() {
		panelCadastrarMedico.getbtnCadastrar().addActionListener(this);  
        panelCadastrarMedico.getbtnLimpar().addActionListener(this);  
		
	}

	public void actionPerformed(ActionEvent e) {
		  if (e.getSource() == panelCadastrarMedico.getbtnCadastrar()) {
	            cadastrarMedico();
	        }else if(e.getSource() == panelCadastrarMedico.getbtnLimpar()) {
	        	limparCampos();
	        }
	}
	
	public void cadastrarMedico() {
		try {
            String nome = panelCadastrarMedico.getTextFieldNome().getText().trim();
            String especialidade = panelCadastrarMedico.getTextFieldEspecialidade().getText().trim();
            String crm = panelCadastrarMedico.getTextFieldCRM().getText().trim();
            String contato = panelCadastrarMedico.getTextAreaContato().getText().trim();
            String textValorConsulta = panelCadastrarMedico.getTextFieldValorConsulta().getText().trim();
            String horarioAtendimento = panelCadastrarMedico.getTextFieldHorarioAtendimento().getText().trim();
            
            String logradouro = panelCadastrarMedico.getTextFieldLogradouro().getText();
			String numero = panelCadastrarMedico.getTextFieldNumero().getText();
			String complemento = panelCadastrarMedico.getTextFieldComplemento().getText();
			String bairro = panelCadastrarMedico.getTextFieldBairro().getText();
			String cep = panelCadastrarMedico.getTextFieldCEP().getText();
			String cidade = panelCadastrarMedico.getTextFieldCidade().getText();
			String estado = panelCadastrarMedico.getTextFieldEstado().getText();
            
            if (nome.isEmpty() || especialidade.isEmpty() || crm.isEmpty() || contato.isEmpty() || textValorConsulta.isEmpty() || horarioAtendimento.isEmpty() ||
            		logradouro.isEmpty() || numero.isEmpty() || complemento.isEmpty() || bairro.isEmpty() || cep.isEmpty() || cidade.isEmpty() || estado.isEmpty()
            		) {
                throw new Exception("Todos os campos devem ser preenchidos!");
            }
            
            if (!nome.matches("^[A-Za-zÀ-ÿ][A-Za-zÀ-ÿ0-9\\s]*$")) {
                throw new Exception("O nome do material deve conter apenas letras e espaços.");
            }
            
            if (!especialidade.matches("^[A-Za-zÀ-ÿ][A-Za-zÀ-ÿ0-9\\s]*$")) {
                throw new Exception("A especialidade deve conter apenas letras e espaços.");
            }
    
            float valorConsulta = Float.parseFloat(textValorConsulta); 
            
            if (valorConsulta<0) {
                throw new Exception("O valor da consulta deve ser um valor maior que 0.");
            }
            
            Medico medico = new Medico(nome, especialidade, crm, contato, 
  				  horarioAtendimento, valorConsulta);
            medicosCadastrados.add(medico);

            JOptionPane.showMessageDialog(panelCadastrarMedico, "Medico cadastrado com sucesso!", "Sucesso!", JOptionPane.INFORMATION_MESSAGE);
            limparCampos();

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(panelCadastrarMedico, "Por favor, insira valores numéricos válidos para valor de consulta.", "Erro de Formato", JOptionPane.WARNING_MESSAGE);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(panelCadastrarMedico, "[ERRO]: " + ex.getMessage(), "Erro", JOptionPane.WARNING_MESSAGE);
        }
	}
		
	private void limparCampos() {   
        panelCadastrarMedico.getTextFieldNome().setText("");
        panelCadastrarMedico.getTextFieldEspecialidade().setText("");
        panelCadastrarMedico.getTextFieldCRM().setText("");
        panelCadastrarMedico.getTextAreaContato().setText("");
        panelCadastrarMedico.getTextFieldValorConsulta().setText("");
        panelCadastrarMedico.getTextFieldHorarioAtendimento().setText("");
        
        panelCadastrarMedico.getTextFieldLogradouro().setText("");
		panelCadastrarMedico.getTextFieldNumero().setText("");
		panelCadastrarMedico.getTextFieldComplemento().setText("");
		panelCadastrarMedico.getTextFieldBairro().setText("");
		panelCadastrarMedico.getTextFieldCEP().setText("");
		panelCadastrarMedico.getTextFieldCidade().setText("");
		panelCadastrarMedico.getTextFieldEstado().setText("");       
    }
}