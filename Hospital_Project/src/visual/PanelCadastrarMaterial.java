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
	private JTextField quantEstoque;
	private JLabel lblQuantidadeEmEstoque;
	private JTextField quantMimEstoque;
	private JLabel lblQuantidadeMnimaEm;
	private JTextField nomeFornecedor;
	private JLabel lblFornecedor;
	private JTextField preco;
	private JLabel lblPreo;
	private JButton btnLimpar;
	private JButton btnCadastrar;
	private JLabel lblDadosDoCadastro;
	
	public PanelCadastrarMaterial() {
		setBackground(new Color(83, 169, 255));
		this.setSize(940, 790);
		setLayout(null);
		add(PanelInformacoesMateriais());
		
		
		JLabel titlePanelCadastrarMateriais = new JLabel("Cadastro dos Materiais");
		titlePanelCadastrarMateriais.setBounds(295, 33, 349, 33);
		titlePanelCadastrarMateriais.setForeground(new Color(255, 255, 255));
		titlePanelCadastrarMateriais.setFont(new Font("Tahoma", Font.BOLD, 30));
	    add(titlePanelCadastrarMateriais);
	    add(getBtnLimpar());
	    add(getBtnCadastrar());
	    add(getLblDadosDoCadastro());
	}
	
	public JPanel PanelInformacoesMateriais() {
		JPanel PanelInformacoesMateriais = new JPanel();
		PanelInformacoesMateriais.setBounds(134, 169, 696, 385);
		PanelInformacoesMateriais.setBorder(new LineBorder(new Color(192, 192, 192), 1, true));
		PanelInformacoesMateriais.setLayout(null);
		PanelInformacoesMateriais.add(getLabelNomeMaterial());
		PanelInformacoesMateriais.add(getTextFieldNomeMaterial());
		PanelInformacoesMateriais.add(getLblQuantidadeEmEstoque());
		PanelInformacoesMateriais.add(getQuantEstoque());
		PanelInformacoesMateriais.add(getLblQuantidadeMnimaEm());
		PanelInformacoesMateriais.add(getQuantMimEstoque());
		PanelInformacoesMateriais.add(getLblFornecedor());
		PanelInformacoesMateriais.add(getNomeFornecedor());
		PanelInformacoesMateriais.add(getLblPreo());
		PanelInformacoesMateriais.add(getPreco());
		
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
	public JTextField getQuantEstoque() {
		if (quantEstoque == null) {
			quantEstoque = new JTextField();
			quantEstoque.setBounds(11, 113, 675, 32);
			quantEstoque.setFont(new Font("Tahoma", Font.PLAIN, 15));
		}
		return quantEstoque;
	}
	public JLabel getLblQuantidadeEmEstoque() {
		if (lblQuantidadeEmEstoque == null) {
			lblQuantidadeEmEstoque = new JLabel("Quantidade em Estoque:");
			lblQuantidadeEmEstoque.setBounds(11, 83, 200, 32);
			lblQuantidadeEmEstoque.setFont(new Font("Tahoma", Font.PLAIN, 15));
		}
		return lblQuantidadeEmEstoque;
	}
	public JTextField getQuantMimEstoque() {
		if (quantMimEstoque == null) {
			quantMimEstoque = new JTextField();
			quantMimEstoque.setBounds(11, 185, 675, 32);
			quantMimEstoque.setFont(new Font("Tahoma", Font.PLAIN, 15));
		}
		return quantMimEstoque;
	}
	public JLabel getLblQuantidadeMnimaEm() {
		if (lblQuantidadeMnimaEm == null) {
			lblQuantidadeMnimaEm = new JLabel("Quantidade Mínima em Estoque:");
			lblQuantidadeMnimaEm.setBounds(11, 155, 220, 32);
			lblQuantidadeMnimaEm.setFont(new Font("Tahoma", Font.PLAIN, 15));
		}
		return lblQuantidadeMnimaEm;
	}
	public JTextField getNomeFornecedor() {
		if (nomeFornecedor == null) {
			nomeFornecedor = new JTextField();
			nomeFornecedor.setBounds(11, 257, 675, 32);
			nomeFornecedor.setFont(new Font("Tahoma", Font.PLAIN, 15));
		}
		return nomeFornecedor;
	}
	public JLabel getLblFornecedor() {
		if (lblFornecedor == null) {
			lblFornecedor = new JLabel("Fornecedor:");
			lblFornecedor.setBounds(11, 227, 220, 32);
			lblFornecedor.setFont(new Font("Tahoma", Font.PLAIN, 15));
		}
		return lblFornecedor;
	}
	public JTextField getPreco() {
		if (preco == null) {
			preco = new JTextField();
			preco.setBounds(11, 329, 675, 32);
			preco.setFont(new Font("Tahoma", Font.PLAIN, 15));
		}
		return preco;
	}
	public JLabel getLblPreo() {
		if (lblPreo == null) {
			lblPreo = new JLabel("Preço:");
			lblPreo.setBounds(11, 299, 220, 32);
			lblPreo.setFont(new Font("Tahoma", Font.PLAIN, 15));
		}
		return lblPreo;
	}
	public JButton getBtnLimpar() {
		if (btnLimpar == null) {
			btnLimpar = new JButton();
			btnLimpar.setBounds(493, 564, 156, 40);
			btnLimpar.setText("LIMPAR");
			btnLimpar.setForeground(new Color(0, 0, 205));
			btnLimpar.setFont(new Font("Tahoma", Font.PLAIN, 15));
		}
		return btnLimpar;
	}
	public JButton getBtnCadastrar() {
		if (btnCadastrar == null) {
			btnCadastrar = new JButton();
			btnCadastrar.setBounds(684, 564, 147, 40);
			btnCadastrar.setText("CADASTRAR");
			btnCadastrar.setForeground(new Color(0, 0, 205));
			btnCadastrar.setFont(new Font("Tahoma", Font.PLAIN, 15));
		}
		return btnCadastrar;
	}
	private JLabel getLblDadosDoCadastro() {
		if (lblDadosDoCadastro == null) {
			lblDadosDoCadastro = new JLabel("Dados do cadastro");
			lblDadosDoCadastro.setForeground(Color.WHITE);
			lblDadosDoCadastro.setFont(new Font("Tahoma", Font.BOLD, 25));
			lblDadosDoCadastro.setBounds(134, 128, 296, 31);
		}
		return lblDadosDoCadastro;
	}
}
