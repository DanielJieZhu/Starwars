package starwars;

abstract public class RegimePolitico{
    private String dataInstituicao;
    private String dataDissolvimento;
    private Planeta capital;
    private SerVivo chefeEstado;
    
    public String getDataInstituicao() {
		return dataInstituicao;
	}
	public void setDataInstituicao(String dataInstituicao) {
		this.dataInstituicao = dataInstituicao;
	}
	public String getDataDissolvimento() {
		return dataDissolvimento;
	}
	public void setDataDissolvimento(String dataDissolvimento) {
		this.dataDissolvimento = dataDissolvimento;
	}
	public Planeta getCapital() {
		return capital;
	}
	public void setCapital(Planeta capital) {
		this.capital = capital;
	}
	public SerVivo getChefeEstado() {
		return chefeEstado;
	}
	public void setChefeEstado(SerVivo chefeEstado) {
		this.chefeEstado = chefeEstado;
	}
}
