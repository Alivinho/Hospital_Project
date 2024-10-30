package visual;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

public class PanelCadastrarMaterial extends JPanel{
	
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
		this.setLayout(null);
		this.setSize(900, 675);
		add(PanelInformacoesMateriais());
		
		
		JLabel titlePanelCadastrarMateriais = new JLabel("Cadastro dos Materiais");
		titlePanelCadastrarMateriais.setFont(new Font("Tahoma", Font.BOLD, 30));
		titlePanelCadastrarMateriais.setSize(393, 25);
		titlePanelCadastrarMateriais.setLocation(253, 31); 
	    add(titlePanelCadastrarMateriais);
	    add(getBtnLimpar());
	    add(getBtnCadastrar());
	}
	
	public JPanel PanelInformacoesMateriais() {
		JPanel PanelInformacoesMateriais = new JPanel();
		PanelInformacoesMateriais.setBorder(new LineBorder(new Color(192, 192, 192)));
		PanelInformacoesMateriais.setLayout(null);
		PanelInformacoesMateriais.setSize(800, 379);
		PanelInformacoesMateriais.setLocation(50, 82);

		
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
	        nomeMaterial.setLocation(113, 40); 
	    }
	    return nomeMaterial;
	}

	public JLabel getLabelNomeMaterial() {
	    if (labelNomeMaterial == null) {
	        labelNomeMaterial = new JLabel("Nome do Material:");
	        labelNomeMaterial.setFont(new Font("Tahoma", Font.PLAIN, 15));
	        labelNomeMaterial.setSize(200, 32);
	        labelNomeMaterial.setLocation(113, 10); 
	    }
	    return labelNomeMaterial;
	}
	private JTextField getTextField() {
		if (textField == null) {
			textField = new JTextField();
			textField.setBounds(113, 112, 574, 32);
		}
		return textField;
	}
	private JLabel getLblQuantidadeEmEstoque() {
		if (lblQuantidadeEmEstoque == null) {
			lblQuantidadeEmEstoque = new JLabel("Quantidade em Estoque:");
			lblQuantidadeEmEstoque.setFont(new Font("Tahoma", Font.PLAIN, 15));
			lblQuantidadeEmEstoque.setBounds(113, 82, 200, 32);
		}
		return lblQuantidadeEmEstoque;
	}
	private JTextField getTextField_1() {
		if (textField_1 == null) {
			textField_1 = new JTextField();
			textField_1.setBounds(113, 184, 574, 32);
		}
		return textField_1;
	}
	private JLabel getLblQuantidadeMnimaEm() {
		if (lblQuantidadeMnimaEm == null) {
			lblQuantidadeMnimaEm = new JLabel("Quantidade Mínima em Estoque:");
			lblQuantidadeMnimaEm.setFont(new Font("Tahoma", Font.PLAIN, 15));
			lblQuantidadeMnimaEm.setBounds(113, 154, 220, 32);
		}
		return lblQuantidadeMnimaEm;
	}
	private JTextField getTextField_2() {
		if (textField_2 == null) {
			textField_2 = new JTextField();
			textField_2.setBounds(113, 256, 574, 32);
		}
		return textField_2;
	}
	private JLabel getLblFornecedor() {
		if (lblFornecedor == null) {
			lblFornecedor = new JLabel("Fornecedor:");
			lblFornecedor.setFont(new Font("Tahoma", Font.PLAIN, 15));
			lblFornecedor.setBounds(113, 226, 220, 32);
		}
		return lblFornecedor;
	}
	private JTextField getTextField_3() {
		if (textField_3 == null) {
			textField_3 = new JTextField();
			textField_3.setBounds(113, 328, 574, 32);
		}
		return textField_3;
	}
	private JLabel getLblPreo() {
		if (lblPreo == null) {
			lblPreo = new JLabel("Preço:");
			lblPreo.setFont(new Font("Tahoma", Font.PLAIN, 15));
			lblPreo.setBounds(113, 298, 220, 32);
		}
		return lblPreo;
	}
	private JButton getBtnLimpar() {
		if (btnLimpar == null) {
			btnLimpar = new JButton();
			btnLimpar.setText("LIMPAR");
			btnLimpar.setForeground(new Color(0, 0, 205));
			btnLimpar.setFont(new Font("Tahoma", Font.PLAIN, 15));
			btnLimpar.setBounds(512, 471, 156, 40);
		}
		return btnLimpar;
	}
	private JButton getBtnCadastrar() {
		if (btnCadastrar == null) {
			btnCadastrar = new JButton();
			btnCadastrar.setText("CADASTRAR");
			btnCadastrar.setForeground(new Color(0, 0, 205));
			btnCadastrar.setFont(new Font("Tahoma", Font.PLAIN, 15));
			btnCadastrar.setBounds(703, 471, 147, 40);
		}
		return btnCadastrar;
	}
}
