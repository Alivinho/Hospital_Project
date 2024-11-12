package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import modelo.Endereco;
import modelo.Paciente;
import visual.PanelCadastrarPaciente;

public class ControladorCadastrarPaciente implements ActionListener{
	PanelCadastrarPaciente panelCadastrarPaciente; 
	ArrayList<Paciente> pacientesCadastrados;
	
	public ControladorCadastrarPaciente(PanelCadastrarPaciente panelCadastrarPaciente) {
		this.panelCadastrarPaciente = panelCadastrarPaciente; 
		pacientesCadastrados = new ArrayList<Paciente>();
		addEventos();
	}
	
	public void cadastrarPaciente() {
		
		try {
			
			String nome = panelCadastrarPaciente.getTextFieldNome().getText();
			String dataNascimento = panelCadastrarPaciente.getLblDataDeNascimento().getText();
			String telefone = panelCadastrarPaciente.getLblTelefone().getText();
			String tipoSanguineo = (String) panelCadastrarPaciente.getComboBoxTipoSangue().getSelectedItem();
			float altura = Float.parseFloat(panelCadastrarPaciente.getTextFieldAltura().getText());
			float peso = Float.parseFloat(panelCadastrarPaciente.getTextFieldPeso().getText());
			String historicoMedico = panelCadastrarPaciente.getTextAreaHistoricoMedico().getText();
			String convenio = (String) panelCadastrarPaciente.getConvenio().getSelectedItem();
			
			String logradouro = panelCadastrarPaciente.getTextFieldLogradouro().getText();
			String numero = panelCadastrarPaciente.getTextFieldNumero().getText();
			String complemento = panelCadastrarPaciente.getTextFieldComplemento().getText();
			String bairro = panelCadastrarPaciente.getTextFieldBairro().getText();
			String cep = panelCadastrarPaciente.getTextFieldCEP().getText();
			String cidade = panelCadastrarPaciente.getTextFieldCidade().getText();
			String estado = panelCadastrarPaciente.getTextFieldEstado().getText();
			
			 nome = panelCadastrarPaciente.getTextFieldNome().getText();
	            if (nome.isEmpty()) {
	            	throw new Exception("O campo Nome não pode estar vazio.");
	            } 
	            if (!nome.matches("[a-zA-Zá-úÁ-ÚçÇ\\s]+")) {
	            	throw new Exception("O campo Nome deve conter apenas letras.");
	            }
	        
	        dataNascimento = panelCadastrarPaciente.getTextFieldDataNascimento().getText();
	            if (dataNascimento.isEmpty()) {
	            	throw new Exception("O campo Data de Nascimento não pode estar vazio.");

	            } 
	            if (!dataNascimento.matches("\\d{2}/\\d{2}/\\d{4}")) {
	            	throw new Exception("Data de Nascimento deve estar no formato DD/MM/AAAA.");
	            }
	            
	        telefone = panelCadastrarPaciente.getTextFieldTelefone().getText();
	            if (telefone.isEmpty()) {
	            	throw new Exception("O campo Telefone não pode estar vazio.");
	            }
	            if (!telefone.matches("\\d{10,11}")) {
	            	throw new Exception("O Telefone deve conter apenas números com 10 ou 11 dígitos.");    
	            } 
	        
	            try {
	                altura = Float.parseFloat(panelCadastrarPaciente.getTextFieldAltura().getText());
	                if (altura <= 0) throw new NumberFormatException();
	            } catch (NumberFormatException e) {
	                throw new Exception("Digite um valor numérico válido para a Altura.");
	            }
	           
	            try {
	                peso = Float.parseFloat(panelCadastrarPaciente.getTextFieldPeso().getText());
	                if (peso <= 0) {
	                	throw new NumberFormatException();
	                }
	            } catch (NumberFormatException e) {
	                throw new Exception("Digite um valor numérico válido para o Peso.");
	            }
	           
	            historicoMedico = panelCadastrarPaciente.getTextAreaHistoricoMedico().getText();
	            if (historicoMedico.isEmpty()) {
	            	throw new Exception("O campo Histórico Médico não pode estar vazio.");
	            }
	           
	            convenio = (String) panelCadastrarPaciente.getConvenio().getSelectedItem();
	            if (convenio == null || convenio.isEmpty()) {
	            	throw new Exception("Selecione um Convênio.");
	            } 

	            
	            logradouro = panelCadastrarPaciente.getTextFieldLogradouro().getText();
	            if (logradouro.isEmpty()) {
	                throw new Exception("O campo Logradouro não pode estar vazio.");
	            }
	            
	            if (!logradouro.matches("^[\\d]+[a-zA-Zá-úÁ-ÚçÇ\\s\\-\\/]*$") && !logradouro.matches("^[a-zA-Zá-úÁ-ÚçÇ\\s\\-\\/]+$")) {
	                throw new Exception("O Logradouro deve ser válido. Pode iniciar com números, mas deve conter ao menos uma letra ou caractere.");
	            }

	           
	            complemento = panelCadastrarPaciente.getTextFieldComplemento().getText();
	            if (complemento.isEmpty()) {
	                throw new Exception("O campo Complemento não pode estar vazio.");
	            }

	            bairro = panelCadastrarPaciente.getTextFieldBairro().getText();
	            if (bairro.isEmpty()) {
	            	throw new Exception("O campo Bairro não pode estar vazio.");
	            }

	            cep = panelCadastrarPaciente.getTextFieldCEP().getText();
	            if (cep.isEmpty()) {
	            	throw new Exception("O campo CEP não pode estar vazio.");
	            } 
	            if (!cep.matches("\\d{5}-\\d{3}")) {
	            	throw new Exception("O campo CEP deve estar no formato XXXXX-XXX.");
	            }

	            cidade = panelCadastrarPaciente.getTextFieldCidade().getText();
	            if (cidade.isEmpty()) {
	            	throw new Exception("O campo Cidade não pode estar vazio.");
	            }
	            if (!cidade.matches("[a-zA-Zá-úÁ-ÚçÇ\\s]+")) {
	            	throw new Exception("O campo Cidade deve conter apenas letras.");
	            }

	            estado = panelCadastrarPaciente.getTextFieldEstado().getText();
	            if (estado.isEmpty()) {
	            	throw new Exception("O campo Estado não pode estar vazio.");
	            }
	            if (!estado.matches("[a-zA-Zá-úÁ-ÚçÇ\\s]+")) {
	            	throw new Exception("O campo Estado deve conter apenas letras.");
	            }
	            
	            Endereco endereco = new Endereco(logradouro, numero, complemento, bairro, cep, cidade, estado);
				Paciente paciente = new Paciente(
						nome, dataNascimento, endereco, telefone, 
						tipoSanguineo, altura, peso, historicoMedico, convenio);
				pacientesCadastrados.add(paciente);
				JOptionPane.showMessageDialog(panelCadastrarPaciente, "Paciente cadastrado.", "Sucesso!", JOptionPane.INFORMATION_MESSAGE);
			
		}
		catch(Exception e) {
            JOptionPane.showMessageDialog(panelCadastrarPaciente, "[ERRO]: " + e.getMessage(), "Erro", JOptionPane.WARNING_MESSAGE);

		}
		
	
		/*try {
			String nome = panelCadastrarPaciente.getTextFieldNome().getText();
			String dataNascimento = panelCadastrarPaciente.getLblDataDeNascimento().getText();
			String telefone = panelCadastrarPaciente.getLblTelefone().getText();
			String tipoSanguineo = (String) panelCadastrarPaciente.getComboBoxTipoSangue().getSelectedItem();
			float altura = Float.parseFloat(panelCadastrarPaciente.getTextFieldAltura().getText());
			float peso = Float.parseFloat(panelCadastrarPaciente.getTextFieldPeso().getText());
			String historicoMedico = panelCadastrarPaciente.getTextAreaHistoricoMedico().getText();
			String convenio = (String) panelCadastrarPaciente.getConvenio().getSelectedItem();
			
			String logradouro = panelCadastrarPaciente.getTextFieldLogradouro().getText();
			String numero = panelCadastrarPaciente.getTextFieldNumero().getText();
			String complemento = panelCadastrarPaciente.getTextFieldComplemento().getText();
			String bairro = panelCadastrarPaciente.getTextFieldBairro().getText();
			String cep = panelCadastrarPaciente.getTextFieldCEP().getText();
			String cidade = panelCadastrarPaciente.getTextFieldCidade().getText();
			String estado = panelCadastrarPaciente.getTextFieldEstado().getText();
			
		
			
			Endereco endereco = new Endereco(logradouro, numero, complemento, bairro, cep, cidade, estado);
			Paciente paciente = new Paciente(
					nome, dataNascimento, endereco, telefone, 
					tipoSanguineo, altura, peso, historicoMedico, convenio);
			pacientesCadastrados.add(paciente);
			JOptionPane.showMessageDialog(panelCadastrarPaciente, "Paciente cadastrado.", "Sucesso!", JOptionPane.INFORMATION_MESSAGE);
		} catch (Exception e) {
			JOptionPane.showMessageDialog(panelCadastrarPaciente, "[ERRO]: Digite valores válidos.", "Erro!" ,JOptionPane.WARNING_MESSAGE);
		}*/
	}
	
