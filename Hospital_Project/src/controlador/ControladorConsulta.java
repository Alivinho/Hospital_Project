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
	
	public void cadastrarConsulta() {
		try {
			String data = panelConsulta.getTextFieldData().getText().trim();
			String hora = panelConsulta.getTextFieldHora().getText().trim();
            String medico = (String) panelConsulta.getTextFieldMedico().getText().trim();
            String paciente = panelConsulta.getTextFieldPaciente().getText().trim();
            String queixaPaciente = panelConsulta.getTextFieldQueixaPaciente().getText().trim();
            String tipoConsulta = (String) panelConsulta.getComboBoxTipoConsulta().getSelectedItem();
            String convenio = (String) panelConsulta.getComboBoxTipoConvenio().getSelectedItem();
            String observacoes = panelConsulta.getTextAreaObservacoes().getText().trim();
            String materiais = panelConsulta.getTextAreaMateriaisUtilizados().getText().trim();

            if (data.isEmpty() || hora.isEmpty() || medico.isEmpty() || paciente.isEmpty() || queixaPaciente.isEmpty() ||
            		tipoConsulta.isEmpty() || tipoConsulta.isEmpty() || convenio.isEmpty() || observacoes.isEmpty() || materiais.isEmpty()) {
                throw new Exception("Todos os campos devem ser preenchidos!");
            }
            
            if (!medico.matches("^[A-Za-zÀ-ÿ][A-Za-zÀ-ÿ0-9\\s]*$")) {
                throw new Exception("O nome do material deve conter apenas letras e espaços.");
            }
            
            if (!paciente.matches("^[A-Za-zÀ-ÿ][A-Za-zÀ-ÿ0-9\\s]*$")) {
                throw new Exception("O nome do paciente deve conter apenas letras e espaços.");
            }
            
            if(panelConsulta.getComboBoxTipoConsulta().getSelectedIndex() == 0) {
            	throw new Exception("Selecione um tipo consulta.");
            }
            
            if(panelConsulta.getComboBoxTipoConvenio().getSelectedIndex() == 0) {
            	throw new Exception("Selecione um tipo de convênio.");
            }
            
            if (!data.matches("\\d{2}/\\d{2}/\\d{4}") || !hora.matches("\\d{2}:\\d{2}")) {
				throw new IllegalArgumentException("Data ou horário em formato inválido. Data: xx/xx/xxxx; Hora: xx:xx");
			}
			
			 String[] dataParts = data.split("/");
		        int anoInformado = Integer.parseInt(dataParts[2]);
		        int anoAtual = java.time.Year.now().getValue();

		        if (anoInformado < anoAtual) {
		            throw new IllegalArgumentException("O ano da data não pode ser menor que o ano atual.");
		        }
    

            Consulta consulta = new Consulta(data, hora, medico, paciente, queixaPaciente,
				 tipoConsulta, convenio, observacoes, materiais);
            consultasCadastradas.add(consulta);

            JOptionPane.showMessageDialog(panelConsulta, "[SUCESSO ✅ ]: Consulta cadastrada com sucesso!", "Sucesso!", JOptionPane.INFORMATION_MESSAGE);
            limparCampos();

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(panelConsulta, "[ERRO ❌ ]: " + ex.getMessage(), "Erro", JOptionPane.WARNING_MESSAGE);
        }
	}
		
	private void limparCampos() {   
        panelConsulta.getTextFieldData().setText("");
		panelConsulta.getTextFieldHora().setText("");
        panelConsulta.getTextFieldMedico().setText("");
        panelConsulta.getTextFieldPaciente().setText("");
        panelConsulta.getTextFieldQueixaPaciente().setText("");
        panelConsulta.getComboBoxTipoConsulta().setSelectedIndex(0);;
        panelConsulta.getComboBoxTipoConvenio().setSelectedIndex(0);
        panelConsulta.getTextAreaObservacoes().setText("");
        panelConsulta.getTextAreaMateriaisUtilizados().setText("");     
    }
}