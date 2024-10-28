package visual;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PanelCadastrarMedico extends JPanel{
	
	private JTextField nome;
	private JTextField especialidade;
	private JTextField crm;
	private JTextField horariosAtendimento;
	private JTextField valorConsultaParticular;
	
	private JLabel labelNome;
	private JLabel labelEspecialidade;
	private JLabel labelCrm;
	private JLabel labelHorariosAtendimentoe;
	private JLabel labelValorConsultaParticular;
	
	private JButton btnCadastrar;
	private JButton btnLimpar; 
	
	public PanelCadastrarMedico() {
		this.setLayout(null);
		this.setSize(1200, 720);
		add(PanelInformacoes());
		
		
		JLabel titlePanelCadastrarMedico = new JLabel("Cadastro dos Médicos");
		titlePanelCadastrarMedico.setFont(new Font("Tahoma", Font.BOLD, 30));
		titlePanelCadastrarMedico.setSize(325, 25);
		titlePanelCadastrarMedico.setLocation(50, 31); 
	    add(titlePanelCadastrarMedico);

		
		add(getbtnCadastrar());
		add(getbtnLimpar());
	}
	
	public JPanel PanelInformacoes() {
		JPanel PanelInformacoes = new JPanel();
		PanelInformacoes.setLayout(null);
		PanelInformacoes.setSize(800, 367);
		PanelInformacoes.setLocation(50, 82);

		
		PanelInformacoes.add(getTextfFieldNome());
		PanelInformacoes.add(getTextFieldEspecialidade());
		PanelInformacoes.add(getTextFieldCrm());
		PanelInformacoes.add(getTextFieldHorariosAtendimento());
		PanelInformacoes.add(getTextFieldValorConsultaParticular());
		PanelInformacoes.add(getLabelNome());
		PanelInformacoes.add(getLabelEspecialidade());
		PanelInformacoes.add(getLabelCrm());
		PanelInformacoes.add(getLabelHorariosAtendimento());
		PanelInformacoes.add(getLabelValorConsultaParticular());
		
		return PanelInformacoes;
	}
	
	public JTextField getTextfFieldNome() {
		if (nome == null) {
			nome = new JTextField();
			nome.setSize(564, 32);
			nome.setLocation(62, 51);
		}
		return nome;
	}
	
	public JTextField getTextFieldEspecialidade() {
	    if (especialidade == null) {
	        especialidade = new JTextField();
	        especialidade.setSize(230, 32);
	        especialidade.setLocation(396, 134); 
	    }
	    return especialidade;
	}

	public JTextField getTextFieldCrm() {
	    if (crm == null) {
	        crm = new JTextField();
	        crm.setSize(230, 32);
	        crm.setLocation(62, 134); 
	    }
	    return crm;
	}

	public JTextField getTextFieldHorariosAtendimento() {
	    if (horariosAtendimento == null) {
	        horariosAtendimento = new JTextField();
	        horariosAtendimento.setSize(230, 32);
	        horariosAtendimento.setLocation(62, 212); 
	    }
	    return horariosAtendimento;
	}

	public JTextField getTextFieldValorConsultaParticular() {
	    if (valorConsultaParticular == null) {
	        valorConsultaParticular = new JTextField();
	        valorConsultaParticular.setSize(230, 32);
	        valorConsultaParticular.setLocation(396, 212); 
	    }
	    return valorConsultaParticular;
	}
	
	
	
	public JLabel getLabelNome() {
	    if (labelNome == null) {
	    	labelNome = new JLabel("Nome:");
	        labelNome.setSize(100, 19);
	        labelNome.setLocation(62, 33); 
	    }
	    return labelNome;
	}

	public JLabel getLabelEspecialidade() {
	    if (labelEspecialidade == null) {
	        labelEspecialidade = new JLabel("Especialidade:");
	        labelEspecialidade.setSize(100, 19);
	        labelEspecialidade.setLocation(396, 114); 
	    }
	    return labelEspecialidade;
	}

	public JLabel getLabelCrm() {
	    if (labelCrm == null) {
	        labelCrm = new JLabel("CRM:");
	        labelCrm.setSize(100, 19);
	        labelCrm.setLocation(62, 114); 
	    }
	    return labelCrm;
	}

	public JLabel getLabelHorariosAtendimento() {
	    if (labelHorariosAtendimentoe == null) {
	        labelHorariosAtendimentoe = new JLabel("Horários de Atendimento:");
	        labelHorariosAtendimentoe.setSize(200, 19);
	        labelHorariosAtendimentoe.setLocation(62, 192); 
	    }
	    return labelHorariosAtendimentoe;
	}

	public JLabel getLabelValorConsultaParticular() {
	    if (labelValorConsultaParticular == null) {
	        labelValorConsultaParticular = new JLabel("Valor Consulta Particular:");
	        labelValorConsultaParticular.setSize(200, 19);
	        labelValorConsultaParticular.setLocation(396, 195);
	        
	    }
	    return labelValorConsultaParticular;
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
