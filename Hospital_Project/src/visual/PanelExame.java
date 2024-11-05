package visual;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;

public class PanelExame extends JPanel {
	private JLabel titlePanelCadastrarMedico;
	public PanelExame() {
		setBackground(new Color(83, 169, 255));
		this.setSize(940, 920);
		setLayout(null);
		add(getTitlePanelCadastrarMedico());
	}

	private JLabel getTitlePanelCadastrarMedico() {
		if (titlePanelCadastrarMedico == null) {
			titlePanelCadastrarMedico = new JLabel("Exames");
			titlePanelCadastrarMedico.setBounds(411, 33, 118, 37);
			titlePanelCadastrarMedico.setForeground(Color.WHITE);
			titlePanelCadastrarMedico.setFont(new Font("Tahoma", Font.BOLD, 30));
		}
		return titlePanelCadastrarMedico;
	}
}
