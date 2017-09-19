package br.com.puc.mec.emuladormec.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="tb_Aluno")
public class Aluno{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	private String cpf;
	private String nome;
	private String email;
	private String telefone;
	
	public Aluno(){}
	public Aluno(String cpf,String nome, String email, String telefone) {
		super();
		this.cpf= cpf;
		this.nome = nome;
		
		this.telefone = telefone;
		this.email = email;
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
