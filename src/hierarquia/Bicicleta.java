package hierarquia;

//Classe Bicicleta subclasse de Veiculo
public class Bicicleta extends Veiculo {

	//Implementacao do metodo quantidade de rodas.
	public int qntdRodas(int rodas) {
			return 2;
		}
	
	public int qntdPortas(int portas) {
		return 0;
	}
	public int qntdBanco(int bancos) {
		return 1;
	}
	public void deslocar(double distancia) {
		
	}
	public void frear() {
		
	}

	
}
