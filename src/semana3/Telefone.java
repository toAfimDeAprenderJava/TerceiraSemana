package semana3;

public class Telefone {
	
	private int ddd;
	private String numero;
	private String operadora;
	
	public Telefone(int ddd, String numero, String operadora) {
		super();
		this.ddd = ddd;
		this.numero = numero;
		this.operadora = operadora;
	}
	public Telefone() {
		super();
	}
	
	public String getAll() {
		return operadora + ":("+ddd+")" + numero;
	}
	
	public void setAll(int d, String n, String o) {
		ddd = d;
		numero = n;
		operadora = o;
	}
	
	public int getDdd() {
		return ddd;
	}
	public void setDdd(int ddd) {
		this.ddd = ddd;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getOperadora() {
		return operadora;
	}
	public void setOperadora(String operadora) {
		this.operadora = operadora;
	}
	
	
}
