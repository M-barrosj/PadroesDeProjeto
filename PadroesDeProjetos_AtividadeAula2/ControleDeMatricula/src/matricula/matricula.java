package matricula;

public abstract class matricula {
	private String curso;
	private String semestre;
	private String disciplina;
	public matricula(String curso, String semestre, String disciplina) {
		
		super();
		this.curso = curso;
		this.semestre = semestre;
		this.disciplina = disciplina;
	
}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	public String getSemestre() {
		return semestre;
	}
	public void setSemestre(String semestre) {
		this.semestre = semestre;
	}
	public String getDisciplina() {
		return disciplina;
	}
	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}
	
	public abstract void fazerMatricula();
	
	
		
	}
