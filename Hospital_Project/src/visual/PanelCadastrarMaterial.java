package visual;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;

public class PanelCadastrarMaterial extends JPanel {
	
	private JTextField nomeMaterial;
	
	private JLabel labelNomeMaterial;
	private JTextField textField;
	private JLabel lblQuantidadeEmEstoque;
	private JTextField textField_1;
	private JLabel lblQuantidadeMnimaEm;
	private JTextField textField_2;
	private JLabel lblFornecedor;
	private JTextField textField_3;
	private JLabel lblPreo;
	private JButton btnLimpar;
	private JButton btnCadastrar;
	
	public PanelCadastrarMaterial() {
		setBackground(new Color(83, 169, 255));
		this.setSize(940, 920);
		setLayout(null);
		add(PanelInformacoesMateriais());
		
		
		JLabel titlePanelCadastrarMateriais = new JLabel("Cadastro dos Materiais");
		titlePanelCadastrarMateriais.setBounds(295, 31, 349, 33);
		titlePanelCadastrarMateriais.setForeground(new Color(255, 255, 255));
		titlePanelCadastrarMateriais.setFont(new Font("Tahoma", Font.BOLD, 30));
	    add(titlePanelCadastrarMateriais);
	    add(getBtnLimpar());
	    add(getBtnCadastrar());
	}
	
