import java.util.Scanner;

public class CaixaLapis extends Produto implements Manipulacao {
	private int quantidade;
	private boolean colorido;
	
	
	public CaixaLapis(String m, float v, int quantidade,boolean colorido){
		super(m, v);
		this.quantidade = quantidade;
		this.colorido = colorido;
	}
	public CaixaLapis(String m, float v) {
		super(m, v);
	}
	
	public int getQuantidade() {
		return this.quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public boolean getColorido() {
		return this.colorido;
	}
	public void setColorido(boolean colorido) {
		this.colorido = colorido;
	}
	@Override
	public boolean Cadastro() {
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite a marca da caixa de lapis: ");
		String marca = ler.next();
		setMarca(marca);
		System.out.println("Digite o valor da caixa lapis: ");
		float valor = ler.nextFloat();
		setValor(valor);
		System.out.println("Digite a quantidade da caixa lapis: ");
		int quantidade = ler.nextInt();
		setQuantidade(quantidade);
		System.out.println("Colorido?(Sim/Não) ");
		String scolorido = ler.next();
		if(scolorido.equals("sim") || scolorido.equals("Sim")) {
			setColorido(true);
		}else {
			setColorido(false);
		}
		if(getMarca().equals(null) || getValor() <= 0 || getQuantidade() <= 0) {
			System.out.println("Informe valores válidos para cadastrar a caixa de Lapis!");
			return false;
		}
		return true;
	}
	@Override
	public String Consulta() {
		String resposta = getMarca() + "\nValor: "+getValor() + "\nQuantidade: "+getQuantidade();
		
		if(getColorido()) {
			resposta += "\nColorido: Sim";
		}else {
		resposta += "\nColorido: Não";
		}
		return resposta;
	}
}
