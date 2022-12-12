package program;

public class People {
	
	private static int counter = 1;
	
	private String name;
	private String cpf;
	private String email;
	public People(String name, String cpf, String email) {
		super();
		this.name = name;
		this.cpf = cpf;
		this.email = email;
		counter += 1;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "\nNome: " + this.getName() +
				"\nCpf: " + this.getCpf() +
				"\nEmail: " + this.getEmail();
	}
	
	
	
	

}
