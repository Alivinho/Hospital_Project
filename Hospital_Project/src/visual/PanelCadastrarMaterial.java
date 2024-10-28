package visual;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PanelCadastrarMaterial extends JPanel{
	
	private JTextField nomeMaterial;
	private JTextField quantEstoque;
	private JTextField quantMinimaEstoque;
	private JTextField fornecedor;
	private JTextField preco;
	
	private JLabel labelNomeMaterial;
	private JLabel labelQuantEstoque;
	private JLabel labelQuantMinimaEstoque;
	private JLabel labelFornecedor;
	private JLabel labelPreco;
	
	private JButton btnCadastrar;
	private JButton btnLimpar; 
	
	public PanelCadastrarMaterial() {
		this.setLayout(null);
		this.setSize(1200, 720);
		add(PanelInformacoesMateriais());
		
		
		JLabel titlePanelCadastrarMateriais = new JLabel("Cadastro dos Materiais");
		titlePanelCadastrarMateriais.setFont(new Font("Tahoma", Font.BOLD, 30));
		titlePanelCadastrarMateriais.setSize(393, 25);
		titlePanelCadastrarMateriais.setLocation(50, 31); 
	    add(titlePanelCadastrarMateriais);

		
		add(getbtnCadastrar());
		add(getbtnLimpar());
	}
	
	public JPanel PanelInformacoesMateriais() {
		JPanel PanelInformacoesMateriais = new JPanel();
		PanelInformacoesMateriais.setLayout(null);
		PanelInformacoesMateriais.setSize(800, 367);
		PanelInformacoesMateriais.setLocation(50, 82);

		
		PanelInformacoesMateriais.add(getTextFieldNomeMaterial());
		PanelInformacoesMateriais.add(getTextFieldQuantEstoque());
		PanelInformacoesMateriais.add(getTextFieldQuantMinimaEstoque());
		PanelInformacoesMateriais.add(getTextFieldFornecedor());
		PanelInformacoesMateriais.add(getTextFieldPreco());

		PanelInformacoesMateriais.add(getLabelNomeMaterial());
		PanelInformacoesMateriais.add(getLabelQuantEstoque());
		PanelInformacoesMateriais.add(getLabelQuantMinimaEstoque());
		PanelInformacoesMateriais.add(getLabelFornecedor());
		PanelInformacoesMateriais.add(getLabelPreco());
		
		return PanelInformacoesMateriais;
	}
	
	public JTextField getTextFieldNomeMaterial() {
	    if (nomeMaterial == null) {
	        nomeMaterial = new JTextField();
	        nomeMaterial.setSize(564, 32);
	        nomeMaterial.setLocation(60, 36); 
	    }
	    return nomeMaterial;
	}

	public JTextField getTextFieldQuantEstoque() {
	    if (quantEstoque == null) {
	        quantEstoque = new JTextField();
	        quantEstoque.setSize(564, 32);
	        quantEstoque.setLocation(60, 92); 
	    }
	    return quantEstoque;
	}

	public JTextField getTextFieldQuantMinimaEstoque() {
	    if (quantMinimaEstoque == null) {
	        quantMinimaEstoque = new JTextField();
	        quantMinimaEstoque.setSize(564, 32);
	        quantMinimaEstoque.setLocation(60, 161); 
	    }
	    return quantMinimaEstoque;
	}

	public JTextField getTextFieldFornecedor() {
	    if (fornecedor == null) {
	        fornecedor = new JTextField();
	        fornecedor.setSize(564, 32);
	        fornecedor.setLocation(60, 227); 
	    }
	    return fornecedor;
	}

	public JTextField getTextFieldPreco() {
	    if (preco == null) {
	        preco = new JTextField();
	        preco.setSize(564, 32);
	        preco.setLocation(60, 295); 
	    }
	    return preco;
	}

	public JLabel getLabelNomeMaterial() {
	    if (labelNomeMaterial == null) {
	        labelNomeMaterial = new JLabel("Nome do Material:");
	        labelNomeMaterial.setSize(200, 32);
	        labelNomeMaterial.setLocation(60, 11); 
	    }
	    return labelNomeMaterial;
	}

	public JLabel getLabelQuantEstoque() {
	    if (labelQuantEstoque == null) {
	        labelQuantEstoque = new JLabel("Quantidade em Estoque:");
	        labelQuantEstoque.setSize(200, 32);
	        labelQuantEstoque.setLocation(60, 67); 
	    }
	    return labelQuantEstoque;
	}

	public JLabel getLabelQuantMinimaEstoque() {
	    if (labelQuantMinimaEstoque == null) {
	        labelQuantMinimaEstoque = new JLabel("Quantidade Mínima em Estoque:");
	        labelQuantMinimaEstoque.setSize(200, 32);
	        labelQuantMinimaEstoque.setLocation(60, 136); 
	    }
	    return labelQuantMinimaEstoque;
	}

	public JLabel getLabelFornecedor() {
	    if (labelFornecedor == null) {
	        labelFornecedor = new JLabel("Fornecedor:");
	        labelFornecedor.setSize(200, 32);
	        labelFornecedor.setLocation(60, 202); 
	    }
	    return labelFornecedor;
	}

	public JLabel getLabelPreco() {
	    if (labelPreco == null) {
	        labelPreco = new JLabel("Preço:");
	        labelPreco.setSize(200, 32);
	        labelPreco.setLocation(60, 270); 
	    }
	    return labelPreco;
	}
	
	
/********************************** BOTÕES **********************************/
	
	public JButton getbtnCadastrar() {
		if(btnCadastrar == null) {
			btnCadastrar = new JButton();
			btnCadastrar.setForeground(new Color(0, 0, 205));
			btnCadastrar.setSize(147,40);
			btnCadastrar.setLocation(109,605);
			btnCadastrar.setText("CADASTRAR");
		}
		return btnCadastrar; 
	}
	
	public JButton getbtnLimpar() {
		if(btnLimpar == null) {
			btnLimpar = new JButton();
			btnLimpar.setForeground(new Color(0, 0, 205));
			btnLimpar.setSize(156,40);
			btnLimpar.setLocation(527,605);
			btnLimpar.setText("LIMPAR");

			
		}
		return btnLimpar; 
	}
	
	
	



}
