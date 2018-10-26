package semana3;

public class TocaDisco {
	private boolean emFuncionamento=false;
	private String marca;
	private String modelo;
	private boolean suporta45rpm;
	//getters e setters dos atributos
	protected String getMarca() {
		return this.marca;
	}
	
	protected String getModelo() {
		return this.modelo;
	}

	protected boolean getSuporta45rpm() {
		return this.suporta45rpm;
	}
	
	protected boolean getEmFuncionamento() {
		return this.emFuncionamento;
	}
	
	protected void setMarca(String marca) {
		this.marca=marca;
	}
	
	protected void setModelo(String modelo) {
		this.modelo=modelo;
	}
	
	protected void setSuporta45rpm(boolean suporta45rpm) {
		this.suporta45rpm=suporta45rpm;
	}
	
	protected boolean setEmFuncionamento(boolean emFuncionamento) {
		if(this.emFuncionamento==emFuncionamento) break; //pula se nada mudou (evitar erros se algo na implementação do onoff é alterado, por padrão isso não aconteceria)
		this.emFuncionamento=emFuncionamento;
	}
	

	//métodos
	protected void onoff() {
		if(this.getEmFuncionamento()==false) {
			this.setEmFuncionamento (true);
		} else{
			at.levanta();
		this.setEmFuncionamento (false);
		}
		System.out.println("Seu " + this.getMarca() + " " + this.getModelo() + " está agora " + (this.getEmFuncionamento() ? "ligado." : "desligado."));
	}
	
	protected void insereDisco(int polegadas) {
		if((polegadas==7) && (this.getSuporta45rpm==false)) {
			System.out.println("Disco não pode ser tocado.");
			at.levanta();
		}
		if(polegadas!=12) {
			System.out.println("Insira apenas discos.");
			at.levanta();
		}
		at.abaixa();
	}
}
