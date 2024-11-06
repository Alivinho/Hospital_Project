package visual;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;

public class PanelRelatorio extends JPanel {
	private JLabel lblRelatrios;
	public PanelRelatorio() {
		setBackground(new Color(83, 169, 255));
		this.setSize(940, 790);
		setLayout(null);
		add(getLblRelatrios());
	}

	private JLabel getLblRelatrios() {
		if (lblRelatrios == null) {
			lblRelatrios = new JLabel("Relatórios");
			lblRelatrios.setBounds(411, 5, 155, 37);
			lblRelatrios.setForeground(Color.WHITE);
			lblRelatrios.setFont(new Font("Tahoma", Font.BOLD, 30));
		}
		return lblRelatrios;
	}
}
