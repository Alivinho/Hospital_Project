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

public class PanelCadastrarPaciente extends JPanel {
	
	private JTextField nome;
	private JTextField dataNascimento;
	private JTextField telefone;
	//private JTextField tipoSangue;
	private JComboBox<String> tipoSangue; 
	private JTextField altura;
	private JTextField peso;
	private JTextField convenio;
	private JTextField historicoMedico;

	private JTextField logradouro;
	private JTextField numero;
	private JTextField complemento;
	private JTextField bairro;
	private JTextField cep;
	private JTextField cidade;
	private JTextField estado;
	
	private JLabel labelNome;
	private JLabel labelDataNascimento;
	private JLabel labelTelefone;
	private JLabel labelTipoSangue;
	private JLabel labelAltura;
	private JLabel labelPeso;
	private JLabel labelConvenio;
	private JLabel labelHistoricoMedico;
	
	private JLabel labelLogradouro;
	private JLabel labelNumero;
	private JLabel labelComplemento;
	private JLabel labelBairro;
	private JLabel labelCep;
	private JLabel labelCidade;
	private JLabel labelEstado;
	
	private JButton btnCadastrar;
	private JButton btnLimpar; 

	public PanelCadastrarPaciente() {
		this.setLayout(null);
		this.setSize(940, 720);
		add(PanelDadosPessoais());
		add(PanelEndereco());
		add(getbtnCadastrar());
		add(getbtnLimpar());
		
		 JLabel tituloDadosPessoais = new JLabel("Dados Pessoais");
		 tituloDadosPessoais.setFont(new Font("Tahoma", Font.BOLD, 25));
		 tituloDadosPessoais.setSize(325, 25);
	     tituloDadosPessoais.setLocation(70, 24); 
	     add(tituloDadosPessoais);
	     
	     JLabel tituloEndereco = new JLabel("Endereço");
	     tituloEndereco.setFont(new Font("Tahoma", Font.BOLD, 25));
	     tituloEndereco.setBounds(70, 335, 325, 25);
	     add(tituloEndereco);
	}
	
	public JPanel PanelDadosPessoais() {
		JPanel panelDadosPessoais = new JPanel();
		panelDadosPessoais.setLayout(null);
		panelDadosPessoais.setSize(800, 250);
		panelDadosPessoais.setLocation(70, 58);

		panelDadosPessoais.add(getLabelNome());
		panelDadosPessoais.add(getTextfFieldNome());
		panelDadosPessoais.add(getLabelDataNascimento());
		panelDadosPessoais.add(getTextFieldDataNascimento());
		panelDadosPessoais.add(getLabelTelefone());
		panelDadosPessoais.add(getTextFieldTelefone());
		panelDadosPessoais.add(getLabelTipoSangue());
	    panelDadosPessoais.add(getComboBoxTipoSangue()); 

		panelDadosPessoais.add(getLabelAltura());
		panelDadosPessoais.add(getTextFieldAltura());
		panelDadosPessoais.add(getLabelPeso());
		panelDadosPessoais.add(getTextFieldPeso());
		panelDadosPessoais.add(getLabelConvenio());
		panelDadosPessoais.add(getTextFieldConvenio());
		panelDadosPessoais.add(getLabelHistoricoMedico());
		panelDadosPessoais.add(getTextFieldHistoricoMedico());

		return panelDadosPessoais;
	}

