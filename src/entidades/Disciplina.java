package entidades;

public class Disciplina {

	private int codigoDisciplina;
	private String nomeDisciplina;
	private int faseDisciplina;
	private int cargaHorariaDisciplina;

	public Disciplina(int codigoDisciplina, String nomeDisciplina, int faseDisciplina, int cargaHorariaDisciplina) {

		this.codigoDisciplina = codigoDisciplina;
		this.nomeDisciplina = nomeDisciplina;
		this.faseDisciplina = faseDisciplina;
		this.cargaHorariaDisciplina = cargaHorariaDisciplina;
	}

	public int getCodigoDisciplina() {
		return codigoDisciplina;
	}

	public String getNomeDisciplina() {
		return nomeDisciplina;
	}

	public int getFaseDisciplina() {
		return faseDisciplina;
	}

	public int getCargaHorariaDisciplina() {
		return cargaHorariaDisciplina;
	}

}
