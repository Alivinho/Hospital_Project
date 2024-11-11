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
import javax.swing.JButton;

public class PanelRelatorioFinanceiro extends JPanel {
	private JLabel lblRelatrioFinanceiro;
	private JLabel lblDadosDoRelatrio;
	private JPanel panelDadosPessoais;
	private JTextField textField;
	private JLabel lblPerodo;
	private JTextField textField_1;
	private JLabel lblData;
	private JTextPane textPane;
	private JLabel lblAgenda_1;
	private JComboBox comboBox_1_1;
	private JLabel lblFormato;
	private JButton btnLimpar;
	private JButton btnGerar;
	public PanelRelatorioFinanceiro() {
		this.setSize(960, 790);
		setBackground(new Color(83, 169, 255));
		setLayout(null);
		add(getLblRelatrioFinanceiro());
		add(getLblDadosDoRelatrio());
		add(getPanelDadosPessoais());
		add(getBtnLimpar());
		add(getBtnGerar());
	}

	private JLabel getLblRelatrioFinanceiro() {
		if (lblRelatrioFinanceiro == null) {
			lblRelatrioFinanceiro = new JLabel("Relatório Financeiro");
			lblRelatrioFinanceiro.setForeground(Color.WHITE);
			lblRelatrioFinanceiro.setFont(new Font("Tahoma", Font.BOLD, 30));
			lblRelatrioFinanceiro.setBounds(323, 33, 313, 37);
		}
		return lblRelatrioFinanceiro;
	}
	private JLabel getLblDadosDoRelatrio() {
		if (lblDadosDoRelatrio == null) {
			lblDadosDoRelatrio = new JLabel("Dados do relatório");
			lblDadosDoRelatrio.setForeground(Color.WHITE);
			lblDadosDoRelatrio.setFont(new Font("Tahoma", Font.BOLD, 25));
			lblDadosDoRelatrio.setBounds(80, 128, 296, 31);
		}
		return lblDadosDoRelatrio;
	}
	private JPanel getPanelDadosPessoais() {
		if (panelDadosPessoais == null) {
			panelDadosPessoais = new JPanel();
			panelDadosPessoais.setLayout(null);
			panelDadosPessoais.setBorder(new LineBorder(new Color(192, 192, 192), 1, true));
			panelDadosPessoais.setBounds(80, 169, 800, 461);
			panelDadosPessoais.add(getTextField());
			panelDadosPessoais.add(getLblPerodo());
			panelDadosPessoais.add(getTextField_1());
			panelDadosPessoais.add(getLblData());
			panelDadosPessoais.add(getTextPane());
			panelDadosPessoais.add(getLblAgenda_1());
			panelDadosPessoais.add(getComboBox_1_1());
			panelDadosPessoais.add(getLblFormato());
		}
		return panelDadosPessoais;
	}
	private JTextField getTextField() {
		if (textField == null) {
			textField = new JTextField();
			textField.setFont(new Font("Tahoma", Font.PLAIN, 15));
			textField.setBounds(10, 40, 299, 32);
		}
		return textField;
	}
	private JLabel getLblPerodo() {
		if (lblPerodo == null) {
			lblPerodo = new JLabel("Período");
			lblPerodo.setFont(new Font("Tahoma", Font.PLAIN, 15));
			lblPerodo.setBounds(10, 10, 397, 32);
		}
		return lblPerodo;
	}
	private JTextField getTextField_1() {
		if (textField_1 == null) {
			textField_1 = new JTextField();
			textField_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
			textField_1.setBounds(319, 40, 109, 32);
		}
		return textField_1;
	}
	private JLabel getLblData() {
		if (lblData == null) {
			lblData = new JLabel("Data");
			lblData.setFont(new Font("Tahoma", Font.PLAIN, 15));
			lblData.setBounds(319, 10, 109, 32);
		}
		return lblData;
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
	private JComboBox getComboBox_1_1() {
		if (comboBox_1_1 == null) {
			comboBox_1_1 = new JComboBox();
			comboBox_1_1.setModel(new DefaultComboBoxModel(new String[] {"Selelcione um formato", "PDF", "Excel"}));
			comboBox_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
			comboBox_1_1.setBackground(Color.WHITE);
			comboBox_1_1.setBounds(438, 40, 190, 32);
		}
		return comboBox_1_1;
	}
	private JLabel getLblFormato() {
		if (lblFormato == null) {
			lblFormato = new JLabel("Formato");
			lblFormato.setFont(new Font("Tahoma", Font.PLAIN, 15));
			lblFormato.setBounds(438, 10, 103, 32);
		}
		return lblFormato;
	}
	private JButton getBtnLimpar() {
		if (btnLimpar == null) {
			btnLimpar = new JButton();
			btnLimpar.setText("LIMPAR");
			btnLimpar.setForeground(new Color(0, 0, 205));
			btnLimpar.setFont(new Font("Tahoma", Font.PLAIN, 15));
			btnLimpar.setBounds(542, 640, 156, 40);
		}
		return btnLimpar;
	}
	private JButton getBtnGerar() {
		if (btnGerar == null) {
			btnGerar = new JButton();
			btnGerar.setText("GERAR");
			btnGerar.setForeground(new Color(0, 0, 205));
			btnGerar.setFont(new Font("Tahoma", Font.PLAIN, 15));
			btnGerar.setBounds(733, 640, 147, 40);
		}
		return btnGerar;
	}
}
