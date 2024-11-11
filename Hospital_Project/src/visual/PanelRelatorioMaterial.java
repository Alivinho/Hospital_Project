package visual;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.border.LineBorder;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JTextPane;
import javax.swing.DefaultComboBoxModel;

public class PanelRelatorioMaterial extends JPanel {
	private JLabel lblRelatrioDeMaterial;
	private JLabel lblDadosDoRelatrio;
	private JPanel panelDadosPessoais;
	private JTextPane textPane;
	private JLabel lblAgenda_1;
	private JTextField textField;
	private JLabel lblPerodo;
	private JLabel lblTipoDeConsulta;
	private JComboBox comboBox_1;
	private JTextField textField_1;
	private JLabel lblData;
	private JLabel lblFormato;
	private JComboBox comboBox_1_1;
	public PanelRelatorioMaterial() {
		setBackground(new Color(83, 169, 255));
		this.setSize(960, 790);
		setLayout(null);
		add(getLblRelatrioDeMaterial());
		add(getLblDadosDoRelatrio());
		add(getPanelDadosPessoais());
	}

	private JLabel getLblRelatrioDeMaterial() {
		if (lblRelatrioDeMaterial == null) {
			lblRelatrioDeMaterial = new JLabel("Relatório de Material");
			lblRelatrioDeMaterial.setForeground(Color.WHITE);
			lblRelatrioDeMaterial.setFont(new Font("Tahoma", Font.BOLD, 30));
			lblRelatrioDeMaterial.setBounds(320, 33, 320, 37);
		}
		return lblRelatrioDeMaterial;
	}
	private JLabel getLblDadosDoRelatrio() {
		if (lblDadosDoRelatrio == null) {
			lblDadosDoRelatrio = new JLabel("Dados do relatório");
			lblDadosDoRelatrio.setForeground(Color.WHITE);
			lblDadosDoRelatrio.setFont(new Font("Tahoma", Font.BOLD, 25));
			lblDadosDoRelatrio.setBounds(78, 128, 296, 31);
		}
		return lblDadosDoRelatrio;
	}
	private JPanel getPanelDadosPessoais() {
		if (panelDadosPessoais == null) {
			panelDadosPessoais = new JPanel();
			panelDadosPessoais.setLayout(null);
			panelDadosPessoais.setBorder(new LineBorder(new Color(192, 192, 192), 1, true));
			panelDadosPessoais.setBounds(78, 169, 800, 461);
			panelDadosPessoais.add(getTextPane());
			panelDadosPessoais.add(getLblAgenda_1());
			panelDadosPessoais.add(getTextField());
			panelDadosPessoais.add(getLblPerodo());
			panelDadosPessoais.add(getLblTipoDeConsulta());
			panelDadosPessoais.add(getComboBox_1());
			panelDadosPessoais.add(getTextField_1());
			panelDadosPessoais.add(getLblData());
			panelDadosPessoais.add(getLblFormato());
			panelDadosPessoais.add(getComboBox_1_1());
		}
		return panelDadosPessoais;
	}
	private JTextPane getTextPane() {
		if (textPane == null) {
			textPane = new JTextPane();
			textPane.setFont(new Font("Tahoma", Font.PLAIN, 15));
			textPane.setBounds(10, 113, 780, 344);
		}
		return textPane;
	}
	private JLabel getLblAgenda_1() {
		if (lblAgenda_1 == null) {
			lblAgenda_1 = new JLabel("Painel");
			lblAgenda_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
			lblAgenda_1.setBounds(10, 82, 109, 32);
		}
		return lblAgenda_1;
	}
	private JTextField getTextField() {
		if (textField == null) {
			textField = new JTextField();
			textField.setFont(new Font("Tahoma", Font.PLAIN, 15));
			textField.setBounds(10, 40, 249, 32);
		}
		return textField;
	}
	private JLabel getLblPerodo() {
		if (lblPerodo == null) {
			lblPerodo = new JLabel("Período");
			lblPerodo.setFont(new Font("Tahoma", Font.PLAIN, 15));
			lblPerodo.setBounds(10, 10, 249, 32);
		}
		return lblPerodo;
	}
	private JLabel getLblTipoDeConsulta() {
		if (lblTipoDeConsulta == null) {
			lblTipoDeConsulta = new JLabel("Tipo de Exame");
			lblTipoDeConsulta.setFont(new Font("Tahoma", Font.PLAIN, 15));
			lblTipoDeConsulta.setBounds(269, 10, 128, 32);
		}
		return lblTipoDeConsulta;
	}
	private JComboBox getComboBox_1() {
		if (comboBox_1 == null) {
			comboBox_1 = new JComboBox();
			comboBox_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
			comboBox_1.setBackground(Color.WHITE);
			comboBox_1.setBounds(269, 40, 224, 32);
		}
		return comboBox_1;
	}
	private JTextField getTextField_1() {
		if (textField_1 == null) {
			textField_1 = new JTextField();
			textField_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
			textField_1.setBounds(503, 40, 109, 32);
		}
		return textField_1;
	}
	private JLabel getLblData() {
		if (lblData == null) {
			lblData = new JLabel("Data");
			lblData.setFont(new Font("Tahoma", Font.PLAIN, 15));
			lblData.setBounds(503, 10, 109, 32);
		}
		return lblData;
	}
	private JLabel getLblFormato() {
		if (lblFormato == null) {
			lblFormato = new JLabel("Formato");
			lblFormato.setFont(new Font("Tahoma", Font.PLAIN, 15));
			lblFormato.setBounds(622, 10, 103, 32);
		}
		return lblFormato;
	}
	private JComboBox getComboBox_1_1() {
		if (comboBox_1_1 == null) {
			comboBox_1_1 = new JComboBox();
			comboBox_1_1.setModel(new DefaultComboBoxModel(new String[] {"Selelcione um formato", "PDF", "Excel"}));
			comboBox_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
			comboBox_1_1.setBackground(Color.WHITE);
			comboBox_1_1.setBounds(622, 40, 168, 32);
		}
		return comboBox_1_1;
	}
}
