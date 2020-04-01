import java.util.ArrayList;
import java.util.Scanner;

public class Projeto_InterPrincipal {
	static Scanner ler = new Scanner(System.in);
	public static void main(String[] args) {
		Pedido pedido;
		ArrayList<Pedido> p = new ArrayList<Pedido>();
			int op = 0;
				do {
					String menu = "-------Bem Vindo ao Sistema da Universidade Cruzeiro do Sul-----\r\n" + 
							"                 Digite uma das opções abaixo			   \r\n" + 
							"1 - Cadastrar 2 - Consultar 3 - Listar Todos 4 - Sair do Sistema";	
					System.out.println(menu);
					op = ler.nextInt();
					switch (op) {
					case 1:
						pedido = new Pedido();
						pedido.Cadastro();
						p.add(pedido);
						break;
					case 2:
						System.out.println("Digite o seu cpf: ");
						String cpf = ler.next();
						for(int i = 0; i < p.size(); i++) {	
							System.out.println("------------------------- Dados do Pedido -------------------------");
							if(cpf.equals(p.get(i).getCliente().getCpf())) {
							System.out.println(p.get(i).Consulta());
							p.get(i).CalculaTotalpedido();
							}
							else {
                                  System.out.println("Cliente não cadastrado!");
							}
						}
						break;
					case 3:
						String pedidos = "";
						if(p.size() > 0) {
							for(int i = 0; i < p.size(); i++) {
								pedidos += p.get(i).Consulta();
							}
							System.out.println("Todos os pedidos: "+ pedidos);
						}else {
							System.out.println("Nenhum pedido cadastrado!");
						}
						break;
					case 4:
						break;
					}
				}while(op != 4);
				System.out.println("Obrigado por usar nosso sistema!");
	}
}