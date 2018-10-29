package semana3;

public class TocaDisco {
	private boolean emFuncionamento=false;
	private String marca;
	private String modelo;
	private boolean suporta45rpm;
	private String agulhaTipo;
	private int agulhaPeso;
	private int agulhaPrecisao;
	private boolean agulhaLevantada;
	
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
	
	protected String getAgulhaTipo() {
		return agulhaTipo;
	}
	//não precisamos saber do peso nem precisão da agulha
	protected boolean getAgulhaLevantada() {
		return agulhaLevantada;
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
	
	protected void setEmFuncionamento(boolean emFuncionamento) {
		if(this.emFuncionamento==emFuncionamento) System.out.println("O que você acha que acontece?");
		this.emFuncionamento=emFuncionamento;
	}

	protected void setAgulhaTipo (String tipo) {
		this.agulhaTipo=tipo;
	}
	
	protected void setAgulhaPrecisao(int precisao) {
		this.agulhaPrecisao=precisao;
	}
	
	protected void setAgulhaPeso(int peso) {
		this.agulhaPeso=peso;
	}
	//setAgulhaLevantada vem aí

	//métodos
	protected void onoff() {
		if(this.getEmFuncionamento()==false) {
			this.setEmFuncionamento (true);
		} else{
			this.agulhaLevanta();
		this.setEmFuncionamento (false);
		}
		System.out.println("Seu " + this.getMarca() + " " + this.getModelo() + " está agora " + (this.getEmFuncionamento() ? "ligado." : "desligado."));
	}
	
	protected void insereDisco(int polegadas) {
		if((polegadas==7) && (this.getSuporta45rpm==false)) {
			System.out.println("Disco não pode ser tocado.");
			this.agulhaLevanta();
		}
		if(polegadas!=12) {
			System.out.println("Insira apenas discos.");
			this.agulhaLevanta();
		}
		this.agulhaAbaixa(); //disco é reconhecido e começa a girar
	}
	
	protected void agulhaLevanta() {
		if(this.getEmFuncionamento()==false) System.out.println("Sua caríssima agulha de tipo " + this.getAgulhaTipo() + " se perde em meio aos fios dos eletrodomésticos. Boa sorte");
		if(this.getAgulhaLevantada()) System.out.println("A agulha aponta para o teto e reproduz a melodia que consegue capturar de uma lâmpada.");
		System.out.println("O pitch diminui até finalmente chegar em 0. A música para");
		this.agulhaLevantada=true;
	}

	protected void agulhaAbaixa() {
		if(this.getAgulhaLevantada()==false) System.out.println("Você se pergunta de onde a agulha está tirando músicas do Slayer");
		System.out.println("A agulha retorna ao seu habitat natural, junto com a música.");
		this.agulhaLevantada=false;
	}
}
