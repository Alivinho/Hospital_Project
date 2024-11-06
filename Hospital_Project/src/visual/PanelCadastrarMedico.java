package visual;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSpinner;
import javax.swing.SpinnerDateModel;
import java.util.Date;
import java.util.Calendar;
import javax.swing.JTextArea;
import java.awt.Component;
import java.awt.Dimension;

import javax.swing.Box;

public class PanelCadastrarMedico extends JPanel {
	
	private JButton btnCadastrar;
	private JButton btnLimpar; 
	private JLabel labelNomeMaterial;
	private JTextField textField_1;
	private JTextField textField;
	private JLabel lblCrm;
	private JTextField textField_2;
	private JLabel labelNomeMaterial_1;
	private JLabel lblHorriosDeAtendimento;
	private JTextField textField_4;
	private JLabel lblValorConsultaParticular;
	private JSpinner spinner_1;
	private JTextArea textArea;
	private JLabel lblValorConsultaParticular_2;
	private JPanel panelEndereco;
	private JTextField textField_3;
	private JLabel lblLogradouro;
	private JTextField textField_5;
	private JLabel lblNmero;
	private JTextField textField_6;
	private JLabel lblComplemento;
	private JTextField textField_7;
	private JLabel lblBairro;
	private JTextField textField_8;
	private JLabel lblCidade;
	private JTextField textField_9;
	private JLabel lblCep;
	private JLabel lblEstado;
	private JTextField textField_10;
	private JLabel tituloEndereco;
	private JLabel tituloDadosPessoais;
	
	private JScrollPane scrollPane;
    private JPanel innerPanel;
	
	public PanelCadastrarMedico() {
		setBackground(new Color(83, 169, 255));
		this.setLayout(null);
		this.setSize(940, 790);
		//add(PanelInformacoes());
		
		innerPanel = new JPanel();
		innerPanel.setLayout(null);
		innerPanel.setBackground(new Color(83, 169, 255));
		innerPanel.setPreferredSize(new Dimension(getWidth(), 1200));//innerPanel.setPreferredSize(getSize()); 
	    
	    innerPanel.add(PanelInformacoes());
	    innerPanel.add(getbtnCadastrar());
		innerPanel.add(getbtnLimpar());
		innerPanel.add(getPanelEndereco());
		innerPanel.add(getTituloDadosPessoais());
		innerPanel.add(getTituloEndereco());
	   
	    
	    
	    //Criação do ScrollPanee adicionando o "innerPanel"
	    scrollPane = new JScrollPane(innerPanel);
        scrollPane.setBounds(0, 0, 940, 932);
        add(scrollPane);
		
		
		JLabel titlePanelCadastrarMedico = new JLabel("Cadastro dos Médicos");
		titlePanelCadastrarMedico.setForeground(new Color(255, 255, 255));
		titlePanelCadastrarMedico.setFont(new Font("Tahoma", Font.BOLD, 30));
		titlePanelCadastrarMedico.setSize(331, 33);
		titlePanelCadastrarMedico.setLocation(304, 31); 
	    //add(titlePanelCadastrarMedico);
		
		innerPanel.add(titlePanelCadastrarMedico);

		
		
	}
	
	public JPanel PanelInformacoes() {
		JPanel PanelInformacoes = new JPanel();
		PanelInformacoes.setBorder(new LineBorder(new Color(192, 192, 192)));
		PanelInformacoes.setLayout(null);
		PanelInformacoes.setSize(800, 254);
		PanelInformacoes.setLocation(70, 146);
		PanelInformacoes.add(getLabelNomeMaterial());
		PanelInformacoes.add(getTextField_1());
		PanelInformacoes.add(getTextField());
		PanelInformacoes.add(getLblCrm());
		PanelInformacoes.add(getTextField_2());
		PanelInformacoes.add(getLabelNomeMaterial_1());
		PanelInformacoes.add(getLblHorriosDeAtendimento());
		PanelInformacoes.add(getTextField_4());
		PanelInformacoes.add(getLblValorConsultaParticular());
		PanelInformacoes.add(getSpinner_1());
		PanelInformacoes.add(getTextArea());
		PanelInformacoes.add(getLblValorConsultaParticular_2());
		
		return PanelInformacoes;
	}
	    
	    
	
/********************************** BOTÕES **********************************/
	
	public JButton getbtnCadastrar() {
		if(btnCadastrar == null) {
			btnCadastrar = new JButton();
			btnCadastrar.setFont(new Font("Tahoma", Font.PLAIN, 15));
			btnCadastrar.setForeground(new Color(0, 0, 205));
			btnCadastrar.setSize(147,40);
			btnCadastrar.setLocation(723,690);
			btnCadastrar.setText("CADASTRAR");
		}
		return btnCadastrar; 
	}
	
