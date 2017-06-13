package principal;

public class Funcionario {
	
	private String nome, email, cargo; 
	private double salarioBase;
	
	public Funcionario(String nome, String email, String cargo, double salarioBase) {
		this.nome = nome;
		this.email = email;
		this.cargo = cargo;
		this.salarioBase = salarioBase;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
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

	public double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}

}
