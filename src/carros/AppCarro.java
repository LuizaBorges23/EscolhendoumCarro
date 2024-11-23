package carros;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class AppCarro {
public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Carro> carros = new ArrayList<Carro>();
		int opc;
		double preco;
		String marca, cor;
		int ano;
		do {
			opc = menu(sc);
			switch (opc) {
			case 1:
				inserir(carros, sc);

				break;
			case 2:
				System.out.println("Preço: ");
				preco = sc.nextDouble();
				buscarPreço(carros, preco);
				break;
			case 3:
				System.out.println("Marca: ");
				marca = sc.next();
				buscarMarca(carros, marca);
				break;
			case 4:
				System.out.println("Marca: ");
				marca = sc.next();
				System.out.println("Ano: ");
				ano = sc.nextInt();
				System.out.println("Cor: ");
				cor = sc.next();
				buscarCarro(carros, marca, cor, ano);

			}
		} while (opc != 5);
	}

public static void buscarCarro(List<Carro> carros, String marca, String cor, int ano) {
	Carro c;
	for(int i=0;i<carros.size();i++) {
		c=carros.get(i);
		if((c.getMarca().equals(marca)) && (c.getAno()==ano) && (c.getCor().equals(cor))){
			System.out.println(c);
			
		}
	}
	
}

	public static void buscarMarca(List<Carro> carros, String marca) {
		Carro c;
		for (int i = 0; i < carros.size(); i++) {
			c = carros.get(i);
			if (c.getMarca().equals(marca)) {
				System.out.println(c);
			}
		}

	}

	public static void buscarPreço(List<Carro> carros, double preco) {
		Carro c;
		for (int i = 0; i < carros.size(); i++) {
			c = carros.get(i);
			if (c.getPreco() < preco) {
				System.out.println(c);
			}
		}

	}

	public static void inserir(List<Carro> carros, Scanner sc) {
		Carro c;
		String marca;
		int ano;
		String cor;
		double preco;
		System.out.println("Marca: ");
		marca = sc.next();
		System.out.println("Cor: ");
		cor = sc.next();
		System.out.println("Ano: ");
		ano = sc.nextInt();
		System.out.println("Preco: ");
		preco = sc.nextDouble();
		c = new Carro(marca, ano, cor, preco);
		carros.add(c);
	}

	public static int menu(Scanner sc) {
		int opc;
		System.out.println(
		"1-Inserir carro\n" 
		+ "2-Buscar por preço" 
		+ "3-Buscar por marca" 
		+ "4-Buscar por carro" 
		+ "5-Sair");
		System.out.println("Opcao: ");
		opc = sc.nextInt();
		return opc;
	}
}
