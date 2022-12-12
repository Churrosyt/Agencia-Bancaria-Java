package program;

import entities.Utils;

public class Conta {
	
	private static int contadorDeContas = 1;
	
	private Integer numeroConta;
	private People pessoa;
	private Double saldo = 0.0;
	
	public Conta(People pessoa) {
		super();
		this.numeroConta = contadorDeContas;
		this.pessoa = pessoa;
		contadorDeContas += 1;
	}

	public Integer getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(Integer numeroConta) {
		this.numeroConta = numeroConta;
	}

	public People getPessoa() {
		return pessoa;
	}

	public void setPessoa(People pessoa) {
		this.pessoa = pessoa;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	@Override
	public String toString() {
		return "\nNúmero da conta: " + this.getNumeroConta() +
				"\nNome: " + this.pessoa.getName() +
				"\nCPF: " + this.pessoa.getCpf() +
				"\nEmail: " + this.pessoa.getEmail() +
				"\nSaldo: " + Utils.doubleToString(this.getSaldo());
	}
	
	
	
	
	
	

}
