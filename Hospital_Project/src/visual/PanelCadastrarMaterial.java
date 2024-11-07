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
		this.setSize(940, 790);
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
		PanelInformacoesMateriais.setLayout(null);
		PanelInformacoesMateriais.add(getLabelNomeMaterial());
		PanelInformacoesMateriais.add(getTextFieldNomeMaterial());
		PanelInformacoesMateriais.add(getLblQuantidadeEmEstoque());
		PanelInformacoesMateriais.add(getTextField());
		PanelInformacoesMateriais.add(getLblQuantidadeMnimaEm());
		PanelInformacoesMateriais.add(getTextField_1());
		PanelInformacoesMateriais.add(getLblFornecedor());
		PanelInformacoesMateriais.add(getTextField_2());
		PanelInformacoesMateriais.add(getLblPreo());
		PanelInformacoesMateriais.add(getTextField_3());
		
		return PanelInformacoesMateriais;
	}
	
	public JTextField getTextFieldNomeMaterial() {
	    if (nomeMaterial == null) {
	        nomeMaterial = new JTextField();
	        nomeMaterial.setBounds(11, 41, 675, 32);
	        nomeMaterial.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    }
	    return nomeMaterial;
	}

	public JLabel getLabelNomeMaterial() {
	    if (labelNomeMaterial == null) {
	        labelNomeMaterial = new JLabel("Nome do Material:");
	        labelNomeMaterial.setBounds(11, 11, 200, 32);
	        labelNomeMaterial.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    }
	    return labelNomeMaterial;
	}
	private JTextField getTextField() {
		if (textField == null) {
			textField = new JTextField();
			textField.setBounds(11, 113, 675, 32);
			textField.setFont(new Font("Tahoma", Font.PLAIN, 15));
		}
		return textField;
	}
	private JLabel getLblQuantidadeEmEstoque() {
		if (lblQuantidadeEmEstoque == null) {
			lblQuantidadeEmEstoque = new JLabel("Quantidade em Estoque:");
			lblQuantidadeEmEstoque.setBounds(11, 83, 200, 32);
			lblQuantidadeEmEstoque.setFont(new Font("Tahoma", Font.PLAIN, 15));
		}
		return lblQuantidadeEmEstoque;
	}
	private JTextField getTextField_1() {
		if (textField_1 == null) {
			textField_1 = new JTextField();
			textField_1.setBounds(11, 185, 675, 32);
			textField_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		}
		return textField_1;
	}
	private JLabel getLblQuantidadeMnimaEm() {
		if (lblQuantidadeMnimaEm == null) {
			lblQuantidadeMnimaEm = new JLabel("Quantidade Mínima em Estoque:");
			lblQuantidadeMnimaEm.setBounds(11, 155, 220, 32);
			lblQuantidadeMnimaEm.setFont(new Font("Tahoma", Font.PLAIN, 15));
		}
		return lblQuantidadeMnimaEm;
	}
	private JTextField getTextField_2() {
		if (textField_2 == null) {
			textField_2 = new JTextField();
			textField_2.setBounds(11, 257, 675, 32);
			textField_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		}
		return textField_2;
	}
	private JLabel getLblFornecedor() {
		if (lblFornecedor == null) {
			lblFornecedor = new JLabel("Fornecedor:");
			lblFornecedor.setBounds(11, 227, 220, 32);
			lblFornecedor.setFont(new Font("Tahoma", Font.PLAIN, 15));
		}
		return lblFornecedor;
	}
	private JTextField getTextField_3() {
		if (textField_3 == null) {
			textField_3 = new JTextField();
			textField_3.setBounds(11, 329, 675, 32);
			textField_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		}
		return textField_3;
	}
	private JLabel getLblPreo() {
		if (lblPreo == null) {
			lblPreo = new JLabel("Preço:");
			lblPreo.setBounds(11, 299, 220, 32);
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
