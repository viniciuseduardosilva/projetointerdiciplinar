public class Cliente {
	private String nome;
	private String cpf;
	private String telefone;
	
	public Cliente(String n, String c, String t) {
		this.nome = n;
		this.cpf = c;
		this.telefone = t;
	}
	
	public String getNome() {
		return this.nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return this.cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getTelefone() {
		return this.telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
}