	 public void limparCampos() {
	        panelCadastrarPaciente.getTextFieldNome().setText("");
	        panelCadastrarPaciente.getTextFieldDataNascimento().setText("");
	        panelCadastrarPaciente.getTextFieldTelefone().setText("");
	        panelCadastrarPaciente.getComboBoxTipoSangue().setSelectedIndex(0);
	        panelCadastrarPaciente.getTextFieldAltura().setText("");
	        panelCadastrarPaciente.getTextFieldPeso().setText("");
	        panelCadastrarPaciente.getTextAreaHistoricoMedico().setText("");
	        panelCadastrarPaciente.getConvenio().setSelectedIndex(0);
	        panelCadastrarPaciente.getTextFieldLogradouro().setText("");
	        panelCadastrarPaciente.getTextFieldNumero().setText("");
	        panelCadastrarPaciente.getTextFieldComplemento().setText("");
	        panelCadastrarPaciente.getTextFieldBairro().setText("");
	        panelCadastrarPaciente.getTextFieldCEP().setText("");
	        panelCadastrarPaciente.getTextFieldCidade().setText("");
	        panelCadastrarPaciente.getTextFieldEstado().setText("");
	    }
	
	private void addEventos() {
		panelCadastrarPaciente.getBtnCadastrar().addActionListener(this);
		panelCadastrarPaciente.getBtnLimpar().addActionListener(this);
	}

	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == panelCadastrarPaciente.getBtnCadastrar()) {
			cadastrarPaciente();
		}else if(e.getSource() == panelCadastrarPaciente.getBtnLimpar()) {
			limparCampos();
		}
		// TODO Auto-generated method stub
	}

}