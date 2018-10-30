package semana3;

/**
 * Abstraia dois objeto da vida real em um objeto Java
 * coloque ao menos 3 métodos e 3 atributos 
 * encapsule todos os metodos e atributos
 *
 */
public class Abstracao {


		private String cor = "Vermelho";
		private String marca = "Ford";
		private double preco = 500.000;

		public String getCor () {
			return cor;
		}
		public void setCor (String cor){
			this.cor = cor;
		}
		public String getMarca () {
			return marca;
		}
		public void setMarca (String marca){
			this.marca = marca;
		}
		public double getPreco () {
			return preco;
		}
		public void setPreco ( double preco){
			this.preco = preco;
		}
		public void imprimir () {
			System.out.println("Marca carro: " + getMarca());
			System.out.println("Cor carro: " + getCor());
			System.out.println("Preço carro: " + getPreco());
			System.out.println("\n");
		}
		public void alteracaoPreco ( double preco){
			this.preco = preco;
		}
		public void altercaoCor (String cor){
			this.cor = cor;
		}

		public static void main (String[]args){

			Abstracao carro = new Abstracao();

			carro.imprimir();
			carro.alteracaoPreco(575.000);
			carro.altercaoCor("Azul");
			carro.imprimir();
		}
	}
