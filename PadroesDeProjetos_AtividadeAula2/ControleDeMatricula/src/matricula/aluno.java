package matricula;

public class aluno extends Pessoa {
	private String numeroMatricula;
	
	public aluno(String nome, String cpf, String endereco, String telefone, String numeroMatricula) {
		super(nome, cpf, endereco, telefone);
		this.numeroMatricula = numeroMatricula;
	}
	
	public String getNumeroMatricula() {
		return numeroMatricula;
	}

	public void setNumeroMatricula(String numeroMatricula) {
		this.numeroMatricula = numeroMatricula;
	}

	
	

	
	
	
	
	

}
