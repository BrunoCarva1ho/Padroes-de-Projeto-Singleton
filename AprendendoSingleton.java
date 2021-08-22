package pacote;

public class AprendendoSingleton {

	private static AprendendoSingleton criado;

	private String nome;
	private int anoNascimento;

	private AprendendoSingleton() {

	}
	//Metodo para criar apenas 1 objeto
	public static AprendendoSingleton ConstroiObj() {

		if (criado == null) {
			criado = new AprendendoSingleton();
		}

		return criado;
	}

	@Override
	public String toString() {
		return "Nome: " + this.nome + ", Ano de nascimento:" + this.anoNascimento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getAnoNascimento() {
		return anoNascimento;
	}

	public void setAnoNascimento(int anoNascimento) {
		this.anoNascimento = anoNascimento;
	}

}
