package visual;

import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import java.awt.Font;

public class PanelExame extends JPanel {
	private JLabel titlePanelCadastrarExame;
	private JLabel lblNomeExame;
	private JLabel lblDescricao;
	private JLabel lblValorParticular;
	private JLabel lblMateriaisUtilizados;
	private JLabel lblMedico; 
	private JLabel lblDadosExame;
	private JLabel lblTipoExame;
	
	private JComboBox<String> tipoExame;
	
	private JTextField nomeExame;
	private JTextArea descricao;
	private JTextField valParticular;
	private JTextArea materiaisUtilizados;
	private JTextField medico;
	
	private JPanel panelDadosExame;
	
	private JButton btnLimpar;
	private JButton btnCadastrar;
	
	

	
	public PanelExame() {
		setBackground(new Color(83, 169, 255));
		this.setSize(940, 920);
		setLayout(null);
		add(getTitlePanelCadastrarExame());
		add(getLblDadosExame());
		add(getPanelDadosExame());
		add(getBtnLimpar());
		add(getBtnCadastrar());
	}
	
	
	private JPanel getPanelDadosExame() {
	    if (panelDadosExame == null) {
	        panelDadosExame = new JPanel();
	        panelDadosExame.setLayout(null);
	        panelDadosExame.setBorder(new LineBorder(new Color(192, 192, 192), 1, true));
	        panelDadosExame.setBounds(69, 169, 800, 375);

	        panelDadosExame.add(getLblNomeExame());
	        panelDadosExame.add(getLblDescricao());
	        panelDadosExame.add(getLblValorParticular());
	        panelDadosExame.add(getLblMateriaisUtilizados());
	        panelDadosExame.add(getLblMedico());
	        panelDadosExame.add(getLblTipoExame());
	       
	        panelDadosExame.add(getTipoExame());
	       
	        panelDadosExame.add(getNomeExame());
	        panelDadosExame.add(getDescricao());
	        panelDadosExame.add(getValParticular());
	        panelDadosExame.add(getMateriaisUtilizados());
	        panelDadosExame.add(getMedico());
	    }
	    return panelDadosExame;
	}



	private JLabel getTitlePanelCadastrarExame() {
		if (titlePanelCadastrarExame == null) {
			titlePanelCadastrarExame = new JLabel("Cadastro de Exames");
			titlePanelCadastrarExame.setBounds(411, 33, 314, 37);
			titlePanelCadastrarExame.setForeground(Color.WHITE);
			titlePanelCadastrarExame.setFont(new Font("Tahoma", Font.BOLD, 30));
		}
		return titlePanelCadastrarExame;
	}
	
	
//***********************************  LABELS ***********************************//
	
	private JLabel getLblDadosExame() {
		if (lblDadosExame == null) {
			lblDadosExame = new JLabel("Dados do exame");
			lblDadosExame.setForeground(Color.WHITE);
			lblDadosExame.setFont(new Font("Tahoma", Font.BOLD, 25));
			lblDadosExame.setBounds(69, 128, 229, 31);
		}
		return lblDadosExame;
	}
	
	public JLabel getLblNomeExame() {
		if (lblNomeExame == null) {
			lblNomeExame = new JLabel("Nome do Exame:");
			lblNomeExame.setFont(new Font("Tahoma", Font.PLAIN, 15));
			lblNomeExame.setBounds(420, 11, 200, 32);
		}
		return lblNomeExame;
	}
	
	public JLabel getLblDescricao() {
	    if (lblDescricao == null) {
	        lblDescricao = new JLabel("Descrição:");
	        lblDescricao.setFont(new Font("Tahoma", Font.PLAIN, 15));
	        lblDescricao.setBounds(10, 159, 200, 32);
	    }
	    return lblDescricao;
	}

	public JLabel getLblValorParticular() {
	    if (lblValorParticular == null) {
	        lblValorParticular = new JLabel("Valor Particular:");
	        lblValorParticular.setFont(new Font("Tahoma", Font.PLAIN, 15));
	        lblValorParticular.setBounds(420, 81, 200, 32);
	    }
	    return lblValorParticular;
	}

	public JLabel getLblMateriaisUtilizados() {
	    if (lblMateriaisUtilizados == null) {
	        lblMateriaisUtilizados = new JLabel("Materiais Utilizados:");
	        lblMateriaisUtilizados.setFont(new Font("Tahoma", Font.PLAIN, 15));
	        lblMateriaisUtilizados.setBounds(420, 159, 200, 32);
	    }
	    return lblMateriaisUtilizados;
	}

