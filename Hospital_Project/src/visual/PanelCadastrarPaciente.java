package visual;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.border.LineBorder;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JFormattedTextField;

public class PanelCadastrarPaciente extends JPanel {
	//private JTextField tipoSangue;
	private JComboBox<String> tipoSanguineo; 
	private JLabel labelNomeMaterial;
	private JTextField textFieldNome;
	private JTextField textFieldDataNascimento;
	private JLabel lblDataDeNascimento;
	private JLabel lblTipoSanguneo;
	private JTextField textFieldTelefone;
	private JLabel lblTelefone;
	private JLabel lblConvnio;
	private JTextField textFieldAltura;
	private JLabel lblTelefone_1;
	private JTextField textFieldPeso;
	private JLabel lblTelefone_1_1;
	private JLabel lblTelefone_1_1_1;
	private JButton btnCadastrar;
	private JButton btnLimpar;
	private JTextField textFieldLogradouro;
	private JLabel lblLogradouro;
	private JTextField textFieldNumero;
	private JLabel lblNmero;
	private JTextField textFieldComplemento;
	private JLabel lblComplemento;
	private JTextField textFieldBairro;
	private JLabel lblBairro;
	private JTextField textFieldCidade;
	private JLabel lblCidade;
	private JTextField textFieldCEP;
	private JLabel lblCep;
	private JLabel lblEstado;
	private JTextField textFieldEstado;
	private JLabel titlePanelCadastrarPaciente;
	private JTextArea textAreaHistoricoMedico;
	private JComboBox<String> Convenio;
	private JScrollPane scrollPane;
	
    private JPanel innerPanel;

    
	public PanelCadastrarPaciente() {
		setBackground(new Color(83, 169, 255));
		this.setLayout(null);
		this.setSize(940, 960);
		//add(PanelDadosPessoais());
		//add(PanelEndereco());
		
		innerPanel = new JPanel();
		innerPanel.setLayout(null);
		innerPanel.setBackground(new Color(83, 169, 255));
		innerPanel.setPreferredSize(new Dimension(940, 1300));//innerPanel.setPreferredSize(getSize()); 
	    
	    innerPanel.add(getTitlePanelCadastrarPaciente());
	    innerPanel.add(PanelDadosPessoais());
	    innerPanel.add(PanelEndereco());
	   
	    
	    
	    //Criação do ScrollPanee adicionando o "innerPanel"
	    scrollPane = new JScrollPane(innerPanel);
        scrollPane.setBounds(0, 0, 940, 1000);
        add(scrollPane);
		
		 JLabel tituloDadosPessoais = new JLabel("Dados Pessoais");
		 tituloDadosPessoais.setForeground(new Color(255, 255, 255));
		 tituloDadosPessoais.setFont(new Font("Tahoma", Font.BOLD, 25));
		 tituloDadosPessoais.setSize(198, 31);
	     tituloDadosPessoais.setLocation(70, 128); 
	     //add(tituloDadosPessoais);
	     
	     JLabel tituloEndereco = new JLabel("Endereço");
	     tituloEndereco.setForeground(new Color(255, 255, 255));
	     tituloEndereco.setFont(new Font("Tahoma", Font.BOLD, 25));
	     tituloEndereco.setBounds(70, 608, 119, 31);
	     //add(tituloEndereco);
	     //add(getBtnCadastrar());
	     //add(getBtnLimpar());
	     //add(getTitlePanelCadastrarPaciente());
	     add(getScrollPane());
	     innerPanel.add(tituloDadosPessoais);
		 innerPanel.add(tituloEndereco);

		 innerPanel.add(getBtnCadastrar());
		 innerPanel.add(getBtnLimpar());
	}
	
	public JPanel PanelDadosPessoais() {
		JPanel panelDadosPessoais = new JPanel();
		panelDadosPessoais.setBorder(new LineBorder(new Color(192, 192, 192), 1, true));
		panelDadosPessoais.setLayout(null);
		panelDadosPessoais.setSize(800, 429);
		panelDadosPessoais.setLocation(70, 169);
	    panelDadosPessoais.add(getComboBoxTipoSangue());
		panelDadosPessoais.add(getTextFieldNome());
		panelDadosPessoais.add(getLabelNomeMaterial());
		panelDadosPessoais.add(getTextFieldDataNascimento());
		panelDadosPessoais.add(getLblDataDeNascimento());
		panelDadosPessoais.add(getLblTipoSanguneo());
		panelDadosPessoais.add(getTextFieldTelefone());
		panelDadosPessoais.add(getLblTelefone());
		panelDadosPessoais.add(getLblConvnio());
		panelDadosPessoais.add(getTextFieldAltura());
		panelDadosPessoais.add(getLblTelefone_1());
		panelDadosPessoais.add(getTextFieldPeso());
		panelDadosPessoais.add(getLblTelefone_1_1());
		panelDadosPessoais.add(getLblTelefone_1_1_1());
		panelDadosPessoais.add(getTextAreaHistoricoMedico());
		panelDadosPessoais.add(getConvenio());

		return panelDadosPessoais;
	}

