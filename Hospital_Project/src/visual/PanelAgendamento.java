package visual;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextField;

public class PanelAgendamento extends JPanel {
	private JLabel titlePanelCadastrarMedico;
	public PanelAgendamento() {
		setBackground(new Color(83, 169, 255));
		setLayout(null);
		this.setSize(940, 790);
		add(getTitlePanelCadastrarMedico());
	}

	private JLabel getTitlePanelCadastrarMedico() {
		if (titlePanelCadastrarMedico == null) {
			titlePanelCadastrarMedico = new JLabel("Agendamentos");
			titlePanelCadastrarMedico.setBounds(355, 33, 229, 37);
			titlePanelCadastrarMedico.setForeground(Color.WHITE);
			titlePanelCadastrarMedico.setFont(new Font("Tahoma", Font.BOLD, 30));
		}
		return titlePanelCadastrarMedico;
	}
}
