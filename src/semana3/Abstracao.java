package semana3;

/**
 * Abstraia dois objeto da vida real em um objeto Java
 * coloque ao menos 3 métodos e 3 atributos 
 * encapsule todos os metodos e atributos
 *
 */
public class Abstracao {
	private String cor = "Vermelho";
	private String nome = "Ferrari";
	private double preco  = 200.000;

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public void imprimir(){
		System.out.println(nome);
		System.out.println(preco);
		System.out.println(cor);
	}

	public void modificarNome(String nome) {
		this.nome = nome;
	}

	public void modificarPreco(double preco){
		this.preco = preco;
	}

	public static void main(String[] args) {

		Abstracao carro = new Abstracao();

		carro.imprimir();
		carro.modificarNome("Uno");
		carro.modificarPreco(100.0);

		System.out.println("===============================");

		carro.imprimir();


	}

}