	public JPanel PanelInformacoesMateriais() {
		JPanel PanelInformacoesMateriais = new JPanel();
		PanelInformacoesMateriais.setBounds(122, 82, 696, 385);
		PanelInformacoesMateriais.setBorder(new LineBorder(new Color(192, 192, 192), 1, true));
		GroupLayout gl_PanelInformacoesMateriais = new GroupLayout(PanelInformacoesMateriais);
		gl_PanelInformacoesMateriais.setHorizontalGroup(
			gl_PanelInformacoesMateriais.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_PanelInformacoesMateriais.createSequentialGroup()
					.addGap(57)
					.addGroup(gl_PanelInformacoesMateriais.createParallelGroup(Alignment.LEADING)
						.addComponent(getLabelNomeMaterial(), GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE)
						.addComponent(getTextFieldNomeMaterial(), GroupLayout.DEFAULT_SIZE, 574, Short.MAX_VALUE)
						.addComponent(getLblQuantidadeEmEstoque(), GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE)
						.addComponent(getTextField(), GroupLayout.PREFERRED_SIZE, 574, GroupLayout.PREFERRED_SIZE)
						.addComponent(getLblQuantidadeMnimaEm(), GroupLayout.PREFERRED_SIZE, 220, GroupLayout.PREFERRED_SIZE)
						.addComponent(getTextField_1(), GroupLayout.PREFERRED_SIZE, 574, GroupLayout.PREFERRED_SIZE)
						.addComponent(getLblFornecedor(), GroupLayout.PREFERRED_SIZE, 220, GroupLayout.PREFERRED_SIZE)
						.addComponent(getTextField_2(), GroupLayout.PREFERRED_SIZE, 574, GroupLayout.PREFERRED_SIZE)
						.addComponent(getLblPreo(), GroupLayout.PREFERRED_SIZE, 220, GroupLayout.PREFERRED_SIZE)
						.addComponent(getTextField_3(), GroupLayout.PREFERRED_SIZE, 574, GroupLayout.PREFERRED_SIZE))
					.addGap(63))
		);
		gl_PanelInformacoesMateriais.setVerticalGroup(
			gl_PanelInformacoesMateriais.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_PanelInformacoesMateriais.createSequentialGroup()
					.addGap(9)
					.addGroup(gl_PanelInformacoesMateriais.createParallelGroup(Alignment.LEADING)
						.addComponent(getLabelNomeMaterial(), GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_PanelInformacoesMateriais.createSequentialGroup()
							.addGap(30)
							.addComponent(getTextFieldNomeMaterial(), GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)))
					.addGap(10)
					.addGroup(gl_PanelInformacoesMateriais.createParallelGroup(Alignment.LEADING)
						.addComponent(getLblQuantidadeEmEstoque(), GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_PanelInformacoesMateriais.createSequentialGroup()
							.addGap(30)
							.addComponent(getTextField(), GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)))
					.addGap(10)
					.addGroup(gl_PanelInformacoesMateriais.createParallelGroup(Alignment.LEADING)
						.addComponent(getLblQuantidadeMnimaEm(), GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_PanelInformacoesMateriais.createSequentialGroup()
							.addGap(30)
							.addComponent(getTextField_1(), GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)))
					.addGap(10)
					.addGroup(gl_PanelInformacoesMateriais.createParallelGroup(Alignment.LEADING)
						.addComponent(getLblFornecedor(), GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_PanelInformacoesMateriais.createSequentialGroup()
							.addGap(30)
							.addComponent(getTextField_2(), GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)))
					.addGap(10)
					.addGroup(gl_PanelInformacoesMateriais.createParallelGroup(Alignment.LEADING)
						.addComponent(getLblPreo(), GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_PanelInformacoesMateriais.createSequentialGroup()
							.addGap(30)
							.addComponent(getTextField_3(), GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)))
					.addGap(24))
		);
		PanelInformacoesMateriais.setLayout(gl_PanelInformacoesMateriais);
		
		return PanelInformacoesMateriais;
	}
	
	public JTextField getTextFieldNomeMaterial() {
	    if (nomeMaterial == null) {
	        nomeMaterial = new JTextField();
	    }
	    return nomeMaterial;
	}

	public JLabel getLabelNomeMaterial() {
	    if (labelNomeMaterial == null) {
	        labelNomeMaterial = new JLabel("Nome do Material:");
	        labelNomeMaterial.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    }
	    return labelNomeMaterial;
	}
	private JTextField getTextField() {
		if (textField == null) {
			textField = new JTextField();
		}
		return textField;
	}
	private JLabel getLblQuantidadeEmEstoque() {
		if (lblQuantidadeEmEstoque == null) {
			lblQuantidadeEmEstoque = new JLabel("Quantidade em Estoque:");
			lblQuantidadeEmEstoque.setFont(new Font("Tahoma", Font.PLAIN, 15));
		}
		return lblQuantidadeEmEstoque;
	}
	private JTextField getTextField_1() {
		if (textField_1 == null) {
			textField_1 = new JTextField();
		}
		return textField_1;
	}
	private JLabel getLblQuantidadeMnimaEm() {
		if (lblQuantidadeMnimaEm == null) {
			lblQuantidadeMnimaEm = new JLabel("Quantidade Mínima em Estoque:");
			lblQuantidadeMnimaEm.setFont(new Font("Tahoma", Font.PLAIN, 15));
		}
		return lblQuantidadeMnimaEm;
	}
	private JTextField getTextField_2() {
		if (textField_2 == null) {
			textField_2 = new JTextField();
		}
		return textField_2;
	}
	private JLabel getLblFornecedor() {
		if (lblFornecedor == null) {
			lblFornecedor = new JLabel("Fornecedor:");
			lblFornecedor.setFont(new Font("Tahoma", Font.PLAIN, 15));
		}
		return lblFornecedor;
	}
	private JTextField getTextField_3() {
		if (textField_3 == null) {
			textField_3 = new JTextField();
		}
		return textField_3;
	}
	private JLabel getLblPreo() {
		if (lblPreo == null) {
			lblPreo = new JLabel("Preço:");
			lblPreo.setFont(new Font("Tahoma", Font.PLAIN, 15));
		}
		return lblPreo;
	}
	private JButton getBtnLimpar() {
		if (btnLimpar == null) {
			btnLimpar = new JButton();
			btnLimpar.setBounds(480, 477, 156, 40);
			btnLimpar.setText("LIMPAR");
			btnLimpar.setForeground(new Color(0, 0, 205));
			btnLimpar.setFont(new Font("Tahoma", Font.PLAIN, 15));
		}
		return btnLimpar;
	}
	private JButton getBtnCadastrar() {
		if (btnCadastrar == null) {
			btnCadastrar = new JButton();
			btnCadastrar.setBounds(671, 477, 147, 40);
			btnCadastrar.setText("CADASTRAR");
			btnCadastrar.setForeground(new Color(0, 0, 205));
			btnCadastrar.setFont(new Font("Tahoma", Font.PLAIN, 15));
		}
		return btnCadastrar;
	}
}
