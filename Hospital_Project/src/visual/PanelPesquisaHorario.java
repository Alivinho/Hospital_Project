package visual;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.border.LineBorder;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextPane;
import javax.swing.JButton;

public class PanelPesquisaHorario extends JPanel {
	private JLabel lblPesquisaDeHorrios;
	private JPanel panelDadosPessoais;
	private JLabel lblTipoDeConsulta;
	private JTextField textField;
	private JLabel lblMdico;
	private JComboBox comboBox_1;
	private JTextField textField_1;
	private JLabel lblData;
	private JLabel lblDadosDaPesquisa;
	private JTextPane textPane;
	private JLabel lblAgenda_1;
	private JButton btnLimpar;
	private JButton btnPesquisar;
	public PanelPesquisaHorario() {
		this.setSize(960, 790);
		setBackground(new Color(89, 169, 255));
		setLayout(null);
		add(getLblPesquisaDeHorrios());
		add(getPanelDadosPessoais());
		add(getLblDadosDaPesquisa());
		add(getBtnLimpar());
		add(getBtnPesquisar());
	}

	private JLabel getLblPesquisaDeHorrios() {
		if (lblPesquisaDeHorrios == null) {
			lblPesquisaDeHorrios = new JLabel("Pesquisa de Horários");
			lblPesquisaDeHorrios.setForeground(Color.WHITE);
			lblPesquisaDeHorrios.setFont(new Font("Tahoma", Font.BOLD, 30));
			lblPesquisaDeHorrios.setBounds(320, 33, 320, 37);
		}
		return lblPesquisaDeHorrios;
	}
	private JPanel getPanelDadosPessoais() {
		if (panelDadosPessoais == null) {
			panelDadosPessoais = new JPanel();
			panelDadosPessoais.setLayout(null);
			panelDadosPessoais.setBorder(new LineBorder(new Color(192, 192, 192), 1, true));
			panelDadosPessoais.setBounds(80, 169, 800, 461);
			panelDadosPessoais.add(getLblTipoDeConsulta());
			panelDadosPessoais.add(getTextField());
			panelDadosPessoais.add(getLblMdico());
			panelDadosPessoais.add(getComboBox_1());
			panelDadosPessoais.add(getTextField_1());
			panelDadosPessoais.add(getLblData());
			panelDadosPessoais.add(getTextPane());
			panelDadosPessoais.add(getLblAgenda_1());
		}
		return panelDadosPessoais;
	}
	private JLabel getLblTipoDeConsulta() {
		if (lblTipoDeConsulta == null) {
			lblTipoDeConsulta = new JLabel("Tipo de Exame");
			lblTipoDeConsulta.setFont(new Font("Tahoma", Font.PLAIN, 15));
			lblTipoDeConsulta.setBounds(447, 10, 128, 32);
		}
		return lblTipoDeConsulta;
	}
	private JTextField getTextField() {
		if (textField == null) {
			textField = new JTextField();
			textField.setFont(new Font("Tahoma", Font.PLAIN, 15));
			textField.setBounds(10, 40, 427, 32);
		}
		return textField;
	}
	private JLabel getLblMdico() {
		if (lblMdico == null) {
			lblMdico = new JLabel("Médico:");
			lblMdico.setFont(new Font("Tahoma", Font.PLAIN, 15));
			lblMdico.setBounds(10, 10, 397, 32);
		}
		return lblMdico;
	}
	private JComboBox getComboBox_1() {
		if (comboBox_1 == null) {
			comboBox_1 = new JComboBox();
			comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Selelcione um tipo de exame", "Exames físicos", "Exames laboratoriais", "Imagens", "Biópsia", "Patologia e análise clínica"}));
			comboBox_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
			comboBox_1.setBackground(Color.WHITE);
			comboBox_1.setBounds(447, 40, 224, 32);
		}
		return comboBox_1;
	}
	private JTextField getTextField_1() {
		if (textField_1 == null) {
			textField_1 = new JTextField();
			textField_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
			textField_1.setBounds(681, 40, 109, 32);
		}
		return textField_1;
	}
	private JLabel getLblData() {
		if (lblData == null) {
			lblData = new JLabel("Data");
			lblData.setFont(new Font("Tahoma", Font.PLAIN, 15));
			lblData.setBounds(681, 10, 109, 32);
		}
		return lblData;
	}
	private JLabel getLblDadosDaPesquisa() {
		if (lblDadosDaPesquisa == null) {
			lblDadosDaPesquisa = new JLabel("Dados da pesquisa");
			lblDadosDaPesquisa.setForeground(Color.WHITE);
			lblDadosDaPesquisa.setFont(new Font("Tahoma", Font.BOLD, 25));
			lblDadosDaPesquisa.setBounds(80, 128, 296, 31);
		}
		return lblDadosDaPesquisa;
	}
	private JTextPane getTextPane() {
		if (textPane == null) {
			textPane = new JTextPane();
			textPane.setBounds(10, 113, 780, 344);
		}
		return textPane;
	}
	private JLabel getLblAgenda_1() {
		if (lblAgenda_1 == null) {
			lblAgenda_1 = new JLabel("Horários");
			lblAgenda_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
			lblAgenda_1.setBounds(10, 82, 109, 32);
		}
		return lblAgenda_1;
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
	private JButton getBtnPesquisar() {
		if (btnPesquisar == null) {
			btnPesquisar = new JButton();
			btnPesquisar.setText("PESQUISAR");
			btnPesquisar.setForeground(new Color(0, 0, 205));
			btnPesquisar.setFont(new Font("Tahoma", Font.PLAIN, 15));
			btnPesquisar.setBounds(733, 640, 147, 40);
		}
		return btnPesquisar;
	}
}
