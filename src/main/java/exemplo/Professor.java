package exemplo;

public class Professor {

	private String nome;
	private int matricula;
	private int cargaHoraria;
	
	public Professor(String nome, int matricula, int cargaHoraria) {
		super();
		setNome(nome);
		setMatricula(matricula);
		setCargaHoraria(cargaHoraria);
	}
	public Professor() {
		super();
	}
	public int getCargaHoraria() {
		return cargaHoraria;
	}
	public void setCargaHoraria(int cargaHoraria) {
		if (cargaHoraria <= 0) {
			throw new IllegalArgumentException("cargaHoraria < 0");
		}
		if (cargaHoraria > 60) {
			throw new IllegalArgumentException("cargaHoraria > 60");
		}
		this.cargaHoraria = cargaHoraria;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		if (nome == null) {
			throw new IllegalArgumentException("nome == null");
		}
		this.nome = nome;
	}
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	
	public float getCargaHorariaMensal() {
		return cargaHoraria * 4.5F;
	}	
}
