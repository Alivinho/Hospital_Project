package visual;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PanelCadastrarMedico extends JPanel{
	
	private JButton btnCadastrar;
	private JButton btnLimpar; 
	private JLabel labelNomeMaterial;
	private JTextField textField_1;
	private JTextField textField;
	private JLabel lblCrm;
	private JTextField textField_2;
	private JLabel labelNomeMaterial_1;
	private JTextField textField_3;
	private JLabel lblHorriosDeAtendimento;
	private JTextField textField_4;
	private JLabel lblValorConsultaParticular;
	private JLabel lblHorriosDeAtendimento_1;
	
	public PanelCadastrarMedico() {
		setBackground(new Color(83, 169, 255));
		this.setLayout(null);
		this.setSize(900, 625);
		add(PanelInformacoes());
		
		
		JLabel titlePanelCadastrarMedico = new JLabel("Cadastro dos Médicos");
		titlePanelCadastrarMedico.setForeground(new Color(255, 255, 255));
		titlePanelCadastrarMedico.setFont(new Font("Tahoma", Font.BOLD, 30));
		titlePanelCadastrarMedico.setSize(359, 25);
		titlePanelCadastrarMedico.setLocation(270, 31); 
	    add(titlePanelCadastrarMedico);

		
		add(getbtnCadastrar());
		add(getbtnLimpar());
	}
	
	public JPanel PanelInformacoes() {
		JPanel PanelInformacoes = new JPanel();
		PanelInformacoes.setBorder(new LineBorder(new Color(192, 192, 192)));
		PanelInformacoes.setLayout(null);
		PanelInformacoes.setSize(800, 367);
		PanelInformacoes.setLocation(50, 82);
		PanelInformacoes.add(getLabelNomeMaterial());
		PanelInformacoes.add(getTextField_1());
		PanelInformacoes.add(getTextField());
		PanelInformacoes.add(getLblCrm());
		PanelInformacoes.add(getTextField_2());
		PanelInformacoes.add(getLabelNomeMaterial_1());
		PanelInformacoes.add(getTextField_3());
		PanelInformacoes.add(getLblHorriosDeAtendimento());
		PanelInformacoes.add(getTextField_4());
		PanelInformacoes.add(getLblValorConsultaParticular());
		PanelInformacoes.add(getLblHorriosDeAtendimento_1());
		
		return PanelInformacoes;
	}
	    
	    
	
/********************************** BOTÕES **********************************/
	
	public JButton getbtnCadastrar() {
		if(btnCadastrar == null) {
			btnCadastrar = new JButton();
			btnCadastrar.setFont(new Font("Tahoma", Font.PLAIN, 15));
			btnCadastrar.setForeground(new Color(0, 0, 205));
			btnCadastrar.setSize(147,40);
			btnCadastrar.setLocation(703,459);
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
			btnLimpar.setLocation(512,459);
			btnLimpar.setText("LIMPAR");

			
		}
		return btnLimpar; 
	}
	private JLabel getLabelNomeMaterial() {
		if (labelNomeMaterial == null) {
			labelNomeMaterial = new JLabel("Nome do Material:");
			labelNomeMaterial.setFont(new Font("Tahoma", Font.PLAIN, 15));
			labelNomeMaterial.setBounds(113, 24, 200, 32);
		}
		return labelNomeMaterial;
	}
	private JTextField getTextField_1() {
		if (textField_1 == null) {
			textField_1 = new JTextField();
			textField_1.setBounds(113, 54, 574, 32);
		}
		return textField_1;
	}
	private JTextField getTextField() {
		if (textField == null) {
			textField = new JTextField();
			textField.setBounds(113, 126, 200, 32);
		}
		return textField;
	}
	private JLabel getLblCrm() {
		if (lblCrm == null) {
			lblCrm = new JLabel("CRM:");
			lblCrm.setFont(new Font("Tahoma", Font.PLAIN, 15));
			lblCrm.setBounds(113, 96, 200, 32);
		}
		return lblCrm;
	}
	private JTextField getTextField_2() {
		if (textField_2 == null) {
			textField_2 = new JTextField();
			textField_2.setBounds(323, 126, 364, 32);
		}
		return textField_2;
	}
	private JLabel getLabelNomeMaterial_1() {
		if (labelNomeMaterial_1 == null) {
			labelNomeMaterial_1 = new JLabel("Nome do Material:");
			labelNomeMaterial_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
			labelNomeMaterial_1.setBounds(323, 96, 364, 32);
		}
		return labelNomeMaterial_1;
	}
	private JTextField getTextField_3() {
		if (textField_3 == null) {
			textField_3 = new JTextField();
			textField_3.setBounds(113, 212, 200, 32);
		}
		return textField_3;
	}
	private JLabel getLblHorriosDeAtendimento() {
		if (lblHorriosDeAtendimento == null) {
			lblHorriosDeAtendimento = new JLabel("Horários de Atendimento:");
			lblHorriosDeAtendimento.setFont(new Font("Tahoma", Font.PLAIN, 15));
			lblHorriosDeAtendimento.setBounds(113, 182, 200, 32);
		}
		return lblHorriosDeAtendimento;
	}
	private JTextField getTextField_4() {
		if (textField_4 == null) {
			textField_4 = new JTextField();
			textField_4.setBounds(323, 212, 364, 32);
		}
		return textField_4;
	}
	private JLabel getLblValorConsultaParticular() {
		if (lblValorConsultaParticular == null) {
			lblValorConsultaParticular = new JLabel("Valor Consulta Particular:");
			lblValorConsultaParticular.setFont(new Font("Tahoma", Font.PLAIN, 15));
			lblValorConsultaParticular.setBounds(323, 182, 200, 32);
		}
		return lblValorConsultaParticular;
	}
	private JLabel getLblHorriosDeAtendimento_1() {
		if (lblHorriosDeAtendimento_1 == null) {
			lblHorriosDeAtendimento_1 = new JLabel("Horários de Atendimento:");
			lblHorriosDeAtendimento_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
			lblHorriosDeAtendimento_1.setBounds(113, 254, 200, 32);
		}
		return lblHorriosDeAtendimento_1;
	}
}
