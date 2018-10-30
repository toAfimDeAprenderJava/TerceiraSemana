package hierarquia;

//Cria��o classe abstrata Veiculo.
public abstract class Veiculo {

	//Declara��o metodos abstratos
	public int qntdRodas(int rodas) {
		return 0;
	}
	public int qntdPortas(int portas) {
		return 0;
	}
	public int qntdBanco(int bancos) {
		return 0;
	}
	public void deslocar(double distancia) {
		
	}
	public void frear() {
		
	}
	
	//Atributo marca com seu respectivo Get e Set.
	private String marca;
	
	public String GetMarca () {
		return marca;
	}
	
	public void SetMarca(String marca) {
		this.marca = marca;
	}
	
}
