package visual;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelHome extends JPanel {
	private JLabel lblBemvindoa;
	private JLabel labelHome;
	private JLabel lblNewLabel_1;
	public PanelHome() {
		setBackground(new Color(89, 169, 255));
		this.setSize(960, 790);
		setLayout(null);
		add(getLblBemvindoa());
		add(getLabelHome());
		add(getLblNewLabel_1());
	}

	private JLabel getLblBemvindoa() {
		if (lblBemvindoa == null) {
			lblBemvindoa = new JLabel("Bem-Vindo(a)!");
			lblBemvindoa.setForeground(Color.WHITE);
			lblBemvindoa.setFont(new Font("Dialog", Font.PLAIN, 40));
			lblBemvindoa.setBounds(350, 48, 260, 52);
		}
		return lblBemvindoa;
	}
	private JLabel getLabelHome() {
		if (labelHome == null) {
			labelHome = new JLabel("Clínica Mais Saúde");
			labelHome.setForeground(Color.WHITE);
			labelHome.setFont(new Font("Arial Black", Font.PLAIN, 60));
			labelHome.setBounds(168, 307, 623, 85);
		}
		return labelHome;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("");
			lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\mateu\\Downloads\\cuidados-de-saude.png"));
			lblNewLabel_1.setBounds(416, 390, 128, 128);
		}
		return lblNewLabel_1;
	}
}
