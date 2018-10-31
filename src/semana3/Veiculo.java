package semana3;

public class Veiculo {
	private int qntRodas;
	private int qntPortas;
	private int qntBancos;
	private double deslocar;
	private String marca;
	
	
	
	public Veiculo(int qntRodas, int qntPortas, int qntBancos, double deslocar, String marca) {
		super();
		this.qntRodas = qntRodas;
		this.qntPortas = qntPortas;
		this.qntBancos = qntBancos;
		this.deslocar = deslocar;
		this.marca = marca;
	}

	public int getQntRodas() {
		return qntRodas;
	}
	public void setQntRodas(int qntRodas) {
		this.qntRodas = qntRodas;
	}
	public int getQntPortas() {
		return qntPortas;
	}
	public void setQntPortas(int qntPortas) {
		this.qntPortas = qntPortas;
	}
	public int getQntBancos() {
		return qntBancos;
	}
	public void setQntBancos(int qntBancos) {
		this.qntBancos = qntBancos;
	}
	public double getDeslocar() {
		return deslocar;
	}
	public void setDeslocar(double deslocar) {
		this.deslocar = deslocar;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	
}
