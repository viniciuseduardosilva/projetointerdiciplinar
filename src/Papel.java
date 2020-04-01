import java.util.Scanner;

public class Papel extends Produto implements Manipulacao{
	private String cor;
	private String tipo;
	private float largura;
	private int gramatura;
	private boolean paltado;
		
	public Papel(String m, float v, String c, String t, float l, int g, boolean p) {
		super(m, v);
		this.cor = c;
		this.tipo = t;
		this.largura = l;
		this.gramatura = g;
		this.paltado = p;
	}
	public Papel(String m, float v) {
		super(m, v);
	}
	
	public String getCor() {
		return this.cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getTipo() {
		return this.tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public float getLargura() {
		return this.largura;
	}
	public void setLargura(float largura) {
		this.largura = largura;
	}
	public int getGramatura() {
		return this.gramatura;
	}
	public void setGramatura(int gramatura) {
		this.gramatura = gramatura;
	}
	public boolean getPaltado() {
		return this.paltado;
	}
	public void setPaltado(boolean paltado) {
		this.paltado = paltado;
	}
	
	@Override
	public boolean Cadastro() {
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite a marca do Papel: ");
		String marca = ler.next();
		setMarca(marca);
		System.out.println("Digite o valor do Papel: ");
		float valor = ler.nextFloat();
		setValor(valor);
		System.out.println("Digite a cor do Papel: ");
		String cor = ler.next();
		setCor(cor);
		System.out.println("Digite o tipo do Papel: ");
		String tipo = ler.next();
		setTipo(tipo);
		System.out.println("Digite a largura do Papel: ");
		float largura = ler.nextFloat();
		setLargura(largura);
		System.out.println("Digite a gramatura do Papel: ");
		int gramatura = ler.nextInt();
		setGramatura(gramatura);
		System.out.println("Paltado? (Sim/Não)");
		String paltado = ler.next();
		if(paltado.equals("Sim") || paltado.equals("sim")) {
			setPaltado(true);
		}else {
			setPaltado(false);
		}
		if(getMarca().equals(null) || getValor() <= 0 || getCor().equals(null) 
				|| getTipo().equals(null) || getLargura() <= 0 && getGramatura() <= 0) {
			System.out.println("Informe valores válido para cadastrar o papel!");
			return false;
		}
		return true;
	}
	@Override
	public String Consulta() {
		String resposta = getMarca()+"\nValor: "+getValor() + "\nCor: "+getCor()+
				"\nTipo: "+ getTipo() + "\nLargura: " + getLargura() + "\nGramatura: "+ getGramatura();
		if(getPaltado()) {
			resposta += "\nPaltado: Sim";
		}else {
			resposta += "\nPaltado: Não";
		}
		return resposta;
	}
}