	public JLabel getLblMedico() {
	    if (lblMedico == null) {
	        lblMedico = new JLabel("Médico:");
	        lblMedico.setFont(new Font("Tahoma", Font.PLAIN, 15));
	        lblMedico.setBounds(10, 11, 200, 32);
	    }
	    return lblMedico;
	}
	
	public JLabel getLblTipoExame() {
	    if (lblTipoExame == null) {
	    	lblTipoExame = new JLabel("Tipo de Exame");
	        lblTipoExame.setFont(new Font("Tahoma", Font.PLAIN, 15));
	        lblTipoExame.setBounds(10, 81, 200, 32);
	    }
	    return lblTipoExame;
	}
	
	
	
	
//***********************************  CAMPOS DE TEXTO  ***********************************//


	public JTextField getNomeExame() {
	    if (nomeExame == null) {
	        nomeExame = new JTextField();
	        nomeExame.setFont(new Font("Tahoma", Font.PLAIN, 15));
	        nomeExame.setBounds(420, 37, 370, 32);
	    }
	    return nomeExame;
	}

	public JTextArea getDescricao() {
	    if (descricao == null) {
	        descricao = new JTextArea();
	        descricao.setFont(new Font("Tahoma", Font.PLAIN, 15));
	        descricao.setLineWrap(true);
	        descricao.setWrapStyleWord(true);
	        descricao.setBounds(10, 189, 370, 175);
	        descricao.setBorder(BorderFactory.createLineBorder(Color.GRAY));
	    }
	    return descricao;
	}

	public JTextField getValParticular() {
	    if (valParticular == null) {
	        valParticular = new JTextField();
	        valParticular.setFont(new Font("Tahoma", Font.PLAIN, 15));
	        valParticular.setBounds(420, 116, 370, 32);
	    }
	    return valParticular;
	}

	public JTextArea getMateriaisUtilizados() {
	    if (materiaisUtilizados == null) {
	        materiaisUtilizados = new JTextArea();
	        materiaisUtilizados.setFont(new Font("Tahoma", Font.PLAIN, 15));
	        materiaisUtilizados.setLineWrap(true);
	        materiaisUtilizados.setWrapStyleWord(true);
	        materiaisUtilizados.setBounds(420, 189, 370, 175);
	        materiaisUtilizados.setBorder(BorderFactory.createLineBorder(Color.GRAY));
	    }
	    return materiaisUtilizados;
	}

	public JTextField getMedico() {
	    if (medico == null) {
	        medico = new JTextField();
	        medico.setFont(new Font("Tahoma", Font.PLAIN, 15));
	        medico.setBounds(10, 37, 370, 32);
	    }
	    return medico;
	}
	
	public JComboBox<String> getTipoExame(){
		if(tipoExame == null) {
			tipoExame = new JComboBox();
			tipoExame.setBackground(new Color(255, 255, 255));
			tipoExame.setFont(new Font("Tahoma", Font.PLAIN, 15));
			tipoExame.setModel(new DefaultComboBoxModel(new String[] {" ", "Exames físicos", "Exames laboratoriais", "Imagens", "Biópsia", "Patologia e análise clínica"}));
			tipoExame.setBounds(10, 116, 370, 32);
		}
	
		return tipoExame;
	}
	
//***********************************  BOTÕES  ***********************************//

	private JButton getBtnLimpar() {
		if (btnLimpar == null) {
			btnLimpar = new JButton();
			btnLimpar.setText("LIMPAR");
			btnLimpar.setForeground(new Color(0, 0, 205));
			btnLimpar.setFont(new Font("Tahoma", Font.PLAIN, 15));
			btnLimpar.setBounds(531, 554, 156, 40);
		}
		return btnLimpar;
	}
	private JButton getBtnCadastrar() {
		if (btnCadastrar == null) {
			btnCadastrar = new JButton();
			btnCadastrar.setText("CADASTRAR");
			btnCadastrar.setForeground(new Color(0, 0, 205));
			btnCadastrar.setFont(new Font("Tahoma", Font.PLAIN, 15));
			btnCadastrar.setBounds(722, 554, 147, 40);
		}
		return btnCadastrar;
	}
	
}
