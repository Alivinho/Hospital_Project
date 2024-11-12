package visual;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.border.LineBorder;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;

public class PanelConsulta extends JPanel {
	private JLabel lblCadastroConsultas;
	private JLabel lblDadosConsulta;
	private JPanel panelDadosPessoais;
	private JTextField textFieldMedico;
	private JLabel lblMedico;
	private JLabel lblTipoConsulta;
	private JTextField textFieldQueixaPaciente;
	private JLabel lblQueixaPaciente;
	private JLabel lblTipoConvenio;
	private JLabel lblObservacoes;
	private JTextArea textAreaObservacoes;
	private JComboBox comboBoxTipoConvenio;
	private JTextField textFieldPaciente;
	private JLabel lblPaciente;
	private JComboBox comboBoxTipoConsulta;
	private JTextArea textAreaMateriaisUtilizados;
	private JLabel lblMateriaisUtilizados;
	private JButton btnLimpar;
	private JButton btnCadastrar;
	public PanelConsulta() {
		setBackground(new Color(83, 169, 255));
		this.setSize(940, 920);
		setLayout(null);
		add(getLblCadastroConsultas());
		add(getLblDadosConsulta());
		add(getPanelDadosPessoais());
		add(getBtnLimpar());
		add(getBtnCadastrar());
	}
	public JLabel getLblCadastroConsultas() {
		if (lblCadastroConsultas == null) {
			lblCadastroConsultas = new JLabel("Cadastro de Consultas");
			lblCadastroConsultas.setForeground(Color.WHITE);
			lblCadastroConsultas.setFont(new Font("Tahoma", Font.BOLD, 30));
			lblCadastroConsultas.setBounds(300, 33, 340, 37);
		}
		return lblCadastroConsultas;
	}
	public JLabel getLblDadosConsulta() {
		if (lblDadosConsulta == null) {
			lblDadosConsulta = new JLabel("Dados da consulta");
			lblDadosConsulta.setForeground(Color.WHITE);
			lblDadosConsulta.setFont(new Font("Tahoma", Font.BOLD, 25));
			lblDadosConsulta.setBounds(69, 128, 229, 31);
		}
		return lblDadosConsulta;
	}
	public JPanel getPanelDadosPessoais() {
		if (panelDadosPessoais == null) {
			panelDadosPessoais = new JPanel();
			panelDadosPessoais.setLayout(null);
			panelDadosPessoais.setBorder(new LineBorder(new Color(192, 192, 192), 1, true));
			panelDadosPessoais.setBounds(69, 169, 800, 375);
			panelDadosPessoais.add(getTextFieldMedico());
			panelDadosPessoais.add(getLblMedico());
			panelDadosPessoais.add(getLblTipoConsulta());
			panelDadosPessoais.add(getTextFieldQueixaPaciente());
			panelDadosPessoais.add(getLblQueixaPaciente());
			panelDadosPessoais.add(getLblTipoConvenio());
			panelDadosPessoais.add(getLblObservacoes());
			panelDadosPessoais.add(getTextAreaObservacoes());
			panelDadosPessoais.add(getComboBoxTipoConvenio());
			panelDadosPessoais.add(getTextFieldPaciente());
			panelDadosPessoais.add(getLblPaciente());
			panelDadosPessoais.add(getComboBoxTipoConsulta());
			panelDadosPessoais.add(getTextAreaMateriaisUtilizados());
			panelDadosPessoais.add(getLblMateriaisUtilizados());
		}
		return panelDadosPessoais;
	}
	public JTextField getTextFieldMedico() {
		if (textFieldMedico == null) {
			textFieldMedico = new JTextField();
			textFieldMedico.setFont(new Font("Tahoma", Font.PLAIN, 15));
			textFieldMedico.setBounds(10, 40, 373, 32);
		}
		return textFieldMedico;
	}
	public JLabel getLblMedico() {
		if (lblMedico == null) {
			lblMedico = new JLabel("Médico:");
			lblMedico.setFont(new Font("Tahoma", Font.PLAIN, 15));
			lblMedico.setBounds(10, 10, 200, 32);
		}
		return lblMedico;
	}
	public JLabel getLblTipoConsulta() {
		if (lblTipoConsulta == null) {
			lblTipoConsulta = new JLabel("Tipo de Consulta");
			lblTipoConsulta.setFont(new Font("Tahoma", Font.PLAIN, 15));
			lblTipoConsulta.setBounds(10, 82, 128, 32);
		}
		return lblTipoConsulta;
	}
	public JTextField getTextFieldQueixaPaciente() {
		if (textFieldQueixaPaciente == null) {
			textFieldQueixaPaciente = new JTextField();
			textFieldQueixaPaciente.setFont(new Font("Tahoma", Font.PLAIN, 15));
			textFieldQueixaPaciente.setBounds(198, 112, 371, 32);
		}
		return textFieldQueixaPaciente;
	}
	public JLabel getLblQueixaPaciente() {
		if (lblQueixaPaciente == null) {
			lblQueixaPaciente = new JLabel("Queixa do paciente");
			lblQueixaPaciente.setFont(new Font("Tahoma", Font.PLAIN, 15));
			lblQueixaPaciente.setBounds(198, 82, 200, 32);
		}
		return lblQueixaPaciente;
	}
	public JLabel getLblTipoConvenio() {
		if (lblTipoConvenio == null) {
			lblTipoConvenio = new JLabel("Convênio:");
			lblTipoConvenio.setFont(new Font("Tahoma", Font.PLAIN, 15));
			lblTipoConvenio.setBounds(579, 82, 211, 32);
		}
		return lblTipoConvenio;
	}
	public JLabel getLblObservacoes() {
		if (lblObservacoes == null) {
			lblObservacoes = new JLabel("Observações");
			lblObservacoes.setFont(new Font("Tahoma", Font.PLAIN, 15));
			lblObservacoes.setBounds(10, 154, 150, 32);
		}
		return lblObservacoes;
	}
	public JTextArea getTextAreaObservacoes() {
		if (textAreaObservacoes == null) {
			textAreaObservacoes = new JTextArea();
			textAreaObservacoes.setFont(new Font("Monospaced", Font.PLAIN, 15));
			textAreaObservacoes.setBounds(10, 186, 373, 163);
		}
		return textAreaObservacoes;
	}
	public JComboBox getComboBoxTipoConvenio() {
		if (comboBoxTipoConvenio == null) {
			comboBoxTipoConvenio = new JComboBox();
			comboBoxTipoConvenio.setFont(new Font("Tahoma", Font.PLAIN, 15));
			comboBoxTipoConvenio.setBackground(Color.WHITE);
			comboBoxTipoConvenio.setBounds(579, 112, 211, 32);
		}
		return comboBoxTipoConvenio;
	}
	public JTextField getTextFieldPaciente() {
		if (textFieldPaciente == null) {
			textFieldPaciente = new JTextField();
			textFieldPaciente.setFont(new Font("Tahoma", Font.PLAIN, 15));
			textFieldPaciente.setBounds(393, 40, 397, 32);
		}
		return textFieldPaciente;
	}
	public JLabel getLblPaciente() {
		if (lblPaciente == null) {
			lblPaciente = new JLabel("Paciente:");
			lblPaciente.setFont(new Font("Tahoma", Font.PLAIN, 15));
			lblPaciente.setBounds(393, 10, 397, 32);
		}
		return lblPaciente;
	}
	public JComboBox getComboBoxTipoConsulta() {
		if (comboBoxTipoConsulta == null) {
			comboBoxTipoConsulta = new JComboBox();
			comboBoxTipoConsulta.setFont(new Font("Tahoma", Font.PLAIN, 15));
			comboBoxTipoConsulta.setBackground(Color.WHITE);
			comboBoxTipoConsulta.setBounds(10, 112, 178, 32);
		}
		return comboBoxTipoConsulta;
	}
	public JTextArea getTextAreaMateriaisUtilizados() {
		if (textAreaMateriaisUtilizados == null) {
			textAreaMateriaisUtilizados = new JTextArea();
			textAreaMateriaisUtilizados.setFont(new Font("Monospaced", Font.PLAIN, 15));
			textAreaMateriaisUtilizados.setBounds(396, 186, 394, 163);
		}
		return textAreaMateriaisUtilizados;
	}
	public JLabel getLblMateriaisUtilizados() {
		if (lblMateriaisUtilizados == null) {
			lblMateriaisUtilizados = new JLabel("Materiais utilizados");
			lblMateriaisUtilizados.setFont(new Font("Tahoma", Font.PLAIN, 15));
			lblMateriaisUtilizados.setBounds(396, 154, 150, 32);
		}
		return lblMateriaisUtilizados;
	}
	public JButton getBtnLimpar() {
		if (btnLimpar == null) {
			btnLimpar = new JButton();
			btnLimpar.setText("LIMPAR");
			btnLimpar.setForeground(new Color(0, 0, 205));
			btnLimpar.setFont(new Font("Tahoma", Font.PLAIN, 15));
			btnLimpar.setBounds(531, 554, 156, 40);
		}
		return btnLimpar;
	}
	public JButton getBtnCadastrar() {
		if (btnCadastrar == null) {
			btnCadastrar = new JButton();
			btnCadastrar.setText("CADASTRAR");
			btnCadastrar.setForeground(new Color(0, 0, 205));
			btnCadastrar.setFont(new Font("Tahoma", Font.PLAIN, 15));
			btnCadastrar.setBounds(722, 554, 147, 40);
		}
		return btnCadastrar;
	}
}
