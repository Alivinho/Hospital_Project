package visual;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.border.LineBorder;

public class PanelCadastrarPaciente extends JPanel {
	//private JTextField tipoSangue;
	private JComboBox<String> tipoSangue; 

	private JTextField logradouro;
	private JTextField numero;
	private JTextField complemento;
	private JTextField bairro;
	private JTextField cep;
	private JTextField cidade;
	private JTextField estado;
	
	private JLabel labelLogradouro;
	private JLabel labelNumero;
	private JLabel labelComplemento;
	private JLabel labelBairro;
	private JLabel labelCep;
	private JLabel labelCidade;
	private JLabel labelEstado;
	private JLabel labelNomeMaterial;
	private JTextField textField;
	private JTextField textField_1;
	private JLabel lblDataDeNascimento;
	private JLabel lblTipoSanguneo;
	private JTextField textField_2;
	private JLabel lblTelefone;
	private JTextField textField_3;
	private JLabel lblConvnio;
	private JTextField textField_4;
	private JLabel lblTelefone_1;
	private JTextField textField_5;
	private JLabel lblTelefone_1_1;
	private JTextField textField_6;
	private JLabel lblTelefone_1_1_1;
	private JButton btnCadastrar;
	private JButton btnLimpar;

	public PanelCadastrarPaciente() {
		this.setLayout(null);
		this.setSize(940, 705);
		add(PanelDadosPessoais());
		add(PanelEndereco());
		
		 JLabel tituloDadosPessoais = new JLabel("Dados Pessoais");
		 tituloDadosPessoais.setFont(new Font("Tahoma", Font.BOLD, 25));
		 tituloDadosPessoais.setSize(325, 25);
	     tituloDadosPessoais.setLocation(70, 24); 
	     add(tituloDadosPessoais);
	     
	     JLabel tituloEndereco = new JLabel("Endereço");
	     tituloEndereco.setFont(new Font("Tahoma", Font.BOLD, 25));
	     tituloEndereco.setBounds(70, 335, 325, 25);
	     add(tituloEndereco);
	     add(getBtnCadastrar());
	     add(getBtnLimpar());
	}
	
	public JPanel PanelDadosPessoais() {
		JPanel panelDadosPessoais = new JPanel();
		panelDadosPessoais.setBorder(new LineBorder(new Color(192, 192, 192), 1, true));
		panelDadosPessoais.setLayout(null);
		panelDadosPessoais.setSize(800, 243);
		panelDadosPessoais.setLocation(70, 58);
	    panelDadosPessoais.add(getComboBoxTipoSangue());
		panelDadosPessoais.add(getTextField());
		panelDadosPessoais.add(getLabelNomeMaterial());
		panelDadosPessoais.add(getTextField_1());
		panelDadosPessoais.add(getLblDataDeNascimento());
		panelDadosPessoais.add(getLblTipoSanguneo());
		panelDadosPessoais.add(getTextField_2());
		panelDadosPessoais.add(getLblTelefone());
		panelDadosPessoais.add(getTextField_3());
		panelDadosPessoais.add(getLblConvnio());
		panelDadosPessoais.add(getTextField_4());
		panelDadosPessoais.add(getLblTelefone_1());
		panelDadosPessoais.add(getTextField_5());
		panelDadosPessoais.add(getLblTelefone_1_1());
		panelDadosPessoais.add(getTextField_6());
		panelDadosPessoais.add(getLblTelefone_1_1_1());

		return panelDadosPessoais;
	}

	private JPanel PanelEndereco() {
		JPanel panelEndereco = new JPanel();
		panelEndereco.setBorder(new LineBorder(new Color(192, 192, 192)));
		panelEndereco.setLayout(null);
		panelEndereco.setSize(800, 224);
		panelEndereco.setLocation(70, 370);

		panelEndereco.add(getLabelLogradouro());
		panelEndereco.add(getTextFieldLogradouro());
		panelEndereco.add(getLabelNumero());
		panelEndereco.add(getTextFieldNumero());
		panelEndereco.add(getLabelComplemento());
		panelEndereco.add(getTextFieldComplemento());
		panelEndereco.add(getLabelBairro());
		panelEndereco.add(getTextFieldBairro());
		panelEndereco.add(getLabelCep());
		panelEndereco.add(getTextFieldCep());
		panelEndereco.add(getLabelCidade());
		panelEndereco.add(getTextFieldCidade());
		panelEndereco.add(getLabelEstado());
		panelEndereco.add(getTextFieldEstado());

		return panelEndereco;
	}
	
