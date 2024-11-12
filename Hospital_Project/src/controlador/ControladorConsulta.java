package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import modelo.Consulta;
import modelo.Material;
import modelo.Medico;
import modelo.Paciente;
import visual.PanelConsulta;

public class ControladorConsulta implements ActionListener {
	PanelConsulta panelConsulta;
	ArrayList<Consulta> consultasCadastradas;

	public ControladorConsulta(PanelConsulta panelConsulta) {
		this.panelConsulta = panelConsulta;
		consultasCadastradas = new ArrayList<Consulta>();
        addEventos();
	}

	private void addEventos() {
		panelConsulta.getBtnCadastrar().addActionListener(this);  
        panelConsulta.getBtnLimpar().addActionListener(this);  
		
	}

	public void actionPerformed(ActionEvent e) {
		  if (e.getSource() == panelConsulta.getBtnCadastrar()) {
	            cadastrarConsulta();
	        }else if(e.getSource() == panelConsulta.getBtnLimpar()) {
	        	limparCampos();
	        }
	}

	// !!!!!!!!!!!!!!!!!!! IMCOMPLETO
	
	public void cadastrarConsulta() {
		try {
            String medico = panelConsulta.getTextFieldMedico().getText().trim();
            String paciente = panelConsulta.getTextFieldPaciente().getText().trim();
            String tipoConsulta = panelConsulta.getComboBoxTipoConsulta().getSelectedItem().trim();
            String queixaPaciente = panelConsulta.getTextFieldQueixaPaciente().getText().trim();
            String tipoConvenio = panelConsulta.getComboBoxTipoConvenio().getSelectedItem().trim();
            String observacoes = panelConsulta.getTextAreaObservacoes().getText().trim();
            String materiaisUtilizados = panelConsulta.getTextAreaMateriaisUtilizados().getText().trim();

            
            if (data, hora, medico, paciente, queixaPaciente,
					tipoConsulta, convenio, observacoes, materiais
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
            
            Consulta consulta = new Consulta(nome, especialidade, crm, contato, 
  				  horarioAtendimento, valorConsulta);
            consultaCadastradas.add(consulta);

            JOptionPane.showMessageDialog(panelConsulta, "[SUCESSO]: Medico cadastrado com sucesso!", "Sucesso!", JOptionPane.INFORMATION_MESSAGE);
            limparCampos();

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(panelConsulta, "Por favor, insira valores numéricos válidos para valor de consulta.", "Erro de Formato", JOptionPane.WARNING_MESSAGE);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(panelConsulta, "[ERRO]: " + ex.getMessage(), "Erro", JOptionPane.WARNING_MESSAGE);
        }
	}
		
	private void limparCampos() {   
		panelConsulta.getTextFieldNome().setText("");
		panelConsulta.getTextFieldEspecialidade().setText("");
		panelConsulta.getTextFieldCRM().setText("");
        panelConsulta.getTextAreaContato().setText("");
        panelConsulta.getTextFieldValorConsulta().setText("");
        panelConsulta.getTextFieldHorarioAtendimento().setText("");
              
    }
}