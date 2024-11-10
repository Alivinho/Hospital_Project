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
	private JComboBox<String> tipoSangue; 
	private JLabel labelNomeMaterial;
	private JTextField textField;
	private JTextField textField_1;
	private JLabel lblDataDeNascimento;
	private JLabel lblTipoSanguneo;
	private JTextField textField_2;
	private JLabel lblTelefone;
	private JLabel lblConvnio;
	private JTextField textField_4;
	private JLabel lblTelefone_1;
	private JTextField textField_5;
	private JLabel lblTelefone_1_1;
	private JLabel lblTelefone_1_1_1;
	private JButton btnCadastrar;
	private JButton btnLimpar;
	private JTextField textField_7;
	private JLabel lblLogradouro;
	private JTextField textField_8;
	private JLabel lblNmero;
	private JTextField textField_9;
	private JLabel lblComplemento;
	private JTextField textField_10;
	private JLabel lblBairro;
	private JTextField textField_11;
	private JLabel lblCidade;
	private JTextField textField_12;
	private JLabel lblCep;
	private JLabel lblEstado;
	private JTextField textField_13;
	private JLabel titlePanelCadastrarPaciente;
	private JTextArea textArea;
	private JComboBox<String> comboBox;
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
		panelDadosPessoais.add(getTextField());
		panelDadosPessoais.add(getLabelNomeMaterial());
		panelDadosPessoais.add(getTextField_1());
		panelDadosPessoais.add(getLblDataDeNascimento());
		panelDadosPessoais.add(getLblTipoSanguneo());
		panelDadosPessoais.add(getTextField_2());
		panelDadosPessoais.add(getLblTelefone());
		panelDadosPessoais.add(getLblConvnio());
		panelDadosPessoais.add(getTextField_4());
		panelDadosPessoais.add(getLblTelefone_1());
		panelDadosPessoais.add(getTextField_5());
		panelDadosPessoais.add(getLblTelefone_1_1());
		panelDadosPessoais.add(getLblTelefone_1_1_1());
		panelDadosPessoais.add(getTextArea());
		panelDadosPessoais.add(getComboBox());

		return panelDadosPessoais;
	}

	private JPanel PanelEndereco() {
		JPanel panelEndereco = new JPanel();
		panelEndereco.setBorder(new LineBorder(new Color(192, 192, 192)));
		panelEndereco.setLayout(null);
		panelEndereco.setSize(800, 235);
		panelEndereco.setLocation(70, 649);
		panelEndereco.add(getTextField_7());
		panelEndereco.add(getLblLogradouro());
		panelEndereco.add(getTextField_8());
		panelEndereco.add(getLblNmero());
		panelEndereco.add(getTextField_9());
		panelEndereco.add(getLblComplemento());
		panelEndereco.add(getTextField_10());
		panelEndereco.add(getLblBairro());
		panelEndereco.add(getTextField_11());
		panelEndereco.add(getLblCidade());
		panelEndereco.add(getTextField_12());
		panelEndereco.add(getLblCep());
		panelEndereco.add(getLblEstado());
		panelEndereco.add(getTextField_13());

		return panelEndereco;
	}
	
	public JComboBox<String> getComboBoxTipoSangue(){
		 if (tipoSangue == null) {
		        String[] tiposSanguineos = { " ", "A+", "A-", "B+", "B-", "AB+", "AB-", "O+", "O-" };
		        tipoSangue = new JComboBox<>(tiposSanguineos);
		        tipoSangue.setFont(new Font("Tahoma", Font.PLAIN, 15));
		        tipoSangue.setBackground(new Color(255, 255, 255));
		        tipoSangue.setModel(new DefaultComboBoxModel(new String[] {"Selecione um tipo sanguíneo", "A+", "A-", "B+", "B-", "AB+", "AB-", "O+", "O-"}));
		        tipoSangue.setSize(245, 32);
		        tipoSangue.setLocation(10, 112); 
		    }
		    return tipoSangue;
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
			textField.setFont(new Font("Tahoma", Font.PLAIN, 15));
			textField.setBounds(10, 40, 553, 32);
		}
		return textField;
	}
	private JTextField getTextField_1() {
		if (textField_1 == null) {
			textField_1 = new JTextField();
			textField_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
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
			textField_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
			textField_2.setBounds(265, 112, 200, 32);
		}
		return textField_2;
	}
	private JLabel getLblTelefone() {
		if (lblTelefone == null) {
			lblTelefone = new JLabel("Telefone:");
			lblTelefone.setFont(new Font("Tahoma", Font.PLAIN, 15));
			lblTelefone.setBounds(265, 82, 200, 32);
		}
		return lblTelefone;
	}
	private JLabel getLblConvnio() {
		if (lblConvnio == null) {
			lblConvnio = new JLabel("Convênio:");
			lblConvnio.setFont(new Font("Tahoma", Font.PLAIN, 15));
			lblConvnio.setBounds(475, 82, 200, 32);
		}
		return lblConvnio;
	}
	private JTextField getTextField_4() {
		if (textField_4 == null) {
			textField_4 = new JTextField();
			textField_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
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
			textField_5.setFont(new Font("Tahoma", Font.PLAIN, 15));
			textField_5.setBounds(220, 184, 163, 32);
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
	private JLabel getLblTelefone_1_1_1() {
		if (lblTelefone_1_1_1 == null) {
			lblTelefone_1_1_1 = new JLabel("Histórico Médico:");
			lblTelefone_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
			lblTelefone_1_1_1.setBounds(10, 226, 150, 32);
		}
		return lblTelefone_1_1_1;
	}
	private JButton getBtnCadastrar() {
		if (btnCadastrar == null) {
			btnCadastrar = new JButton();
			btnCadastrar.setText("CADASTRAR");
			btnCadastrar.setForeground(new Color(0, 0, 205));
			btnCadastrar.setFont(new Font("Tahoma", Font.PLAIN, 15));
			btnCadastrar.setBounds(723, 894, 147, 40);
		}
		return btnCadastrar;
	}
	private JButton getBtnLimpar() {
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
	private JTextField getTextField_7() {
		if (textField_7 == null) {
			textField_7 = new JTextField();
			textField_7.setFont(new Font("Tahoma", Font.PLAIN, 15));
			textField_7.setBounds(10, 40, 553, 32);
		}
		return textField_7;
	}
	private JLabel getLblLogradouro() {
		if (lblLogradouro == null) {
			lblLogradouro = new JLabel("Logradouro:");
			lblLogradouro.setFont(new Font("Tahoma", Font.PLAIN, 15));
			lblLogradouro.setBounds(10, 10, 200, 32);
		}
		return lblLogradouro;
	}
	private JTextField getTextField_8() {
		if (textField_8 == null) {
			textField_8 = new JTextField();
			textField_8.setFont(new Font("Tahoma", Font.PLAIN, 15));
			textField_8.setBounds(573, 40, 217, 32);
		}
		return textField_8;
	}
	private JLabel getLblNmero() {
		if (lblNmero == null) {
			lblNmero = new JLabel("Número:");
			lblNmero.setFont(new Font("Tahoma", Font.PLAIN, 15));
			lblNmero.setBounds(573, 10, 201, 32);
		}
		return lblNmero;
	}
	private JTextField getTextField_9() {
		if (textField_9 == null) {
			textField_9 = new JTextField();
			textField_9.setFont(new Font("Tahoma", Font.PLAIN, 15));
			textField_9.setBounds(438, 112, 352, 32);
		}
		return textField_9;
	}
	private JLabel getLblComplemento() {
		if (lblComplemento == null) {
			lblComplemento = new JLabel("Complemento:");
			lblComplemento.setFont(new Font("Tahoma", Font.PLAIN, 15));
			lblComplemento.setBounds(438, 82, 201, 32);
		}
		return lblComplemento;
	}
	private JTextField getTextField_10() {
		if (textField_10 == null) {
			textField_10 = new JTextField();
			textField_10.setFont(new Font("Tahoma", Font.PLAIN, 15));
			textField_10.setBounds(10, 112, 418, 32);
		}
		return textField_10;
	}
	private JLabel getLblBairro() {
		if (lblBairro == null) {
			lblBairro = new JLabel("Bairro:");
			lblBairro.setFont(new Font("Tahoma", Font.PLAIN, 15));
			lblBairro.setBounds(10, 82, 201, 32);
		}
		return lblBairro;
	}
	private JTextField getTextField_11() {
		if (textField_11 == null) {
			textField_11 = new JTextField();
			textField_11.setFont(new Font("Tahoma", Font.PLAIN, 15));
			textField_11.setBounds(10, 183, 286, 32);
		}
		return textField_11;
	}
	private JLabel getLblCidade() {
		if (lblCidade == null) {
			lblCidade = new JLabel("Cidade:");
			lblCidade.setFont(new Font("Tahoma", Font.PLAIN, 15));
			lblCidade.setBounds(10, 153, 201, 32);
		}
		return lblCidade;
	}
	private JTextField getTextField_12() {
		if (textField_12 == null) {
			textField_12 = new JTextField();
			textField_12.setFont(new Font("Tahoma", Font.PLAIN, 15));
			textField_12.setBounds(306, 183, 189, 32);
		}
		return textField_12;
	}
	private JLabel getLblCep() {
		if (lblCep == null) {
			lblCep = new JLabel("CEP:");
			lblCep.setFont(new Font("Tahoma", Font.PLAIN, 15));
			lblCep.setBounds(306, 153, 189, 32);
		}
		return lblCep;
	}
	private JLabel getLblEstado() {
		if (lblEstado == null) {
			lblEstado = new JLabel("Estado:");
			lblEstado.setFont(new Font("Tahoma", Font.PLAIN, 15));
			lblEstado.setBounds(504, 153, 189, 32);
		}
		return lblEstado;
	}
	private JTextField getTextField_13() {
		if (textField_13 == null) {
			textField_13 = new JTextField();
			textField_13.setFont(new Font("Tahoma", Font.PLAIN, 15));
			textField_13.setBounds(504, 183, 286, 32);
		}
		return textField_13;
	}
	private JLabel getTitlePanelCadastrarPaciente() {
		if (titlePanelCadastrarPaciente == null) {
			titlePanelCadastrarPaciente = new JLabel("Cadastro dos Pacientes");
			titlePanelCadastrarPaciente.setForeground(Color.WHITE);
			titlePanelCadastrarPaciente.setFont(new Font("Tahoma", Font.BOLD, 30));
			titlePanelCadastrarPaciente.setBounds(304, 33, 355, 37);
		}
		return titlePanelCadastrarPaciente;
	}
	private JTextArea getTextArea() {
		if (textArea == null) {
			textArea = new JTextArea();
			textArea.setFont(new Font("Monospaced", Font.PLAIN, 15));
			textArea.setBounds(10, 256, 780, 163);
		}
		return textArea;
	}
	private JComboBox<String> getComboBox() {
		if (comboBox == null) {
			comboBox = new JComboBox();
			comboBox.setBackground(new Color(255, 255, 255));
			comboBox.setFont(new Font("Tahoma", Font.PLAIN, 15));
			comboBox.setModel(new DefaultComboBoxModel(new String[] {"Selecione um plano", "Plano Básico", "Plano Bronze", "Plano Prata", "Plano Ouro", "Plano Diamante"}));
			comboBox.setBounds(475, 112, 315, 32);
		}
		return comboBox;
	}
	private JScrollPane getScrollPane() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setBounds(926, 0, 14, 64);
		}
		return scrollPane;
	}
}
