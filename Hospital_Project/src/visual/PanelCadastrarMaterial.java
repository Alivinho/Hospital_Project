package visual;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

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
		this.setLayout(null);
		this.setSize(940, 920);
		add(PanelInformacoesMateriais());
		
		
		JLabel titlePanelCadastrarMateriais = new JLabel("Cadastro dos Materiais");
		titlePanelCadastrarMateriais.setForeground(new Color(255, 255, 255));
		titlePanelCadastrarMateriais.setFont(new Font("Tahoma", Font.BOLD, 30));
		titlePanelCadastrarMateriais.setSize(349, 33);
		titlePanelCadastrarMateriais.setLocation(295, 31); 
	    add(titlePanelCadastrarMateriais);
	    add(getBtnLimpar());
	    add(getBtnCadastrar());
	}
	
	public JPanel PanelInformacoesMateriais() {
		JPanel PanelInformacoesMateriais = new JPanel();
		PanelInformacoesMateriais.setBorder(new LineBorder(new Color(192, 192, 192), 1, true));
		PanelInformacoesMateriais.setLayout(null);
		PanelInformacoesMateriais.setSize(696, 385);
		PanelInformacoesMateriais.setLocation(122, 82);

		
		PanelInformacoesMateriais.add(getTextFieldNomeMaterial());

		PanelInformacoesMateriais.add(getLabelNomeMaterial());
		PanelInformacoesMateriais.add(getTextField());
		PanelInformacoesMateriais.add(getLblQuantidadeEmEstoque());
		PanelInformacoesMateriais.add(getTextField_1());
		PanelInformacoesMateriais.add(getLblQuantidadeMnimaEm());
		PanelInformacoesMateriais.add(getTextField_2());
		PanelInformacoesMateriais.add(getLblFornecedor());
		PanelInformacoesMateriais.add(getTextField_3());
		PanelInformacoesMateriais.add(getLblPreo());
		
		return PanelInformacoesMateriais;
	}
	
	public JTextField getTextFieldNomeMaterial() {
	    if (nomeMaterial == null) {
	        nomeMaterial = new JTextField();
	        nomeMaterial.setSize(574, 32);
	        nomeMaterial.setLocation(58, 40); 
	    }
	    return nomeMaterial;
	}

	public JLabel getLabelNomeMaterial() {
	    if (labelNomeMaterial == null) {
	        labelNomeMaterial = new JLabel("Nome do Material:");
	        labelNomeMaterial.setFont(new Font("Tahoma", Font.PLAIN, 15));
	        labelNomeMaterial.setSize(200, 32);
	        labelNomeMaterial.setLocation(58, 10); 
	    }
	    return labelNomeMaterial;
	}
	private JTextField getTextField() {
		if (textField == null) {
			textField = new JTextField();
			textField.setBounds(58, 112, 574, 32);
		}
		return textField;
	}
	private JLabel getLblQuantidadeEmEstoque() {
		if (lblQuantidadeEmEstoque == null) {
			lblQuantidadeEmEstoque = new JLabel("Quantidade em Estoque:");
			lblQuantidadeEmEstoque.setFont(new Font("Tahoma", Font.PLAIN, 15));
			lblQuantidadeEmEstoque.setBounds(58, 82, 200, 32);
		}
		return lblQuantidadeEmEstoque;
	}
	private JTextField getTextField_1() {
		if (textField_1 == null) {
			textField_1 = new JTextField();
			textField_1.setBounds(58, 184, 574, 32);
		}
		return textField_1;
	}
	private JLabel getLblQuantidadeMnimaEm() {
		if (lblQuantidadeMnimaEm == null) {
			lblQuantidadeMnimaEm = new JLabel("Quantidade Mínima em Estoque:");
			lblQuantidadeMnimaEm.setFont(new Font("Tahoma", Font.PLAIN, 15));
			lblQuantidadeMnimaEm.setBounds(58, 154, 220, 32);
		}
		return lblQuantidadeMnimaEm;
	}
	private JTextField getTextField_2() {
		if (textField_2 == null) {
			textField_2 = new JTextField();
			textField_2.setBounds(58, 256, 574, 32);
		}
		return textField_2;
	}
	private JLabel getLblFornecedor() {
		if (lblFornecedor == null) {
			lblFornecedor = new JLabel("Fornecedor:");
			lblFornecedor.setFont(new Font("Tahoma", Font.PLAIN, 15));
			lblFornecedor.setBounds(58, 226, 220, 32);
		}
		return lblFornecedor;
	}
	private JTextField getTextField_3() {
		if (textField_3 == null) {
			textField_3 = new JTextField();
			textField_3.setBounds(58, 328, 574, 32);
		}
		return textField_3;
	}
	private JLabel getLblPreo() {
		if (lblPreo == null) {
			lblPreo = new JLabel("Preço:");
			lblPreo.setFont(new Font("Tahoma", Font.PLAIN, 15));
			lblPreo.setBounds(58, 298, 220, 32);
		}
		return lblPreo;
	}
	private JButton getBtnLimpar() {
		if (btnLimpar == null) {
			btnLimpar = new JButton();
			btnLimpar.setText("LIMPAR");
			btnLimpar.setForeground(new Color(0, 0, 205));
			btnLimpar.setFont(new Font("Tahoma", Font.PLAIN, 15));
			btnLimpar.setBounds(480, 477, 156, 40);
		}
		return btnLimpar;
	}
	private JButton getBtnCadastrar() {
		if (btnCadastrar == null) {
			btnCadastrar = new JButton();
			btnCadastrar.setText("CADASTRAR");
			btnCadastrar.setForeground(new Color(0, 0, 205));
			btnCadastrar.setFont(new Font("Tahoma", Font.PLAIN, 15));
			btnCadastrar.setBounds(671, 477, 147, 40);
		}
		return btnCadastrar;
	}
}
