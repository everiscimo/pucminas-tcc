package br.com.puc.tcc.model;

public class AlunoMEC {

private long id;
	
	private String cpf;
	private String nome;
	private String email;
	private String telefone;
	
	public AlunoMEC(){}
	public AlunoMEC(Aluno aluno) {
		super();
		this.cpf= aluno.getCpf();
		this.nome = aluno.getNome();
		
		this.telefone = aluno.getTelefone();
		this.email = aluno.getUsuario().getEmail();
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
}
