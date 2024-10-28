package visual;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Frame extends JFrame{
	
	JMenuBar barraMenu;
	JMenu menuCadastrar;
	
	JMenuItem itemCadastrarPaciente;
	JMenuItem itemCadastrarMedico;
	JMenuItem itemCadastrarMaterial;
	
	public Frame() {
		super();
		this.setVisible(true);
		this.setSize(1200, 720);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setJMenuBar(getBarraMenu());

	}

	public JMenuBar getBarraMenu() {
		if(barraMenu == null) {
			barraMenu = new JMenuBar();
			barraMenu.add(getCadastrar());
		}
		return barraMenu;
	}
	
	public JMenu getCadastrar() {
		if(menuCadastrar == null) {
			menuCadastrar = new JMenu();
			menuCadastrar.setText("Cadastrar");
			menuCadastrar.add(getCadastrarPaciente());
			menuCadastrar.add(getCadastrarMedico());
			menuCadastrar.add(getCadastrarMaterial());

		}
		return menuCadastrar;
	}
	
	public JMenuItem getCadastrarPaciente() {
		if(itemCadastrarPaciente == null) {
			itemCadastrarPaciente = new JMenuItem();
			itemCadastrarPaciente.setText("Paciente");
		}
		return itemCadastrarPaciente;
	}
	
	public JMenuItem getCadastrarMedico() {
		if(itemCadastrarMedico == null) {
			itemCadastrarMedico = new JMenuItem();
			itemCadastrarMedico.setText("Médico");
		}
		return itemCadastrarMedico;
	}
	
	public JMenuItem getCadastrarMaterial() {
		if(itemCadastrarMaterial == null) {
			itemCadastrarMaterial = new JMenuItem();
			itemCadastrarMaterial.setText("Material");
		}
		return itemCadastrarMaterial;
	}
}
