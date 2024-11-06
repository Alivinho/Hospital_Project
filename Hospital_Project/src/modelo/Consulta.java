package modelo;

public class Consulta {
	
	private String data;
	private String hora;
	private Medico medico;
	private Paciente paciente;
	private String queixaPaciente;
	private String tipoConsulta;
	private String convenio;
	private String observacoes;
	private Material materiais;
	
	public Consulta() {}
	
	public Consulta(String data, String hora, Medico medico, Paciente paciente, String queixaPaciente,
					String tipoConsulta, String convenio, String observacoes, Material materiais) {
		this.data = data;
		this.hora = hora;
		this.medico = medico;
		this.paciente = paciente;
		this.queixaPaciente = queixaPaciente;
		this.convenio = convenio;
		this.observacoes = observacoes;
		this.materiais = materiais;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}

	public Medico getMedico() {
		return medico;
	}

	public void setMedico(Medico medico) {
		this.medico = medico;
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	public String getQueixaPaciente() {
		return queixaPaciente;
	}

	public void setQueixaPaciente(String queixaPaciente) {
		this.queixaPaciente = queixaPaciente;
	}

	public String getTipoConsulta() {
		return tipoConsulta;
	}

	public void setTipoConsulta(String tipoConsulta) {
		this.tipoConsulta = tipoConsulta;
	}

	public String getConvenio() {
		return convenio;
	}

	public void setConvenio(String convenio) {
		this.convenio = convenio;
	}

	public String getObservacoes() {
		return observacoes;
	}

	public void setObservacoes(String observacoes) {
		this.observacoes = observacoes;
	}

	public Material getMateriais() {
		return materiais;
	}

	public void setMateriais(Material materiais) {
		this.materiais = materiais;
	}
	
}
