package modelo;

public class Exame {
	
	private String nomeExame;
	private String descricao;
	private String tipoExame;
	private float valorParticular;
	private Material materiais;
	private Medico medico;
		
	public Exame() {}
	
	public Exame(String nomeExame, String descricao, String tipoExame, float valorParticular, Material materiais, Medico medico) {
		this.nomeExame = nomeExame;
		this.descricao = descricao;
		this.tipoExame = tipoExame;
		this.valorParticular = valorParticular;
		this.materiais = materiais;
		this.medico = medico;				
	}

	public String getNomeExame() {
		return nomeExame;
	}

	public void setNomeExame(String nomeExame) {
		this.nomeExame = nomeExame;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getTipoExame() {
		return tipoExame;
	}

	public void setTipoExame(String tipoExame) {
		this.tipoExame = tipoExame;
	}

	public float getValorParticular() {
		return valorParticular;
	}

	public void setValorParticular(float valorParticular) {
		this.valorParticular = valorParticular;
	}

	public Material getMateriais() {
		return materiais;
	}

	public void setMateriais(Material materiais) {
		this.materiais = materiais;
	}

	public Medico getMedico() {
		return medico;
	}

	public void setMedico(Medico medico) {
		this.medico = medico;
	}		

}
