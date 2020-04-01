import java.util.ArrayList;
import java.util.Scanner;

public class Pedido implements Manipulacao{
	private Data data;
	private Cliente cliente;
	private float totalpedido;
	private ArrayList<CaixaLapis> cxlapis;
	private ArrayList<Papel> papel;
	private ArrayList<Caderno> caderno;
	
	public Pedido() {
		cxlapis = new ArrayList<>();
		papel = new ArrayList<>();
		caderno = new ArrayList<>();
	}
	
	public Data getData() {
		return this.data;
	}
	public void setData(Data data) {
		this.data = data;
	}
	public Cliente getCliente() {
		return this.cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	public float getTotalpedido() {
		return this.totalpedido;
	}
	public void setTotalpedido(float totalpedido) {
		this.totalpedido = totalpedido;
	}
	public ArrayList<CaixaLapis> getCxlapis() {
		return this.cxlapis;
	}
	public void setCaixaLapis(ArrayList<CaixaLapis> cxlapis) {
		this.cxlapis = cxlapis;
	}
	public ArrayList<Papel> getPapel(){
		return this.papel;
	}
	public void setPapel(ArrayList<Papel> papel) {
		this.papel = papel;
	}
	public ArrayList<Caderno> getCaderno(){
		return this.caderno;
	}
	public void setCaderno(ArrayList<Caderno> caderno) {
		this.caderno = caderno;
	}

	public void CalculaTotalpedido() {
		
		float pedidocaderno = 0;
		for (Caderno totalcaderno : caderno) {
			pedidocaderno += totalcaderno.getValor();
		}
		
		float pedidopapel = 0;
		for (Papel totalpapel : papel) {
			pedidopapel += totalpapel.getValor();
		}
		
		float pedidocxlapis = 0;
		for (CaixaLapis totalcxlapis : cxlapis) {
			pedidocxlapis += totalcxlapis.getValor();
		}
		float total;
		total = pedidocaderno + pedidopapel + pedidocxlapis;
		System.out.println("Total do pedido: " + total);
	}
	
	
	@Override
	public boolean Cadastro() {
		// Dados do cliente
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite o seu nome: ");
		String nome = ler.next();
		System.out.println("Digite o seu cpf: ");
		String cpf = ler.next();
		System.out.println("Digite o seu telefone: ");
		String telefone = ler.next();
		this.cliente = new Cliente(nome, cpf, telefone);
		// Dados da classe data
		System.out.println("Digite o dia: ");
		int dia = ler.nextInt();
		System.out.println("Digite o mes: ");
		int mes = ler.nextInt();
		System.out.println("Digite o ano: ");
		int ano = ler.nextInt();
		this.data = new Data(dia, mes, ano);
		Caderno ca = new Caderno(null, 0);
		if(ca.Cadastro()) {caderno.add(ca);}
		
		CaixaLapis cx = new CaixaLapis(null, 0);
		if(cx.Cadastro()) {cxlapis.add(cx);}
		
		Papel p = new Papel(null, 0);
		if(p.Cadastro()) {papel.add(p);}
		
		if(getData().equals(null) || getCliente().equals(null) || getCxlapis().equals(null) 
				|| getPapel().equals(null) || getCaderno().equals(null)) {
			System.out.println("Informe valores válidos!");
			return false;
		}
		System.out.println("Pedido cadastrado com sucesso!");
		return true;
	}
	@Override
	public String Consulta() {
		String listaC = "";
		for (Caderno listacaderno : caderno) {
			listaC += listacaderno.Consulta();
		}
		String listaP = "";
		for (Papel listapapel : papel) {
			listaP += listapapel.Consulta();
		}
		String listaCx = "";
		for (CaixaLapis listacaixa : cxlapis) {
			listaCx += listacaixa.Consulta(); 
		}	
		String resposta = 		
		"\nDados do Cliente: "+this.cliente.getNome() +"   Cpf: "+ this.cliente.getCpf()+
		"   Telefone: "+this.cliente.getTelefone()
		+"\nData: " + getData().getDia() + "/" + this.data.getMes() + "/" + getData().getAno()
		+"\n------------------------- Papel -----------------------------------"
		+ "\nPapel: " +listaP + 
		"\n------------------------- Caderno ---------------------------------"
		+"\nCaderno: " + listaC+
		"\n------------------------- Caixa Lapis  ---------------------------"
		+ "\nCaixa Lapis: "+ listaCx + "\n--------------------------------------------------------------------";
		return resposta;
	}
}
