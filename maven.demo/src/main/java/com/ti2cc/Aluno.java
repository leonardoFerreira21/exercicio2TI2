package com.ti2cc;

public class Aluno {
	
	private int cod;
	private String nome;
	private String cpf;
	private char sexo;
	
	public Aluno() {
		this.cod = -1;
		this.nome = "";
		this.cpf = "";
		this.sexo = '*';
	}
	
	public Aluno(int cod, String nome, String cpf, char sexo) {
		this.cod = cod;
		this.nome = nome;
		this.nome = cpf;
		this.sexo = sexo;
	}
	
	public int getCod() {
		return cod;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public String getNome() {
		return nome;
	}
	
	public char getSexo() {
		return sexo;
	}
	
	public void setCod(int cod) {
		this.cod = cod;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	
	public String toString() {
		return "Aluno [cod=" + cod + ", nome=" + nome+ ", cpf=" + cpf + ", sexo=" + sexo + "]";
	}

}
