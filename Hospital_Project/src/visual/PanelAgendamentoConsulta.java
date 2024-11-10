package visual;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JComboBox;

public class PanelAgendamentoConsulta extends JPanel {
	private JPanel panelDadosPessoais;
	private JTextField textField;
	private JLabel lblMdico;
	private JTextField textField_1;
	private JLabel lblData;
	private JTextField textField_2;
	private JLabel lblPaciente;
	private JLabel lblDadosDoAgendamento;
	private JLabel lblAgendamentoDeConsultas;
	private JLabel lblHora;
	private JTextField textField_3;
	public PanelAgendamentoConsulta() {
		setBackground(new Color(89, 169, 255));
		this.setSize(960, 790);
		setLayout(null);
		add(getPanelDadosPessoais());
		add(getLblDadosDoAgendamento());
		add(getLblAgendamentoDeConsultas());
	}
	private JPanel getPanelDadosPessoais() {
		if (panelDadosPessoais == null) {
			panelDadosPessoais = new JPanel();
			panelDadosPessoais.setLayout(null);
			panelDadosPessoais.setBorder(new LineBorder(new Color(192, 192, 192), 1, true));
			panelDadosPessoais.setBounds(79, 169, 800, 167);
			panelDadosPessoais.add(getTextField());
			panelDadosPessoais.add(getLblMdico());
			panelDadosPessoais.add(getTextField_1());
			panelDadosPessoais.add(getLblData());
			panelDadosPessoais.add(getTextField_2());
			panelDadosPessoais.add(getLblPaciente());
			panelDadosPessoais.add(getLblHora());
			panelDadosPessoais.add(getTextField_3());
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
	private JTextField getTextField_1() {
		if (textField_1 == null) {
			textField_1 = new JTextField();
			textField_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
			textField_1.setBounds(10, 112, 109, 32);
		}
		return textField_1;
	}
	private JLabel getLblData() {
		if (lblData == null) {
			lblData = new JLabel("Data");
			lblData.setFont(new Font("Tahoma", Font.PLAIN, 15));
			lblData.setBounds(10, 82, 109, 32);
		}
		return lblData;
	}
	private JTextField getTextField_2() {
		if (textField_2 == null) {
			textField_2 = new JTextField();
			textField_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
			textField_2.setBounds(393, 40, 397, 32);
		}
		return textField_2;
	}
	private JLabel getLblPaciente() {
		if (lblPaciente == null) {
			lblPaciente = new JLabel("Paciente:");
			lblPaciente.setFont(new Font("Tahoma", Font.PLAIN, 15));
			lblPaciente.setBounds(393, 10, 397, 32);
		}
		return lblPaciente;
	}
	private JLabel getLblDadosDoAgendamento() {
		if (lblDadosDoAgendamento == null) {
			lblDadosDoAgendamento = new JLabel("Dados do agendamento");
			lblDadosDoAgendamento.setForeground(Color.WHITE);
			lblDadosDoAgendamento.setFont(new Font("Tahoma", Font.BOLD, 25));
			lblDadosDoAgendamento.setBounds(79, 128, 296, 31);
		}
		return lblDadosDoAgendamento;
	}
	private JLabel getLblAgendamentoDeConsultas() {
		if (lblAgendamentoDeConsultas == null) {
			lblAgendamentoDeConsultas = new JLabel("Agendamento de Consultas");
			lblAgendamentoDeConsultas.setForeground(Color.WHITE);
			lblAgendamentoDeConsultas.setFont(new Font("Tahoma", Font.BOLD, 30));
			lblAgendamentoDeConsultas.setBounds(271, 35, 417, 37);
		}
		return lblAgendamentoDeConsultas;
	}
	private JLabel getLblHora() {
		if (lblHora == null) {
			lblHora = new JLabel("Horário");
			lblHora.setFont(new Font("Tahoma", Font.PLAIN, 15));
			lblHora.setBounds(129, 82, 109, 32);
		}
		return lblHora;
	}
	private JTextField getTextField_3() {
		if (textField_3 == null) {
			textField_3 = new JTextField();
			textField_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
			textField_3.setBounds(129, 112, 109, 32);
		}
		return textField_3;
	}
}
