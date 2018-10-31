package semana3;

public class Bicicleta extends Veiculo {
	private int aro;
	private boolean cesto;
	private int qntPedais;
	
	public Bicicleta(int qntRodas, int qntPortas, int qntBancos, double deslocar, String marca, int aro, boolean cesto,
			int qntPedais) {
		super(qntRodas, qntPortas, qntBancos, deslocar, marca);
		this.aro = aro;
		this.cesto = cesto;
		this.qntPedais = qntPedais;
	}
	
	public Bicicleta(int qntRodas, int qntPortas, int qntBancos, double deslocar, String marca) {
		super(qntRodas, qntPortas, qntBancos, deslocar, marca);
		// TODO Auto-generated constructor stub
	}
	
	public String getAll() {
		return 	"Nº de rodas: " + getQntRodas() + "\n" + "Nº de Portas: " + getQntPortas() + "\n" + "Nº de Bancos: " + getQntBancos() + "KM: "
				+ getDeslocar() + "\n" +
				"Marca do Possante: " + getMarca() + "\n" +
				"aro: " + aro + "\n" + "tem cesto? " + cesto + "\n" + "nº de pedais: " + qntPedais;
	}
	
	public void setAll(int r, int port, int banc, double des, String mar, int a, boolean c, int p) {
		setQntRodas(r);
		setQntPortas(port);
		setQntBancos(banc);
		setDeslocar(des);
		setMarca(mar);
		aro = a;
		cesto = true;
		qntPedais = p;
	}

	public int getAro() {
		return aro;
	}
	public void setAro(int aro) {
		this.aro = aro;
	}
	public boolean isCesto() {
		return cesto;
	}
	public void setCesto(boolean cesto) {
		this.cesto = cesto;
	}
	public int getQntPedais() {
		return qntPedais;
	}
	public void setQntPedais(int qntPedais) {
		this.qntPedais = qntPedais;
	}
	
	
}
