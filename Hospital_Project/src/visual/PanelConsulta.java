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
	private JLabel lblCadastroDeConsultas;
	private JLabel lblDadosDaConsulta;
	private JPanel panelDadosPessoais;
	private JTextField textField;
	private JLabel lblMdico;
	private JLabel lblTipoDeConsulta;
	private JTextField textField_2;
	private JLabel lblQueixaDoPaciente;
	private JLabel lblConvnio;
	private JLabel lblTelefone_1_1_1;
	private JTextArea textArea;
	private JComboBox comboBox;
	private JTextField textField_1;
	private JLabel lblPaciente;
	private JComboBox comboBox_1;
	private JTextArea textArea_1;
	private JLabel lblTelefone_1_1_1_1;
	private JButton btnLimpar;
	private JButton btnCadastrar;
	public PanelConsulta() {
		setBackground(new Color(83, 169, 255));
		this.setSize(940, 920);
		setLayout(null);
		add(getLblCadastroDeConsultas());
		add(getLblDadosDaConsulta());
		add(getPanelDadosPessoais());
		add(getBtnLimpar());
		add(getBtnCadastrar());
	}
	private JLabel getLblCadastroDeConsultas() {
		if (lblCadastroDeConsultas == null) {
			lblCadastroDeConsultas = new JLabel("Cadastro de Consultas");
			lblCadastroDeConsultas.setForeground(Color.WHITE);
			lblCadastroDeConsultas.setFont(new Font("Tahoma", Font.BOLD, 30));
			lblCadastroDeConsultas.setBounds(300, 33, 340, 37);
		}
		return lblCadastroDeConsultas;
	}
	private JLabel getLblDadosDaConsulta() {
		if (lblDadosDaConsulta == null) {
			lblDadosDaConsulta = new JLabel("Dados da consulta");
			lblDadosDaConsulta.setForeground(Color.WHITE);
			lblDadosDaConsulta.setFont(new Font("Tahoma", Font.BOLD, 25));
			lblDadosDaConsulta.setBounds(69, 119, 229, 31);
		}
		return lblDadosDaConsulta;
	}
	private JPanel getPanelDadosPessoais() {
		if (panelDadosPessoais == null) {
			panelDadosPessoais = new JPanel();
			panelDadosPessoais.setLayout(null);
			panelDadosPessoais.setBorder(new LineBorder(new Color(192, 192, 192), 1, true));
			panelDadosPessoais.setBounds(70, 152, 800, 375);
			panelDadosPessoais.add(getTextField());
			panelDadosPessoais.add(getLblMdico());
			panelDadosPessoais.add(getLblTipoDeConsulta());
			panelDadosPessoais.add(getTextField_2());
			panelDadosPessoais.add(getLblQueixaDoPaciente());
			panelDadosPessoais.add(getLblConvnio());
			panelDadosPessoais.add(getLblTelefone_1_1_1());
			panelDadosPessoais.add(getTextArea());
			panelDadosPessoais.add(getComboBox());
			panelDadosPessoais.add(getTextField_1());
			panelDadosPessoais.add(getLblPaciente());
			panelDadosPessoais.add(getComboBox_1());
			panelDadosPessoais.add(getTextArea_1());
			panelDadosPessoais.add(getLblTelefone_1_1_1_1());
		}
		return panelDadosPessoais;
	}
	private JTextField getTextField() {
		if (textField == null) {
			textField = new JTextField();
			textField.setFont(new Font("Tahoma", Font.PLAIN, 15));
			textField.setBounds(10, 40, 373, 32);
		}
		return textField;
	}
	private JLabel getLblMdico() {
		if (lblMdico == null) {
			lblMdico = new JLabel("Médico:");
			lblMdico.setFont(new Font("Tahoma", Font.PLAIN, 15));
			lblMdico.setBounds(10, 10, 200, 32);
		}
		return lblMdico;
	}
	private JLabel getLblTipoDeConsulta() {
		if (lblTipoDeConsulta == null) {
			lblTipoDeConsulta = new JLabel("Tipo de Consulta");
			lblTipoDeConsulta.setFont(new Font("Tahoma", Font.PLAIN, 15));
			lblTipoDeConsulta.setBounds(10, 82, 128, 32);
		}
		return lblTipoDeConsulta;
	}
	private JTextField getTextField_2() {
		if (textField_2 == null) {
			textField_2 = new JTextField();
			textField_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
			textField_2.setBounds(198, 112, 371, 32);
		}
		return textField_2;
	}
	private JLabel getLblQueixaDoPaciente() {
		if (lblQueixaDoPaciente == null) {
			lblQueixaDoPaciente = new JLabel("Queixa do paciente");
			lblQueixaDoPaciente.setFont(new Font("Tahoma", Font.PLAIN, 15));
			lblQueixaDoPaciente.setBounds(198, 82, 200, 32);
		}
		return lblQueixaDoPaciente;
	}
	private JLabel getLblConvnio() {
		if (lblConvnio == null) {
			lblConvnio = new JLabel("Convênio:");
			lblConvnio.setFont(new Font("Tahoma", Font.PLAIN, 15));
			lblConvnio.setBounds(579, 82, 211, 32);
		}
		return lblConvnio;
	}
	private JLabel getLblTelefone_1_1_1() {
		if (lblTelefone_1_1_1 == null) {
			lblTelefone_1_1_1 = new JLabel("Observações");
			lblTelefone_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
			lblTelefone_1_1_1.setBounds(10, 154, 150, 32);
		}
		return lblTelefone_1_1_1;
	}
	private JTextArea getTextArea() {
		if (textArea == null) {
			textArea = new JTextArea();
			textArea.setFont(new Font("Monospaced", Font.PLAIN, 15));
			textArea.setBounds(10, 186, 373, 163);
		}
		return textArea;
	}
	private JComboBox getComboBox() {
		if (comboBox == null) {
			comboBox = new JComboBox();
			comboBox.setFont(new Font("Tahoma", Font.PLAIN, 15));
			comboBox.setBackground(Color.WHITE);
			comboBox.setBounds(579, 112, 211, 32);
		}
		return comboBox;
	}
	private JTextField getTextField_1() {
		if (textField_1 == null) {
			textField_1 = new JTextField();
			textField_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
			textField_1.setBounds(393, 40, 397, 32);
		}
		return textField_1;
	}
	private JLabel getLblPaciente() {
		if (lblPaciente == null) {
			lblPaciente = new JLabel("Paciente:");
			lblPaciente.setFont(new Font("Tahoma", Font.PLAIN, 15));
			lblPaciente.setBounds(393, 10, 397, 32);
		}
		return lblPaciente;
	}
	private JComboBox getComboBox_1() {
		if (comboBox_1 == null) {
			comboBox_1 = new JComboBox();
			comboBox_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
			comboBox_1.setBackground(Color.WHITE);
			comboBox_1.setBounds(10, 112, 178, 32);
		}
		return comboBox_1;
	}
	private JTextArea getTextArea_1() {
		if (textArea_1 == null) {
			textArea_1 = new JTextArea();
			textArea_1.setFont(new Font("Monospaced", Font.PLAIN, 15));
			textArea_1.setBounds(396, 186, 394, 163);
		}
		return textArea_1;
	}
	private JLabel getLblTelefone_1_1_1_1() {
		if (lblTelefone_1_1_1_1 == null) {
			lblTelefone_1_1_1_1 = new JLabel("Materiais utilizados");
			lblTelefone_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
			lblTelefone_1_1_1_1.setBounds(396, 154, 150, 32);
		}
		return lblTelefone_1_1_1_1;
	}
	private JButton getBtnLimpar() {
		if (btnLimpar == null) {
			btnLimpar = new JButton();
			btnLimpar.setText("LIMPAR");
			btnLimpar.setForeground(new Color(0, 0, 205));
			btnLimpar.setFont(new Font("Tahoma", Font.PLAIN, 15));
			btnLimpar.setBounds(532, 537, 156, 40);
		}
		return btnLimpar;
	}
	private JButton getBtnCadastrar() {
		if (btnCadastrar == null) {
			btnCadastrar = new JButton();
			btnCadastrar.setText("CADASTRAR");
			btnCadastrar.setForeground(new Color(0, 0, 205));
			btnCadastrar.setFont(new Font("Tahoma", Font.PLAIN, 15));
			btnCadastrar.setBounds(723, 537, 147, 40);
		}
		return btnCadastrar;
	}
}
