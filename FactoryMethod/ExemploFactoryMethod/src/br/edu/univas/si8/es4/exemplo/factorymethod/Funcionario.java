package br.edu.univas.si8.es4.exemplo.factorymethod;

public abstract class Funcionario {

	private String nome;
	private String email;
	private double comissao;

	public abstract double getSalario();

	public abstract CalculadoraImposto createCalculadora();

	public double calcularSalarioLiquido() {
		double salario = getSalario();
		double comissaoCalculada = salario * comissao;
		CalculadoraImposto calculadora = createCalculadora();
		double impostos = calculadora.calcular();
		return salario + comissaoCalculada - impostos;
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

	public double getComissao() {
		return comissao;
	}

	public void setComissao(double comissao) {
		this.comissao = comissao;
	}

}
