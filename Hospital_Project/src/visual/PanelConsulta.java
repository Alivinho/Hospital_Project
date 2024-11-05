package visual;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;

public class PanelConsulta extends JPanel {
	private JLabel titlePanelCadastrarMedico;
	public PanelConsulta() {
		setBackground(new Color(83, 169, 255));
		this.setSize(940, 920);
		setLayout(null);
		add(getTitlePanelCadastrarMedico());
	}

	private JLabel getTitlePanelCadastrarMedico() {
		if (titlePanelCadastrarMedico == null) {
			titlePanelCadastrarMedico = new JLabel("Consultas");
			titlePanelCadastrarMedico.setBounds(395, 33, 149, 37);
			titlePanelCadastrarMedico.setForeground(Color.WHITE);
			titlePanelCadastrarMedico.setFont(new Font("Tahoma", Font.BOLD, 30));
		}
		return titlePanelCadastrarMedico;
	}
}
