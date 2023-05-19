package entidades;

import java.util.Arrays;

public class Professor {

	private int codigo;
	private String nome;
	private Disciplina[] disciplinas;

	public Professor() {

	}

	public Professor(int codigoProfessor, String nomeProfessor, Disciplina[] disciplinas) {

		this.codigo = codigoProfessor;
		this.nome = nomeProfessor;
		this.disciplinas = disciplinas;
	}

	public int getCodigo() {
		return codigo;
	}

	public String getNome() {
		return nome;
	}

	public Disciplina[] getDisciplinas() {
		return disciplinas;
	}

	@Override
	public String toString() {
		return "Professor [Codigo: " + codigo + ", Nome: " + nome + ", Disciplinas: " + Arrays.toString(disciplinas)
				+ "]";
	}

}
