package br.com.puc.tcc.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity(name="tb_Aluno")
public class Aluno{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	private String cpf;
	private String nome;
	private String telefone;
	
	@OneToOne(cascade=CascadeType.ALL)
	private Usuario usuario;

	public Aluno(){}
	public Aluno(String cpf,String nome, String email, String telefone, String senha) {
		super();
		this.cpf= cpf;
		this.nome = nome;
		
		this.telefone = telefone;
		Usuario user = new Usuario();
		user.setEmail(email);
		user.setSenha(senha);
		setUsuario(user);
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
	public Usuario getUsuario() {
		return usuario;
	}
	
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
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
