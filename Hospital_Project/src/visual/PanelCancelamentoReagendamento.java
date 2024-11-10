package visual;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.border.LineBorder;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JTextPane;

public class PanelCancelamentoReagendamento extends JPanel {
	private JLabel lblDados;
	private JPanel panelDadosPessoais;
	private JTextPane textPane;
	private JLabel lblAgenda_1;
	private JLabel lblCancelamentoEReagendamento;
	public PanelCancelamentoReagendamento() {
		setBackground(new Color(89, 169, 255));
		this.setSize(960, 790);
		setLayout(null);
		add(getLblDados());
		add(getPanelDadosPessoais());
		add(getLblCancelamentoEReagendamento());
	}

	private JLabel getLblDados() {
		if (lblDados == null) {
			lblDados = new JLabel("Dados");
			lblDados.setForeground(Color.WHITE);
			lblDados.setFont(new Font("Tahoma", Font.BOLD, 25));
			lblDados.setBounds(80, 128, 296, 31);
		}
		return lblDados;
	}
	private JPanel getPanelDadosPessoais() {
		if (panelDadosPessoais == null) {
			panelDadosPessoais = new JPanel();
			panelDadosPessoais.setLayout(null);
			panelDadosPessoais.setBorder(new LineBorder(new Color(192, 192, 192), 1, true));
			panelDadosPessoais.setBounds(80, 169, 800, 464);
			panelDadosPessoais.add(getTextPane());
			panelDadosPessoais.add(getLblAgenda_1());
		}
		return panelDadosPessoais;
	}
	private JTextPane getTextPane() {
		if (textPane == null) {
			textPane = new JTextPane();
			textPane.setFont(new Font("Tahoma", Font.PLAIN, 15));
			textPane.setBounds(10, 41, 780, 413);
		}
		return textPane;
	}
	private JLabel getLblAgenda_1() {
		if (lblAgenda_1 == null) {
			lblAgenda_1 = new JLabel("Painel");
			lblAgenda_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
			lblAgenda_1.setBounds(10, 10, 109, 32);
		}
		return lblAgenda_1;
	}
	private JLabel getLblCancelamentoEReagendamento() {
		if (lblCancelamentoEReagendamento == null) {
			lblCancelamentoEReagendamento = new JLabel("Cancelamento e Reagendamento");
			lblCancelamentoEReagendamento.setForeground(Color.WHITE);
			lblCancelamentoEReagendamento.setFont(new Font("Tahoma", Font.BOLD, 30));
			lblCancelamentoEReagendamento.setBounds(228, 33, 504, 37);
		}
		return lblCancelamentoEReagendamento;
	}
}