	public JComboBox<String> getComboBoxTipoSangue(){
		 if (tipoSangue == null) {
		        String[] tiposSanguineos = { " ", "A+", "A-", "B+", "B-", "AB+", "AB-", "O+", "O-" };
		        tipoSangue = new JComboBox<>(tiposSanguineos);
		        tipoSangue.setSize(150, 32);
		        tipoSangue.setLocation(10, 112); 
		    }
		    return tipoSangue;
	}
	
	public JTextField getTextFieldLogradouro() {
	    if (logradouro == null) {
	        logradouro = new JTextField();
	        logradouro.setSize(564, 32);
	        logradouro.setLocation(62, 39); 
	    }
	    return logradouro;
	}

	public JTextField getTextFieldNumero() {
	    if (numero == null) {
	        numero = new JTextField();
	        numero.setSize(150, 19);
	        numero.setLocation(62, 99); 
	    }
	    return numero;
	}

	public JTextField getTextFieldComplemento() {
	    if (complemento == null) {
	        complemento = new JTextField();
	        complemento.setSize(150, 19);
	        complemento.setLocation(264, 99); 
	    }
	    return complemento;
	}

	public JTextField getTextFieldBairro() {
	    if (bairro == null) {
	        bairro = new JTextField();
	        bairro.setSize(150, 19);
	        bairro.setLocation(476, 99); 
	    }
	    return bairro;
	}

	public JTextField getTextFieldCep() {
	    if (cep == null) {
	        cep = new JTextField();
	        cep.setSize(150, 19);
	        cep.setLocation(264, 157); 
	    }
	    return cep;
	}

	public JTextField getTextFieldCidade() {
	    if (cidade == null) {
	        cidade = new JTextField();
	        cidade.setSize(150, 19);
	        cidade.setLocation(62, 157); 
	    }
	    return cidade;
	}

	public JTextField getTextFieldEstado() {
	    if (estado == null) {
	        estado = new JTextField();
	        estado.setSize(150, 19);
	        estado.setLocation(476, 157); 
	    }
	    return estado;
	}
	

	public JLabel getLabelLogradouro() {
	    if (labelLogradouro == null) {
	        labelLogradouro = new JLabel("Logradouro:");
	        labelLogradouro.setSize(100, 19);
	        labelLogradouro.setLocation(62, 22);
	    }
	    return labelLogradouro;
	}

	public JLabel getLabelNumero() {
	    if (labelNumero == null) {
	        labelNumero = new JLabel("Número:");
	        labelNumero.setSize(100, 19);
	        labelNumero.setLocation(62, 81);
	    }
	    return labelNumero;
	}

	public JLabel getLabelComplemento() {
	    if (labelComplemento == null) {
	        labelComplemento = new JLabel("Complemento:");
	        labelComplemento.setSize(100, 19);
	        labelComplemento.setLocation(264, 81);
	    }
	    return labelComplemento;
	}

	public JLabel getLabelBairro() {
	    if (labelBairro == null) {
	        labelBairro = new JLabel("Bairro:");
	        labelBairro.setSize(100, 19);
	        labelBairro.setLocation(476, 81);
	    }
	    return labelBairro;
	}

	public JLabel getLabelCep() {
	    if (labelCep == null) {
	        labelCep = new JLabel("CEP:");
	        labelCep.setSize(100, 19);
	        labelCep.setLocation(264, 139);
	    }
	    return labelCep;
	}

	public JLabel getLabelCidade() {
	    if (labelCidade == null) {
	        labelCidade = new JLabel("Cidade:");
	        labelCidade.setSize(100, 19);
	        labelCidade.setLocation(62, 139);
	    }
	    return labelCidade;
	}

