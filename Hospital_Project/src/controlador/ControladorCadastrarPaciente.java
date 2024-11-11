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
			
		
			
			Endereco endereco = new Endereco(logradouro, numero, complemento, bairro, cep, cidade, estado);
			Paciente paciente = new Paciente(
					nome, dataNascimento, endereco, telefone, 
					tipoSanguineo, altura, peso, historicoMedico, convenio);
			pacientesCadastrados.add(paciente);
			JOptionPane.showMessageDialog(panelCadastrarPaciente, "Paciente cadastrado.", "Sucesso!", JOptionPane.INFORMATION_MESSAGE);
		} catch (Exception e) {
			JOptionPane.showMessageDialog(panelCadastrarPaciente, "[ERRO]: Digite valores válidos.", "Erro!" ,JOptionPane.WARNING_MESSAGE);
		}
	}
	
	private void addEventos() {
		panelCadastrarPaciente.getBtnCadastrar().addActionListener(this);
		panelCadastrarPaciente.getBtnLimpar().addActionListener(this);
	}

	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == panelCadastrarPaciente.getBtnCadastrar()) {
			cadastrarPaciente();
		}
		// TODO Auto-generated method stub
	}

}