	private JPanel PanelEndereco() {
		JPanel panelEndereco = new JPanel();
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

	public JTextField getTextfFieldNome() {
		if (nome == null) {
			nome = new JTextField();
			nome.setSize(564, 32);
			nome.setLocation(62, 51);
		}
		return nome;
	}
	
	public JTextField getTextFieldDataNascimento() {
	    if (dataNascimento == null) {
	        dataNascimento = new JTextField();
	        dataNascimento.setSize(150, 19);
	        dataNascimento.setLocation(62, 112); 
	    }
	    return dataNascimento;
	}

	public JTextField getTextFieldTelefone() {
	    if (telefone == null) {
	        telefone = new JTextField();
	        telefone.setSize(150, 19);
	        telefone.setLocation(290, 112); 
	    }
	    return telefone;
	}
	
	public JComboBox<String> getComboBoxTipoSangue(){
		 if (tipoSangue == null) {
		        String[] tiposSanguineos = { " ", "A+", "A-", "B+", "B-", "AB+", "AB-", "O+", "O-" };
		        tipoSangue = new JComboBox<>(tiposSanguineos);
		        tipoSangue.setSize(150, 19);
		        tipoSangue.setLocation(62, 160); 
		    }
		    return tipoSangue;
	}

	public JTextField getTextFieldAltura() {
	    if (altura == null) {
	        altura = new JTextField();
	        altura.setSize(150, 19);
	        altura.setLocation(290, 160); 
	    }
	    return altura;
	}

	public JTextField getTextFieldPeso() {
	    if (peso == null) {
	        peso = new JTextField();
	        peso.setSize(150, 19);
	        peso.setLocation(474, 160); 
	    }
	    return peso;
	}
	
	public JTextField getTextFieldConvenio() {
	    if (convenio == null) {
	    	convenio = new JTextField();
	    	convenio.setSize(150, 19);
	    	convenio.setLocation(475, 110); 
	    }
	    return convenio;
	}
	
	public JTextField getTextFieldHistoricoMedico() {
	    if (historicoMedico == null) {
	    	historicoMedico = new JTextField();
	    	historicoMedico.setSize(564, 19);
	    	historicoMedico.setLocation(62, 208); 
	    }
	    return historicoMedico;
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
	
	public JLabel getLabelNome() {
	    if (labelNome == null) {
	        labelNome = new JLabel("Nome:");
	        labelNome.setSize(100, 19);
	        labelNome.setLocation(62, 33);
	    }
	    return labelNome;
	}

	public JLabel getLabelDataNascimento() {
	    if (labelDataNascimento == null) {
	        labelDataNascimento = new JLabel("Data de Nascimento:");
	        labelDataNascimento.setSize(150, 19);
	        labelDataNascimento.setLocation(62, 94);
	    }
	    return labelDataNascimento;
	}

	public JLabel getLabelTelefone() {
	    if (labelTelefone == null) {
	        labelTelefone = new JLabel("Telefone:");
	        labelTelefone.setSize(100, 19);
	        labelTelefone.setLocation(290, 94);
	    }
	    return labelTelefone;
	}

	public JLabel getLabelTipoSangue() {
	    if (labelTipoSangue == null) {
	        labelTipoSangue = new JLabel("Tipo Sanguíneo:");
	        labelTipoSangue.setSize(150, 19);
	        labelTipoSangue.setLocation(62, 142);
	    }
	    return labelTipoSangue;
	}

	public JLabel getLabelAltura() {
	    if (labelAltura == null) {
	        labelAltura = new JLabel("Altura:");
	        labelAltura.setSize(100, 19);
	        labelAltura.setLocation(290, 142);
	    }
	    return labelAltura;
	}

	public JLabel getLabelPeso() {
	    if (labelPeso == null) {
	        labelPeso = new JLabel("Peso:");
	        labelPeso.setSize(100, 19);
	        labelPeso.setLocation(474, 140);
	    }
	    return labelPeso;
	}
	
	public JLabel getLabelConvenio() {
	    if (labelConvenio == null) {
	    	labelConvenio = new JLabel("Convênio:");
	    	labelConvenio.setSize(100, 19);
	    	labelConvenio.setLocation(475, 89);
	    }
	    return labelConvenio;
	}
	
	public JLabel getLabelHistoricoMedico() {
	    if (labelHistoricoMedico == null) {
	    	labelHistoricoMedico = new JLabel("Histórico Médico:");
	    	labelHistoricoMedico.setSize(100, 19);
	    	labelHistoricoMedico.setLocation(62, 189);
	    }
	    return labelHistoricoMedico;
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
	
	/********************************** BOTÕES **********************************/
	
	public JButton getbtnCadastrar() {
		if(btnCadastrar == null) {
			btnCadastrar = new JButton();
			btnCadastrar.setForeground(new Color(0, 0, 205));
			btnCadastrar.setSize(147,40);
			btnCadastrar.setLocation(307,604);
			btnCadastrar.setText("CADASTRAR");
		}
		return btnCadastrar; 
	}
	
	public JButton getbtnLimpar() {
		if(btnLimpar == null) {
			btnLimpar = new JButton();
			btnLimpar.setForeground(new Color(0, 0, 205));
			btnLimpar.setSize(156,40);
			btnLimpar.setLocation(480,604);
			btnLimpar.setText("LIMPAR");

			
		}
		return btnLimpar; 
	}
}
