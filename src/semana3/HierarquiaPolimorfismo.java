package semana3;

import hierarquia.Automovel;
import hierarquia.Bicicleta;

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
	
		//Exemplificacao de Polimorfismo
		Bicicleta bike = new Bicicleta ();
		Automovel carro = new Automovel();
		
		System.out.printf("Uma bibicleta tem %d rodas," , bike.qntdRodas(2));
		System.out.printf(" e um carro tem %d rodas." , carro.qntdRodas(4));
	
	}
}