	public JButton getbtnLimpar() {
		if(btnLimpar == null) {
			btnLimpar = new JButton();
			btnLimpar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});
			btnLimpar.setFont(new Font("Tahoma", Font.PLAIN, 15));
			btnLimpar.setForeground(new Color(0, 0, 205));
			btnLimpar.setSize(156,40);
			btnLimpar.setLocation(532,690);
			btnLimpar.setText("LIMPAR");

			
		}
		return btnLimpar; 
	}
	private JLabel getLabelNomeMaterial() {
		if (labelNomeMaterial == null) {
			labelNomeMaterial = new JLabel("Nome");
			labelNomeMaterial.setFont(new Font("Tahoma", Font.PLAIN, 15));
			labelNomeMaterial.setBounds(66, 24, 200, 32);
		}
		return labelNomeMaterial;
	}
	private JTextField getTextField_1() {
		if (textField_1 == null) {
			textField_1 = new JTextField();
			textField_1.setBounds(66, 54, 286, 32);
		}
		return textField_1;
	}
	private JTextField getTextField() {
		if (textField == null) {
			textField = new JTextField();
			textField.setBounds(66, 126, 286, 32);
		}
		return textField;
	}
	private JLabel getLblCrm() {
		if (lblCrm == null) {
			lblCrm = new JLabel("CRM:");
			lblCrm.setFont(new Font("Tahoma", Font.PLAIN, 15));
			lblCrm.setBounds(66, 96, 200, 32);
		}
		return lblCrm;
	}
	private JTextField getTextField_2() {
		if (textField_2 == null) {
			textField_2 = new JTextField();
			textField_2.setBounds(362, 54, 364, 32);
		}
		return textField_2;
	}
	private JLabel getLabelNomeMaterial_1() {
		if (labelNomeMaterial_1 == null) {
			labelNomeMaterial_1 = new JLabel("Especialidade");
			labelNomeMaterial_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
			labelNomeMaterial_1.setBounds(362, 24, 364, 32);
		}
		return labelNomeMaterial_1;
	}
	private JLabel getLblHorriosDeAtendimento() {
		if (lblHorriosDeAtendimento == null) {
			lblHorriosDeAtendimento = new JLabel("Horários de Atendimento:");
			lblHorriosDeAtendimento.setFont(new Font("Tahoma", Font.PLAIN, 15));
			lblHorriosDeAtendimento.setBounds(66, 168, 200, 32);
		}
		return lblHorriosDeAtendimento;
	}
	private JTextField getTextField_4() {
		if (textField_4 == null) {
			textField_4 = new JTextField();
			textField_4.setBounds(276, 198, 162, 32);
		}
		return textField_4;
	}
	private JLabel getLblValorConsultaParticular() {
		if (lblValorConsultaParticular == null) {
			lblValorConsultaParticular = new JLabel("Valor Consulta Particular:");
			lblValorConsultaParticular.setFont(new Font("Tahoma", Font.PLAIN, 15));
			lblValorConsultaParticular.setBounds(276, 168, 200, 32);
		}
		return lblValorConsultaParticular;
	}
	private JSpinner getSpinner_1() {
		if (spinner_1 == null) {
			spinner_1 = new JSpinner();
			spinner_1.setModel(new SpinnerDateModel(new Date(1730689200000L), null, null, Calendar.DAY_OF_YEAR));
			spinner_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
			spinner_1.setBounds(66, 198, 200, 32);
		}
		return spinner_1;
	}
	private JTextArea getTextArea() {
		if (textArea == null) {
			textArea = new JTextArea();
			textArea.setBounds(448, 129, 278, 101);
		}
		return textArea;
	}
	private JLabel getLblValorConsultaParticular_2() {
		if (lblValorConsultaParticular_2 == null) {
			lblValorConsultaParticular_2 = new JLabel("Contato");
			lblValorConsultaParticular_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
			lblValorConsultaParticular_2.setBounds(448, 96, 200, 32);
		}
		return lblValorConsultaParticular_2;
	}
	private JPanel getPanelEndereco() {
		if (panelEndereco == null) {
			panelEndereco = new JPanel();
			panelEndereco.setLayout(null);
			panelEndereco.setBorder(new LineBorder(new Color(192, 192, 192)));
			panelEndereco.setBounds(70, 445, 800, 235);
			panelEndereco.add(getTextField_3());
			panelEndereco.add(getLblLogradouro());
			panelEndereco.add(getTextField_5());
			panelEndereco.add(getLblNmero());
			panelEndereco.add(getTextField_6());
			panelEndereco.add(getLblComplemento());
			panelEndereco.add(getTextField_7());
			panelEndereco.add(getLblBairro());
			panelEndereco.add(getTextField_8());
			panelEndereco.add(getLblCidade());
			panelEndereco.add(getTextField_9());
			panelEndereco.add(getLblCep());
			panelEndereco.add(getLblEstado());
			panelEndereco.add(getTextField_10());
		}
		return panelEndereco;
	}
	private JTextField getTextField_3() {
		if (textField_3 == null) {
			textField_3 = new JTextField();
			textField_3.setBounds(23, 39, 553, 32);
		}
		return textField_3;
	}
	private JLabel getLblLogradouro() {
		if (lblLogradouro == null) {
			lblLogradouro = new JLabel("Logradouro:");
			lblLogradouro.setFont(new Font("Tahoma", Font.PLAIN, 15));
			lblLogradouro.setBounds(23, 9, 200, 32);
		}
		return lblLogradouro;
	}
	private JTextField getTextField_5() {
		if (textField_5 == null) {
			textField_5 = new JTextField();
			textField_5.setBounds(586, 39, 201, 32);
		}
		return textField_5;
	}
	private JLabel getLblNmero() {
		if (lblNmero == null) {
			lblNmero = new JLabel("Número:");
			lblNmero.setFont(new Font("Tahoma", Font.PLAIN, 15));
			lblNmero.setBounds(586, 9, 201, 32);
		}
		return lblNmero;
	}
	private JTextField getTextField_6() {
		if (textField_6 == null) {
			textField_6 = new JTextField();
			textField_6.setBounds(451, 111, 336, 32);
		}
		return textField_6;
	}
	private JLabel getLblComplemento() {
		if (lblComplemento == null) {
			lblComplemento = new JLabel("Complemento:");
			lblComplemento.setFont(new Font("Tahoma", Font.PLAIN, 15));
			lblComplemento.setBounds(451, 81, 201, 32);
		}
		return lblComplemento;
	}
	private JTextField getTextField_7() {
		if (textField_7 == null) {
			textField_7 = new JTextField();
			textField_7.setBounds(23, 111, 418, 32);
		}
		return textField_7;
	}
	private JLabel getLblBairro() {
		if (lblBairro == null) {
			lblBairro = new JLabel("Bairro:");
			lblBairro.setFont(new Font("Tahoma", Font.PLAIN, 15));
			lblBairro.setBounds(23, 81, 201, 32);
		}
		return lblBairro;
	}
	private JTextField getTextField_8() {
		if (textField_8 == null) {
			textField_8 = new JTextField();
			textField_8.setBounds(23, 182, 286, 32);
		}
		return textField_8;
	}
	private JLabel getLblCidade() {
		if (lblCidade == null) {
			lblCidade = new JLabel("Cidade:");
			lblCidade.setFont(new Font("Tahoma", Font.PLAIN, 15));
			lblCidade.setBounds(23, 152, 201, 32);
		}
		return lblCidade;
	}
	private JTextField getTextField_9() {
		if (textField_9 == null) {
			textField_9 = new JTextField();
			textField_9.setBounds(319, 182, 189, 32);
		}
		return textField_9;
	}
	private JLabel getLblCep() {
		if (lblCep == null) {
			lblCep = new JLabel("CEP:");
			lblCep.setFont(new Font("Tahoma", Font.PLAIN, 15));
			lblCep.setBounds(319, 152, 189, 32);
		}
		return lblCep;
	}
	private JLabel getLblEstado() {
		if (lblEstado == null) {
			lblEstado = new JLabel("Estado:");
			lblEstado.setFont(new Font("Tahoma", Font.PLAIN, 15));
			lblEstado.setBounds(517, 152, 189, 32);
		}
		return lblEstado;
	}
	private JTextField getTextField_10() {
		if (textField_10 == null) {
			textField_10 = new JTextField();
			textField_10.setBounds(517, 182, 270, 32);
		}
		return textField_10;
	}
	private JLabel getTituloEndereco() {
		if (tituloEndereco == null) {
			tituloEndereco = new JLabel("Endereço");
			tituloEndereco.setForeground(Color.WHITE);
			tituloEndereco.setFont(new Font("Tahoma", Font.BOLD, 25));
			tituloEndereco.setBounds(70, 410, 119, 31);
		}
		return tituloEndereco;
	}
	private JLabel getTituloDadosPessoais() {
		if (tituloDadosPessoais == null) {
			tituloDadosPessoais = new JLabel("Dados Pessoais");
			tituloDadosPessoais.setForeground(Color.WHITE);
			tituloDadosPessoais.setFont(new Font("Tahoma", Font.BOLD, 25));
			tituloDadosPessoais.setBounds(70, 114, 198, 31);
		}
		return tituloDadosPessoais;
	}
}
