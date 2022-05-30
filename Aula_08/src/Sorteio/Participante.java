package Sorteio;

public class Participante {
	private String nome, presente;

	@Override
	public String toString() {
		return "O sorteado foi: " + nome + ", e o presente é: " + presente;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getPresente() {
		return presente;
	}

	public void setPresente(String presente) {
		this.presente = presente;
	}
}