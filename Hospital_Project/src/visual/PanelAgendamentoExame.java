package visual;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.border.LineBorder;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class PanelAgendamentoExame extends JPanel {
	private JLabel lblAgendamentoDeExames;
	private JLabel lblDadosDoAgendamento;
	private JPanel panelDadosPessoais;
	private JLabel lblTipoDeConsulta;
	private JTextField textField_2;
	private JLabel lblPaciente;
	private JComboBox comboBox_1;
	private JTextField textField;
	private JLabel lblData;
	private JTextField textField_1;
	private JLabel lblHorrio;
	public PanelAgendamentoExame() {
		setBackground(new Color(89, 169, 255));
		this.setSize(960, 790);
		setLayout(null);
		add(getLblAgendamentoDeExames());
		add(getLblDadosDoAgendamento());
		add(getPanelDadosPessoais());
	}

	private JLabel getLblAgendamentoDeExames() {
		if (lblAgendamentoDeExames == null) {
			lblAgendamentoDeExames = new JLabel("Agendamento de Exames");
			lblAgendamentoDeExames.setForeground(Color.WHITE);
			lblAgendamentoDeExames.setFont(new Font("Tahoma", Font.BOLD, 30));
			lblAgendamentoDeExames.setBounds(287, 35, 386, 37);
		}
		return lblAgendamentoDeExames;
	}
	private JLabel getLblDadosDoAgendamento() {
		if (lblDadosDoAgendamento == null) {
			lblDadosDoAgendamento = new JLabel("Dados do agendamento");
			lblDadosDoAgendamento.setForeground(Color.WHITE);
			lblDadosDoAgendamento.setFont(new Font("Tahoma", Font.BOLD, 25));
			lblDadosDoAgendamento.setBounds(80, 128, 296, 31);
		}
		return lblDadosDoAgendamento;
	}
	private JPanel getPanelDadosPessoais() {
		if (panelDadosPessoais == null) {
			panelDadosPessoais = new JPanel();
			panelDadosPessoais.setLayout(null);
			panelDadosPessoais.setBorder(new LineBorder(new Color(192, 192, 192), 1, true));
			panelDadosPessoais.setBounds(80, 169, 800, 167);
			panelDadosPessoais.add(getLblTipoDeConsulta());
			panelDadosPessoais.add(getTextField_2());
			panelDadosPessoais.add(getLblPaciente());
			panelDadosPessoais.add(getComboBox_1());
			panelDadosPessoais.add(getTextField());
			panelDadosPessoais.add(getLblData());
			panelDadosPessoais.add(getTextField_1_1());
			panelDadosPessoais.add(getLblHorrio());
		}
		return panelDadosPessoais;
	}
	private JLabel getLblTipoDeConsulta() {
		if (lblTipoDeConsulta == null) {
			lblTipoDeConsulta = new JLabel("Tipo de Exame");
			lblTipoDeConsulta.setFont(new Font("Tahoma", Font.PLAIN, 15));
			lblTipoDeConsulta.setBounds(531, 10, 128, 32);
		}
		return lblTipoDeConsulta;
	}
	private JTextField getTextField_2() {
		if (textField_2 == null) {
			textField_2 = new JTextField();
			textField_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
			textField_2.setBounds(10, 40, 511, 32);
		}
		return textField_2;
	}
	private JLabel getLblPaciente() {
		if (lblPaciente == null) {
			lblPaciente = new JLabel("Paciente:");
			lblPaciente.setFont(new Font("Tahoma", Font.PLAIN, 15));
			lblPaciente.setBounds(10, 10, 397, 32);
		}
		return lblPaciente;
	}
	private JComboBox getComboBox_1() {
		if (comboBox_1 == null) {
			comboBox_1 = new JComboBox();
			comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Selelcione um tipo de exame", "Exames físicos", "Exames laboratoriais", "Imagens", "Biópsia", "Patologia e análise clínica"}));
			comboBox_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
			comboBox_1.setBackground(Color.WHITE);
			comboBox_1.setBounds(531, 40, 259, 32);
		}
		return comboBox_1;
	}
	private JTextField getTextField() {
		if (textField == null) {
			textField = new JTextField();
			textField.setFont(new Font("Tahoma", Font.PLAIN, 15));
			textField.setBounds(10, 112, 109, 32);
		}
		return textField;
	}
	private JLabel getLblData() {
		if (lblData == null) {
			lblData = new JLabel("Data");
			lblData.setFont(new Font("Tahoma", Font.PLAIN, 15));
			lblData.setBounds(10, 82, 109, 32);
		}
		return lblData;
	}
	private JTextField getTextField_1_1() {
		if (textField_1 == null) {
			textField_1 = new JTextField();
			textField_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
			textField_1.setBounds(129, 112, 109, 32);
		}
		return textField_1;
	}
	private JLabel getLblHorrio() {
		if (lblHorrio == null) {
			lblHorrio = new JLabel("Horário");
			lblHorrio.setFont(new Font("Tahoma", Font.PLAIN, 15));
			lblHorrio.setBounds(129, 82, 109, 32);
		}
		return lblHorrio;
	}
}
