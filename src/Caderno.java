import java.util.Scanner;

public class Caderno extends Produto implements Manipulacao{
	private int qtdefolhas;
	private String tamanho;
	private String tipo;
	private boolean capadura;
	
	public Caderno(String m, float v, int q, String ta, String t, boolean c) {
		super(m, v);
		this.qtdefolhas = q;
		this.tamanho = ta;
		this.tipo = t;
		this.capadura = c;
	}
	
	public Caderno(String m, float v) {
		super(m, v);
	}
	
	
	public int getQtdefolhas() {
		return this.qtdefolhas;
	}
	public void setQtdefolhas(int qtdefolhas) {
		this.qtdefolhas = qtdefolhas;
	}
	public String getTamanho() {
		return this.tamanho;
	}
	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}
	public String getTipo() {
		return this.tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public boolean getCapadura() {
		return this.capadura;
	}
	public void setCapadura(boolean capadura) {
		this.capadura = capadura;
	}
	@Override
	public boolean Cadastro() {
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite a marca do Caderno: ");
		String marca = ler.next();
		setMarca(marca);
		System.out.println("Digite o valor do Caderno: ");
		float valor = ler.nextFloat();
		setValor(valor);
		System.out.println("Digite a quantidade de folhas do Caderno: ");
		int quantidade = ler.nextInt();
		setQtdefolhas(quantidade);
		System.out.println("Digite o tamanho do Caderno: ");
		String tamanho = ler.next();
		setTamanho(tamanho);
		System.out.println("Digite o tipo do Caderno: ");
		String tipo = ler.next();
		setTipo(tipo);
		System.out.println("Capadura? (Sim/Não)");
		String capadura = ler.next();
		if(capadura.equals("Sim") || capadura.equals("sim")) {
			setCapadura(true);
		}else {
			setCapadura(false);
		}
		if(getMarca().equals(null) || getValor() <= 0 || getQtdefolhas() <= 0
			|| getTamanho().equals(null) || getTipo().equals(null)) {
			System.out.println("Informe valores válidos para cadastrar o caderno!");
				return false;
			}
			
		return true;
	}
	@Override
	public String Consulta() {
		String resposta = getMarca() + "\nValor: "+getValor() + "\nQuantidade folhas: "+getQtdefolhas()
		+ "\nTamanho: " + getTamanho() + "\nTipo: " + getTipo();
		if(getCapadura()) {
			resposta += "\nCapadura: Sim";
		}else {
			resposta += "\nCapadura: Não";
		}
		return resposta;
	}
	
	
}
