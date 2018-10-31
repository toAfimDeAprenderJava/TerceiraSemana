package semana3;

/**
 *	Criar uma estrutura hierárquica que contenha as seguintes classes:
 * 	Veiculo (classe abstracta), Bicicleta e Automóvel.
 * 	Os métodos da classe Veiculo são todos abstractos e possuem a seguinte assinatura:
 * qntdRodas(int)
 * qntdPortas(int)
 * qntdBanco(int)
 * deslocar(double)
 * frear()
 * String marca
 * Estes métodos são implementados nas subclasses Automóvel e Bicicleta.
 * Acrescentar na classe Automóvel o método mudarOleo()
 *  encapsule todos os metodos e atributos
 */
public class HierarquiaPolimorfismo {
	public static void main(String[] args) {
		
		Automovel carro = new Automovel(Magica.inteiro("Digite quantidade de Rodas"),
										Magica.inteiro("Digite quantidade de Portas"), 
										Magica.inteiro("Digite a quantidade de Bancos"), 
										Magica.decimal("Digite quantidade de quilometros a serem deslocado"), 
										Magica.texto("Digite Marca do Carro"), 
										true,
										Magica.inteiro("Digite quantos pedais tem o Carro"), 
										Magica.inteiro("Digite quantos espelhos tem o carro"));

		
	System.out.println(carro.getAll());
	}
		
}
