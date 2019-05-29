package com.javainspires.demothymeleaf.model;

public class Login {

	private String id;
	private String nome;
	private String age;
	
	public Login() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Login(String id, String nome, String age) {
		super();
		this.id = id;
		this.nome = nome;
		this.age = age;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	
	 
}