	private JPanel PanelEndereco() {
		JPanel panelEndereco = new JPanel();
		panelEndereco.setBorder(new LineBorder(new Color(192, 192, 192)));
		panelEndereco.setLayout(null);
		panelEndereco.setSize(800, 235);
		panelEndereco.setLocation(70, 649);
		panelEndereco.add(getTextFieldLogradouro());
		panelEndereco.add(getLblLogradouro());
		panelEndereco.add(getTextFieldNumero());
		panelEndereco.add(getLblNmero());
		panelEndereco.add(getTextFieldComplemento());
		panelEndereco.add(getLblComplemento());
		panelEndereco.add(getTextFieldBairro());
		panelEndereco.add(getLblBairro());
		panelEndereco.add(getTextFieldCidade());
		panelEndereco.add(getLblCidade());
		panelEndereco.add(getTextFieldCEP());
		panelEndereco.add(getLblCep());
		panelEndereco.add(getLblEstado());
		panelEndereco.add(getTextFieldEstado());

		return panelEndereco;
	}
	
	public JComboBox<String> getComboBoxTipoSangue(){
		 if (tipoSanguineo == null) {
		        String[] tiposSanguineos = { " ", "A+", "A-", "B+", "B-", "AB+", "AB-", "O+", "O-" };
		        tipoSanguineo = new JComboBox<>(tiposSanguineos);
		        tipoSanguineo.setFont(new Font("Tahoma", Font.PLAIN, 15));
		        tipoSanguineo.setBackground(new Color(255, 255, 255));
		        tipoSanguineo.setModel(new DefaultComboBoxModel(new String[] {"Selecione um tipo sanguíneo", "A+", "A-", "B+", "B-", "AB+", "AB-", "O+", "O-"}));
		        tipoSanguineo.setSize(245, 32);
		        tipoSanguineo.setLocation(10, 112); 
		    }
		    return tipoSanguineo;
	}
	public JLabel getLabelNomeMaterial() {
		if (labelNomeMaterial == null) {
			labelNomeMaterial = new JLabel("Nome:");
			labelNomeMaterial.setBounds(10, 10, 200, 32);
			labelNomeMaterial.setFont(new Font("Tahoma", Font.PLAIN, 15));
		}
		return labelNomeMaterial;
	}
	public JTextField getTextFieldNome() {
		if (textFieldNome == null) {
			textFieldNome = new JTextField();
			textFieldNome.setFont(new Font("Tahoma", Font.PLAIN, 15));
			textFieldNome.setBounds(10, 40, 553, 32);
		}
		return textFieldNome;
	}
	public JTextField getTextFieldDataNascimento() {
		if (textFieldDataNascimento == null) {
			textFieldDataNascimento = new JTextField();
			textFieldDataNascimento.setFont(new Font("Tahoma", Font.PLAIN, 15));
			textFieldDataNascimento.setBounds(590, 40, 200, 32);
		}
		return textFieldDataNascimento;
	}
	public JLabel getLblDataDeNascimento() {
		if (lblDataDeNascimento == null) {
			lblDataDeNascimento = new JLabel("Data de Nascimento:");
			lblDataDeNascimento.setFont(new Font("Tahoma", Font.PLAIN, 15));
			lblDataDeNascimento.setBounds(590, 10, 200, 32);
		}
		return lblDataDeNascimento;
	}
	public JLabel getLblTipoSanguneo() {
		if (lblTipoSanguneo == null) {
			lblTipoSanguneo = new JLabel("Tipo Sanguíneo:");
			lblTipoSanguneo.setFont(new Font("Tahoma", Font.PLAIN, 15));
			lblTipoSanguneo.setBounds(10, 80, 200, 32);
		}
		return lblTipoSanguneo;
	}
	public JTextField getTextFieldTelefone() {
		if (textFieldTelefone == null) {
			textFieldTelefone = new JTextField();
			textFieldTelefone.setFont(new Font("Tahoma", Font.PLAIN, 15));
			textFieldTelefone.setBounds(265, 112, 200, 32);
		}
		return textFieldTelefone;
	}
	public JLabel getLblTelefone() {
		if (lblTelefone == null) {
			lblTelefone = new JLabel("Telefone:");
			lblTelefone.setFont(new Font("Tahoma", Font.PLAIN, 15));
			lblTelefone.setBounds(265, 82, 200, 32);
		}
		return lblTelefone;
	}
	public JLabel getLblConvnio() {
		if (lblConvnio == null) {
			lblConvnio = new JLabel("Convênio:");
			lblConvnio.setFont(new Font("Tahoma", Font.PLAIN, 15));
			lblConvnio.setBounds(475, 82, 200, 32);
		}
		return lblConvnio;
	}
	public JTextField getTextFieldAltura() {
		if (textFieldAltura == null) {
			textFieldAltura = new JTextField();
			textFieldAltura.setFont(new Font("Tahoma", Font.PLAIN, 15));
			textFieldAltura.setBounds(10, 184, 200, 32);
		}
		return textFieldAltura;
	}
	public JLabel getLblTelefone_1() {
		if (lblTelefone_1 == null) {
			lblTelefone_1 = new JLabel("Altura:");
			lblTelefone_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
			lblTelefone_1.setBounds(10, 154, 200, 32);
		}
		return lblTelefone_1;
	}
	public JTextField getTextFieldPeso() {
		if (textFieldPeso == null) {
			textFieldPeso = new JTextField();
			textFieldPeso.setFont(new Font("Tahoma", Font.PLAIN, 15));
			textFieldPeso.setBounds(220, 184, 163, 32);
		}
		return textFieldPeso;
	}
	public JLabel getLblTelefone_1_1() {
		if (lblTelefone_1_1 == null) {
			lblTelefone_1_1 = new JLabel("Peso:");
			lblTelefone_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
			lblTelefone_1_1.setBounds(220, 154, 150, 32);
		}
		return lblTelefone_1_1;
	}
	public JLabel getLblTelefone_1_1_1() {
		if (lblTelefone_1_1_1 == null) {
			lblTelefone_1_1_1 = new JLabel("Histórico Médico:");
			lblTelefone_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
			lblTelefone_1_1_1.setBounds(10, 226, 150, 32);
		}
		return lblTelefone_1_1_1;
	}
	public JButton getBtnCadastrar() {
		if (btnCadastrar == null) {
			btnCadastrar = new JButton();
			btnCadastrar.setText("CADASTRAR");
			btnCadastrar.setForeground(new Color(0, 0, 205));
			btnCadastrar.setFont(new Font("Tahoma", Font.PLAIN, 15));
			btnCadastrar.setBounds(723, 894, 147, 40);
		}
		return btnCadastrar;
	}
	public JButton getBtnLimpar() {
		if (btnLimpar == null) {
			btnLimpar = new JButton();
			btnLimpar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});
			btnLimpar.setText("LIMPAR");
			btnLimpar.setForeground(new Color(0, 0, 205));
			btnLimpar.setFont(new Font("Tahoma", Font.PLAIN, 15));
			btnLimpar.setBounds(532, 894, 156, 40);
		}
		return btnLimpar;
	}
	public JTextField getTextFieldLogradouro() {
		if (textFieldLogradouro == null) {
			textFieldLogradouro = new JTextField();
			textFieldLogradouro.setFont(new Font("Tahoma", Font.PLAIN, 15));
			textFieldLogradouro.setBounds(10, 40, 553, 32);
		}
		return textFieldLogradouro;
	}
	public JLabel getLblLogradouro() {
		if (lblLogradouro == null) {
			lblLogradouro = new JLabel("Logradouro:");
			lblLogradouro.setFont(new Font("Tahoma", Font.PLAIN, 15));
			lblLogradouro.setBounds(10, 10, 200, 32);
		}
		return lblLogradouro;
	}
	public JTextField getTextFieldNumero() {
		if (textFieldNumero == null) {
			textFieldNumero = new JTextField();
			textFieldNumero.setFont(new Font("Tahoma", Font.PLAIN, 15));
			textFieldNumero.setBounds(573, 40, 217, 32);
		}
		return textFieldNumero;
	}
	public JLabel getLblNmero() {
		if (lblNmero == null) {
			lblNmero = new JLabel("Número:");
			lblNmero.setFont(new Font("Tahoma", Font.PLAIN, 15));
			lblNmero.setBounds(573, 10, 201, 32);
		}
		return lblNmero;
	}
	public JTextField getTextFieldComplemento() {
		if (textFieldComplemento == null) {
			textFieldComplemento = new JTextField();
			textFieldComplemento.setFont(new Font("Tahoma", Font.PLAIN, 15));
			textFieldComplemento.setBounds(438, 112, 352, 32);
		}
		return textFieldComplemento;
	}
	public JLabel getLblComplemento() {
		if (lblComplemento == null) {
			lblComplemento = new JLabel("Complemento:");
			lblComplemento.setFont(new Font("Tahoma", Font.PLAIN, 15));
			lblComplemento.setBounds(438, 82, 201, 32);
		}
		return lblComplemento;
	}
	public JTextField getTextFieldBairro() {
		if (textFieldBairro == null) {
			textFieldBairro = new JTextField();
			textFieldBairro.setFont(new Font("Tahoma", Font.PLAIN, 15));
			textFieldBairro.setBounds(10, 112, 418, 32);
		}
		return textFieldBairro;
	}
	public JLabel getLblBairro() {
		if (lblBairro == null) {
			lblBairro = new JLabel("Bairro:");
			lblBairro.setFont(new Font("Tahoma", Font.PLAIN, 15));
			lblBairro.setBounds(10, 82, 201, 32);
		}
		return lblBairro;
	}
	public JTextField getTextFieldCidade() {
		if (textFieldCidade == null) {
			textFieldCidade = new JTextField();
			textFieldCidade.setFont(new Font("Tahoma", Font.PLAIN, 15));
			textFieldCidade.setBounds(10, 183, 286, 32);
		}
		return textFieldCidade;
	}
	public JLabel getLblCidade() {
		if (lblCidade == null) {
			lblCidade = new JLabel("Cidade:");
			lblCidade.setFont(new Font("Tahoma", Font.PLAIN, 15));
			lblCidade.setBounds(10, 153, 201, 32);
		}
		return lblCidade;
	}
	public JTextField getTextFieldCEP() {
		if (textFieldCEP == null) {
			textFieldCEP = new JTextField();
			textFieldCEP.setFont(new Font("Tahoma", Font.PLAIN, 15));
			textFieldCEP.setBounds(306, 183, 189, 32);
		}
		return textFieldCEP;
	}
	public JLabel getLblCep() {
		if (lblCep == null) {
			lblCep = new JLabel("CEP:");
			lblCep.setFont(new Font("Tahoma", Font.PLAIN, 15));
			lblCep.setBounds(306, 153, 189, 32);
		}
		return lblCep;
	}
	public JLabel getLblEstado() {
		if (lblEstado == null) {
			lblEstado = new JLabel("Estado:");
			lblEstado.setFont(new Font("Tahoma", Font.PLAIN, 15));
			lblEstado.setBounds(504, 153, 189, 32);
		}
		return lblEstado;
	}
	public JTextField getTextFieldEstado() {
		if (textFieldEstado == null) {
			textFieldEstado = new JTextField();
			textFieldEstado.setFont(new Font("Tahoma", Font.PLAIN, 15));
			textFieldEstado.setBounds(504, 183, 286, 32);
		}
		return textFieldEstado;
	}
	public JLabel getTitlePanelCadastrarPaciente() {
		if (titlePanelCadastrarPaciente == null) {
			titlePanelCadastrarPaciente = new JLabel("Cadastro dos Pacientes");
			titlePanelCadastrarPaciente.setForeground(Color.WHITE);
			titlePanelCadastrarPaciente.setFont(new Font("Tahoma", Font.BOLD, 30));
			titlePanelCadastrarPaciente.setBounds(304, 33, 355, 37);
		}
		return titlePanelCadastrarPaciente;
	}
	public JTextArea getTextAreaHistoricoMedico() {
		if (textAreaHistoricoMedico == null) {
			textAreaHistoricoMedico = new JTextArea();
			textAreaHistoricoMedico.setFont(new Font("Monospaced", Font.PLAIN, 15));
			textAreaHistoricoMedico.setBounds(10, 256, 780, 163);
		}
		return textAreaHistoricoMedico;
	}
	public JComboBox<String> getConvenio() {
		if (Convenio == null) {
			Convenio = new JComboBox();
			Convenio.setBackground(new Color(255, 255, 255));
			Convenio.setFont(new Font("Tahoma", Font.PLAIN, 15));
			Convenio.setModel(new DefaultComboBoxModel(new String[] {"Selecione um plano", "Plano Básico", "Plano Bronze", "Plano Prata", "Plano Ouro", "Plano Diamante"}));
			Convenio.setBounds(475, 112, 315, 32);
		}
		return Convenio;
	}
	public JScrollPane getScrollPane() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setBounds(926, 0, 14, 64);
		}
		return scrollPane;
	}
}