	public JLabel getLabelEstado() {
	    if (labelEstado == null) {
	        labelEstado = new JLabel("Estado:");
	        labelEstado.setSize(100, 19);
	        labelEstado.setLocation(476, 139);
	    }
	    return labelEstado;
	}
	private JLabel getLabelNomeMaterial() {
		if (labelNomeMaterial == null) {
			labelNomeMaterial = new JLabel("Nome:");
			labelNomeMaterial.setBounds(10, 10, 200, 32);
			labelNomeMaterial.setFont(new Font("Tahoma", Font.PLAIN, 15));
		}
		return labelNomeMaterial;
	}
	private JTextField getTextField() {
		if (textField == null) {
			textField = new JTextField();
			textField.setBounds(10, 40, 553, 32);
		}
		return textField;
	}
	private JTextField getTextField_1() {
		if (textField_1 == null) {
			textField_1 = new JTextField();
			textField_1.setBounds(590, 40, 200, 32);
		}
		return textField_1;
	}
	private JLabel getLblDataDeNascimento() {
		if (lblDataDeNascimento == null) {
			lblDataDeNascimento = new JLabel("Data de Nascimento:");
			lblDataDeNascimento.setFont(new Font("Tahoma", Font.PLAIN, 15));
			lblDataDeNascimento.setBounds(590, 10, 200, 32);
		}
		return lblDataDeNascimento;
	}
	private JLabel getLblTipoSanguneo() {
		if (lblTipoSanguneo == null) {
			lblTipoSanguneo = new JLabel("Tipo Sanguíneo:");
			lblTipoSanguneo.setFont(new Font("Tahoma", Font.PLAIN, 15));
			lblTipoSanguneo.setBounds(10, 80, 200, 32);
		}
		return lblTipoSanguneo;
	}
	private JTextField getTextField_2() {
		if (textField_2 == null) {
			textField_2 = new JTextField();
			textField_2.setBounds(170, 112, 200, 32);
		}
		return textField_2;
	}
	private JLabel getLblTelefone() {
		if (lblTelefone == null) {
			lblTelefone = new JLabel("Telefone:");
			lblTelefone.setFont(new Font("Tahoma", Font.PLAIN, 15));
			lblTelefone.setBounds(170, 82, 200, 32);
		}
		return lblTelefone;
	}
	private JTextField getTextField_3() {
		if (textField_3 == null) {
			textField_3 = new JTextField();
			textField_3.setBounds(380, 112, 410, 32);
		}
		return textField_3;
	}
	private JLabel getLblConvnio() {
		if (lblConvnio == null) {
			lblConvnio = new JLabel("Convênio:");
			lblConvnio.setFont(new Font("Tahoma", Font.PLAIN, 15));
			lblConvnio.setBounds(380, 82, 200, 32);
		}
		return lblConvnio;
	}
	private JTextField getTextField_4() {
		if (textField_4 == null) {
			textField_4 = new JTextField();
			textField_4.setBounds(10, 184, 200, 32);
		}
		return textField_4;
	}
	private JLabel getLblTelefone_1() {
		if (lblTelefone_1 == null) {
			lblTelefone_1 = new JLabel("Altura:");
			lblTelefone_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
			lblTelefone_1.setBounds(10, 154, 200, 32);
		}
		return lblTelefone_1;
	}
	private JTextField getTextField_5() {
		if (textField_5 == null) {
			textField_5 = new JTextField();
			textField_5.setBounds(220, 184, 150, 32);
		}
		return textField_5;
	}
	private JLabel getLblTelefone_1_1() {
		if (lblTelefone_1_1 == null) {
			lblTelefone_1_1 = new JLabel("Peso:");
			lblTelefone_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
			lblTelefone_1_1.setBounds(220, 154, 150, 32);
		}
		return lblTelefone_1_1;
	}
	private JTextField getTextField_6() {
		if (textField_6 == null) {
			textField_6 = new JTextField();
			textField_6.setBounds(380, 184, 410, 32);
		}
		return textField_6;
	}
	private JLabel getLblTelefone_1_1_1() {
		if (lblTelefone_1_1_1 == null) {
			lblTelefone_1_1_1 = new JLabel("Histórico Médico:");
			lblTelefone_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
			lblTelefone_1_1_1.setBounds(380, 154, 150, 32);
		}
		return lblTelefone_1_1_1;
	}
	private JButton getBtnCadastrar() {
		if (btnCadastrar == null) {
			btnCadastrar = new JButton();
			btnCadastrar.setText("CADASTRAR");
			btnCadastrar.setForeground(new Color(0, 0, 205));
			btnCadastrar.setFont(new Font("Tahoma", Font.PLAIN, 15));
			btnCadastrar.setBounds(723, 604, 147, 40);
		}
		return btnCadastrar;
	}
	private JButton getBtnLimpar() {
		if (btnLimpar == null) {
			btnLimpar = new JButton();
			btnLimpar.setText("LIMPAR");
			btnLimpar.setForeground(new Color(0, 0, 205));
			btnLimpar.setFont(new Font("Tahoma", Font.PLAIN, 15));
			btnLimpar.setBounds(532, 604, 156, 40);
		}
		return btnLimpar;
	}
}
