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

abstract class Veiculo {
	protected String marca;
	protected int rodas;
	protected int bancos;
	protected double velocidadeAtual=0;
	
	protected void deslocar (double km) {
		System.out.println("Acelerando " + km + " KM/H...");
		velocidadeAtual+=km;
		System.out.println(this.marca + " desloca a " + this.velocidadeAtual + " por hora.");
	}
	
	protected void frear() {
		this.velocidadeAtual=this.velocidadeAtual/2;
		System.out.println("Freio aplicado. Velocidade atual: " + velocidadeAtual);
	}
	}
	
	class Carro extends Veiculo {
		protected int portas;
		
		protected void trocarOleo() {
			System.out.println("�leo do " + this.marca + " trocado com sucesso.");
		}
	}
	
	class Bicicleta extends Veiculo {
	}
	
	public class HierarquiaPolimorfismo {
		public static void main(String[] args) {
		Carro veiculo1=new Carro();
			veiculo1.marca="Ford";
			veiculo1.bancos=4;
			veiculo1.portas=4;
			veiculo1.rodas=4;
			veiculo1.deslocar(100);
			veiculo1.frear();
			veiculo1.deslocar(25);
			veiculo1.trocarOleo();
			Bicicleta veiculo2=new Bicicleta();
			veiculo2.marca="Trek";
			veiculo2.bancos=1;
			veiculo2.rodas=2;
			//veiculo2.portas?
			veiculo2.deslocar(50.0);
			veiculo2.frear();
			veiculo2.frear();
	}
}
