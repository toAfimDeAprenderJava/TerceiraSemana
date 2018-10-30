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
		abstract class  Veiculo {

			//métodos abstratos

			public abstract double deslocar();
			public abstract void frear();

			//atributos
			private String marca;
			private int qntdRodas ;
			private int qntdPortas;
			private int qntdBanco;

			public int getQntdBanco() {
				return qntdBanco;
			}

			public void setQntdBanco(int qntdBanco) {
				this.qntdBanco = qntdBanco;
			}



			public int getQntdPortas() {
				return qntdPortas;
			}

			public void setQntdPortas(int qntdPortas) {
				this.qntdPortas = qntdPortas;
			}

			public int getQntdRodas() {
				return qntdRodas;
			}

			public void setQntdRodas(int qntdRodas) {
				this.qntdRodas = qntdRodas;
			}


			public String getMarca() {
				return marca;
			}

			public void setMarca(String marca) {
				this.marca = marca;
			}

		}

		class Bicicleta extends Veiculo {


			@Override
			public double deslocar() {
				return 16;
			}

			@Override
			public void frear() {
				System.out.println("Freando bicicleta");
			}
		}

		class Automovel extends Veiculo{

			@Override
			public double deslocar() {
				return 50;
			}

			@Override
			public void frear() {
				System.out.println("Freando Automovel");
			}
			public void mudarOleo(){
				System.out.println("Mudando Oleo do Automovel");
			}
		}
		public class HierarquiaPolimorfismo {

			public static void main(String[] args) {

				Bicicleta bicicleta = new Bicicleta();
				System.out.println("-------------------------------------");
				System.out.println("Bicicleta");
				System.out.println("-------------------------------------");

				bicicleta.setMarca("Caloi");
				bicicleta.setQntdRodas(4);
				bicicleta.setQntdPortas(0);
				bicicleta.setQntdBanco(1);

				System.out.println("Marca "+ bicicleta.getMarca() + "\nQuantidade de pneus "+ bicicleta.getQntdRodas() + "\nDeslocando "+ bicicleta.deslocar()+ "\nBancos "+bicicleta.getQntdBanco()+ "\nPortas "+ bicicleta.getQntdPortas());

				bicicleta.frear();

				System.out.println("-------------------------------------");
				System.out.println("Automovel");
				System.out.println("-------------------------------------");
				Automovel automovel = new Automovel();
				automovel.setMarca("Ford");
				automovel.setQntdRodas(4);
				automovel.setQntdPortas(4);
				automovel.setQntdBanco(4);

				System.out.println("Marca "+ automovel.getMarca() + "\nQuantidade de pneus "+ automovel.getQntdRodas()+ "\nDeslocando "+automovel.deslocar()+ "\nBancos "+automovel.getQntdBanco()+ "\nPortas "+ automovel.getQntdPortas());

				automovel.frear();
				automovel.mudarOleo();

	}
}
