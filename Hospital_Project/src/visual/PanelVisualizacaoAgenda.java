package visual;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.border.LineBorder;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JTextPane;

public class PanelVisualizacaoAgenda extends JPanel {
	private JLabel lblVisualizaoDeAgenda;
	private JPanel panelDadosPessoais;
	private JLabel lblData_1;
	private JTextField textField;
	private JLabel lblPesquisarMdico;
	private JLabel lblAgenda_1;
	private JLabel lblAgenda;
	private JTextField textField_3;
	private JTextPane textPane;
	public PanelVisualizacaoAgenda() {
		this.setSize(960, 790);
		setBackground(new Color(89, 169, 255));
		setLayout(null);
		add(getLblVisualizaoDeAgenda());
		add(getPanelDadosPessoais());
		add(getLblAgenda());
	}

	private JLabel getLblVisualizaoDeAgenda() {
		if (lblVisualizaoDeAgenda == null) {
			lblVisualizaoDeAgenda = new JLabel("Visualização de Agenda");
			lblVisualizaoDeAgenda.setForeground(Color.WHITE);
			lblVisualizaoDeAgenda.setFont(new Font("Tahoma", Font.BOLD, 30));
			lblVisualizaoDeAgenda.setBounds(301, 33, 358, 37);
		}
		return lblVisualizaoDeAgenda;
	}
	private JPanel getPanelDadosPessoais() {
		if (panelDadosPessoais == null) {
			panelDadosPessoais = new JPanel();
			panelDadosPessoais.setLayout(null);
			panelDadosPessoais.setBorder(new LineBorder(new Color(192, 192, 192), 1, true));
			panelDadosPessoais.setBounds(80, 153, 800, 472);
			panelDadosPessoais.add(getLblData_1());
			panelDadosPessoais.add(getTextField());
			panelDadosPessoais.add(getLblPesquisarMdico());
			panelDadosPessoais.add(getLblAgenda_1());
			panelDadosPessoais.add(getTextField_3());
			panelDadosPessoais.add(getTextPane());
		}
		return panelDadosPessoais;
	}
	private JLabel getLblData_1() {
		if (lblData_1 == null) {
			lblData_1 = new JLabel("Pesquisar Data");
			lblData_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
			lblData_1.setBounds(559, 10, 128, 32);
		}
		return lblData_1;
	}
	private JTextField getTextField() {
		if (textField == null) {
			textField = new JTextField();
			textField.setFont(new Font("Tahoma", Font.PLAIN, 15));
			textField.setBounds(10, 40, 539, 32);
		}
		return textField;
	}
	private JLabel getLblPesquisarMdico() {
		if (lblPesquisarMdico == null) {
			lblPesquisarMdico = new JLabel("Pesquisar Médico");
			lblPesquisarMdico.setFont(new Font("Tahoma", Font.PLAIN, 15));
			lblPesquisarMdico.setBounds(10, 10, 397, 32);
		}
		return lblPesquisarMdico;
	}
	private JLabel getLblAgenda_1() {
		if (lblAgenda_1 == null) {
			lblAgenda_1 = new JLabel("Agenda");
			lblAgenda_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
			lblAgenda_1.setBounds(10, 82, 109, 32);
		}
		return lblAgenda_1;
	}
	private JLabel getLblAgenda() {
		if (lblAgenda == null) {
			lblAgenda = new JLabel("Agenda");
			lblAgenda.setForeground(Color.WHITE);
			lblAgenda.setFont(new Font("Tahoma", Font.BOLD, 25));
			lblAgenda.setBounds(80, 114, 94, 31);
		}
		return lblAgenda;
	}
	private JTextField getTextField_3() {
		if (textField_3 == null) {
			textField_3 = new JTextField();
			textField_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
			textField_3.setBounds(559, 40, 231, 32);
		}
		return textField_3;
	}
	private JTextPane getTextPane() {
		if (textPane == null) {
			textPane = new JTextPane();
			textPane.setBounds(10, 113, 780, 344);
		}
		return textPane;
	}
}
