package semana3;

public class Automovel extends Veiculo {
	private boolean mudarOleo;
	private int qntPedais;
	private int qntEspelhos;
	
	
	public Automovel(int qntRodas, int qntPortas, int qntBancos, double deslocar, String marca, boolean mudarOleo,
			int qntPedais, int qntEspelhos) {
		super(qntRodas, qntPortas, qntBancos, deslocar, marca);
		this.mudarOleo = mudarOleo;
		this.qntPedais = qntPedais;
		this.qntEspelhos = qntEspelhos;
	}
	
	public String getAll() {
		return 	"N� de rodas: " + getQntRodas() + "\n" + "N� de Portas: " + getQntPortas() + "\n" + "N� de Bancos: " + getQntBancos() + "KM: "
				+ getDeslocar() + "\n" +
				"Marca do Possante: " + getMarca() + "\n" +
				"Precisa trocar Oleo? " + mudarOleo + "\n" + "n� de pedais: " + qntPedais + "Quantidade de Espelhos: " + qntEspelhos;
	}
	
	public void setAll(int r, int port, int banc, double des, String mar, boolean m, int p, int e) {
		setQntRodas(r);
		setQntPortas(port);
		setQntBancos(banc);
		setDeslocar(des);
		setMarca(mar);
		mudarOleo = true;
		qntPedais = p;
		qntEspelhos = e;
	}
	
	public boolean isMudarOleo() {
		return mudarOleo;
	}
	public void setMudarOleo(boolean mudarOleo) {
		this.mudarOleo = mudarOleo;
	}
	public int getQntPedais() {
		return qntPedais;
	}
	public void setQntPedais(int qntPedais) {
		this.qntPedais = qntPedais;
	}
	public int getQntEspelhos() {
		return qntEspelhos;
	}
	public void setQntEspelhos(int qntEspelhos) {
		this.qntEspelhos = qntEspelhos;
	}
	
	
	
	
}
